package com.gdou.car.business.order.dal.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarRentalListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public CarRentalListExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
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

        public Criteria andListIdIsNull() {
            addCriterion("list_id is null");
            return (Criteria) this;
        }

        public Criteria andListIdIsNotNull() {
            addCriterion("list_id is not null");
            return (Criteria) this;
        }

        public Criteria andListIdEqualTo(String value) {
            addCriterion("list_id =", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotEqualTo(String value) {
            addCriterion("list_id <>", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThan(String value) {
            addCriterion("list_id >", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThanOrEqualTo(String value) {
            addCriterion("list_id >=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThan(String value) {
            addCriterion("list_id <", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThanOrEqualTo(String value) {
            addCriterion("list_id <=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLike(String value) {
            addCriterion("list_id like", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotLike(String value) {
            addCriterion("list_id not like", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdIn(List<String> values) {
            addCriterion("list_id in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotIn(List<String> values) {
            addCriterion("list_id not in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdBetween(String value1, String value2) {
            addCriterion("list_id between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotBetween(String value1, String value2) {
            addCriterion("list_id not between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTenantNameIsNull() {
            addCriterion("tenant_name is null");
            return (Criteria) this;
        }

        public Criteria andTenantNameIsNotNull() {
            addCriterion("tenant_name is not null");
            return (Criteria) this;
        }

        public Criteria andTenantNameEqualTo(String value) {
            addCriterion("tenant_name =", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameNotEqualTo(String value) {
            addCriterion("tenant_name <>", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameGreaterThan(String value) {
            addCriterion("tenant_name >", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_name >=", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameLessThan(String value) {
            addCriterion("tenant_name <", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameLessThanOrEqualTo(String value) {
            addCriterion("tenant_name <=", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameLike(String value) {
            addCriterion("tenant_name like", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameNotLike(String value) {
            addCriterion("tenant_name not like", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameIn(List<String> values) {
            addCriterion("tenant_name in", values, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameNotIn(List<String> values) {
            addCriterion("tenant_name not in", values, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameBetween(String value1, String value2) {
            addCriterion("tenant_name between", value1, value2, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameNotBetween(String value1, String value2) {
            addCriterion("tenant_name not between", value1, value2, "tenantName");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNull() {
            addCriterion("contact_number is null");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNotNull() {
            addCriterion("contact_number is not null");
            return (Criteria) this;
        }

        public Criteria andContactNumberEqualTo(String value) {
            addCriterion("contact_number =", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotEqualTo(String value) {
            addCriterion("contact_number <>", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThan(String value) {
            addCriterion("contact_number >", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("contact_number >=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThan(String value) {
            addCriterion("contact_number <", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThanOrEqualTo(String value) {
            addCriterion("contact_number <=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLike(String value) {
            addCriterion("contact_number like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotLike(String value) {
            addCriterion("contact_number not like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberIn(List<String> values) {
            addCriterion("contact_number in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotIn(List<String> values) {
            addCriterion("contact_number not in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberBetween(String value1, String value2) {
            addCriterion("contact_number between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotBetween(String value1, String value2) {
            addCriterion("contact_number not between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGetDateIsNull() {
            addCriterion("order_get_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderGetDateIsNotNull() {
            addCriterion("order_get_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGetDateEqualTo(Date value) {
            addCriterion("order_get_date =", value, "orderGetDate");
            return (Criteria) this;
        }

        public Criteria andOrderGetDateNotEqualTo(Date value) {
            addCriterion("order_get_date <>", value, "orderGetDate");
            return (Criteria) this;
        }

        public Criteria andOrderGetDateGreaterThan(Date value) {
            addCriterion("order_get_date >", value, "orderGetDate");
            return (Criteria) this;
        }

        public Criteria andOrderGetDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_get_date >=", value, "orderGetDate");
            return (Criteria) this;
        }

        public Criteria andOrderGetDateLessThan(Date value) {
            addCriterion("order_get_date <", value, "orderGetDate");
            return (Criteria) this;
        }

        public Criteria andOrderGetDateLessThanOrEqualTo(Date value) {
            addCriterion("order_get_date <=", value, "orderGetDate");
            return (Criteria) this;
        }

        public Criteria andOrderGetDateIn(List<Date> values) {
            addCriterion("order_get_date in", values, "orderGetDate");
            return (Criteria) this;
        }

        public Criteria andOrderGetDateNotIn(List<Date> values) {
            addCriterion("order_get_date not in", values, "orderGetDate");
            return (Criteria) this;
        }

        public Criteria andOrderGetDateBetween(Date value1, Date value2) {
            addCriterion("order_get_date between", value1, value2, "orderGetDate");
            return (Criteria) this;
        }

        public Criteria andOrderGetDateNotBetween(Date value1, Date value2) {
            addCriterion("order_get_date not between", value1, value2, "orderGetDate");
            return (Criteria) this;
        }

        public Criteria andOrderBackDateIsNull() {
            addCriterion("order_back_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderBackDateIsNotNull() {
            addCriterion("order_back_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBackDateEqualTo(Date value) {
            addCriterion("order_back_date =", value, "orderBackDate");
            return (Criteria) this;
        }

        public Criteria andOrderBackDateNotEqualTo(Date value) {
            addCriterion("order_back_date <>", value, "orderBackDate");
            return (Criteria) this;
        }

        public Criteria andOrderBackDateGreaterThan(Date value) {
            addCriterion("order_back_date >", value, "orderBackDate");
            return (Criteria) this;
        }

        public Criteria andOrderBackDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_back_date >=", value, "orderBackDate");
            return (Criteria) this;
        }

        public Criteria andOrderBackDateLessThan(Date value) {
            addCriterion("order_back_date <", value, "orderBackDate");
            return (Criteria) this;
        }

        public Criteria andOrderBackDateLessThanOrEqualTo(Date value) {
            addCriterion("order_back_date <=", value, "orderBackDate");
            return (Criteria) this;
        }

        public Criteria andOrderBackDateIn(List<Date> values) {
            addCriterion("order_back_date in", values, "orderBackDate");
            return (Criteria) this;
        }

        public Criteria andOrderBackDateNotIn(List<Date> values) {
            addCriterion("order_back_date not in", values, "orderBackDate");
            return (Criteria) this;
        }

        public Criteria andOrderBackDateBetween(Date value1, Date value2) {
            addCriterion("order_back_date between", value1, value2, "orderBackDate");
            return (Criteria) this;
        }

        public Criteria andOrderBackDateNotBetween(Date value1, Date value2) {
            addCriterion("order_back_date not between", value1, value2, "orderBackDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateIsNull() {
            addCriterion("renewal_date is null");
            return (Criteria) this;
        }

        public Criteria andRenewalDateIsNotNull() {
            addCriterion("renewal_date is not null");
            return (Criteria) this;
        }

        public Criteria andRenewalDateEqualTo(Date value) {
            addCriterion("renewal_date =", value, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateNotEqualTo(Date value) {
            addCriterion("renewal_date <>", value, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateGreaterThan(Date value) {
            addCriterion("renewal_date >", value, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("renewal_date >=", value, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateLessThan(Date value) {
            addCriterion("renewal_date <", value, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateLessThanOrEqualTo(Date value) {
            addCriterion("renewal_date <=", value, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateIn(List<Date> values) {
            addCriterion("renewal_date in", values, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateNotIn(List<Date> values) {
            addCriterion("renewal_date not in", values, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateBetween(Date value1, Date value2) {
            addCriterion("renewal_date between", value1, value2, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateNotBetween(Date value1, Date value2) {
            addCriterion("renewal_date not between", value1, value2, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdIsNull() {
            addCriterion("pick_up_location_id is null");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdIsNotNull() {
            addCriterion("pick_up_location_id is not null");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdEqualTo(String value) {
            addCriterion("pick_up_location_id =", value, "pickUpLocationId");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdNotEqualTo(String value) {
            addCriterion("pick_up_location_id <>", value, "pickUpLocationId");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdGreaterThan(String value) {
            addCriterion("pick_up_location_id >", value, "pickUpLocationId");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdGreaterThanOrEqualTo(String value) {
            addCriterion("pick_up_location_id >=", value, "pickUpLocationId");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdLessThan(String value) {
            addCriterion("pick_up_location_id <", value, "pickUpLocationId");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdLessThanOrEqualTo(String value) {
            addCriterion("pick_up_location_id <=", value, "pickUpLocationId");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdLike(String value) {
            addCriterion("pick_up_location_id like", value, "pickUpLocationId");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdNotLike(String value) {
            addCriterion("pick_up_location_id not like", value, "pickUpLocationId");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdIn(List<String> values) {
            addCriterion("pick_up_location_id in", values, "pickUpLocationId");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdNotIn(List<String> values) {
            addCriterion("pick_up_location_id not in", values, "pickUpLocationId");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdBetween(String value1, String value2) {
            addCriterion("pick_up_location_id between", value1, value2, "pickUpLocationId");
            return (Criteria) this;
        }

        public Criteria andPickUpLocationIdNotBetween(String value1, String value2) {
            addCriterion("pick_up_location_id not between", value1, value2, "pickUpLocationId");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdIsNull() {
            addCriterion("returning_location_id is null");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdIsNotNull() {
            addCriterion("returning_location_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdEqualTo(String value) {
            addCriterion("returning_location_id =", value, "returningLocationId");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdNotEqualTo(String value) {
            addCriterion("returning_location_id <>", value, "returningLocationId");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdGreaterThan(String value) {
            addCriterion("returning_location_id >", value, "returningLocationId");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdGreaterThanOrEqualTo(String value) {
            addCriterion("returning_location_id >=", value, "returningLocationId");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdLessThan(String value) {
            addCriterion("returning_location_id <", value, "returningLocationId");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdLessThanOrEqualTo(String value) {
            addCriterion("returning_location_id <=", value, "returningLocationId");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdLike(String value) {
            addCriterion("returning_location_id like", value, "returningLocationId");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdNotLike(String value) {
            addCriterion("returning_location_id not like", value, "returningLocationId");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdIn(List<String> values) {
            addCriterion("returning_location_id in", values, "returningLocationId");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdNotIn(List<String> values) {
            addCriterion("returning_location_id not in", values, "returningLocationId");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdBetween(String value1, String value2) {
            addCriterion("returning_location_id between", value1, value2, "returningLocationId");
            return (Criteria) this;
        }

        public Criteria andReturningLocationIdNotBetween(String value1, String value2) {
            addCriterion("returning_location_id not between", value1, value2, "returningLocationId");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Integer value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Integer value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Integer value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Integer value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Integer value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Integer> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Integer> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Integer value1, Integer value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andPenaltyIsNull() {
            addCriterion("penalty is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyIsNotNull() {
            addCriterion("penalty is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyEqualTo(Integer value) {
            addCriterion("penalty =", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyNotEqualTo(Integer value) {
            addCriterion("penalty <>", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyGreaterThan(Integer value) {
            addCriterion("penalty >", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyGreaterThanOrEqualTo(Integer value) {
            addCriterion("penalty >=", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyLessThan(Integer value) {
            addCriterion("penalty <", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyLessThanOrEqualTo(Integer value) {
            addCriterion("penalty <=", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyIn(List<Integer> values) {
            addCriterion("penalty in", values, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyNotIn(List<Integer> values) {
            addCriterion("penalty not in", values, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyBetween(Integer value1, Integer value2) {
            addCriterion("penalty between", value1, value2, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyNotBetween(Integer value1, Integer value2) {
            addCriterion("penalty not between", value1, value2, "penalty");
            return (Criteria) this;
        }

        public Criteria andStyleNameIsNull() {
            addCriterion("style_name is null");
            return (Criteria) this;
        }

        public Criteria andStyleNameIsNotNull() {
            addCriterion("style_name is not null");
            return (Criteria) this;
        }

        public Criteria andStyleNameEqualTo(String value) {
            addCriterion("style_name =", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotEqualTo(String value) {
            addCriterion("style_name <>", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameGreaterThan(String value) {
            addCriterion("style_name >", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameGreaterThanOrEqualTo(String value) {
            addCriterion("style_name >=", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLessThan(String value) {
            addCriterion("style_name <", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLessThanOrEqualTo(String value) {
            addCriterion("style_name <=", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLike(String value) {
            addCriterion("style_name like", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotLike(String value) {
            addCriterion("style_name not like", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameIn(List<String> values) {
            addCriterion("style_name in", values, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotIn(List<String> values) {
            addCriterion("style_name not in", values, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameBetween(String value1, String value2) {
            addCriterion("style_name between", value1, value2, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotBetween(String value1, String value2) {
            addCriterion("style_name not between", value1, value2, "styleName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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