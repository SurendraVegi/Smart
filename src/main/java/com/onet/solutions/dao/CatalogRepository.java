package com.onet.solutions.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.Catalog;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, String> {
	
	List<Catalog> findAll();

}
