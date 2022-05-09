package com.bluefashion.c2cbluefashionbitirmeprojesi.api.controllers;

import com.bluefashion.c2cbluefashionbitirmeprojesi.business.abstracts.ImageService;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.image.ImageGetDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.image.ImageListDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.image.CreateImageRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.image.DeleteImageRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.image.UpdateImageRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.exception.BusinessException;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.DataResult;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/Images")
public class ImageController {
    private ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/getAll")
    DataResult<List<ImageListDto>> getAll() {
        return this.imageService.getAll();
    }

    @GetMapping("getByImageId")
    DataResult<ImageGetDto> getByImageId(@RequestParam int imageId) throws BusinessException {
        return this.imageService.getByImageId(imageId);
    }

    @PostMapping("/add")
    Result add(@RequestBody @Valid CreateImageRequest createImageRequest) {
        return this.imageService.add(createImageRequest);
    }

    @PutMapping("/update")
    Result update(@RequestBody @Valid UpdateImageRequest updateImageRequest) throws BusinessException {
        return this.imageService.update(updateImageRequest);
    }

    @DeleteMapping("/delete")
    Result delete(@RequestBody DeleteImageRequest deleteImageRequest) throws BusinessException {
        return this.imageService.delete(deleteImageRequest);
    }

    @GetMapping("/getAllPaged")
    DataResult<List<ImageListDto>> getAllPaged(@RequestParam int pageNo, @RequestParam int pageSize) {
        return this.imageService.getAllPaged(pageNo, pageSize);
    }

    @GetMapping("/getAllSorted")
    DataResult<List<ImageListDto>> getAllSorted(@RequestParam boolean sort) {
        return this.imageService.getAllSorted(sort);
    }
}
