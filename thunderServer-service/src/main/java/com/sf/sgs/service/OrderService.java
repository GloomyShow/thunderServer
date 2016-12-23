package com.sf.sgs.service;

import com.sf.sgs.dto.CallCourierRequestDTO;
import com.sf.sgs.dto.CallCourierResponseDTO;
import com.sf.sgs.dto.OrderRequestDTO;

public interface OrderService {
    CallCourierResponseDTO callCourier(CallCourierRequestDTO callCourierRequest);
    Boolean createOrder(OrderRequestDTO orderRequest);
}
