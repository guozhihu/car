package com.gdou.car.business.car.dal.entitys;

import java.util.ArrayList;
import java.util.List;

public class CarReleaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public CarReleaseExample() {
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

        public Criteria andReleaseIdIsNull() {
            addCriterion("release_id is null");
            return (Criteria) this;
        }

        public Criteria andReleaseIdIsNotNull() {
            addCriterion("release_id is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseIdEqualTo(String value) {
            addCriterion("release_id =", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdNotEqualTo(String value) {
            addCriterion("release_id <>", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdGreaterThan(String value) {
            addCriterion("release_id >", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("release_id >=", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdLessThan(String value) {
            addCriterion("release_id <", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdLessThanOrEqualTo(String value) {
            addCriterion("release_id <=", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdLike(String value) {
            addCriterion("release_id like", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdNotLike(String value) {
            addCriterion("release_id not like", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdIn(List<String> values) {
            addCriterion("release_id in", values, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdNotIn(List<String> values) {
            addCriterion("release_id not in", values, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdBetween(String value1, String value2) {
            addCriterion("release_id between", value1, value2, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdNotBetween(String value1, String value2) {
            addCriterion("release_id not between", value1, value2, "releaseId");
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

        public Criteria andLocationInfoIdIsNull() {
            addCriterion("location_info_id is null");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdIsNotNull() {
            addCriterion("location_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdEqualTo(String value) {
            addCriterion("location_info_id =", value, "locationInfoId");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdNotEqualTo(String value) {
            addCriterion("location_info_id <>", value, "locationInfoId");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdGreaterThan(String value) {
            addCriterion("location_info_id >", value, "locationInfoId");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("location_info_id >=", value, "locationInfoId");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdLessThan(String value) {
            addCriterion("location_info_id <", value, "locationInfoId");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdLessThanOrEqualTo(String value) {
            addCriterion("location_info_id <=", value, "locationInfoId");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdLike(String value) {
            addCriterion("location_info_id like", value, "locationInfoId");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdNotLike(String value) {
            addCriterion("location_info_id not like", value, "locationInfoId");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdIn(List<String> values) {
            addCriterion("location_info_id in", values, "locationInfoId");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdNotIn(List<String> values) {
            addCriterion("location_info_id not in", values, "locationInfoId");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdBetween(String value1, String value2) {
            addCriterion("location_info_id between", value1, value2, "locationInfoId");
            return (Criteria) this;
        }

        public Criteria andLocationInfoIdNotBetween(String value1, String value2) {
            addCriterion("location_info_id not between", value1, value2, "locationInfoId");
            return (Criteria) this;
        }

        public Criteria andAvailableCountIsNull() {
            addCriterion("available_count is null");
            return (Criteria) this;
        }

        public Criteria andAvailableCountIsNotNull() {
            addCriterion("available_count is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableCountEqualTo(Integer value) {
            addCriterion("available_count =", value, "availableCount");
            return (Criteria) this;
        }

        public Criteria andAvailableCountNotEqualTo(Integer value) {
            addCriterion("available_count <>", value, "availableCount");
            return (Criteria) this;
        }

        public Criteria andAvailableCountGreaterThan(Integer value) {
            addCriterion("available_count >", value, "availableCount");
            return (Criteria) this;
        }

        public Criteria andAvailableCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("available_count >=", value, "availableCount");
            return (Criteria) this;
        }

        public Criteria andAvailableCountLessThan(Integer value) {
            addCriterion("available_count <", value, "availableCount");
            return (Criteria) this;
        }

        public Criteria andAvailableCountLessThanOrEqualTo(Integer value) {
            addCriterion("available_count <=", value, "availableCount");
            return (Criteria) this;
        }

        public Criteria andAvailableCountIn(List<Integer> values) {
            addCriterion("available_count in", values, "availableCount");
            return (Criteria) this;
        }

        public Criteria andAvailableCountNotIn(List<Integer> values) {
            addCriterion("available_count not in", values, "availableCount");
            return (Criteria) this;
        }

        public Criteria andAvailableCountBetween(Integer value1, Integer value2) {
            addCriterion("available_count between", value1, value2, "availableCount");
            return (Criteria) this;
        }

        public Criteria andAvailableCountNotBetween(Integer value1, Integer value2) {
            addCriterion("available_count not between", value1, value2, "availableCount");
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