package com.bluefashion.c2cbluefashionbitirmeprojesi.business.abstracts;

import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.CommentGetDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.CommentListDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.CreateCommentRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.DeleteCommentRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.UpdateCommentRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.exception.BusinessException;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.DataResult;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.Result;

import java.util.List;

public interface CommentService {
    DataResult<List<CommentListDto>> getAll();

    DataResult<CommentGetDto> getByCommentId(int commentId) throws BusinessException;

    Result add(CreateCommentRequest createCommentRequest) throws BusinessException;

    Result update(UpdateCommentRequest updateCommentRequest) throws BusinessException;

    Result delete(DeleteCommentRequest deleteCommentRequest) throws BusinessException;

    DataResult<List<CommentListDto>> getAllPaged(int pageNo, int pageSize);

    DataResult<List<CommentListDto>> getAllSorted(boolean sort);

}
