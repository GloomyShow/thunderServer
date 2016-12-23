package com.sf.sgs.web.controller;

import com.sf.sgs.dto.CallCourierRequestDTO;
import com.sf.sgs.dto.CallCourierResponseDTO;
import com.sf.sgs.service.CourierAccountService;
import com.sf.sgs.service.OrderService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("order")
@Controller
public class OrderController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private OrderService orderService;

    @RequestMapping("callCourier")
    @ResponseBody
    public CallCourierResponseDTO callCourier(CallCourierRequestDTO orderRequest) {
        return orderService.callCourier(orderRequest);
    }

//    @RequestMapping("createOrder")
//    @ResponseBody
//    public CallCourierResponseDTO createOrder(CallCourierRequestDTO orderRequest) {
//
//        String type = orderRequest.getType();
//
//        return orderService.callCourier(orderRequest);
//    }

}
