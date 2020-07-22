package com.tydic.work.dao.po;

import java.math.BigDecimal;
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
 * 项目表
 * </p>
 *
 * @author lungic
 * @since 2020-06-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_project")
@ApiModel(value="Project对象", description="项目表")
public class Project extends PageCommon {

    private static final long serialVersionUID=1L;

    @TableId(value = "t_id", type = IdType.AUTO)
    private Integer tId;

    private String projectName;

    @ApiModelProperty(value = "父项目ID，一级项目为0")
    private Integer pid;

    @ApiModelProperty(value = "所属的项目集id")
    private Integer collectionId;

    @ApiModelProperty(value = "删除状态，0正常，1删除")
    private String deleteStatus;

    @ApiModelProperty(value = "项目状态,0正常，1结束")
    private String projectStatus;

    @ApiModelProperty(value = "阿里专家计划天数")
    private BigDecimal alimajorPlanDays;

    @ApiModelProperty(value = "阿里非专家计划天数")
    private BigDecimal notAlimajorPlanDays;

    @ApiModelProperty(value = "厂家计划天数")
    private BigDecimal isvPlanDays;

    @ApiModelProperty(value = "告警阈值")
    private String alarmThreshold;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
