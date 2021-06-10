package com.sky.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@Api(value = "User-API",description = "这是用户接口详细信息的描述")
@RestController
@RequestMapping("/test")
public class TestController {

    static Map<String, User> users = Collections.synchronizedMap(new HashMap<String, User>());


    @ApiOperation(value = "获取用户列表", notes = "根据url的id来获取用户详细信息，返回List<User>类型用户信息的JSON")
    @RequestMapping(value = {""}, method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public List<User> getUserList() {
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }

    ....省略n行代码
}
