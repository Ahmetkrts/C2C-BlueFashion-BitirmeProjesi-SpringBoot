package com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageListDto {
    private int imageId;
    private String imageSubInfo;
    private String imageUrl;
}
