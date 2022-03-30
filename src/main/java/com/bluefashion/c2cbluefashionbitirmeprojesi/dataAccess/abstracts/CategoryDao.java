package com.bluefashion.c2cbluefashionbitirmeprojesi.dataAccess.abstracts;

import com.bluefashion.c2cbluefashionbitirmeprojesi.entities.concrates.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
    boolean existsByCategoryName(String categoyName);
}
