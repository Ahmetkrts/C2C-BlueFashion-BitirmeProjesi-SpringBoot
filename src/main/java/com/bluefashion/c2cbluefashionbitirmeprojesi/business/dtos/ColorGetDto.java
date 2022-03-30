package com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColorGetDto {
    private int colorId;
    private String colorName;
}
