package com.example.lesson.dao;

import com.example.lesson.ProductRecord;

import java.sql.SQLException;
import java.util.List;

public interface IProductDao {
    List<ProductRecord> findAll();
    ProductRecord findById(int searchId);
    int insert(ProductRecord data);
    int update(ProductRecord data);
    int delete(int id);

}