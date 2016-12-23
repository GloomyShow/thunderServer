package com.sf.sgs.dto;

public class CallCourierResponseDTO {

    // 快递品牌(公司)
    private String company;
    // 预计到达时间, 分钟
    private int expectTime;
    // 预估费用
    private int expectMoney;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getExpectTime() {
        return expectTime;
    }

    public void setExpectTime(int expectTime) {
        this.expectTime = expectTime;
    }

    public int getExpectMoney() {
        return expectMoney;
    }

    public void setExpectMoney(int expectMoney) {
        this.expectMoney = expectMoney;
    }
}
