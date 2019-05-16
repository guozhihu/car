package com.gdou.car.business.order.dal.entitys;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public OrderExample() {
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

        public Criteria andSeriesidIsNull() {
            addCriterion("seriesId is null");
            return (Criteria) this;
        }

        public Criteria andSeriesidIsNotNull() {
            addCriterion("seriesId is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesidEqualTo(String value) {
            addCriterion("seriesId =", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotEqualTo(String value) {
            addCriterion("seriesId <>", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidGreaterThan(String value) {
            addCriterion("seriesId >", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidGreaterThanOrEqualTo(String value) {
            addCriterion("seriesId >=", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidLessThan(String value) {
            addCriterion("seriesId <", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidLessThanOrEqualTo(String value) {
            addCriterion("seriesId <=", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidLike(String value) {
            addCriterion("seriesId like", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotLike(String value) {
            addCriterion("seriesId not like", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidIn(List<String> values) {
            addCriterion("seriesId in", values, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotIn(List<String> values) {
            addCriterion("seriesId not in", values, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidBetween(String value1, String value2) {
            addCriterion("seriesId between", value1, value2, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotBetween(String value1, String value2) {
            addCriterion("seriesId not between", value1, value2, "seriesid");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNull() {
            addCriterion("driverName is null");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNotNull() {
            addCriterion("driverName is not null");
            return (Criteria) this;
        }

        public Criteria andDrivernameEqualTo(String value) {
            addCriterion("driverName =", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotEqualTo(String value) {
            addCriterion("driverName <>", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThan(String value) {
            addCriterion("driverName >", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThanOrEqualTo(String value) {
            addCriterion("driverName >=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThan(String value) {
            addCriterion("driverName <", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThanOrEqualTo(String value) {
            addCriterion("driverName <=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLike(String value) {
            addCriterion("driverName like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotLike(String value) {
            addCriterion("driverName not like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameIn(List<String> values) {
            addCriterion("driverName in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotIn(List<String> values) {
            addCriterion("driverName not in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameBetween(String value1, String value2) {
            addCriterion("driverName between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotBetween(String value1, String value2) {
            addCriterion("driverName not between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDriverphoneIsNull() {
            addCriterion("driverPhone is null");
            return (Criteria) this;
        }

        public Criteria andDriverphoneIsNotNull() {
            addCriterion("driverPhone is not null");
            return (Criteria) this;
        }

        public Criteria andDriverphoneEqualTo(String value) {
            addCriterion("driverPhone =", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneNotEqualTo(String value) {
            addCriterion("driverPhone <>", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneGreaterThan(String value) {
            addCriterion("driverPhone >", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneGreaterThanOrEqualTo(String value) {
            addCriterion("driverPhone >=", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneLessThan(String value) {
            addCriterion("driverPhone <", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneLessThanOrEqualTo(String value) {
            addCriterion("driverPhone <=", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneLike(String value) {
            addCriterion("driverPhone like", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneNotLike(String value) {
            addCriterion("driverPhone not like", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneIn(List<String> values) {
            addCriterion("driverPhone in", values, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneNotIn(List<String> values) {
            addCriterion("driverPhone not in", values, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneBetween(String value1, String value2) {
            addCriterion("driverPhone between", value1, value2, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneNotBetween(String value1, String value2) {
            addCriterion("driverPhone not between", value1, value2, "driverphone");
            return (Criteria) this;
        }

        public Criteria andIdcardnumIsNull() {
            addCriterion("IDcardNum is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnumIsNotNull() {
            addCriterion("IDcardNum is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnumEqualTo(String value) {
            addCriterion("IDcardNum =", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumNotEqualTo(String value) {
            addCriterion("IDcardNum <>", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumGreaterThan(String value) {
            addCriterion("IDcardNum >", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumGreaterThanOrEqualTo(String value) {
            addCriterion("IDcardNum >=", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumLessThan(String value) {
            addCriterion("IDcardNum <", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumLessThanOrEqualTo(String value) {
            addCriterion("IDcardNum <=", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumLike(String value) {
            addCriterion("IDcardNum like", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumNotLike(String value) {
            addCriterion("IDcardNum not like", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumIn(List<String> values) {
            addCriterion("IDcardNum in", values, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumNotIn(List<String> values) {
            addCriterion("IDcardNum not in", values, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumBetween(String value1, String value2) {
            addCriterion("IDcardNum between", value1, value2, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumNotBetween(String value1, String value2) {
            addCriterion("IDcardNum not between", value1, value2, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateIsNull() {
            addCriterion("orderGetDate is null");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateIsNotNull() {
            addCriterion("orderGetDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateEqualTo(String value) {
            addCriterion("orderGetDate =", value, "ordergetdate");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateNotEqualTo(String value) {
            addCriterion("orderGetDate <>", value, "ordergetdate");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateGreaterThan(String value) {
            addCriterion("orderGetDate >", value, "ordergetdate");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateGreaterThanOrEqualTo(String value) {
            addCriterion("orderGetDate >=", value, "ordergetdate");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateLessThan(String value) {
            addCriterion("orderGetDate <", value, "ordergetdate");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateLessThanOrEqualTo(String value) {
            addCriterion("orderGetDate <=", value, "ordergetdate");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateLike(String value) {
            addCriterion("orderGetDate like", value, "ordergetdate");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateNotLike(String value) {
            addCriterion("orderGetDate not like", value, "ordergetdate");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateIn(List<String> values) {
            addCriterion("orderGetDate in", values, "ordergetdate");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateNotIn(List<String> values) {
            addCriterion("orderGetDate not in", values, "ordergetdate");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateBetween(String value1, String value2) {
            addCriterion("orderGetDate between", value1, value2, "ordergetdate");
            return (Criteria) this;
        }

        public Criteria andOrdergetdateNotBetween(String value1, String value2) {
            addCriterion("orderGetDate not between", value1, value2, "ordergetdate");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateIsNull() {
            addCriterion("orderBackDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateIsNotNull() {
            addCriterion("orderBackDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateEqualTo(String value) {
            addCriterion("orderBackDate =", value, "orderbackdate");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateNotEqualTo(String value) {
            addCriterion("orderBackDate <>", value, "orderbackdate");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateGreaterThan(String value) {
            addCriterion("orderBackDate >", value, "orderbackdate");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateGreaterThanOrEqualTo(String value) {
            addCriterion("orderBackDate >=", value, "orderbackdate");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateLessThan(String value) {
            addCriterion("orderBackDate <", value, "orderbackdate");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateLessThanOrEqualTo(String value) {
            addCriterion("orderBackDate <=", value, "orderbackdate");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateLike(String value) {
            addCriterion("orderBackDate like", value, "orderbackdate");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateNotLike(String value) {
            addCriterion("orderBackDate not like", value, "orderbackdate");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateIn(List<String> values) {
            addCriterion("orderBackDate in", values, "orderbackdate");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateNotIn(List<String> values) {
            addCriterion("orderBackDate not in", values, "orderbackdate");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateBetween(String value1, String value2) {
            addCriterion("orderBackDate between", value1, value2, "orderbackdate");
            return (Criteria) this;
        }

        public Criteria andOrderbackdateNotBetween(String value1, String value2) {
            addCriterion("orderBackDate not between", value1, value2, "orderbackdate");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(String value) {
            addCriterion("totalPrice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(String value) {
            addCriterion("totalPrice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(String value) {
            addCriterion("totalPrice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(String value) {
            addCriterion("totalPrice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(String value) {
            addCriterion("totalPrice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(String value) {
            addCriterion("totalPrice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLike(String value) {
            addCriterion("totalPrice like", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotLike(String value) {
            addCriterion("totalPrice not like", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<String> values) {
            addCriterion("totalPrice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<String> values) {
            addCriterion("totalPrice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(String value1, String value2) {
            addCriterion("totalPrice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(String value1, String value2) {
            addCriterion("totalPrice not between", value1, value2, "totalprice");
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

        public Criteria andPenaltyEqualTo(String value) {
            addCriterion("penalty =", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyNotEqualTo(String value) {
            addCriterion("penalty <>", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyGreaterThan(String value) {
            addCriterion("penalty >", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyGreaterThanOrEqualTo(String value) {
            addCriterion("penalty >=", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyLessThan(String value) {
            addCriterion("penalty <", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyLessThanOrEqualTo(String value) {
            addCriterion("penalty <=", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyLike(String value) {
            addCriterion("penalty like", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyNotLike(String value) {
            addCriterion("penalty not like", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyIn(List<String> values) {
            addCriterion("penalty in", values, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyNotIn(List<String> values) {
            addCriterion("penalty not in", values, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyBetween(String value1, String value2) {
            addCriterion("penalty between", value1, value2, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyNotBetween(String value1, String value2) {
            addCriterion("penalty not between", value1, value2, "penalty");
            return (Criteria) this;
        }

        public Criteria andRentstyleIsNull() {
            addCriterion("rentStyle is null");
            return (Criteria) this;
        }

        public Criteria andRentstyleIsNotNull() {
            addCriterion("rentStyle is not null");
            return (Criteria) this;
        }

        public Criteria andRentstyleEqualTo(String value) {
            addCriterion("rentStyle =", value, "rentstyle");
            return (Criteria) this;
        }

        public Criteria andRentstyleNotEqualTo(String value) {
            addCriterion("rentStyle <>", value, "rentstyle");
            return (Criteria) this;
        }

        public Criteria andRentstyleGreaterThan(String value) {
            addCriterion("rentStyle >", value, "rentstyle");
            return (Criteria) this;
        }

        public Criteria andRentstyleGreaterThanOrEqualTo(String value) {
            addCriterion("rentStyle >=", value, "rentstyle");
            return (Criteria) this;
        }

        public Criteria andRentstyleLessThan(String value) {
            addCriterion("rentStyle <", value, "rentstyle");
            return (Criteria) this;
        }

        public Criteria andRentstyleLessThanOrEqualTo(String value) {
            addCriterion("rentStyle <=", value, "rentstyle");
            return (Criteria) this;
        }

        public Criteria andRentstyleLike(String value) {
            addCriterion("rentStyle like", value, "rentstyle");
            return (Criteria) this;
        }

        public Criteria andRentstyleNotLike(String value) {
            addCriterion("rentStyle not like", value, "rentstyle");
            return (Criteria) this;
        }

        public Criteria andRentstyleIn(List<String> values) {
            addCriterion("rentStyle in", values, "rentstyle");
            return (Criteria) this;
        }

        public Criteria andRentstyleNotIn(List<String> values) {
            addCriterion("rentStyle not in", values, "rentstyle");
            return (Criteria) this;
        }

        public Criteria andRentstyleBetween(String value1, String value2) {
            addCriterion("rentStyle between", value1, value2, "rentstyle");
            return (Criteria) this;
        }

        public Criteria andRentstyleNotBetween(String value1, String value2) {
            addCriterion("rentStyle not between", value1, value2, "rentstyle");
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