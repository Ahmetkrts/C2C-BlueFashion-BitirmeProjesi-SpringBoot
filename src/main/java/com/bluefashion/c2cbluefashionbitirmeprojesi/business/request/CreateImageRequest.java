package com.bluefashion.c2cbluefashionbitirmeprojesi.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateImageRequest {
    @NotNull
    private String imageSubInfo;
    @NotNull
    private String imageUrl;
}
