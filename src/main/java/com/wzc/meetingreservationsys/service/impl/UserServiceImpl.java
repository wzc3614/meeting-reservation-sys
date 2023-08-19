package com.wzc.meetingreservationsys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzc.meetingreservationsys.mapper.UserMapper;
import com.wzc.meetingreservationsys.model.entity.User;
import com.wzc.meetingreservationsys.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
