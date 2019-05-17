package com.gdou.car.business.car.dal.entitys;

import java.util.ArrayList;
import java.util.List;

public class CarInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public CarInfoExample() {
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

        public Criteria andCarTitleIsNull() {
            addCriterion("car_title is null");
            return (Criteria) this;
        }

        public Criteria andCarTitleIsNotNull() {
            addCriterion("car_title is not null");
            return (Criteria) this;
        }

        public Criteria andCarTitleEqualTo(String value) {
            addCriterion("car_title =", value, "carTitle");
            return (Criteria) this;
        }

        public Criteria andCarTitleNotEqualTo(String value) {
            addCriterion("car_title <>", value, "carTitle");
            return (Criteria) this;
        }

        public Criteria andCarTitleGreaterThan(String value) {
            addCriterion("car_title >", value, "carTitle");
            return (Criteria) this;
        }

        public Criteria andCarTitleGreaterThanOrEqualTo(String value) {
            addCriterion("car_title >=", value, "carTitle");
            return (Criteria) this;
        }

        public Criteria andCarTitleLessThan(String value) {
            addCriterion("car_title <", value, "carTitle");
            return (Criteria) this;
        }

        public Criteria andCarTitleLessThanOrEqualTo(String value) {
            addCriterion("car_title <=", value, "carTitle");
            return (Criteria) this;
        }

        public Criteria andCarTitleLike(String value) {
            addCriterion("car_title like", value, "carTitle");
            return (Criteria) this;
        }

        public Criteria andCarTitleNotLike(String value) {
            addCriterion("car_title not like", value, "carTitle");
            return (Criteria) this;
        }

        public Criteria andCarTitleIn(List<String> values) {
            addCriterion("car_title in", values, "carTitle");
            return (Criteria) this;
        }

        public Criteria andCarTitleNotIn(List<String> values) {
            addCriterion("car_title not in", values, "carTitle");
            return (Criteria) this;
        }

        public Criteria andCarTitleBetween(String value1, String value2) {
            addCriterion("car_title between", value1, value2, "carTitle");
            return (Criteria) this;
        }

        public Criteria andCarTitleNotBetween(String value1, String value2) {
            addCriterion("car_title not between", value1, value2, "carTitle");
            return (Criteria) this;
        }

        public Criteria andAgeStyleIsNull() {
            addCriterion("age_style is null");
            return (Criteria) this;
        }

        public Criteria andAgeStyleIsNotNull() {
            addCriterion("age_style is not null");
            return (Criteria) this;
        }

        public Criteria andAgeStyleEqualTo(String value) {
            addCriterion("age_style =", value, "ageStyle");
            return (Criteria) this;
        }

        public Criteria andAgeStyleNotEqualTo(String value) {
            addCriterion("age_style <>", value, "ageStyle");
            return (Criteria) this;
        }

        public Criteria andAgeStyleGreaterThan(String value) {
            addCriterion("age_style >", value, "ageStyle");
            return (Criteria) this;
        }

        public Criteria andAgeStyleGreaterThanOrEqualTo(String value) {
            addCriterion("age_style >=", value, "ageStyle");
            return (Criteria) this;
        }

        public Criteria andAgeStyleLessThan(String value) {
            addCriterion("age_style <", value, "ageStyle");
            return (Criteria) this;
        }

        public Criteria andAgeStyleLessThanOrEqualTo(String value) {
            addCriterion("age_style <=", value, "ageStyle");
            return (Criteria) this;
        }

        public Criteria andAgeStyleLike(String value) {
            addCriterion("age_style like", value, "ageStyle");
            return (Criteria) this;
        }

        public Criteria andAgeStyleNotLike(String value) {
            addCriterion("age_style not like", value, "ageStyle");
            return (Criteria) this;
        }

        public Criteria andAgeStyleIn(List<String> values) {
            addCriterion("age_style in", values, "ageStyle");
            return (Criteria) this;
        }

        public Criteria andAgeStyleNotIn(List<String> values) {
            addCriterion("age_style not in", values, "ageStyle");
            return (Criteria) this;
        }

        public Criteria andAgeStyleBetween(String value1, String value2) {
            addCriterion("age_style between", value1, value2, "ageStyle");
            return (Criteria) this;
        }

        public Criteria andAgeStyleNotBetween(String value1, String value2) {
            addCriterion("age_style not between", value1, value2, "ageStyle");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationIsNull() {
            addCriterion("car_configuration is null");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationIsNotNull() {
            addCriterion("car_configuration is not null");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationEqualTo(String value) {
            addCriterion("car_configuration =", value, "carConfiguration");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationNotEqualTo(String value) {
            addCriterion("car_configuration <>", value, "carConfiguration");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationGreaterThan(String value) {
            addCriterion("car_configuration >", value, "carConfiguration");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationGreaterThanOrEqualTo(String value) {
            addCriterion("car_configuration >=", value, "carConfiguration");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationLessThan(String value) {
            addCriterion("car_configuration <", value, "carConfiguration");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationLessThanOrEqualTo(String value) {
            addCriterion("car_configuration <=", value, "carConfiguration");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationLike(String value) {
            addCriterion("car_configuration like", value, "carConfiguration");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationNotLike(String value) {
            addCriterion("car_configuration not like", value, "carConfiguration");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationIn(List<String> values) {
            addCriterion("car_configuration in", values, "carConfiguration");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationNotIn(List<String> values) {
            addCriterion("car_configuration not in", values, "carConfiguration");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationBetween(String value1, String value2) {
            addCriterion("car_configuration between", value1, value2, "carConfiguration");
            return (Criteria) this;
        }

        public Criteria andCarConfigurationNotBetween(String value1, String value2) {
            addCriterion("car_configuration not between", value1, value2, "carConfiguration");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNull() {
            addCriterion("series_name is null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNotNull() {
            addCriterion("series_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameEqualTo(String value) {
            addCriterion("series_name =", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotEqualTo(String value) {
            addCriterion("series_name <>", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThan(String value) {
            addCriterion("series_name >", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThanOrEqualTo(String value) {
            addCriterion("series_name >=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThan(String value) {
            addCriterion("series_name <", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThanOrEqualTo(String value) {
            addCriterion("series_name <=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLike(String value) {
            addCriterion("series_name like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotLike(String value) {
            addCriterion("series_name not like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIn(List<String> values) {
            addCriterion("series_name in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotIn(List<String> values) {
            addCriterion("series_name not in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameBetween(String value1, String value2) {
            addCriterion("series_name between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotBetween(String value1, String value2) {
            addCriterion("series_name not between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andBranIdIsNull() {
            addCriterion("bran_id is null");
            return (Criteria) this;
        }

        public Criteria andBranIdIsNotNull() {
            addCriterion("bran_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranIdEqualTo(String value) {
            addCriterion("bran_id =", value, "branId");
            return (Criteria) this;
        }

        public Criteria andBranIdNotEqualTo(String value) {
            addCriterion("bran_id <>", value, "branId");
            return (Criteria) this;
        }

        public Criteria andBranIdGreaterThan(String value) {
            addCriterion("bran_id >", value, "branId");
            return (Criteria) this;
        }

        public Criteria andBranIdGreaterThanOrEqualTo(String value) {
            addCriterion("bran_id >=", value, "branId");
            return (Criteria) this;
        }

        public Criteria andBranIdLessThan(String value) {
            addCriterion("bran_id <", value, "branId");
            return (Criteria) this;
        }

        public Criteria andBranIdLessThanOrEqualTo(String value) {
            addCriterion("bran_id <=", value, "branId");
            return (Criteria) this;
        }

        public Criteria andBranIdLike(String value) {
            addCriterion("bran_id like", value, "branId");
            return (Criteria) this;
        }

        public Criteria andBranIdNotLike(String value) {
            addCriterion("bran_id not like", value, "branId");
            return (Criteria) this;
        }

        public Criteria andBranIdIn(List<String> values) {
            addCriterion("bran_id in", values, "branId");
            return (Criteria) this;
        }

        public Criteria andBranIdNotIn(List<String> values) {
            addCriterion("bran_id not in", values, "branId");
            return (Criteria) this;
        }

        public Criteria andBranIdBetween(String value1, String value2) {
            addCriterion("bran_id between", value1, value2, "branId");
            return (Criteria) this;
        }

        public Criteria andBranIdNotBetween(String value1, String value2) {
            addCriterion("bran_id not between", value1, value2, "branId");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(String value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(String value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(String value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(String value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(String value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(String value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLike(String value) {
            addCriterion("model_id like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotLike(String value) {
            addCriterion("model_id not like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<String> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<String> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(String value1, String value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(String value1, String value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNull() {
            addCriterion("photo_url is null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNotNull() {
            addCriterion("photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlEqualTo(String value) {
            addCriterion("photo_url =", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotEqualTo(String value) {
            addCriterion("photo_url <>", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThan(String value) {
            addCriterion("photo_url >", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("photo_url >=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThan(String value) {
            addCriterion("photo_url <", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("photo_url <=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLike(String value) {
            addCriterion("photo_url like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotLike(String value) {
            addCriterion("photo_url not like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIn(List<String> values) {
            addCriterion("photo_url in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotIn(List<String> values) {
            addCriterion("photo_url not in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlBetween(String value1, String value2) {
            addCriterion("photo_url between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("photo_url not between", value1, value2, "photoUrl");
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