package com.bluefashion.c2cbluefashionbitirmeprojesi.business.abstracts;

import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.AddressGetDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.dtos.AddressListDto;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.CreateAddressRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.DeleteAddressRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.business.request.UpdateAddressRequest;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.exception.BusinessException;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.DataResult;
import com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result.Result;

import java.util.List;

public interface AddressService {
    DataResult<List<AddressListDto>> getAll();

    DataResult<AddressGetDto> getByAddressId(int addressId) throws BusinessException;

    Result add(CreateAddressRequest createAddressRequest);

    Result update(UpdateAddressRequest updateAddressRequest) throws BusinessException;

    Result delete(DeleteAddressRequest deleteAddressRequest) throws BusinessException;

    DataResult<List<AddressListDto>> getAllPaged(int pageNo, int pageSize);

    DataResult<List<AddressListDto>> getAllSorted(boolean sort);

}
