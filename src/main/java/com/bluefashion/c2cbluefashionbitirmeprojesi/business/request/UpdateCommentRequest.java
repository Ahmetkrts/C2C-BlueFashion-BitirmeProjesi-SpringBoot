package com.bluefashion.c2cbluefashionbitirmeprojesi.business.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCommentRequest {

    private int commentId;
    @NotNull
    private String commentTitle;
    @NotNull
    private String commentContent;
    @NotNull
    private Date commentCreateDate;

    @Min(1)
    @Max(10)
    @NotNull
    private int commentScore;
    private int parent_CommentId;


}