package com.sf.sgs.service;

import com.sf.sgs.dto.CallCourierRequestDTO;
import com.sf.sgs.dto.CallCourierResponseDTO;

public interface OrderService {
    CallCourierResponseDTO callCourier(CallCourierRequestDTO orderRequest);
}
