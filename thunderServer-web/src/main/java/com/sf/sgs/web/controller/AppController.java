package com.sf.sgs.web.controller;

import java.util.Map;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.Page;
import com.sf.sgs.domain.App;
import com.sf.sgs.domain.AppExample;
import com.sf.sgs.service.AppService;

/**
 * appController类
 *
 * @author 594829
*/
@RequestMapping("app")
@Controller
public class AppController {

	@Autowired
    private AppService appService;
    
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
	public Integer countByExample(AppExample example){
		int count = 0;
	    count = appService.countByExample(example);
	    return count;
	}

	/**
	 * 按主键删除
	 * 
	 * @param appId 唯一的ID（没有啥意义，主键，自增长而已）
	 * 
	 * @return int 成功条数  
	 *
    */
	@RequestMapping("deleteByPrimaryKey")
    @ResponseBody
    public Boolean deleteByPrimaryKey(Long appId){
    	if(appId == null){
    		throw new IllegalStateException("参数appId不能为空");
    	}
    	int count = 0;
    	count = appService.deleteByPrimaryKey(appId);
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
    public Boolean insert(App record){
    	if(record == null){
			throw new IllegalStateException("参数record不能为空");
		}
    	if(record.getAppId() == null){
    		throw new IllegalStateException("主键appId属性不能为空");
    	}
    	int count = 0;
    	count = appService.insert(record);
        return  count > 0;
    }
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * @param offset 起始条数偏移量
	 * @param pageSize  每页数量
	 * 
	 * @return  List<App> 记录列表 
	 *
    */	
	@RequestMapping("selectByExample")
    @ResponseBody
    public Map<String, Object> selectByExample(App record, Integer offset, Integer pageSize){
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
    	AppExample example = new AppExample(); 
    	Page<App> rows = null;
		rows = appService.selectByExample(example, pageNum, pageSize);
		resultMap.put("rows", rows.getResult());
		resultMap.put("totalRecord", rows.getTotal());
        return resultMap;
    }

	/**
	 * 按主键查询
	 * 
	 * @param appId 唯一的ID（没有啥意义，主键，自增长而已）
	 * 
	 * @return App 记录 
	 *
    */	
	@RequestMapping("selectByPrimaryKey")
    @ResponseBody
	public App selectByPrimaryKey(Long appId){
    	if(appId == null){
    		throw new IllegalStateException("参数appId不能为空");
    	}
	    return appService.selectByPrimaryKey(appId);
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
	public Boolean updateByPrimaryKeySelective(App record){
		if(record == null){
			throw new IllegalStateException("参数record不能为空");
		}
    	if(record.getAppId() == null){
    		throw new IllegalStateException("主键appId属性不能为空");
    	}
	    int count = 0;
		count = appService.updateByPrimaryKeySelective(record);
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
    public Boolean updateByPrimaryKey(App record){
    	if(record == null){
			throw new IllegalStateException("参数record不能为空");
		}
    	if(record.getAppId() == null){
    		throw new IllegalStateException("主键appId属性不能为空");
    	}
    	int count = 0;
    	count = appService.updateByPrimaryKey(record);
        return count > 0;
    }
	
}