package com.gdou.car.business.car.dal.entitys;

import java.util.ArrayList;
import java.util.List;

public class SeriesmsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public SeriesmsgExample() {
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

        public Criteria andCarphotoIsNull() {
            addCriterion("carPhoto is null");
            return (Criteria) this;
        }

        public Criteria andCarphotoIsNotNull() {
            addCriterion("carPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andCarphotoEqualTo(String value) {
            addCriterion("carPhoto =", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoNotEqualTo(String value) {
            addCriterion("carPhoto <>", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoGreaterThan(String value) {
            addCriterion("carPhoto >", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoGreaterThanOrEqualTo(String value) {
            addCriterion("carPhoto >=", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoLessThan(String value) {
            addCriterion("carPhoto <", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoLessThanOrEqualTo(String value) {
            addCriterion("carPhoto <=", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoLike(String value) {
            addCriterion("carPhoto like", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoNotLike(String value) {
            addCriterion("carPhoto not like", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoIn(List<String> values) {
            addCriterion("carPhoto in", values, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoNotIn(List<String> values) {
            addCriterion("carPhoto not in", values, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoBetween(String value1, String value2) {
            addCriterion("carPhoto between", value1, value2, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoNotBetween(String value1, String value2) {
            addCriterion("carPhoto not between", value1, value2, "carphoto");
            return (Criteria) this;
        }

        public Criteria andProductiondateIsNull() {
            addCriterion("productionDate is null");
            return (Criteria) this;
        }

        public Criteria andProductiondateIsNotNull() {
            addCriterion("productionDate is not null");
            return (Criteria) this;
        }

        public Criteria andProductiondateEqualTo(String value) {
            addCriterion("productionDate =", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateNotEqualTo(String value) {
            addCriterion("productionDate <>", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateGreaterThan(String value) {
            addCriterion("productionDate >", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateGreaterThanOrEqualTo(String value) {
            addCriterion("productionDate >=", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateLessThan(String value) {
            addCriterion("productionDate <", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateLessThanOrEqualTo(String value) {
            addCriterion("productionDate <=", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateLike(String value) {
            addCriterion("productionDate like", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateNotLike(String value) {
            addCriterion("productionDate not like", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateIn(List<String> values) {
            addCriterion("productionDate in", values, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateNotIn(List<String> values) {
            addCriterion("productionDate not in", values, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateBetween(String value1, String value2) {
            addCriterion("productionDate between", value1, value2, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateNotBetween(String value1, String value2) {
            addCriterion("productionDate not between", value1, value2, "productiondate");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andAvailablecountIsNull() {
            addCriterion("availableCount is null");
            return (Criteria) this;
        }

        public Criteria andAvailablecountIsNotNull() {
            addCriterion("availableCount is not null");
            return (Criteria) this;
        }

        public Criteria andAvailablecountEqualTo(String value) {
            addCriterion("availableCount =", value, "availablecount");
            return (Criteria) this;
        }

        public Criteria andAvailablecountNotEqualTo(String value) {
            addCriterion("availableCount <>", value, "availablecount");
            return (Criteria) this;
        }

        public Criteria andAvailablecountGreaterThan(String value) {
            addCriterion("availableCount >", value, "availablecount");
            return (Criteria) this;
        }

        public Criteria andAvailablecountGreaterThanOrEqualTo(String value) {
            addCriterion("availableCount >=", value, "availablecount");
            return (Criteria) this;
        }

        public Criteria andAvailablecountLessThan(String value) {
            addCriterion("availableCount <", value, "availablecount");
            return (Criteria) this;
        }

        public Criteria andAvailablecountLessThanOrEqualTo(String value) {
            addCriterion("availableCount <=", value, "availablecount");
            return (Criteria) this;
        }

        public Criteria andAvailablecountLike(String value) {
            addCriterion("availableCount like", value, "availablecount");
            return (Criteria) this;
        }

        public Criteria andAvailablecountNotLike(String value) {
            addCriterion("availableCount not like", value, "availablecount");
            return (Criteria) this;
        }

        public Criteria andAvailablecountIn(List<String> values) {
            addCriterion("availableCount in", values, "availablecount");
            return (Criteria) this;
        }

        public Criteria andAvailablecountNotIn(List<String> values) {
            addCriterion("availableCount not in", values, "availablecount");
            return (Criteria) this;
        }

        public Criteria andAvailablecountBetween(String value1, String value2) {
            addCriterion("availableCount between", value1, value2, "availablecount");
            return (Criteria) this;
        }

        public Criteria andAvailablecountNotBetween(String value1, String value2) {
            addCriterion("availableCount not between", value1, value2, "availablecount");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
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