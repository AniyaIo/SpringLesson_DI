package com.example.lesson;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductServiceTest {
//    @Test
//    public void findByIdTest(){
//        var service=new ProductService();
//        var expected= new ProductRecord(2,"定規",250);
//        var result =service.findById(2);
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void findByIdTest2(){
//        var service=new ProductService();
//
//        //エラーが出れば成功
//        ProductNotFoundException expected = assertThrows(ProductNotFoundException.class, () -> service.findById(22222));
//        assertThat(expected.getMessage(), is("IDが存在しません"));
//    }
//
//    @Test
//    public void findByNameTest(){
//        var service=new ProductService();
//        List<ProductRecord> expected= new ArrayList<ProductRecord>();
//        expected.add(new ProductRecord(3,"地球儀",5000));
//        var result =service.findByName("地球");
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void findByNameTest2(){
//        var service=new ProductService();
//        List<ProductRecord> expected= new ArrayList<ProductRecord>();
//        var result =service.findByName("水筒");
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void insertTest(){
//        var service=new ProductService();
//        var expected= 1;
//        var result =service.insert(new ProductRecord(1,"筆箱",1000));
//
//        assertEquals(expected, result);
//    }
//    @Test
//    public void insertTest2(){
//        var service=new ProductService();
//        var expected= 1;
//        var result =service.insert(new ProductRecord(1,"筆箱",1000));
//        result =service.insert(new ProductRecord(1,"筆箱",1000));
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void updateTest(){
//        var service=new ProductService();
//        var expected= 1;
//        var result =service.update(new ProductRecord(10,"シャーペン",100));
//
//        assertEquals(expected, result);
//    }
//    @Test
//    public void updateTest2(){
//        var service=new ProductService();
//        var expected= 1;
//        var result =service.update(new ProductRecord(11,"紙粘土",300));
//        result =service.update(new ProductRecord(9,"鉛筆削り",1000));
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void deleteTest(){
//        var service=new ProductService();
//        var expected= 1;
//        var result =service.delete(6);
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void bulkInsertTest(){
//        var data = new ArrayList<ProductRecord>();
//        data.add(new ProductRecord(1,"シャー芯",80));
//        data.add(new ProductRecord(1,"蛍光ペン(赤)",60));
//        data.add(new ProductRecord(1,"蛍光ペン(緑)",60));
//
//        var service=new ProductService();
//        var expected= data.size();
//        var result =service.bulkInsert(data);
//
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void bulkInsertTest2(){
//        var data = new ArrayList<ProductRecord>();
//        data.add(new ProductRecord(1,"シャー芯",80));
//        data.add(new ProductRecord(1,"50文字を超える入力50文字を超える入力50文字を超える入力50文字を超える入力50文字を超える入力5",60));
//        data.add(new ProductRecord(1,"蛍光ペン(緑)",60));
//
//        var service=new ProductService();
//        var expected= 0;
//        var result =service.bulkInsert(data);
//
//        assertEquals(expected, result);
//    }
//

}