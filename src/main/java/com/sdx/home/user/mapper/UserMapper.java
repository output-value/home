package com.sdx.home.user.mapper;

import com.sdx.home.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import javax.validation.constraints.PastOrPresent;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sdx
 * @since 2020-03-13
 */
public interface UserMapper extends BaseMapper<User> {

}
