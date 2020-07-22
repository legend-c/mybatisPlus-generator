package com.tydic.work.common;

import com.baomidou.mybatisplus.annotation.TableField;

import lombok.Data;

@Data
public class PageCommon {

	//页数
	@TableField(exist = false)
	private Integer pageNum;
	//每页大小
	@TableField(exist = false)
	private Integer pageSize;
	
	
}
