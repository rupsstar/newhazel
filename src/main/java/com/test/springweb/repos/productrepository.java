package com.test.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.springweb.entities.product;

public interface productrepository extends JpaRepository<product, Integer> {

}
