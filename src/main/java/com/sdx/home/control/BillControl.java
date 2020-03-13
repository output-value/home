package com.sdx.home.control;

import com.sdx.home.db.UserDb;
import com.sdx.home.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 账单的control
 */
@RequestMapping(value = "bill",method = RequestMethod.GET)
@RestController
public class BillControl {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("addBill")
    public String addBill(){
        UserDb userDb = userMapper.selectById("1");
        return "hello"+userDb;
    }
}
