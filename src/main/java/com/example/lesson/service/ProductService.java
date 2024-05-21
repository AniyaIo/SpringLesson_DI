package com.example.lesson.service;

import com.example.lesson.ProductRecord;
import com.example.lesson.dao.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductDao productDao;
    @Override
    public List<ProductRecord> findAll(){
        return productDao.findAll();
    }

    @Override
    public ProductRecord findById(int searchId){
        return productDao.findById(searchId);
    }

    @Override
    public int insert(ProductRecord data){
        return productDao.insert(data);
    }
    @Override
    public int update(ProductRecord data){
        return productDao.update(data);
    }

    @Override
    public int delete(int id){
        return productDao.delete(id);
    }
}
