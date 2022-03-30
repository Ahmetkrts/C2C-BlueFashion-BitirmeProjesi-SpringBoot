package com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryGetDto {
    private int categoryId;
    private String categoryName;
}
