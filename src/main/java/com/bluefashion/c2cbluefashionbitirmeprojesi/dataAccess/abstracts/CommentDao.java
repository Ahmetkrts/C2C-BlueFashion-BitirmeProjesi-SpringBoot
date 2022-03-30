package com.bluefashion.c2cbluefashionbitirmeprojesi.dataAccess.abstracts;

import com.bluefashion.c2cbluefashionbitirmeprojesi.entities.concrates.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDao extends JpaRepository<Comment, Integer> {
}
