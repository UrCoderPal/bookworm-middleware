package com.example.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.MyShelf;
import com.example.entities.ProductMaster;

@Repository
public interface MyShelfRepository extends JpaRepository<MyShelf, Long> {

}