package com.sdx.home.db;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data()
@TableName("home_bill")
public class BillDb {
    private int id;
    private String userId;
    private String money;
    private String note;
    private String date;
    private String typeId;
    private String createTime;
}
