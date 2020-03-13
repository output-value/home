package com.sdx.home.db;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data()
@TableName("home_bill_type")
public class BillTypeDb {
    private int id;
    private String name;

}
