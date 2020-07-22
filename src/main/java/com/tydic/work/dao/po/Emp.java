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
 * 员工信息表
 * </p>
 *
 * @author lungic
 * @since 2020-06-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_emp")
@ApiModel(value="Emp对象", description="员工信息表")
public class Emp extends PageCommon {

    private static final long serialVersionUID=1L;

    @TableId(value = "emp_id", type = IdType.AUTO)
    private Long empId;

    @ApiModelProperty(value = "员工名")
    private String empName;

    @ApiModelProperty(value = "员工花名")
    private String empNameAlias;

    @ApiModelProperty(value = "员工职别 1/2/3/4/分别对应 初级/中级/高级(p6)/阿里非专家/阿里专家")
    private Integer empLevel;

    @ApiModelProperty(value = "员工级别名称 初级/中级/高级(p6)/专家(p7)/p8/p9")
    private String empLevelName;

    @ApiModelProperty(value = "对应阿里或厂家的级别，如阿里的p6,p7,p8,p9等")
    private String empLevelAlias;

    @ApiModelProperty(value = "驻场状态 1持续驻场/2撤离项目")
    private String empStatus;

    @ApiModelProperty(value = "公司id")
    private Integer companyId;

    @ApiModelProperty(value = "所属公司")
    private String companyName;

    @ApiModelProperty(value = "派驻岗位")
    private String empPost;

    @ApiModelProperty(value = "是否isv原厂,1/是,2/否")
    private String empIsv;

    @ApiModelProperty(value = "毕业时间")
    private Date empGraduateDate;

    @ApiModelProperty(value = "导入批次号 批量导入时有")
    private String importSerial;

    @ApiModelProperty(value = "小组id,一般阿里才有")
    private Integer classId;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "删除状态，0正常，1删除")
    private String deleteStatus;

    @ApiModelProperty(value = "入场时间")
    private Date entryTime;

    @ApiModelProperty(value = "退场时间")
    private Date exitTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
