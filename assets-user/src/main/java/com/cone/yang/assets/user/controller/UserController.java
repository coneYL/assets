package com.cone.yang.assets.user.controller;

import com.cone.yang.assets.user.converter.UserConverter;
import com.cone.yang.assets.user.dto.ResultDTO;
import com.cone.yang.assets.user.dto.UserDTO;
import com.cone.yang.assets.user.model.User;
import com.cone.yang.assets.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 用户管理
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/10 16:59
 */
@RestController
@RequestMapping(value = "/assert/user", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"用户管理接口" })
public class UserController {
    @Autowired
    private UserConverter userConverter;
    @Autowired
    private UserService userService;


    @ApiOperation(value = "新建用户")
    @PostMapping
    public ResultDTO<UserDTO> create(@RequestBody @Valid final UserDTO userDTO) {
        User user = userConverter.toModel(userDTO);
        user = userService.save(user);
        return ResultDTO.success(userConverter.toDTO(user));
    }

    @GetMapping
    @ApiOperation(value = "所有用户")
    public ResultDTO<List<UserDTO>> findAll() {
        List<User> userList = userService.findAll();
        return ResultDTO.success(userConverter.toDTOList(userList));
    }
}
