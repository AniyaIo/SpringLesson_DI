package com.example.lesson.service;

import com.example.lesson.ProductRecord;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    List<ProductRecord> findAll();
    ProductRecord findById(int searchId);
    int insert(ProductRecord data);
    int update(ProductRecord data);
    int delete(int id);
}
