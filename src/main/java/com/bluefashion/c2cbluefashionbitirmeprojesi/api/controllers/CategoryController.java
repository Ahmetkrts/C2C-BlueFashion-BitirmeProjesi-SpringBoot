package com.bluefashion.c2cbluefashionbitirmeprojesi.api.controllers;

import com.bluefashion.c2cbluefashionbitirmeprojesi.business.abstracts.CategoryService;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.CategoryGetDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.CategoryListDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.CreateCategoryRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.DeleteCategoryRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.UpdateCategoryRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.exception.BusinessException;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.DataResult;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/Categories")
public class CategoryController {
    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/getAll")
    DataResult<List<CategoryListDto>> getAll() {
        return this.categoryService.getAll();
    }

    @GetMapping("getByCategoryId")
    DataResult<CategoryGetDto> getByCategoryId(@RequestParam int categoryId) throws BusinessException {
        return this.categoryService.getByCategoryId(categoryId);
    }

    @PostMapping("/add")
    Result add(@RequestBody @Valid CreateCategoryRequest createCategoryRequest) throws BusinessException {
        return this.categoryService.add(createCategoryRequest);
    }

    @PutMapping("/update")
    Result update(@RequestBody @Valid UpdateCategoryRequest updateCategoryRequest) throws BusinessException {
        return this.categoryService.update(updateCategoryRequest);
    }

    @DeleteMapping("/delete")
    Result delete(@RequestBody DeleteCategoryRequest deleteCategoryRequest) throws BusinessException {
        return this.categoryService.delete(deleteCategoryRequest);
    }

    @GetMapping("/getAllPaged")
    DataResult<List<CategoryListDto>> getAllPaged(@RequestParam int pageNo, @RequestParam int pageSize) {
        return this.categoryService.getAllPaged(pageNo, pageSize);
    }

    @GetMapping("/getAllSorted")
    DataResult<List<CategoryListDto>> getAllSorted(@RequestParam boolean sort) {
        return this.categoryService.getAllSorted(sort);
    }
}
