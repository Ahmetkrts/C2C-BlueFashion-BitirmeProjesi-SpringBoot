package com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShippingListDto {

    private int shippingId;
    private String shippingCompany;
    private String shippingPaymentMethod;
    private String shippingPrice;
    private String shippingDate;
    private String shippingTrackingNumber;
}
