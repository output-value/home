package com.sdx.home.work.daily.entity;

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
 * @since 2020-04-06
 */
@Data
@Accessors(chain = true)
public class WorkDaily {

    private static final long serialVersionUID = 1L;
    private int id;

    private String content;

    /**
     * 日期
     */
    private String date;


}
