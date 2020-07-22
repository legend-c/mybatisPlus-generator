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
 * 员工工时表 
 * </p>
 *
 * @author lungic
 * @since 2020-06-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_emp_worktime")
@ApiModel(value="EmpWorktime对象", description="员工工时表 ")
public class EmpWorktime extends PageCommon {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "work_id", type = IdType.AUTO)
    private Long workId;

    @ApiModelProperty(value = "员工id")
    private Long empId;

    @ApiModelProperty(value = "项目集id")
    private Integer collectionId;

    @ApiModelProperty(value = "大项目")
    private Integer projectId1;

    @ApiModelProperty(value = "子项目")
    private Integer projectId2;

    @ApiModelProperty(value = "子子项目")
    private Integer projectId3;

    @ApiModelProperty(value = "工时月份")
    private String workMonth;

    @ApiModelProperty(value = "工时")
    private BigDecimal wokingTimes;

    @ApiModelProperty(value = "导入批次id")
    private String serialId;

    @ApiModelProperty(value = "删除状态，0正常，1删除")
    private String deleteStatus;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
