package com.bluefashion.c2cbluefashionbitirmeprojesi.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateImageRequest {
    private int imageId;
    @NotNull
    private String imageSubInfo;
    @NotNull
    private String imageUrl;
}
