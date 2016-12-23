package com.sf.sgs.web.controller;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.sf.sgs.domain.*;
import com.sf.sgs.service.CourierAccountService;
import com.sf.sgs.service.CourierLoginLogService;
import com.sf.sgs.service.CustomerAccountService;
import com.sf.sgs.service.CustomerLoginLogService;
import com.sf.sgs.web.dto.CourierDto;
import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户登录
 * Created by 594829 on 2016/12/23.
 */

@Controller
public class CustomerLoginController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerLoginController.class);


    @Autowired
    private CustomerAccountService customerAccountService;

    @Autowired
    private CourierAccountService courierAccountService;

    @Autowired
    private CourierLoginLogService courierLoginLogService;

    /**
     * 用户登录
     * @param request
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public Boolean login(HttpServletRequest request){
        try {
            String str = IOUtils.toString(request.getInputStream(),"UTF-8");
            JSONObject jsonObject = JSONObject.fromObject(str);
            CustomerAccount  customerAccount = (CustomerAccount)JSONObject.toBean(jsonObject, CustomerAccount.class);  ;

            logger.info("用户【"+customerAccount.getPhone()+"】登录成功！");
            CustomerAccount account = customerAccountService.selectByCustomer(customerAccount);
            if(null == account){
                logger.warn("用户【"+customerAccount.getPhone()+"】登录失败！");
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    /**
     * 获取附近的收派员
     * @param request
     * @return
     */
    @RequestMapping("/getNearCourier")
    @ResponseBody
    private List<CourierDto> getNearCourier(HttpServletRequest request){
        String str = null;
        try {
            str = IOUtils.toString(request.getInputStream(),"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = JSONObject.fromObject(str);
        Integer courierType = (Integer)jsonObject.get("courierType");
        Double lng = (Double)jsonObject.get("lng");
        Double lat =(Double)jsonObject.get("lat");
        String company = (String)jsonObject.get("company");
        logger.info("用户位置：经度"+lng+"纬度："+lat+"收件员类型："+courierType+" 公司："+company+"查询中！");
        List<CourierAccount> courierAccountList = new ArrayList<CourierAccount>();
        if(company.equals("全部")){
            courierAccountList = courierAccountService.selectByType(courierType,null);
        }else{
            courierAccountList = courierAccountService.selectByType(courierType,company);
        }

        List<CourierDto> courierDtoList = new ArrayList<CourierDto>();
         if(!courierAccountList.isEmpty()){
            for(int i=0;i<courierAccountList.size();i++){

                CourierAccount courierAccount = courierAccountList.get(i);
                Long id = courierAccount.getId();
                CourierLoginLog courierLoginLog =  courierLoginLogService.selectByCorierAccountId(id);

                CourierDto courierDto = new CourierDto();
                courierDto.setCompany(courierAccount.getCompany());
                courierDto.setCourierLevel(courierAccount.getCourierLevel());
                courierDto.setCourierType(courierAccount.getCourierType());
                courierDto.setId(courierAccount.getId());
                courierDto.setLat(courierLoginLog.getLat());
                courierDto.setLng(courierLoginLog.getLng());
                courierDto.setName(courierAccount.getName());
                courierDto.setPhone(courierAccount.getPhone());
                courierDto.setPic(courierAccount.getPic());
                courierDto.setPriority(courierAccount.getPriority());
                courierDto.setStatus(courierAccount.getStatus());
                courierDto.setTaskCount(courierAccount.getTaskCount());

                courierDtoList.add(courierDto);

            }
        }
        return courierDtoList;
    }

    /**
     * 用户下单前获取信息
     * @param request
     * @return
     */
    @RequestMapping("/getSendInfo")
    @ResponseBody
    public Map<String,Object> getSendInfo(HttpServletRequest request){

        String str = null;
        try {
            str = IOUtils.toString(request.getInputStream(),"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = JSONObject.fromObject(str);
        Integer courierType = (Integer)jsonObject.get("courierType");
        Double lng = (Double)jsonObject.get("lng");
        Double lat =(Double)jsonObject.get("lat");
        String company = (String)jsonObject.get("company");

        Map<String,Object> resultMap = new HashMap<String,Object>();

        List<CourierAccount> courierAccountList = courierAccountService.selectByType(courierType,company);
        CourierAccount courierAccount = courierAccountList.get(0);

        CourierLoginLog courierLoginLog =  courierLoginLogService.selectByCorierAccountId(courierAccount.getId());
        resultMap.put("courier",courierAccount);
        resultMap.put("lng",courierLoginLog.getLng());
        resultMap.put("lat",courierLoginLog.getLat());
        resultMap.put("time",getRandom(10));
        resultMap.put("money,",getRandom(5));
        return resultMap;
    }


    public static int getRandom(int count){
        java.util.Random random=new java.util.Random();// 定义随机类
        int result=random.nextInt(count);// 返回[0,10)集合中的整数，注意不包括10
        return result+1;
    }

}
