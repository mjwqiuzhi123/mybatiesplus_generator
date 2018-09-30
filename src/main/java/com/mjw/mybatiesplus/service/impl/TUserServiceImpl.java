package com.mjw.mybatiesplus.service.impl;

import com.mjw.mybatiesplus.entity.TUser;
import com.mjw.mybatiesplus.mapper.TUserMapper;
import com.mjw.mybatiesplus.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mjw
 * @since 2018-09-17
 */
@Service
@Transactional
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
