package com.bluefashion.c2cbluefashionbitirmeprojesi.business.abstracts;

import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.ImageGetDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.ImageListDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.CreateImageRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.DeleteImageRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.UpdateImageRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.exception.BusinessException;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.DataResult;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.Result;

import java.util.List;

public interface ImageService {
    DataResult<List<ImageListDto>> getAll();

    DataResult<ImageGetDto> getByImageId(int imageId) throws BusinessException;

    Result add(CreateImageRequest createImageRequest);

    Result update(UpdateImageRequest updateImageRequest) throws BusinessException;

    Result delete(DeleteImageRequest deleteImageRequest) throws BusinessException;

    DataResult<List<ImageListDto>> getAllPaged(int pageNo, int pageSize);

    DataResult<List<ImageListDto>> getAllSorted(boolean sort);

}
