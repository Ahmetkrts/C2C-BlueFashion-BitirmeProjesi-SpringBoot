package com.bluefashion.c2cbluefashionbitirmeprojesi.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAddressRequest {

    private int addressId;
    @NotNull
    private String addresTitle;
    @NotNull
    private String addresFistName;
    @NotNull
    private String addresLastName;
    private String addresMail;
    @NotNull
    private String addresPhoneNumber;
    @NotNull
    private String addresProvince;
    @NotNull
    private String addresCounty;
    @NotNull
    private String addresDistrict;
    private String addresPostCode;
    @NotNull
    private String addresFullAdress;


}
