package com.bluefashion.c2cbluefashionbitirmeprojesi.api.controllers;

import com.bluefashion.c2cbluefashionbitirmeprojesi.business.abstracts.ProductService;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.product.ProductGetDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.product.ProductListDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.product.CreateProductRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.product.DeleteProductRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.product.UpdateProductRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.exception.BusinessException;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.DataResult;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/Products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAll")
    DataResult<List<ProductListDto>> getAll() {
        return this.productService.getAll();
    }

    @GetMapping("getByProductId")
    DataResult<ProductGetDto> getByProductId(@RequestParam int productId) throws BusinessException {
        return this.productService.getByProductId(productId);
    }

    @PostMapping("/add")
    Result add(@RequestBody @Valid CreateProductRequest createProductRequest) throws BusinessException {
        return this.productService.add(createProductRequest);
    }

    @PutMapping("/update")
    Result update(@RequestBody @Valid UpdateProductRequest updateProductRequest) throws BusinessException {
        return this.productService.update(updateProductRequest);
    }

    @DeleteMapping("/delete")
    Result delete(@RequestBody DeleteProductRequest deleteProductRequest) throws BusinessException {
        return this.productService.delete(deleteProductRequest);
    }

    @GetMapping("/getAllPaged")
    DataResult<List<ProductListDto>> getAllPaged(@RequestParam int pageNo, @RequestParam int pageSize) {
        return this.productService.getAllPaged(pageNo, pageSize);
    }

    @GetMapping("/getAllSorted")
    DataResult<List<ProductListDto>> getAllSorted(@RequestParam boolean sort) {
        return this.productService.getAllSorted(sort);
    }

    @GetMapping("/getProductByCategoryId")
    DataResult<List<ProductListDto>> getProductByCategoryId(@RequestParam int categoryId) throws BusinessException {
        return this.productService.getProductByCategoryId(categoryId);
    }

    @GetMapping("/getProductByUserId")
    DataResult<List<ProductListDto>> getProductByUserId(@RequestParam int userId) throws BusinessException {
        return this.productService.getProductByUserId(userId);
    }

    @GetMapping("/getProductByColorId")
    DataResult<List<ProductListDto>> getProductByColorId(@RequestParam int colorId) throws BusinessException {
        return this.productService.getProductByColorId(colorId);
    }

    @GetMapping("/getProductByBrandId")
    DataResult<List<ProductListDto>> getProductByBrandId(@RequestParam int brandId) throws BusinessException {
        return this.productService.getProductByBrandId(brandId);
    }

    @GetMapping("/getProductBySizeId")
    DataResult<List<ProductListDto>> getProductBySizeId(@RequestParam int sizeId) throws BusinessException {
        return this.productService.getProductBySizeId(sizeId);
    }

    @GetMapping("/getProductByGreaterPrice")
    DataResult<List<ProductListDto>> getProductByGreaterPrice(@RequestParam double price) throws BusinessException {
        return this.productService.getProductByGreaterPrice(price);
    }

    @GetMapping("/getProductByLessPrice")
    DataResult<List<ProductListDto>> getProductByLessPrice(@RequestParam double price) throws BusinessException {
        return this.productService.getProductByLessPrice(price);
    }


}
