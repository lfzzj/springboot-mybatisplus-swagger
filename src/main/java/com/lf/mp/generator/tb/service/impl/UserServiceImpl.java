package com.lf.mp.generator.tb.service.impl;

import com.lf.mp.generator.tb.entity.User;
import com.lf.mp.generator.tb.mapper.UserMapper;
import com.lf.mp.generator.tb.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lf
 * @since 2020-10-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
