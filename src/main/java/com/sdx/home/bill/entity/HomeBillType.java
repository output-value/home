package com.sdx.home.bill.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.sdx.home.db.BaseDb;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sdx
 * @since 2020-03-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("home_bill_type")
public class HomeBillType extends BaseDb {

    private static final long serialVersionUID = 1L;

    /**
     * 类型
     */
    private String name;


}
