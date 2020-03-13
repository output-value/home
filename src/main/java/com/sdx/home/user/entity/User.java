package com.sdx.home.user.entity;

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
 * @since 2020-03-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class User extends BaseDb {

    private static final long serialVersionUID = 1L;

    /**
     * 用户的名字
     */
    private String name;


}
