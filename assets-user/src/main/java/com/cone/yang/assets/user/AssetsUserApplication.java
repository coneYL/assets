package com.cone.yang.assets.user;

import com.cone.yang.assets.user.model.AssetsType;
import com.cone.yang.assets.user.model.House;
import com.cone.yang.assets.user.model.Stock;
import com.cone.yang.assets.user.model.User;
import com.cone.yang.assets.user.repository.AssetsTypeRepository;
import com.cone.yang.assets.user.repository.HouseRepository;
import com.cone.yang.assets.user.repository.StockRepository;
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
    private SetupScript setupScript;


    public static void main(String[] args) {
        SpringApplication.run(AssetsUserApplication.class, args);
    }




    @Override
    public void run(String... args) throws Exception {
        setupScript.init();
    }
}
