package com.onet.solutions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.CodeGroup;

@Repository
public interface CodeGroupRepository extends JpaRepository<CodeGroup, String>{

}
 