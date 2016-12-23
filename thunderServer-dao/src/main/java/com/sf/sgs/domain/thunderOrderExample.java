package com.sf.sgs.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 594829
 * 
 */
public class thunderOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public thunderOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCourierIdIsNull() {
            addCriterion("courier_id is null");
            return (Criteria) this;
        }

        public Criteria andCourierIdIsNotNull() {
            addCriterion("courier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourierIdEqualTo(Long value) {
            addCriterion("courier_id =", value, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdNotEqualTo(Long value) {
            addCriterion("courier_id <>", value, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdGreaterThan(Long value) {
            addCriterion("courier_id >", value, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("courier_id >=", value, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdLessThan(Long value) {
            addCriterion("courier_id <", value, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdLessThanOrEqualTo(Long value) {
            addCriterion("courier_id <=", value, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdIn(List<Long> values) {
            addCriterion("courier_id in", values, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdNotIn(List<Long> values) {
            addCriterion("courier_id not in", values, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdBetween(Long value1, Long value2) {
            addCriterion("courier_id between", value1, value2, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdNotBetween(Long value1, Long value2) {
            addCriterion("courier_id not between", value1, value2, "courierId");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andStartLngIsNull() {
            addCriterion("start_lng is null");
            return (Criteria) this;
        }

        public Criteria andStartLngIsNotNull() {
            addCriterion("start_lng is not null");
            return (Criteria) this;
        }

        public Criteria andStartLngEqualTo(String value) {
            addCriterion("start_lng =", value, "startLng");
            return (Criteria) this;
        }

        public Criteria andStartLngNotEqualTo(String value) {
            addCriterion("start_lng <>", value, "startLng");
            return (Criteria) this;
        }

        public Criteria andStartLngGreaterThan(String value) {
            addCriterion("start_lng >", value, "startLng");
            return (Criteria) this;
        }

        public Criteria andStartLngGreaterThanOrEqualTo(String value) {
            addCriterion("start_lng >=", value, "startLng");
            return (Criteria) this;
        }

        public Criteria andStartLngLessThan(String value) {
            addCriterion("start_lng <", value, "startLng");
            return (Criteria) this;
        }

        public Criteria andStartLngLessThanOrEqualTo(String value) {
            addCriterion("start_lng <=", value, "startLng");
            return (Criteria) this;
        }

        public Criteria andStartLngLike(String value) {
            addCriterion("start_lng like", value, "startLng");
            return (Criteria) this;
        }

        public Criteria andStartLngNotLike(String value) {
            addCriterion("start_lng not like", value, "startLng");
            return (Criteria) this;
        }

        public Criteria andStartLngIn(List<String> values) {
            addCriterion("start_lng in", values, "startLng");
            return (Criteria) this;
        }

        public Criteria andStartLngNotIn(List<String> values) {
            addCriterion("start_lng not in", values, "startLng");
            return (Criteria) this;
        }

        public Criteria andStartLngBetween(String value1, String value2) {
            addCriterion("start_lng between", value1, value2, "startLng");
            return (Criteria) this;
        }

        public Criteria andStartLngNotBetween(String value1, String value2) {
            addCriterion("start_lng not between", value1, value2, "startLng");
            return (Criteria) this;
        }

        public Criteria andStartLatIsNull() {
            addCriterion("start_lat is null");
            return (Criteria) this;
        }

        public Criteria andStartLatIsNotNull() {
            addCriterion("start_lat is not null");
            return (Criteria) this;
        }

        public Criteria andStartLatEqualTo(String value) {
            addCriterion("start_lat =", value, "startLat");
            return (Criteria) this;
        }

        public Criteria andStartLatNotEqualTo(String value) {
            addCriterion("start_lat <>", value, "startLat");
            return (Criteria) this;
        }

        public Criteria andStartLatGreaterThan(String value) {
            addCriterion("start_lat >", value, "startLat");
            return (Criteria) this;
        }

        public Criteria andStartLatGreaterThanOrEqualTo(String value) {
            addCriterion("start_lat >=", value, "startLat");
            return (Criteria) this;
        }

        public Criteria andStartLatLessThan(String value) {
            addCriterion("start_lat <", value, "startLat");
            return (Criteria) this;
        }

        public Criteria andStartLatLessThanOrEqualTo(String value) {
            addCriterion("start_lat <=", value, "startLat");
            return (Criteria) this;
        }

        public Criteria andStartLatLike(String value) {
            addCriterion("start_lat like", value, "startLat");
            return (Criteria) this;
        }

        public Criteria andStartLatNotLike(String value) {
            addCriterion("start_lat not like", value, "startLat");
            return (Criteria) this;
        }

        public Criteria andStartLatIn(List<String> values) {
            addCriterion("start_lat in", values, "startLat");
            return (Criteria) this;
        }

        public Criteria andStartLatNotIn(List<String> values) {
            addCriterion("start_lat not in", values, "startLat");
            return (Criteria) this;
        }

        public Criteria andStartLatBetween(String value1, String value2) {
            addCriterion("start_lat between", value1, value2, "startLat");
            return (Criteria) this;
        }

        public Criteria andStartLatNotBetween(String value1, String value2) {
            addCriterion("start_lat not between", value1, value2, "startLat");
            return (Criteria) this;
        }

        public Criteria andFinishedLngIsNull() {
            addCriterion("finished_lng is null");
            return (Criteria) this;
        }

        public Criteria andFinishedLngIsNotNull() {
            addCriterion("finished_lng is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedLngEqualTo(String value) {
            addCriterion("finished_lng =", value, "finishedLng");
            return (Criteria) this;
        }

        public Criteria andFinishedLngNotEqualTo(String value) {
            addCriterion("finished_lng <>", value, "finishedLng");
            return (Criteria) this;
        }

        public Criteria andFinishedLngGreaterThan(String value) {
            addCriterion("finished_lng >", value, "finishedLng");
            return (Criteria) this;
        }

        public Criteria andFinishedLngGreaterThanOrEqualTo(String value) {
            addCriterion("finished_lng >=", value, "finishedLng");
            return (Criteria) this;
        }

        public Criteria andFinishedLngLessThan(String value) {
            addCriterion("finished_lng <", value, "finishedLng");
            return (Criteria) this;
        }

        public Criteria andFinishedLngLessThanOrEqualTo(String value) {
            addCriterion("finished_lng <=", value, "finishedLng");
            return (Criteria) this;
        }

        public Criteria andFinishedLngLike(String value) {
            addCriterion("finished_lng like", value, "finishedLng");
            return (Criteria) this;
        }

        public Criteria andFinishedLngNotLike(String value) {
            addCriterion("finished_lng not like", value, "finishedLng");
            return (Criteria) this;
        }

        public Criteria andFinishedLngIn(List<String> values) {
            addCriterion("finished_lng in", values, "finishedLng");
            return (Criteria) this;
        }

        public Criteria andFinishedLngNotIn(List<String> values) {
            addCriterion("finished_lng not in", values, "finishedLng");
            return (Criteria) this;
        }

        public Criteria andFinishedLngBetween(String value1, String value2) {
            addCriterion("finished_lng between", value1, value2, "finishedLng");
            return (Criteria) this;
        }

        public Criteria andFinishedLngNotBetween(String value1, String value2) {
            addCriterion("finished_lng not between", value1, value2, "finishedLng");
            return (Criteria) this;
        }

        public Criteria andFinishedLatIsNull() {
            addCriterion("finished__lat is null");
            return (Criteria) this;
        }

        public Criteria andFinishedLatIsNotNull() {
            addCriterion("finished__lat is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedLatEqualTo(String value) {
            addCriterion("finished__lat =", value, "finishedLat");
            return (Criteria) this;
        }

        public Criteria andFinishedLatNotEqualTo(String value) {
            addCriterion("finished__lat <>", value, "finishedLat");
            return (Criteria) this;
        }

        public Criteria andFinishedLatGreaterThan(String value) {
            addCriterion("finished__lat >", value, "finishedLat");
            return (Criteria) this;
        }

        public Criteria andFinishedLatGreaterThanOrEqualTo(String value) {
            addCriterion("finished__lat >=", value, "finishedLat");
            return (Criteria) this;
        }

        public Criteria andFinishedLatLessThan(String value) {
            addCriterion("finished__lat <", value, "finishedLat");
            return (Criteria) this;
        }

        public Criteria andFinishedLatLessThanOrEqualTo(String value) {
            addCriterion("finished__lat <=", value, "finishedLat");
            return (Criteria) this;
        }

        public Criteria andFinishedLatLike(String value) {
            addCriterion("finished__lat like", value, "finishedLat");
            return (Criteria) this;
        }

        public Criteria andFinishedLatNotLike(String value) {
            addCriterion("finished__lat not like", value, "finishedLat");
            return (Criteria) this;
        }

        public Criteria andFinishedLatIn(List<String> values) {
            addCriterion("finished__lat in", values, "finishedLat");
            return (Criteria) this;
        }

        public Criteria andFinishedLatNotIn(List<String> values) {
            addCriterion("finished__lat not in", values, "finishedLat");
            return (Criteria) this;
        }

        public Criteria andFinishedLatBetween(String value1, String value2) {
            addCriterion("finished__lat between", value1, value2, "finishedLat");
            return (Criteria) this;
        }

        public Criteria andFinishedLatNotBetween(String value1, String value2) {
            addCriterion("finished__lat not between", value1, value2, "finishedLat");
            return (Criteria) this;
        }

        public Criteria andSourceAddressIsNull() {
            addCriterion("source_address is null");
            return (Criteria) this;
        }

        public Criteria andSourceAddressIsNotNull() {
            addCriterion("source_address is not null");
            return (Criteria) this;
        }

        public Criteria andSourceAddressEqualTo(String value) {
            addCriterion("source_address =", value, "sourceAddress");
            return (Criteria) this;
        }

        public Criteria andSourceAddressNotEqualTo(String value) {
            addCriterion("source_address <>", value, "sourceAddress");
            return (Criteria) this;
        }

        public Criteria andSourceAddressGreaterThan(String value) {
            addCriterion("source_address >", value, "sourceAddress");
            return (Criteria) this;
        }

        public Criteria andSourceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("source_address >=", value, "sourceAddress");
            return (Criteria) this;
        }

        public Criteria andSourceAddressLessThan(String value) {
            addCriterion("source_address <", value, "sourceAddress");
            return (Criteria) this;
        }

        public Criteria andSourceAddressLessThanOrEqualTo(String value) {
            addCriterion("source_address <=", value, "sourceAddress");
            return (Criteria) this;
        }

        public Criteria andSourceAddressLike(String value) {
            addCriterion("source_address like", value, "sourceAddress");
            return (Criteria) this;
        }

        public Criteria andSourceAddressNotLike(String value) {
            addCriterion("source_address not like", value, "sourceAddress");
            return (Criteria) this;
        }

        public Criteria andSourceAddressIn(List<String> values) {
            addCriterion("source_address in", values, "sourceAddress");
            return (Criteria) this;
        }

        public Criteria andSourceAddressNotIn(List<String> values) {
            addCriterion("source_address not in", values, "sourceAddress");
            return (Criteria) this;
        }

        public Criteria andSourceAddressBetween(String value1, String value2) {
            addCriterion("source_address between", value1, value2, "sourceAddress");
            return (Criteria) this;
        }

        public Criteria andSourceAddressNotBetween(String value1, String value2) {
            addCriterion("source_address not between", value1, value2, "sourceAddress");
            return (Criteria) this;
        }

        public Criteria andDestAddressIsNull() {
            addCriterion("dest_address is null");
            return (Criteria) this;
        }

        public Criteria andDestAddressIsNotNull() {
            addCriterion("dest_address is not null");
            return (Criteria) this;
        }

        public Criteria andDestAddressEqualTo(String value) {
            addCriterion("dest_address =", value, "destAddress");
            return (Criteria) this;
        }

        public Criteria andDestAddressNotEqualTo(String value) {
            addCriterion("dest_address <>", value, "destAddress");
            return (Criteria) this;
        }

        public Criteria andDestAddressGreaterThan(String value) {
            addCriterion("dest_address >", value, "destAddress");
            return (Criteria) this;
        }

        public Criteria andDestAddressGreaterThanOrEqualTo(String value) {
            addCriterion("dest_address >=", value, "destAddress");
            return (Criteria) this;
        }

        public Criteria andDestAddressLessThan(String value) {
            addCriterion("dest_address <", value, "destAddress");
            return (Criteria) this;
        }

        public Criteria andDestAddressLessThanOrEqualTo(String value) {
            addCriterion("dest_address <=", value, "destAddress");
            return (Criteria) this;
        }

        public Criteria andDestAddressLike(String value) {
            addCriterion("dest_address like", value, "destAddress");
            return (Criteria) this;
        }

        public Criteria andDestAddressNotLike(String value) {
            addCriterion("dest_address not like", value, "destAddress");
            return (Criteria) this;
        }

        public Criteria andDestAddressIn(List<String> values) {
            addCriterion("dest_address in", values, "destAddress");
            return (Criteria) this;
        }

        public Criteria andDestAddressNotIn(List<String> values) {
            addCriterion("dest_address not in", values, "destAddress");
            return (Criteria) this;
        }

        public Criteria andDestAddressBetween(String value1, String value2) {
            addCriterion("dest_address between", value1, value2, "destAddress");
            return (Criteria) this;
        }

        public Criteria andDestAddressNotBetween(String value1, String value2) {
            addCriterion("dest_address not between", value1, value2, "destAddress");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Byte value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Byte value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Byte value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Byte value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Byte value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Byte> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Byte> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Byte value1, Byte value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(String value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(String value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(String value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(String value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(String value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLike(String value) {
            addCriterion("volume like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotLike(String value) {
            addCriterion("volume not like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<String> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<String> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(String value1, String value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(String value1, String value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andExpectedArrivalTimeIsNull() {
            addCriterion("expected_arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andExpectedArrivalTimeIsNotNull() {
            addCriterion("expected_arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedArrivalTimeEqualTo(Date value) {
            addCriterion("expected_arrival_time =", value, "expectedArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectedArrivalTimeNotEqualTo(Date value) {
            addCriterion("expected_arrival_time <>", value, "expectedArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectedArrivalTimeGreaterThan(Date value) {
            addCriterion("expected_arrival_time >", value, "expectedArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectedArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expected_arrival_time >=", value, "expectedArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectedArrivalTimeLessThan(Date value) {
            addCriterion("expected_arrival_time <", value, "expectedArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectedArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("expected_arrival_time <=", value, "expectedArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectedArrivalTimeIn(List<Date> values) {
            addCriterion("expected_arrival_time in", values, "expectedArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectedArrivalTimeNotIn(List<Date> values) {
            addCriterion("expected_arrival_time not in", values, "expectedArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectedArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("expected_arrival_time between", value1, value2, "expectedArrivalTime");
            return (Criteria) this;
        }

        public Criteria andExpectedArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("expected_arrival_time not between", value1, value2, "expectedArrivalTime");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Byte value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Byte value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Byte value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Byte value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Byte value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Byte> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Byte> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Byte value1, Byte value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andStartedTimeIsNull() {
            addCriterion("started_time is null");
            return (Criteria) this;
        }

        public Criteria andStartedTimeIsNotNull() {
            addCriterion("started_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartedTimeEqualTo(Date value) {
            addCriterion("started_time =", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeNotEqualTo(Date value) {
            addCriterion("started_time <>", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeGreaterThan(Date value) {
            addCriterion("started_time >", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("started_time >=", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeLessThan(Date value) {
            addCriterion("started_time <", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeLessThanOrEqualTo(Date value) {
            addCriterion("started_time <=", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeIn(List<Date> values) {
            addCriterion("started_time in", values, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeNotIn(List<Date> values) {
            addCriterion("started_time not in", values, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeBetween(Date value1, Date value2) {
            addCriterion("started_time between", value1, value2, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeNotBetween(Date value1, Date value2) {
            addCriterion("started_time not between", value1, value2, "startedTime");
            return (Criteria) this;
        }

        public Criteria andFinshedTimeIsNull() {
            addCriterion("finshed_time is null");
            return (Criteria) this;
        }

        public Criteria andFinshedTimeIsNotNull() {
            addCriterion("finshed_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinshedTimeEqualTo(Date value) {
            addCriterion("finshed_time =", value, "finshedTime");
            return (Criteria) this;
        }

        public Criteria andFinshedTimeNotEqualTo(Date value) {
            addCriterion("finshed_time <>", value, "finshedTime");
            return (Criteria) this;
        }

        public Criteria andFinshedTimeGreaterThan(Date value) {
            addCriterion("finshed_time >", value, "finshedTime");
            return (Criteria) this;
        }

        public Criteria andFinshedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finshed_time >=", value, "finshedTime");
            return (Criteria) this;
        }

        public Criteria andFinshedTimeLessThan(Date value) {
            addCriterion("finshed_time <", value, "finshedTime");
            return (Criteria) this;
        }

        public Criteria andFinshedTimeLessThanOrEqualTo(Date value) {
            addCriterion("finshed_time <=", value, "finshedTime");
            return (Criteria) this;
        }

        public Criteria andFinshedTimeIn(List<Date> values) {
            addCriterion("finshed_time in", values, "finshedTime");
            return (Criteria) this;
        }

        public Criteria andFinshedTimeNotIn(List<Date> values) {
            addCriterion("finshed_time not in", values, "finshedTime");
            return (Criteria) this;
        }

        public Criteria andFinshedTimeBetween(Date value1, Date value2) {
            addCriterion("finshed_time between", value1, value2, "finshedTime");
            return (Criteria) this;
        }

        public Criteria andFinshedTimeNotBetween(Date value1, Date value2) {
            addCriterion("finshed_time not between", value1, value2, "finshedTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements java.io.Serializable {
        private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements java.io.Serializable {
        private static final long serialVersionUID = 1L;

        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}