package com.cone.yang.assets.user.controller;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 房产管理
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/10 16:38
 */
@RestController
@RequestMapping(value = "/assert/house", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"Web端-展示管理-节目管理-布局模版API" })
public class AssertHouseController {
}
