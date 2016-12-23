package com.sf.sgs.service.impl;

import com.sf.sgs.domain.CourierAccount;
import com.sf.sgs.dto.CallCourierRequestDTO;
import com.sf.sgs.dto.CallCourierResponseDTO;
import com.sf.sgs.manager.CourierAccountManager;
import com.sf.sgs.service.OrderService;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    CourierAccountManager courierAccountManager;

    @Override
    public CallCourierResponseDTO callCourier(CallCourierRequestDTO orderRequest) {
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
}
