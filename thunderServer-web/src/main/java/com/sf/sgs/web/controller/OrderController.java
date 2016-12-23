package com.sf.sgs.web.controller;

import com.alibaba.fastjson.JSON;
import com.sf.sgs.dto.CallCourierRequestDTO;
import com.sf.sgs.dto.CallCourierResponseDTO;
import com.sf.sgs.dto.OrderRequestDTO;
import com.sf.sgs.service.CourierAccountService;
import com.sf.sgs.service.OrderService;
import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RequestMapping("order")
@Controller
public class OrderController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "callCourier", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public CallCourierResponseDTO callCourier(CallCourierRequestDTO orderRequest, HttpServletRequest request) throws IOException {
        String str = IOUtils.toString(request.getInputStream(), "UTF-8");
        return orderService.callCourier(orderRequest);
    }

    @RequestMapping(value = "createOrder", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Boolean createOrder(HttpServletRequest request) throws IOException {
        String body = IOUtils.toString(request.getInputStream(), "UTF-8");
        logger.info("create order...{}", body);
        OrderRequestDTO orderRequest = JSON.parseObject(body, OrderRequestDTO.class);
        return orderService.createOrder(orderRequest);
    }

}
