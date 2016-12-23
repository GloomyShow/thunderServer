package com.sf.sgs.domain;

import java.util.Date;

/**
 * 该类与数据库中的表courier_account对应 
 * 
 * @author 594829
 */
public class CourierAccount {
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

    private Date createdTime;

    private Date updateTime;

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
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
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
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}