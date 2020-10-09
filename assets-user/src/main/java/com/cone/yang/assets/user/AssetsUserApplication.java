package com.cone.yang.assets.user;

import com.cone.yang.assets.user.model.AssetsType;
import com.cone.yang.assets.user.model.User;
import com.cone.yang.assets.user.repository.AssetsTypeRepository;
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
    @Autowired
    private AssetsTypeRepository assetsTypeRepository;
    public static void main(String[] args) {
        SpringApplication.run(AssetsUserApplication.class, args);
    }

    public void setUp(){
        //buildUser();
        buildAssetsType();
    }

    private void buildAssetsType() {
        AssetsType assetsType = new AssetsType();
        assetsType.setCode("20000");
        assetsType.setName("房产");
        assetsType.setInUse(false);
        assetsTypeRepository.save(assetsType);
        Iterable<AssetsType> inUse = assetsTypeRepository.findByInUseIsTrue();
        inUse.forEach(model -> System.out.println(model.getCode()+"-"+model.getName()));
    }

    private void buildUser() {
        User user = new User();
        user.setName("王五");
        user.setRegisterDate(LocalDateTime.now());

        userRepository.save(user);
    }


    @Override
    public void run(String... args) throws Exception {
       setUp();
    }
}
