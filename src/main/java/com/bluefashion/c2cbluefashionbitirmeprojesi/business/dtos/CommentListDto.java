package com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentListDto {

    private int commentId;
    private String commentTitle;
    private String commentContent;
    private Date commentCreateDate;
    private int commentScore;
    private int parentId;


}
