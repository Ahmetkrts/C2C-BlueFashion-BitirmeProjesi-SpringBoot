package com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressListDto {

    private int addressId;
    private String addressTitle;
    private String addressFirstName;
    private String addressLastName;
    private String addressMail;
    private String addressPhoneNumber;
    private String addressProvince;
    private String addressCounty;
    private String addressDistrict;
    private String addressPostCode;
    private String addressFullAdress;


}
