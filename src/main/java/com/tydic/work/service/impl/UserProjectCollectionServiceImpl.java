package com.tydic.work.service.impl;

import com.tydic.work.dao.po.UserProjectCollection;
import com.tydic.work.dao.mapper.UserProjectCollectionMapper;
import com.tydic.work.service.IUserProjectCollectionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 项目集表 服务实现类
 * </p>
 *
 * @author lungic
 * @since 2020-06-14
 */
@Service
public class UserProjectCollectionServiceImpl extends ServiceImpl<UserProjectCollectionMapper, UserProjectCollection> implements IUserProjectCollectionService {

}
