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
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class WorkDaily extends BaseDb {

    private static final long serialVersionUID = 1L;

    private String content;

    /**
     * 日期
     */
    private LocalDateTime date;


}
