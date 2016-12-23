package com.sf.sgs.dto;

public class CallCourierRequestDTO {

    private Long customerId;
    // 经度
    private double lng;
    // 维度
    private double lat;
    // 1骑士 2收派员
    private String type;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
