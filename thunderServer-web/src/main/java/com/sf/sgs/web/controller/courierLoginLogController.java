package com.sf.sgs.web.controller;

import java.util.Map;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.Page;
import com.sf.sgs.domain.courierLoginLog;
import com.sf.sgs.domain.courierLoginLogExample;
import com.sf.sgs.service.courierLoginLogService;

/**
 * courierLoginLogController类
 *
 * @author 594829
*/
@RequestMapping("courierLoginLog")
@Controller
public class courierLoginLogController {

	@Autowired
    private courierLoginLogService courierLoginLogService;
    
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 *
	 * @return int 记录总数
	 *
    */
    @RequestMapping("countByExample")
    @ResponseBody
	public Integer countByExample(courierLoginLogExample example){
		int count = 0;
	    count = courierLoginLogService.countByExample(example);
	    return count;
	}

	/**
	 * 按主键删除
	 * 
	 * @param id 
	 * 
	 * @return int 成功条数  
	 *
    */
	@RequestMapping("deleteByPrimaryKey")
    @ResponseBody
    public Boolean deleteByPrimaryKey(Long id){
    	if(id == null){
    		throw new IllegalStateException("参数id不能为空");
    	}
    	int count = 0;
    	count = courierLoginLogService.deleteByPrimaryKey(id);
        return  count > 0;
    }

	/**
	 * 新增
	 * 
	 * @param record 记录
	 * 
	 * @return int 成功条数  
	 *
    */
	@RequestMapping("insert")
    @ResponseBody
    public Boolean insert(courierLoginLog record){
    	if(record == null){
			throw new IllegalStateException("参数record不能为空");
		}
    	if(record.getId() == null){
    		throw new IllegalStateException("主键id属性不能为空");
    	}
    	int count = 0;
    	count = courierLoginLogService.insert(record);
        return  count > 0;
    }
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * @param offset 起始条数偏移量
	 * @param pageSize  每页数量
	 * 
	 * @return  List<courierLoginLog> 记录列表 
	 *
    */	
	@RequestMapping("selectByExample")
    @ResponseBody
    public Map<String, Object> selectByExample(courierLoginLog record, Integer offset, Integer pageSize){
    	if(offset != null && offset < 0){
			throw new IllegalStateException("参数offset不能小于0");
		}
		if(pageSize != null && pageSize < 1){
			throw new IllegalStateException("参数pageSize不能小于1");
		}
		if((offset == null && pageSize != null)
			||(offset != null && pageSize == null)){
			throw new IllegalStateException("offset、pageSize必须同时为null或不为null");
		}
		Integer pageNum = null;
		if(pageSize != null){
			pageNum = (offset.intValue() / pageSize.intValue()) + 1;
		}
   		Map<String, Object> resultMap = new HashMap<String, Object>();
    	courierLoginLogExample example = new courierLoginLogExample(); 
    	Page<courierLoginLog> rows = null;
		rows = courierLoginLogService.selectByExample(example, pageNum, pageSize);
		resultMap.put("rows", rows.getResult());
		resultMap.put("totalRecord", rows.getTotal());
        return resultMap;
    }

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return courierLoginLog 记录 
	 *
    */	
	@RequestMapping("selectByPrimaryKey")
    @ResponseBody
	public courierLoginLog selectByPrimaryKey(Long id){
    	if(id == null){
    		throw new IllegalStateException("参数id不能为空");
    	}
	    return courierLoginLogService.selectByPrimaryKey(id);
	}
	
	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
     *
	 * @return int 成功条数  
	 *
    */
	@RequestMapping("updateByPrimaryKeySelective")
    @ResponseBody
	public Boolean updateByPrimaryKeySelective(courierLoginLog record){
		if(record == null){
			throw new IllegalStateException("参数record不能为空");
		}
    	if(record.getId() == null){
    		throw new IllegalStateException("主键id属性不能为空");
    	}
	    int count = 0;
		count = courierLoginLogService.updateByPrimaryKeySelective(record);
	    return count > 0; 
	}

	/**
	 * 按主键更新
	 * 
	 * @param record 记录
     *
	 * @return int 成功条数  
	 *
    */
	@RequestMapping("updateByPrimaryKey")
    @ResponseBody
    public Boolean updateByPrimaryKey(courierLoginLog record){
    	if(record == null){
			throw new IllegalStateException("参数record不能为空");
		}
    	if(record.getId() == null){
    		throw new IllegalStateException("主键id属性不能为空");
    	}
    	int count = 0;
    	count = courierLoginLogService.updateByPrimaryKey(record);
        return count > 0;
    }
	
}