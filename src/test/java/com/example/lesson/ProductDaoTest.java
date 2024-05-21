package com.example.lesson;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductDaoTest {
//    @Test
//    public void findByIdTest(){
//        ProductRecord expected=new ProductRecord(1,"鉛筆",50);
//        var dao=new ProductDao(DBUtil.getConnection());
//        ProductRecord result = null;
//        try {
//            result = dao.findById(1);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        assertEquals(expected, result);
//    }
//    @Test
//    public void findByIdTest2(){
//        ProductRecord expected=null;
//        var dao=new ProductDao(DBUtil.getConnection());
//        ProductRecord result = null;
//        try {
//            result = dao.findById(-1);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void findByNameTest(){
//        var dao=new ProductDao(DBUtil.getConnection());
//
//        List<ProductRecord> expected=new ArrayList<ProductRecord>();
//        expected.add(new ProductRecord(2,"消しゴム",100));
//        List<ProductRecord> result = null;
//        try {
//            result = dao.findByName("しゴ");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void insertTest(){
//        var dao=new ProductDao(DBUtil.getConnection());
//
//        var expected=0;
//        //idは連番で設定されるので何番でも良い
//        int result = 0;
//        try {
//            result = dao.insert(new ProductRecord(4,"ノート",300));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void insertTest2(){
//        var dao=new ProductDao(DBUtil.getConnection());
//
//        var expected=1;
//        int result = 0;
//        try {
//            result = dao.insert(new ProductRecord(5,"定規",250));
//            result =dao.insert(new ProductRecord(5,"定規",250));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void updateTest(){
//        var dao=new ProductDao(DBUtil.getConnection());
//
//        var expected=1;
//        int result = 0;
//        try {
//            result = dao.update(new ProductRecord(2,"定規",250));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void updateTest2(){
//        var dao=new ProductDao(DBUtil.getConnection());
//
//        var expected=0;
//        int result = 0;
//        try {
//            result = dao.update(new ProductRecord(5555,"定規",250));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void deleteTest(){
//        var dao=new ProductDao(DBUtil.getConnection());
//
//        var expected=1;
//        int result = 0;
//        try {
//            result = dao.delete(5);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void deleteTest2(){
//        var dao=new ProductDao(DBUtil.getConnection());
//
//        var expected=0;
//        int result = 0;
//        try {
//            result = dao.delete(55555);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        assertEquals(expected, result);
//    }
}