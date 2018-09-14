package com.zjcy;

import com.zjcy.dao.UserDao;
import com.zjcy.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JsonContent;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author flyap
 * @email 927840351@qq.com
 * @date 2018/9/11
 * @used
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
     @Autowired
     private UserDao userDao;
     @Test
     public  void  findUser(){
     UserEntity userEntity= userDao.findByUserId(1L);
         System.out.println(userEntity.getUsername());
     }




}
