package com.bluefashion.c2cbluefashionbitirmeprojesi.business.abstracts;

import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.product.ProductGetDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.product.ProductListDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.product.CreateProductRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.product.DeleteProductRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.product.UpdateProductRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.exception.BusinessException;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.DataResult;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.Result;

import java.util.List;

public interface ProductService {
    DataResult<List<ProductListDto>> getAll();

    DataResult<ProductGetDto> getByProductId(int productId) throws BusinessException;

    Result add(CreateProductRequest createProductRequest) throws BusinessException;

    Result update(UpdateProductRequest updateProductRequest) throws BusinessException;

    Result delete(DeleteProductRequest deleteProductRequest) throws BusinessException;

    DataResult<List<ProductListDto>> getAllPaged(int pageNo, int pageSize);

    DataResult<List<ProductListDto>> getAllSorted(boolean sort);

    DataResult<List<ProductListDto>> getProductByCategoryId(int categoryId) throws BusinessException;

    DataResult<List<ProductListDto>> getProductByUserId(int userId) throws BusinessException;

    DataResult<List<ProductListDto>> getProductByColorId(int colorId) throws BusinessException;

    DataResult<List<ProductListDto>> getProductByBrandId(int brandId) throws BusinessException;

    DataResult<List<ProductListDto>> getProductBySizeId(int sizeId) throws BusinessException;

    DataResult<List<ProductListDto>> getProductByGreaterPrice(double price) throws BusinessException;

    DataResult<List<ProductListDto>> getProductByLessPrice(double price) throws BusinessException;


    void checkIfProductGetById(int id) throws BusinessException;

}
