package com.sf.sgs.manager.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sf.sgs.domain.customerAccount;
import com.sf.sgs.domain.customerAccountExample;
import com.sf.sgs.mapper.customerAccountMapper;
import com.sf.sgs.manager.customerAccountManager;

/**
 * customerAccountManager实现类
 *
 * @author 594829
*/
@Component
public class customerAccountManagerImpl implements customerAccountManager {

	@Autowired
	private customerAccountMapper customerAccountMapper;
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
	@Override
    public int countByExample(customerAccountExample example){
		return customerAccountMapper.countByExample(example);
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
    public int deleteByExample(customerAccountExample example){
		return customerAccountMapper.deleteByExample(example);
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
		return customerAccountMapper.deleteByPrimaryKey(id);
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
    public int insert(customerAccount record){
	    return customerAccountMapper.insert(record);
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
    public int insertSelective(customerAccount record){
		return customerAccountMapper.insertSelective(record);
	}
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<customerAccount> 记录列表
	 *
    */
	@Override
    public List<customerAccount> selectByExample(customerAccountExample example){
		return customerAccountMapper.selectByExample(example);
	}

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return customerAccount 记录 
	 *
    */
	@Override
    public customerAccount selectByPrimaryKey(Long id){
		return customerAccountMapper.selectByPrimaryKey(id);
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
    public int updateByExampleSelective(customerAccount record, customerAccountExample example){
		return customerAccountMapper.updateByExampleSelective(record, example);
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
    public int updateByExample(customerAccount record,  customerAccountExample example){
		return customerAccountMapper.updateByExample(record, example);
	}

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    public int updateByPrimaryKeySelective(customerAccount record){
		return customerAccountMapper.updateByPrimaryKeySelective(record);
	}


	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
	@Override
    public int updateByPrimaryKey(customerAccount record){
		return customerAccountMapper.updateByPrimaryKey(record);
	}
	
}