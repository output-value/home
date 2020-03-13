package com.sdx.home.bill.entity;

import com.sdx.home.db.BaseDb;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sdx
 * @since 2020-03-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class HomeBill extends BaseDb {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 花的钱
     */
    private Float money;

    /**
     * 备注
     */
    private String note;

    /**
     * 日期
     */
    private LocalDateTime date;

    /**
     * 花费类型
     */
    private Integer typeId;


}
