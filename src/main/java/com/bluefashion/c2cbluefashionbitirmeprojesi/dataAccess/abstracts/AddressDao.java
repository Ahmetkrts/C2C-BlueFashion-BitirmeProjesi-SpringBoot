package com.bluefashion.c2cbluefashionbitirmeprojesi.dataAccess.abstracts;

import com.bluefashion.c2cbluefashionbitirmeprojesi.entities.concrates.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Address, Integer> {
}
