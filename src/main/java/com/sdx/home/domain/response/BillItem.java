package com.sdx.home.domain.response;

import lombok.Data;

/**
 * Created by dx on {DATE}.
 */
@Data
public class BillItem {

    private Integer id;
    /**
     * 花费的用户
     */
    private String userName;

    private Integer userId;
    /**
     * 花费金额
     */
    private String money;
    /**
     * 花费时间
     */
    private String useDate;
    /**
     * 花费类型
     */
    private String typeName;
}
