package com.cl.code.cldemo;

import com.cl.code.cldemo.rbac.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@SpringBootTest
class ClDemoApplicationTests {

    @Autowired
    UserRepository userRepository;


    @Test
    void contextLoads() {
        User user = new User();
        user.setUserName("aaa");
        user.setUserAccount("aaa2");
        user.setEmail("aaa@777");
        user.setPhone("1507929222");
        userRepository.save(user);
    }

}
