package com.cone.yang.assets.user;

import com.cone.yang.assets.user.model.User;
import com.cone.yang.assets.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

/**
 * 用户启动类
 * @version 1.0.0.1
 * @author yanglei
 */
@SpringBootApplication
public class AssetsUserApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(AssetsUserApplication.class, args);
    }

    public void setUpUser(){
        User user = new User();
        user.setName("李四");
        user.setRegisterDate(LocalDateTime.now());

        userRepository.save(user);
    }

    @Override
    public void run(String... args) throws Exception {
       setUpUser();
    }
}
