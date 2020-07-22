package com.tydic.work.service.impl;

import com.tydic.work.dao.po.SysUser;
import com.tydic.work.dao.mapper.SysUserMapper;
import com.tydic.work.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author lungic
 * @since 2020-06-14
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
