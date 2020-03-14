package com.sdx.home.domain.request;


import lombok.Data;

/**
 * Created by dx on {DATE}.
 */
@Data
public class AddBillDomain {

    private Integer userId;

    /**
     * 花的钱
     */
    private String money;

    /**
     * 备注
     */
    private String note;

    /**
     * 花费类型
     */
    private Integer typeId;

    private String date;
}
