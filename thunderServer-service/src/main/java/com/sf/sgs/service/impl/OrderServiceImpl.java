package com.sf.sgs.service.impl;

import com.sf.sgs.domain.CourierAccount;
import com.sf.sgs.domain.ThunderOrder;
import com.sf.sgs.dto.CallCourierRequestDTO;
import com.sf.sgs.dto.CallCourierResponseDTO;
import com.sf.sgs.dto.OrderRequestDTO;
import com.sf.sgs.manager.CourierAccountManager;
import com.sf.sgs.manager.ThunderOrderManager;
import com.sf.sgs.service.OrderService;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private CourierAccountManager courierAccountManager;

    @Autowired
    private ThunderOrderManager thunderOrderManager;

    @Override
    public CallCourierResponseDTO callCourier(CallCourierRequestDTO callCourierRequest) {
        CallCourierResponseDTO callCourierResponse = new CallCourierResponseDTO();
        // 派工
        // (先固定取一个)
        CourierAccount courierAccount = courierAccountManager.selectByPrimaryKey(1L);
        callCourierResponse.setCompany(courierAccount.getCompany());
        int expectTime = RandomUtils.nextInt(1, 10);
        int expectMoney = RandomUtils.nextInt(100, 1000) / 100;
        callCourierResponse.setExpectMoney(expectMoney);
        callCourierResponse.setExpectTime(expectTime);
        return callCourierResponse;
    }

    @Override
    public Boolean createOrder(OrderRequestDTO orderRequest) {
        ThunderOrder order = new ThunderOrder();
        order.setSourceAddress(orderRequest.getSourceAddress());
        order.setDestAddress(orderRequest.getDestAddress());
        order.setStartedTime(new Date());
        order.setCustomerId(100L);
        order.setCourierId(RandomUtils.nextLong(0, 1000L));
        order.setWeight(orderRequest.getWeight());
        order.setExpectedArrivalTime(DateUtils.addMinutes(new Date(), RandomUtils.nextInt(10, 30)));
        thunderOrderManager.insert(order);
        return true;
    }
}
