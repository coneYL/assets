package com.cone.yang.assets.user.service;

import com.cone.yang.assets.user.model.User;
import com.cone.yang.assets.user.repository.UserRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/12 9:24
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 创建用户
     * @return
     */
    public User save(User user){
        return userRepository.save(user);
    }

    /**
     * 所有用户列表
     * @return
     */
    public List<User> findAll(){
        return Lists.newArrayList(userRepository.findAll());
    }
}
