package com.sf.sgs.manager.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sf.sgs.domain.courierAccount;
import com.sf.sgs.domain.courierAccountExample;
import com.sf.sgs.mapper.courierAccountMapper;
import com.sf.sgs.manager.courierAccountManager;

/**
 * courierAccountManager实现类
 *
 * @author 594829
*/
@Component
public class courierAccountManagerImpl implements courierAccountManager {

	@Autowired
	private courierAccountMapper courierAccountMapper;
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
	@Override
    public int countByExample(courierAccountExample example){
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
    public int deleteByExample(courierAccountExample example){
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
    public int insert(courierAccount record){
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
    public int insertSelective(courierAccount record){
		return courierAccountMapper.insertSelective(record);
	}
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<courierAccount> 记录列表
	 *
    */
	@Override
    public List<courierAccount> selectByExample(courierAccountExample example){
		return courierAccountMapper.selectByExample(example);
	}

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return courierAccount 记录 
	 *
    */
	@Override
    public courierAccount selectByPrimaryKey(Long id){
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
    public int updateByExampleSelective(courierAccount record, courierAccountExample example){
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
    public int updateByExample(courierAccount record,  courierAccountExample example){
		return courierAccountMapper.updateByExample(record, example);
	}

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    public int updateByPrimaryKeySelective(courierAccount record){
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
    public int updateByPrimaryKey(courierAccount record){
		return courierAccountMapper.updateByPrimaryKey(record);
	}
	
}