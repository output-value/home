package com.sdx.home.user.service.impl;

import com.sdx.home.user.entity.User;
import com.sdx.home.user.mapper.UserMapper;
import com.sdx.home.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sdx
 * @since 2020-03-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
