package com.lt;

import com.lt.entity.BatchTest;
import com.lt.mapper.BatchTestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lucine
 * @version 1.0 2022/8/21 15:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {

    @Autowired
    BatchTestMapper batchTestMapper;

    //for循环更改为主键+1
    @Test
    public void testUpdate(){
        //测试for循环
//        100 |500 |1000|1w|10w
//        382ms |942ms |1391ms|8119ms|73591ms
        BatchTest batchTest =  new BatchTest();
        long start = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 2; i++) {
//        for (int i = 0; i < 5; i++) {
//        for (int i = 0; i < 10; i++) {
//        for (int i = 0; i < 100; i++) {
//        for (int i = 0; i < 500; i++) {
//        for (int i = 0; i < 1000; i++) {
//        for (int i = 0; i < 10000; i++) {
//        for (int i = 0; i < 100000; i++) {
//        for (int i = 0; i < 200000; i++) {
            batchTest.setEmpNo(i);
            batchTest.setTitle(i+1+"");
            batchTestMapper.updateById(batchTest);
        }
        System.out.println("共耗时" + (start - System.currentTimeMillis())+ "ms");


//        测试MyBatis foreach
//        100 |500 |1000|1w|10w
//        289ms |515ms |791ms|5828ms|55621ms
//        long start = System.currentTimeMillis();
//
//        System.out.println(start);
//        List<BatchTest> batchTests =new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//        for (int i = 0; i < 10; i++) {
//        for (int i = 0; i < 100; i++) {
//        for (int i = 0; i < 500; i++) {
//        for (int i = 0; i < 1000; i++) {
//        for (int i = 0; i < 10000; i++) {
//        for (int i = 0; i < 100000; i++) {
//        for (int i = 0; i < 200000; i++) {
//            BatchTest batchTest = new BatchTest();
//            batchTest.setEmpNo(i);
//            batchTest.setTitle(i+1+"");
//            batchTests.add(batchTest);
//        }
//        batchTestMapper.updateForList(batchTests);
//        System.out.println("共耗时" + (start - System.currentTimeMillis())+ "ms");
    }

    @Test
    public void testAdd(){
        //测试for循环
//(49845 + 51166 +50504)/3
//       2      |5   |10 | 100   |500  |1000   |1w  |10w
//      194ms|206ms| 221ms|373ms|815ms|1144ms|6573ms|50505ms
        BatchTest batchTest =  new BatchTest();
        long start = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
//        for (int i = 0; i < 2; i++) {
//        for (int i = 0; i < 5; i++) {
//        for (int i = 0; i < 10; i++) {
//        for (int i = 0; i < 100; i++) {
//        for (int i = 0; i < 500; i++) {
//        for (int i = 0; i < 1000; i++) {
//        for (int i = 0; i < 10000; i++) {
        for (int i = 0; i < 100000; i++) {
//        for (int i = 0; i < 200000; i++) {
            batchTest.setEmpNo(i);
            batchTest.setTitle(i+1+"");
            batchTestMapper.insert(batchTest);
        }
        System.out.println("共耗时" + (start - System.currentTimeMillis())+ "ms");
        batchTestMapper.delete(null);

//        测试MyBatis foreach
//      (3525 + 3640 +3485)/3
//       2      |5   |10    | 100   |500  |1000   |1w  |10w|20w
//       170ms |191ms |223ms|225ms|195ms  |215ms|498ms |2250ms|3550ms
//        long start = System.currentTimeMillis();
//        List<BatchTest> batchTests =new ArrayList<>();
//        for (int i = 0; i < 2; i++) {
//        for (int i = 0; i < 5; i++) {
//        for (int i = 0; i < 10; i++) {
//        for (int i = 0; i < 100; i++) {
//        for (int i = 0; i < 500; i++) {
//        for (int i = 0; i < 1000; i++) {
//        for (int i = 0; i < 10000; i++) {
//        for (int i = 0; i < 100000; i++) {
//        for (int i = 0; i < 200000; i++) {
//            BatchTest batchTest = new BatchTest();
//            batchTest.setEmpNo(i);
//            batchTest.setTitle(i+1+"");
//            batchTests.add(batchTest);
//        }
//        batchTestMapper.addForList(batchTests);
//        System.out.println("共耗时" + (start - System.currentTimeMillis())+ "ms");
//        batchTestMapper.delete(null);
    }
}
