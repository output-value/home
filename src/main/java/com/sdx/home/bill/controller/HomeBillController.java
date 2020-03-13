package com.sdx.home.bill.controller;


import com.sdx.home.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author sdx
 * @since 2020-03-13
 */
@RestController
@RequestMapping(value = "bill",method = RequestMethod.GET)
public class HomeBillController {


    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping("addBill")
    public String addBill() {
        return "你好" + userMapper.selectById(1);
    }
}
