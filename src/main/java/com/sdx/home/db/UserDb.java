package com.sdx.home.db;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data()
@TableName("user")
public class UserDb {
    private int id;
    private String name;
}
