package com.sdx.home.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sdx.home.db.UserDb;
import org.apache.ibatis.annotations.Mapper;

/**
 * create by sdx
 * 数据库user的mapper
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDb> {

}
