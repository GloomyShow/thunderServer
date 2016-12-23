package com.sf.sgs.domain;

import java.util.Date;

/**
 * 该类与数据库中的表customer_login_log对应 
 * 
 * @author 594829
 */
public class CustomerLoginLog {
    private Long id;

    private Long customerId;

    private Date loginTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}