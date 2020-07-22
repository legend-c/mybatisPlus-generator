package com.tydic.work.service.impl;

import com.tydic.work.dao.po.CompanyProject;
import com.tydic.work.dao.mapper.CompanyProjectMapper;
import com.tydic.work.service.ICompanyProjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司项目关系表 服务实现类
 * </p>
 *
 * @author lungic
 * @since 2020-06-14
 */
@Service
public class CompanyProjectServiceImpl extends ServiceImpl<CompanyProjectMapper, CompanyProject> implements ICompanyProjectService {

}
