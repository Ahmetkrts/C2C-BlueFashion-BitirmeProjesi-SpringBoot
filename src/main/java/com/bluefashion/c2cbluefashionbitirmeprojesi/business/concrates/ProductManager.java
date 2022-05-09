package com.bluefashion.c2cbluefashionbitirmeprojesi.business.concrates;

import com.bluefashion.c2cbluefashionbitirmeprojesi.business.abstracts.*;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.product.ProductGetDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.product.ProductListDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.product.CreateProductRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.product.DeleteProductRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.product.UpdateProductRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.exception.BusinessException;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.mapping.ModelMapperService;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.DataResult;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.Result;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.SuccessDataResult;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.SucessResult;
import com.bluefashion.c2cbluefashionbitirmeprojesi.dataAccess.abstracts.ProductDao;
import com.bluefashion.c2cbluefashionbitirmeprojesi.entities.concrates.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;
    private ModelMapperService modelMapperService;
    private CategoryService categoryService;
    private UserService userService;
    private ColorService colorService;
    private BrandService brandService;
    private SizeService sizeService;

    @Autowired
    public ProductManager(ProductDao productDao,
                          ModelMapperService modelMapperService,
                          CategoryService categoryService,
                          UserService userService,
                          ColorService colorService,
                          BrandService brandService,
                          SizeService sizeService) {
        this.productDao = productDao;
        this.modelMapperService = modelMapperService;
        this.categoryService = categoryService;
        this.userService = userService;
        this.colorService = colorService;
        this.brandService = brandService;
        this.sizeService = sizeService;
    }

    @Override
    public DataResult<List<ProductListDto>> getAll() {
        List<Product> response = this.productDao.findAll();
        List<ProductListDto> result = response.stream()
                .map(product -> this.modelMapperService.forDto().map(product, ProductListDto.class))
                .collect(Collectors.toList());

        return new SuccessDataResult<>(result, "Ürünlerler Listelendi..");
    }

    @Override
    public DataResult<ProductGetDto> getByProductId(int productId) throws BusinessException {
        checkIfProductGetById(productId);
        Product response = this.productDao.getById(productId);
        ProductGetDto result = this.modelMapperService.forDto().map(response, ProductGetDto.class);
        return new SuccessDataResult<>(result, productId + " No'ya Ait Ürünler Getirildi..");
    }

    @Override
    public Result add(CreateProductRequest createProductRequest) throws BusinessException {
        this.brandService.checkIfBrandGetById(createProductRequest.getBrandId());
        this.categoryService.checkIfCategoryGetById(createProductRequest.getCategoryId());
        this.colorService.checkIfColorGetById(createProductRequest.getColorId());
        this.sizeService.checkIfSizeGetById(createProductRequest.getSizeId());
        this.userService.checkIfUserId(createProductRequest.getUserId());

        Product result = this.modelMapperService.forRequest().map(createProductRequest, Product.class);
        this.productDao.save(result);
        return new SucessResult(createProductRequest.getProductTitle() + " Başarıyla Eklendi..");
    }

    @Override
    public Result update(UpdateProductRequest updateProductRequest) throws BusinessException {
        this.brandService.checkIfBrandGetById(updateProductRequest.getBrandId());
        this.categoryService.checkIfCategoryGetById(updateProductRequest.getCategoryId());
        this.colorService.checkIfColorGetById(updateProductRequest.getColorId());
        this.sizeService.checkIfSizeGetById(updateProductRequest.getSizeId());
        this.userService.checkIfUserId(updateProductRequest.getUserId());

        Product result = this.modelMapperService.forRequest().map(updateProductRequest, Product.class);
        this.productDao.save(result);
        return new SucessResult(updateProductRequest.getProductTitle() + " Başarıyla Güncellendi..");

    }

    @Override
    public Result delete(DeleteProductRequest deleteProductRequest) throws BusinessException {
        checkIfProductGetById(deleteProductRequest.getProductId());
        Product result = this.productDao.getById(deleteProductRequest.getProductId());
        this.productDao.delete(result);
        return new SucessResult(" Başarıyla Silindi..");
    }

    @Override
    public DataResult<List<ProductListDto>> getAllPaged(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        List<Product> response = this.productDao.findAll(pageable).getContent();
        List<ProductListDto> result = response.stream()
                .map(product -> this.modelMapperService.forDto().map(product, ProductListDto.class))
                .collect(Collectors.toList());
        return new SuccessDataResult<>(result, "Ürünlerler Listelendi..");
    }

    @Override
    public DataResult<List<ProductListDto>> getAllSorted(boolean sort) {
        Sort productSort = Sort.by(ifSortConverter(sort), "ProductTitle");
        List<Product> response = this.productDao.findAll(productSort);
        List<ProductListDto> result = response.stream()
                .map(product -> this.modelMapperService.forDto().map(product, ProductListDto.class))
                .collect(Collectors.toList());
        return new SuccessDataResult<>(result, "Ürünlerler Listelendi..");
    }

    @Override
    public DataResult<List<ProductListDto>> getProductByCategoryId(int categoryId) throws BusinessException {
        this.categoryService.checkIfCategoryGetById(categoryId);
        List<Product> response = this.productDao.getByCategory_CategoryId(categoryId);
        List<ProductListDto> result = response.stream()
                .map(product -> this.modelMapperService.forDto().map(product, ProductListDto.class))
                .collect(Collectors.toList());

        return new SuccessDataResult<>(result, "Ürünlerler Listelendi..");
    }

    @Override
    public DataResult<List<ProductListDto>> getProductByUserId(int userId) throws BusinessException {
        this.userService.checkIfUserId(userId);
        List<Product> response = this.productDao.getByUser_UserId(userId);
        List<ProductListDto> result = response.stream()
                .map(product -> this.modelMapperService.forDto().map(product, ProductListDto.class))
                .collect(Collectors.toList());

        return new SuccessDataResult<>(result, "Ürünlerler Listelendi..");
    }

    @Override
    public DataResult<List<ProductListDto>> getProductByColorId(int colorId) throws BusinessException {
        this.colorService.checkIfColorGetById(colorId);
        List<Product> response = this.productDao.getByColor_ColorId(colorId);
        List<ProductListDto> result = response.stream()
                .map(product -> this.modelMapperService.forDto().map(product, ProductListDto.class))
                .collect(Collectors.toList());

        return new SuccessDataResult<>(result, "Ürünlerler Listelendi..");
    }

    @Override
    public DataResult<List<ProductListDto>> getProductByBrandId(int brandId) throws BusinessException {
        this.brandService.checkIfBrandGetById(brandId);
        List<Product> response = this.productDao.getByBrand_BrandId(brandId);
        List<ProductListDto> result = response.stream()
                .map(product -> this.modelMapperService.forDto().map(product, ProductListDto.class))
                .collect(Collectors.toList());

        return new SuccessDataResult<>(result, "Ürünlerler Listelendi..");
    }

    @Override
    public DataResult<List<ProductListDto>> getProductBySizeId(int sizeId) throws BusinessException {
        this.sizeService.checkIfSizeGetById(sizeId);
        List<Product> response = this.productDao.getBySize_SizeId(sizeId);
        List<ProductListDto> result = response.stream()
                .map(product -> this.modelMapperService.forDto().map(product, ProductListDto.class))
                .collect(Collectors.toList());

        return new SuccessDataResult<>(result, "Ürünlerler Listelendi..");
    }

    @Override
    public DataResult<List<ProductListDto>> getProductByGreaterPrice(double price) throws BusinessException {
        List<Product> response = this.productDao.getByProductDiscountPriceGreaterThanEqual(price);
        List<ProductListDto> result = response.stream()
                .map(product -> this.modelMapperService.forDto().map(product, ProductListDto.class))
                .collect(Collectors.toList());

        return new SuccessDataResult<>(result, "Ürünlerler Listelendi..");
    }

    @Override
    public DataResult<List<ProductListDto>> getProductByLessPrice(double price) throws BusinessException {
        List<Product> response = this.productDao.getByProductDiscountPriceLessThanEqual(price);
        List<ProductListDto> result = response.stream()
                .map(product -> this.modelMapperService.forDto().map(product, ProductListDto.class))
                .collect(Collectors.toList());

        return new SuccessDataResult<>(result, "Ürünlerler Listelendi..");
    }

    public void checkIfProductGetById(int id) throws BusinessException {
        if (!this.productDao.existsById(id)) {
            throw new BusinessException(id + "No'ya Ait Ürünler Bulunamadı..");
        }
    }


    private Sort.Direction ifSortConverter(boolean sort) {
        return sort ? Sort.Direction.ASC : Sort.Direction.DESC;
    }
}
