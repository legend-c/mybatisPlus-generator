package com.tydic.work.service.impl;

import com.tydic.work.dao.po.EmpWorktime;
import com.tydic.work.dao.mapper.EmpWorktimeMapper;
import com.tydic.work.service.IEmpWorktimeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工工时表  服务实现类
 * </p>
 *
 * @author lungic
 * @since 2020-06-14
 */
@Service
public class EmpWorktimeServiceImpl extends ServiceImpl<EmpWorktimeMapper, EmpWorktime> implements IEmpWorktimeService {

}
