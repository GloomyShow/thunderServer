package com.sf.sgs.manager.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sf.sgs.domain.CourierLoginLog;
import com.sf.sgs.domain.CourierLoginLogExample;
import com.sf.sgs.mapper.CourierLoginLogMapper;
import com.sf.sgs.manager.CourierLoginLogManager;

/**
 * CourierLoginLogManager实现类
 *
 * @author 594829
*/
@Component
public class CourierLoginLogManagerImpl implements CourierLoginLogManager {

	@Autowired
	private CourierLoginLogMapper courierLoginLogMapper;
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
	@Override
    public int countByExample(CourierLoginLogExample example){
		return courierLoginLogMapper.countByExample(example);
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
    public int deleteByExample(CourierLoginLogExample example){
		return courierLoginLogMapper.deleteByExample(example);
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
		return courierLoginLogMapper.deleteByPrimaryKey(id);
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
    public int insert(CourierLoginLog record){
	    return courierLoginLogMapper.insert(record);
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
    public int insertSelective(CourierLoginLog record){
		return courierLoginLogMapper.insertSelective(record);
	}
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<CourierLoginLog> 记录列表
	 *
    */
	@Override
    public List<CourierLoginLog> selectByExample(CourierLoginLogExample example){
		return courierLoginLogMapper.selectByExample(example);
	}

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return CourierLoginLog 记录 
	 *
    */
	@Override
    public CourierLoginLog selectByPrimaryKey(Long id){
		return courierLoginLogMapper.selectByPrimaryKey(id);
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
    public int updateByExampleSelective(CourierLoginLog record, CourierLoginLogExample example){
		return courierLoginLogMapper.updateByExampleSelective(record, example);
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
    public int updateByExample(CourierLoginLog record,  CourierLoginLogExample example){
		return courierLoginLogMapper.updateByExample(record, example);
	}

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    public int updateByPrimaryKeySelective(CourierLoginLog record){
		return courierLoginLogMapper.updateByPrimaryKeySelective(record);
	}


	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
	@Override
    public int updateByPrimaryKey(CourierLoginLog record){
		return courierLoginLogMapper.updateByPrimaryKey(record);
	}
	
}