package com.cone.yang.assets.user.converter;

import com.cone.yang.assets.user.dto.UserDTO;
import com.cone.yang.assets.user.model.User;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户传输对象转换器
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/12 9:18
 */
@Component
public class UserConverter extends AbstractBaseConverter<User,UserDTO> {

    @Override
    public User toModel(UserDTO userDTO){
        User user = new User();
        user.setName(userDTO.getName());
        user.setRegisterDate(LocalDateTime.now());
        return user;
    }

    @Override
    public UserDTO toDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        return userDTO;
    }

}
