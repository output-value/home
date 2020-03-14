package com.sdx.home.domain.request;


import lombok.Data;

/**
 * Created by dx on {DATE}.
 */
@Data
public class BillListDomain {
    /**
     * 查询开始日期
     */
    private String fromDate;
    /**
     * 查询结束时间
     */
    private String endDate;
    /**
     * 查询的用户id
     */
    private Integer userId;
    /**
     * 查询花费的类型
     */
    private Integer type;
}
