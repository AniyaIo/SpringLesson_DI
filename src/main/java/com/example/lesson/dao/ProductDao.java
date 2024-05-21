package com.example.lesson.dao;

import com.example.lesson.ProductRecord;
import com.example.lesson.dao.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductDao implements IProductDao {
    //DB接続用コンポーネントの宣言
    @Autowired
//    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<ProductRecord> findAll() {
        return jdbcTemplate.query("SELECT * FROM products ORDER BY id",
                new DataClassRowMapper<>(ProductRecord.class));
    }

    @Override
    public ProductRecord findById(int searchId){
        var param = new MapSqlParameterSource();
        param.addValue("id", searchId);
        var list = jdbcTemplate.query("SELECT * FROM products WHERE id = :id", param, new DataClassRowMapper<>(ProductRecord.class));
        return list.isEmpty() ? null : list.get(0);

    }

    @Override
    public int insert(ProductRecord data){
        var param = new MapSqlParameterSource();
        param.addValue("name", data.name());
        param.addValue("price", data.price());
        return jdbcTemplate.update("INSERT INTO products (name,price) VALUES(:name, :price)", param);

    }

    @Override
    public int update(ProductRecord data){
        var param = new MapSqlParameterSource();
        param.addValue("id",data.id());
        param.addValue("name", data.name());
        param.addValue("price", data.price());
        return jdbcTemplate.update("UPDATE products SET name=:name, price=:price WHERE id=:id", param);
    }

    @Override
    public int delete(int id){
        var param = new MapSqlParameterSource();
        param.addValue("id",id);
        return jdbcTemplate.update("DELETE FROM products WHERE id=:id", param);
    }
}
