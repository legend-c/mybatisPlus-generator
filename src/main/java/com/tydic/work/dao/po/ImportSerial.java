package com.tydic.work.dao.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.tydic.work.common.PageCommon;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 工时导入批次表 
 * </p>
 *
 * @author lungic
 * @since 2020-06-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_import_serial")
@ApiModel(value="ImportSerial对象", description="工时导入批次表 ")
public class ImportSerial extends PageCommon {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "批次号")
    private String serialId;

    @ApiModelProperty(value = "导入内容简述")
    private String serialDesc;

    @ApiModelProperty(value = "导入类型，1/工时导入,2/员工导入")
    private Integer importType;

    @ApiModelProperty(value = "导入用户")
    private String importUser;

    @ApiModelProperty(value = "导入文件名")
    private String importFileName;

    private String resultCode;

    @ApiModelProperty(value = "导入结果描述")
    private String resultDesc;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
