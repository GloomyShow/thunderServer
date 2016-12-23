package com.sf.sgs.web.dto;

/**
 * Created by 594829 on 2016/12/23.
 */
public class CourierDto {
    private Long id;

    private String name;

    private String phone;

    private String company;

    private Byte status;

    private Byte courierType;

    private Integer taskCount;

    private Byte courierLevel;

    private Byte priority;

    private String pic;

    private String lng;

    private String lat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getCourierType() {
        return courierType;
    }

    public void setCourierType(Byte courierType) {
        this.courierType = courierType;
    }

    public Integer getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    public Byte getCourierLevel() {
        return courierLevel;
    }

    public void setCourierLevel(Byte courierLevel) {
        this.courierLevel = courierLevel;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}
