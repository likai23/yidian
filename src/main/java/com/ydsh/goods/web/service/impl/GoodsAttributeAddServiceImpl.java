/**
 * @filename:GoodsAttributeAddServiceImpl 2019-06-12 10:08:37
 * @project ydsh-saas-service-demo  V1.0
 * Copyright(c) 2018 姚仲杰 Co. Ltd. 
 * All right reserved. 
 */
package com.ydsh.goods.web.service.impl;

import com.ydsh.goods.web.entity.GoodsAttributeAdd;
import com.ydsh.goods.web.dao.GoodsAttributeAddDao;
import com.ydsh.goods.web.service.GoodsAttributeAddService;

import freemarker.core.ReturnInstruction.Return;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**   
 * <p>自定义serviceImpl写在这里</p>
 * 
 * <p>说明： 商品销售属性管理新增属性服务实现层</P>
 * @version: V1.0
 * @author: 姚仲杰
 * 
 */
@Service
public class GoodsAttributeAddServiceImpl  extends ServiceImpl<GoodsAttributeAddDao, GoodsAttributeAdd> implements GoodsAttributeAddService  {
	
	@Autowired
	private GoodsAttributeAddDao goodsAttributeAddDao;
	/**
	 * 
	* 连表查询 销售属性主表和副表
	*
	* @param @param page
	* @param @param queryWrapper
	* @param @return
	* @return
	 */
	 public Page<Map<String, Object>> selectAttributeAddWithManager(IPage<Map<String, Object>> page, @Param(Constants.WRAPPER) Wrapper<Map<String, Object>> queryWrapper){
		 return goodsAttributeAddDao.selectAttributeAddWithManager(page, queryWrapper);
	 }
}