package com.tydic.work.dao.po;

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
 * 项目集表
 * </p>
 *
 * @author lungic
 * @since 2020-06-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="UserProjectCollection对象", description="项目集表")
public class UserProjectCollection extends PageCommon {

    private static final long serialVersionUID=1L;

    @TableId(value = "t_id", type = IdType.AUTO)
    private Long tId;

    @ApiModelProperty(value = "项目集id")
    private Integer projectCollectionId;

    @ApiModelProperty(value = "用户id")
    private Integer ownerUserId;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
