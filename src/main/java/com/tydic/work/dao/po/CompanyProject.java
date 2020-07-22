package com.tydic.work.dao.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.tydic.work.common.PageCommon;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 公司项目关系表
 * </p>
 *
 * @author lungic
 * @since 2020-06-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_company_project")
@ApiModel(value="CompanyProject对象", description="公司项目关系表")
public class CompanyProject extends PageCommon {

    private static final long serialVersionUID=1L;

    @TableId(value = "t_id", type = IdType.AUTO)
    private Long tId;

    @ApiModelProperty(value = "公司id")
    private Integer companyId;

    @ApiModelProperty(value = "项目id，记录到最小层级")
    private Integer projectId;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
