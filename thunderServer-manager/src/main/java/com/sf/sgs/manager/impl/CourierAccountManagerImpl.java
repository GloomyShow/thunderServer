package com.sf.sgs.manager.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sf.sgs.domain.CourierAccount;
import com.sf.sgs.domain.CourierAccountExample;
import com.sf.sgs.mapper.CourierAccountMapper;
import com.sf.sgs.manager.CourierAccountManager;

/**
 * CourierAccountManager实现类
 *
 * @author 594829
*/
@Component
public class CourierAccountManagerImpl implements CourierAccountManager {

	@Autowired
	private CourierAccountMapper courierAccountMapper;
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
	@Override
    public int countByExample(CourierAccountExample example){
		return courierAccountMapper.countByExample(example);
	}

	/**
	 * 按条件删除
	 * 
	 * @param example 条件
	 * 
	 * @return int 成功条数  
	 *
    */
	@Override
    public int deleteByExample(CourierAccountExample example){
		return courierAccountMapper.deleteByExample(example);
	}
	
	/**
	 * 按主键删除
	 * 
	 * @param id 
	 * 
	 * @return int 成功条数  
	 *
    */
	@Override
    public int deleteByPrimaryKey(Long id){
		return courierAccountMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 新增
	 * 
	 * @param record 记录
	 * 
	 * @return int 成功条数  
	 *
    */
	@Override
    public int insert(CourierAccount record){
	    return courierAccountMapper.insert(record);
	}
	
	/**
	 * 新增,null字段不插入
	 * 
	 * @param record 记录
	 * 
	 * @return int 成功条数  
	 *
    */
	@Override
    public int insertSelective(CourierAccount record){
		return courierAccountMapper.insertSelective(record);
	}
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<CourierAccount> 记录列表
	 *
    */
	@Override
    public List<CourierAccount> selectByExample(CourierAccountExample example){
		return courierAccountMapper.selectByExample(example);
	}

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return CourierAccount 记录 
	 *
    */
	@Override
    public CourierAccount selectByPrimaryKey(Long id){
		return courierAccountMapper.selectByPrimaryKey(id);
	}

	/**
	 * 按条件更新,null字段不更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
	@Override
    public int updateByExampleSelective(CourierAccount record, CourierAccountExample example){
		return courierAccountMapper.updateByExampleSelective(record, example);
	}

	
	/**
	 * 按条件更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
	@Override
    public int updateByExample(CourierAccount record,  CourierAccountExample example){
		return courierAccountMapper.updateByExample(record, example);
	}

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    public int updateByPrimaryKeySelective(CourierAccount record){
		return courierAccountMapper.updateByPrimaryKeySelective(record);
	}


	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
	@Override
    public int updateByPrimaryKey(CourierAccount record){
		return courierAccountMapper.updateByPrimaryKey(record);
	}
	
}