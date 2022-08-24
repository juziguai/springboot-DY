package com.xtyu.toolapi;

import com.xtyu.toolapi.mapper.UserMapper;
import com.xtyu.toolapi.model.UserPO.UserPO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbvApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void ceshi(){
        for (UserPO userPO : userMapper.selectList(null)) {
            System.out.println(userPO.toString());
        }
    }
}
