package com.sf.sgs.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sf.sgs.domain.App;
import com.sf.sgs.domain.AppExample;
import com.sf.sgs.manager.AppManager;
import com.sf.sgs.service.AppService;
/**
 * appService实现类
 *
 * @author 594829
*/
@Service
public class AppServiceImpl implements AppService {

	private Logger logger = LoggerFactory.getLogger(getClass());
			
	@Autowired
	AppManager appManager;
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return Integer 记录总数
	 *
    */
	public Integer countByExample(AppExample example) {
		int count = 0;
		try{
			count = appManager.countByExample(example);
		}
		catch(Exception e){
			logger.error("countByExample error", e);
		}
		return count;
	}

	/**
	 * 按主键删除
	 * 
	 * @param appId 唯一的ID（没有啥意义，主键，自增长而已）
	 * 
	 * @return Integer 成功条数  
	 *
    */
    public Integer deleteByPrimaryKey(Long appId){
    	if(appId == null){
    		throw new IllegalStateException("参数appId不能为空");
    	}
		int count = 0;
		try{
			count = appManager.deleteByPrimaryKey(appId);
		}
		catch(Exception e){
			logger.error("deleteByPrimaryKey error", e);
		}
		return count;
	}

	/**
	 * 新增
	 * 
	 * @param record 记录
	 * 
	 * @return Integer 成功条数  
	 *
    */
    public Integer insert(App record){
		if(record == null){
			throw new IllegalStateException("参数record不能为空");
		}
    	if(record.getAppId() == null){
    		throw new IllegalStateException("主键appId属性不能为空");
    	}
		int count = 0;
		try{
			count = appManager.insert(record);
		}
		catch(Exception e){
			logger.error("insert error", e);
		}
		return count;
	}
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * @param pageNum 页码
	 * @param pageSize 每页数量
	 * 
	 * @return  Page 
	 *
    */
    public Page<App> selectByExample(AppExample example, Integer pageNum, Integer pageSize){
		if(pageNum != null && pageNum < 1){
			throw new IllegalStateException("参数pageNum不能小于1");
		}
		if(pageSize != null && pageSize < 1){
			throw new IllegalStateException("参数pageSize不能小于1");
		}
		if((pageNum == null && pageSize != null)
			||(pageNum != null && pageSize == null)){
			throw new IllegalStateException("pageNum、pageSize必须同时为null或不为null");
		}
		if(pageNum == null && pageSize == null){ //一次查所有数据
			pageNum = 1;
			pageSize = 0;
		}
		Page<App> records = new Page<App>();
		PageHelper.startPage(pageNum, pageSize);
		try{
			records = (Page<App>)appManager.selectByExample(example);
		}
		catch(Exception e){
			logger.error("selectByExample error", e);
		}
		return records;
	}

	/**
	 * 按主键查询
	 * 
	 * @param appId 唯一的ID（没有啥意义，主键，自增长而已）
	 * 
	 * @return  List 
	 *
    */
	public App selectByPrimaryKey(Long appId){
    	if(appId == null){
    		throw new IllegalStateException("参数appId不能为空");
    	}
		App record = null;
		try{
			record = appManager.selectByPrimaryKey(appId);
		}
		catch(Exception e){
			logger.error("selectByPrimaryKey error", e);
		}
		return record;
	}

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return  List 
	 *
    */
	public Integer updateByPrimaryKeySelective(App record){
		if(record == null){
			throw new IllegalStateException("参数record不能为空");
		}
    	if(record.getAppId() == null){
    		throw new IllegalStateException("主键appId属性不能为空");
    	}
		int count = 0;
		try{
			count = appManager.updateByPrimaryKeySelective(record);
		}
		catch(Exception e){
			logger.error("updateByPrimaryKeySelective error", e);
		}
		return count;
	}

	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return Integer 成功条数  
	 *
    */
    public Integer updateByPrimaryKey(App record){
		if(record == null){
			throw new IllegalStateException("参数record不能为空");
		}
    	if(record.getAppId() == null){
    		throw new IllegalStateException("主键appId属性不能为空");
    	}
		int count = 0;
		try{
			count = appManager.updateByPrimaryKey(record);
		}
		catch(Exception e){
			logger.error("updateByPrimaryKey error", e);
		}
		return count;
	}
	
}