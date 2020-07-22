package com.tydic.work.service.impl;

import com.tydic.work.dao.po.Emp;
import com.tydic.work.dao.mapper.EmpMapper;
import com.tydic.work.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息表 服务实现类
 * </p>
 *
 * @author lungic
 * @since 2020-06-14
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

}
