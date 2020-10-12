package com.cone.yang.assets.user.configuration;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
