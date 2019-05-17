package com.gdou.car.business.car.dal.entitys;

import java.util.ArrayList;
import java.util.List;

public class CarConfigInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public CarConfigInfoExample() {
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

        public Criteria andSeatNumIsNull() {
            addCriterion("seat_num is null");
            return (Criteria) this;
        }

        public Criteria andSeatNumIsNotNull() {
            addCriterion("seat_num is not null");
            return (Criteria) this;
        }

        public Criteria andSeatNumEqualTo(Integer value) {
            addCriterion("seat_num =", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumNotEqualTo(Integer value) {
            addCriterion("seat_num <>", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumGreaterThan(Integer value) {
            addCriterion("seat_num >", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_num >=", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumLessThan(Integer value) {
            addCriterion("seat_num <", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumLessThanOrEqualTo(Integer value) {
            addCriterion("seat_num <=", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumIn(List<Integer> values) {
            addCriterion("seat_num in", values, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumNotIn(List<Integer> values) {
            addCriterion("seat_num not in", values, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumBetween(Integer value1, Integer value2) {
            addCriterion("seat_num between", value1, value2, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_num not between", value1, value2, "seatNum");
            return (Criteria) this;
        }

        public Criteria andDoorsNumIsNull() {
            addCriterion("doors_num is null");
            return (Criteria) this;
        }

        public Criteria andDoorsNumIsNotNull() {
            addCriterion("doors_num is not null");
            return (Criteria) this;
        }

        public Criteria andDoorsNumEqualTo(Integer value) {
            addCriterion("doors_num =", value, "doorsNum");
            return (Criteria) this;
        }

        public Criteria andDoorsNumNotEqualTo(Integer value) {
            addCriterion("doors_num <>", value, "doorsNum");
            return (Criteria) this;
        }

        public Criteria andDoorsNumGreaterThan(Integer value) {
            addCriterion("doors_num >", value, "doorsNum");
            return (Criteria) this;
        }

        public Criteria andDoorsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("doors_num >=", value, "doorsNum");
            return (Criteria) this;
        }

        public Criteria andDoorsNumLessThan(Integer value) {
            addCriterion("doors_num <", value, "doorsNum");
            return (Criteria) this;
        }

        public Criteria andDoorsNumLessThanOrEqualTo(Integer value) {
            addCriterion("doors_num <=", value, "doorsNum");
            return (Criteria) this;
        }

        public Criteria andDoorsNumIn(List<Integer> values) {
            addCriterion("doors_num in", values, "doorsNum");
            return (Criteria) this;
        }

        public Criteria andDoorsNumNotIn(List<Integer> values) {
            addCriterion("doors_num not in", values, "doorsNum");
            return (Criteria) this;
        }

        public Criteria andDoorsNumBetween(Integer value1, Integer value2) {
            addCriterion("doors_num between", value1, value2, "doorsNum");
            return (Criteria) this;
        }

        public Criteria andDoorsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("doors_num not between", value1, value2, "doorsNum");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNull() {
            addCriterion("fuel_type is null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNotNull() {
            addCriterion("fuel_type is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeEqualTo(String value) {
            addCriterion("fuel_type =", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotEqualTo(String value) {
            addCriterion("fuel_type <>", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThan(String value) {
            addCriterion("fuel_type >", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fuel_type >=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThan(String value) {
            addCriterion("fuel_type <", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThanOrEqualTo(String value) {
            addCriterion("fuel_type <=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLike(String value) {
            addCriterion("fuel_type like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotLike(String value) {
            addCriterion("fuel_type not like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIn(List<String> values) {
            addCriterion("fuel_type in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotIn(List<String> values) {
            addCriterion("fuel_type not in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeBetween(String value1, String value2) {
            addCriterion("fuel_type between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotBetween(String value1, String value2) {
            addCriterion("fuel_type not between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeIsNull() {
            addCriterion("gearbox_type is null");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeIsNotNull() {
            addCriterion("gearbox_type is not null");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeEqualTo(String value) {
            addCriterion("gearbox_type =", value, "gearboxType");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeNotEqualTo(String value) {
            addCriterion("gearbox_type <>", value, "gearboxType");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeGreaterThan(String value) {
            addCriterion("gearbox_type >", value, "gearboxType");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("gearbox_type >=", value, "gearboxType");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeLessThan(String value) {
            addCriterion("gearbox_type <", value, "gearboxType");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeLessThanOrEqualTo(String value) {
            addCriterion("gearbox_type <=", value, "gearboxType");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeLike(String value) {
            addCriterion("gearbox_type like", value, "gearboxType");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeNotLike(String value) {
            addCriterion("gearbox_type not like", value, "gearboxType");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeIn(List<String> values) {
            addCriterion("gearbox_type in", values, "gearboxType");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeNotIn(List<String> values) {
            addCriterion("gearbox_type not in", values, "gearboxType");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeBetween(String value1, String value2) {
            addCriterion("gearbox_type between", value1, value2, "gearboxType");
            return (Criteria) this;
        }

        public Criteria andGearboxTypeNotBetween(String value1, String value2) {
            addCriterion("gearbox_type not between", value1, value2, "gearboxType");
            return (Criteria) this;
        }

        public Criteria andDisplacementIsNull() {
            addCriterion("displacement is null");
            return (Criteria) this;
        }

        public Criteria andDisplacementIsNotNull() {
            addCriterion("displacement is not null");
            return (Criteria) this;
        }

        public Criteria andDisplacementEqualTo(Integer value) {
            addCriterion("displacement =", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotEqualTo(Integer value) {
            addCriterion("displacement <>", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementGreaterThan(Integer value) {
            addCriterion("displacement >", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementGreaterThanOrEqualTo(Integer value) {
            addCriterion("displacement >=", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementLessThan(Integer value) {
            addCriterion("displacement <", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementLessThanOrEqualTo(Integer value) {
            addCriterion("displacement <=", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementIn(List<Integer> values) {
            addCriterion("displacement in", values, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotIn(List<Integer> values) {
            addCriterion("displacement not in", values, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementBetween(Integer value1, Integer value2) {
            addCriterion("displacement between", value1, value2, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotBetween(Integer value1, Integer value2) {
            addCriterion("displacement not between", value1, value2, "displacement");
            return (Criteria) this;
        }

        public Criteria andFuelLabelIsNull() {
            addCriterion("fuel_label is null");
            return (Criteria) this;
        }

        public Criteria andFuelLabelIsNotNull() {
            addCriterion("fuel_label is not null");
            return (Criteria) this;
        }

        public Criteria andFuelLabelEqualTo(String value) {
            addCriterion("fuel_label =", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelNotEqualTo(String value) {
            addCriterion("fuel_label <>", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelGreaterThan(String value) {
            addCriterion("fuel_label >", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelGreaterThanOrEqualTo(String value) {
            addCriterion("fuel_label >=", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelLessThan(String value) {
            addCriterion("fuel_label <", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelLessThanOrEqualTo(String value) {
            addCriterion("fuel_label <=", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelLike(String value) {
            addCriterion("fuel_label like", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelNotLike(String value) {
            addCriterion("fuel_label not like", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelIn(List<String> values) {
            addCriterion("fuel_label in", values, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelNotIn(List<String> values) {
            addCriterion("fuel_label not in", values, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelBetween(String value1, String value2) {
            addCriterion("fuel_label between", value1, value2, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelNotBetween(String value1, String value2) {
            addCriterion("fuel_label not between", value1, value2, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andDriveModeIsNull() {
            addCriterion("drive_mode is null");
            return (Criteria) this;
        }

        public Criteria andDriveModeIsNotNull() {
            addCriterion("drive_mode is not null");
            return (Criteria) this;
        }

        public Criteria andDriveModeEqualTo(String value) {
            addCriterion("drive_mode =", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeNotEqualTo(String value) {
            addCriterion("drive_mode <>", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeGreaterThan(String value) {
            addCriterion("drive_mode >", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeGreaterThanOrEqualTo(String value) {
            addCriterion("drive_mode >=", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeLessThan(String value) {
            addCriterion("drive_mode <", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeLessThanOrEqualTo(String value) {
            addCriterion("drive_mode <=", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeLike(String value) {
            addCriterion("drive_mode like", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeNotLike(String value) {
            addCriterion("drive_mode not like", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeIn(List<String> values) {
            addCriterion("drive_mode in", values, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeNotIn(List<String> values) {
            addCriterion("drive_mode not in", values, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeBetween(String value1, String value2) {
            addCriterion("drive_mode between", value1, value2, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeNotBetween(String value1, String value2) {
            addCriterion("drive_mode not between", value1, value2, "driveMode");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormIsNull() {
            addCriterion("engine_intake_form is null");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormIsNotNull() {
            addCriterion("engine_intake_form is not null");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormEqualTo(String value) {
            addCriterion("engine_intake_form =", value, "engineIntakeForm");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormNotEqualTo(String value) {
            addCriterion("engine_intake_form <>", value, "engineIntakeForm");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormGreaterThan(String value) {
            addCriterion("engine_intake_form >", value, "engineIntakeForm");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormGreaterThanOrEqualTo(String value) {
            addCriterion("engine_intake_form >=", value, "engineIntakeForm");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormLessThan(String value) {
            addCriterion("engine_intake_form <", value, "engineIntakeForm");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormLessThanOrEqualTo(String value) {
            addCriterion("engine_intake_form <=", value, "engineIntakeForm");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormLike(String value) {
            addCriterion("engine_intake_form like", value, "engineIntakeForm");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormNotLike(String value) {
            addCriterion("engine_intake_form not like", value, "engineIntakeForm");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormIn(List<String> values) {
            addCriterion("engine_intake_form in", values, "engineIntakeForm");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormNotIn(List<String> values) {
            addCriterion("engine_intake_form not in", values, "engineIntakeForm");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormBetween(String value1, String value2) {
            addCriterion("engine_intake_form between", value1, value2, "engineIntakeForm");
            return (Criteria) this;
        }

        public Criteria andEngineIntakeFormNotBetween(String value1, String value2) {
            addCriterion("engine_intake_form not between", value1, value2, "engineIntakeForm");
            return (Criteria) this;
        }

        public Criteria andSkylightIsNull() {
            addCriterion("skylight is null");
            return (Criteria) this;
        }

        public Criteria andSkylightIsNotNull() {
            addCriterion("skylight is not null");
            return (Criteria) this;
        }

        public Criteria andSkylightEqualTo(String value) {
            addCriterion("skylight =", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightNotEqualTo(String value) {
            addCriterion("skylight <>", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightGreaterThan(String value) {
            addCriterion("skylight >", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightGreaterThanOrEqualTo(String value) {
            addCriterion("skylight >=", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightLessThan(String value) {
            addCriterion("skylight <", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightLessThanOrEqualTo(String value) {
            addCriterion("skylight <=", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightLike(String value) {
            addCriterion("skylight like", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightNotLike(String value) {
            addCriterion("skylight not like", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightIn(List<String> values) {
            addCriterion("skylight in", values, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightNotIn(List<String> values) {
            addCriterion("skylight not in", values, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightBetween(String value1, String value2) {
            addCriterion("skylight between", value1, value2, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightNotBetween(String value1, String value2) {
            addCriterion("skylight not between", value1, value2, "skylight");
            return (Criteria) this;
        }

        public Criteria andMailboxCapacityIsNull() {
            addCriterion("mailbox_capacity is null");
            return (Criteria) this;
        }

        public Criteria andMailboxCapacityIsNotNull() {
            addCriterion("mailbox_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andMailboxCapacityEqualTo(Integer value) {
            addCriterion("mailbox_capacity =", value, "mailboxCapacity");
            return (Criteria) this;
        }

        public Criteria andMailboxCapacityNotEqualTo(Integer value) {
            addCriterion("mailbox_capacity <>", value, "mailboxCapacity");
            return (Criteria) this;
        }

        public Criteria andMailboxCapacityGreaterThan(Integer value) {
            addCriterion("mailbox_capacity >", value, "mailboxCapacity");
            return (Criteria) this;
        }

        public Criteria andMailboxCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("mailbox_capacity >=", value, "mailboxCapacity");
            return (Criteria) this;
        }

        public Criteria andMailboxCapacityLessThan(Integer value) {
            addCriterion("mailbox_capacity <", value, "mailboxCapacity");
            return (Criteria) this;
        }

        public Criteria andMailboxCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("mailbox_capacity <=", value, "mailboxCapacity");
            return (Criteria) this;
        }

        public Criteria andMailboxCapacityIn(List<Integer> values) {
            addCriterion("mailbox_capacity in", values, "mailboxCapacity");
            return (Criteria) this;
        }

        public Criteria andMailboxCapacityNotIn(List<Integer> values) {
            addCriterion("mailbox_capacity not in", values, "mailboxCapacity");
            return (Criteria) this;
        }

        public Criteria andMailboxCapacityBetween(Integer value1, Integer value2) {
            addCriterion("mailbox_capacity between", value1, value2, "mailboxCapacity");
            return (Criteria) this;
        }

        public Criteria andMailboxCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("mailbox_capacity not between", value1, value2, "mailboxCapacity");
            return (Criteria) this;
        }

        public Criteria andSpeakerIsNull() {
            addCriterion("speaker is null");
            return (Criteria) this;
        }

        public Criteria andSpeakerIsNotNull() {
            addCriterion("speaker is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakerEqualTo(Integer value) {
            addCriterion("speaker =", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotEqualTo(Integer value) {
            addCriterion("speaker <>", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerGreaterThan(Integer value) {
            addCriterion("speaker >", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerGreaterThanOrEqualTo(Integer value) {
            addCriterion("speaker >=", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerLessThan(Integer value) {
            addCriterion("speaker <", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerLessThanOrEqualTo(Integer value) {
            addCriterion("speaker <=", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerIn(List<Integer> values) {
            addCriterion("speaker in", values, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotIn(List<Integer> values) {
            addCriterion("speaker not in", values, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerBetween(Integer value1, Integer value2) {
            addCriterion("speaker between", value1, value2, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotBetween(Integer value1, Integer value2) {
            addCriterion("speaker not between", value1, value2, "speaker");
            return (Criteria) this;
        }

        public Criteria andSeatIsNull() {
            addCriterion("seat is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("seat is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(String value) {
            addCriterion("seat =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(String value) {
            addCriterion("seat <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(String value) {
            addCriterion("seat >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(String value) {
            addCriterion("seat >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(String value) {
            addCriterion("seat <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(String value) {
            addCriterion("seat <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLike(String value) {
            addCriterion("seat like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotLike(String value) {
            addCriterion("seat not like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<String> values) {
            addCriterion("seat in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<String> values) {
            addCriterion("seat not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(String value1, String value2) {
            addCriterion("seat between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(String value1, String value2) {
            addCriterion("seat not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andReversingRadarIsNull() {
            addCriterion("reversing_radar is null");
            return (Criteria) this;
        }

        public Criteria andReversingRadarIsNotNull() {
            addCriterion("reversing_radar is not null");
            return (Criteria) this;
        }

        public Criteria andReversingRadarEqualTo(String value) {
            addCriterion("reversing_radar =", value, "reversingRadar");
            return (Criteria) this;
        }

        public Criteria andReversingRadarNotEqualTo(String value) {
            addCriterion("reversing_radar <>", value, "reversingRadar");
            return (Criteria) this;
        }

        public Criteria andReversingRadarGreaterThan(String value) {
            addCriterion("reversing_radar >", value, "reversingRadar");
            return (Criteria) this;
        }

        public Criteria andReversingRadarGreaterThanOrEqualTo(String value) {
            addCriterion("reversing_radar >=", value, "reversingRadar");
            return (Criteria) this;
        }

        public Criteria andReversingRadarLessThan(String value) {
            addCriterion("reversing_radar <", value, "reversingRadar");
            return (Criteria) this;
        }

        public Criteria andReversingRadarLessThanOrEqualTo(String value) {
            addCriterion("reversing_radar <=", value, "reversingRadar");
            return (Criteria) this;
        }

        public Criteria andReversingRadarLike(String value) {
            addCriterion("reversing_radar like", value, "reversingRadar");
            return (Criteria) this;
        }

        public Criteria andReversingRadarNotLike(String value) {
            addCriterion("reversing_radar not like", value, "reversingRadar");
            return (Criteria) this;
        }

        public Criteria andReversingRadarIn(List<String> values) {
            addCriterion("reversing_radar in", values, "reversingRadar");
            return (Criteria) this;
        }

        public Criteria andReversingRadarNotIn(List<String> values) {
            addCriterion("reversing_radar not in", values, "reversingRadar");
            return (Criteria) this;
        }

        public Criteria andReversingRadarBetween(String value1, String value2) {
            addCriterion("reversing_radar between", value1, value2, "reversingRadar");
            return (Criteria) this;
        }

        public Criteria andReversingRadarNotBetween(String value1, String value2) {
            addCriterion("reversing_radar not between", value1, value2, "reversingRadar");
            return (Criteria) this;
        }

        public Criteria andAirBagIsNull() {
            addCriterion("air_bag is null");
            return (Criteria) this;
        }

        public Criteria andAirBagIsNotNull() {
            addCriterion("air_bag is not null");
            return (Criteria) this;
        }

        public Criteria andAirBagEqualTo(Integer value) {
            addCriterion("air_bag =", value, "airBag");
            return (Criteria) this;
        }

        public Criteria andAirBagNotEqualTo(Integer value) {
            addCriterion("air_bag <>", value, "airBag");
            return (Criteria) this;
        }

        public Criteria andAirBagGreaterThan(Integer value) {
            addCriterion("air_bag >", value, "airBag");
            return (Criteria) this;
        }

        public Criteria andAirBagGreaterThanOrEqualTo(Integer value) {
            addCriterion("air_bag >=", value, "airBag");
            return (Criteria) this;
        }

        public Criteria andAirBagLessThan(Integer value) {
            addCriterion("air_bag <", value, "airBag");
            return (Criteria) this;
        }

        public Criteria andAirBagLessThanOrEqualTo(Integer value) {
            addCriterion("air_bag <=", value, "airBag");
            return (Criteria) this;
        }

        public Criteria andAirBagIn(List<Integer> values) {
            addCriterion("air_bag in", values, "airBag");
            return (Criteria) this;
        }

        public Criteria andAirBagNotIn(List<Integer> values) {
            addCriterion("air_bag not in", values, "airBag");
            return (Criteria) this;
        }

        public Criteria andAirBagBetween(Integer value1, Integer value2) {
            addCriterion("air_bag between", value1, value2, "airBag");
            return (Criteria) this;
        }

        public Criteria andAirBagNotBetween(Integer value1, Integer value2) {
            addCriterion("air_bag not between", value1, value2, "airBag");
            return (Criteria) this;
        }

        public Criteria andDvdCdIsNull() {
            addCriterion("dvd_cd is null");
            return (Criteria) this;
        }

        public Criteria andDvdCdIsNotNull() {
            addCriterion("dvd_cd is not null");
            return (Criteria) this;
        }

        public Criteria andDvdCdEqualTo(String value) {
            addCriterion("dvd_cd =", value, "dvdCd");
            return (Criteria) this;
        }

        public Criteria andDvdCdNotEqualTo(String value) {
            addCriterion("dvd_cd <>", value, "dvdCd");
            return (Criteria) this;
        }

        public Criteria andDvdCdGreaterThan(String value) {
            addCriterion("dvd_cd >", value, "dvdCd");
            return (Criteria) this;
        }

        public Criteria andDvdCdGreaterThanOrEqualTo(String value) {
            addCriterion("dvd_cd >=", value, "dvdCd");
            return (Criteria) this;
        }

        public Criteria andDvdCdLessThan(String value) {
            addCriterion("dvd_cd <", value, "dvdCd");
            return (Criteria) this;
        }

        public Criteria andDvdCdLessThanOrEqualTo(String value) {
            addCriterion("dvd_cd <=", value, "dvdCd");
            return (Criteria) this;
        }

        public Criteria andDvdCdLike(String value) {
            addCriterion("dvd_cd like", value, "dvdCd");
            return (Criteria) this;
        }

        public Criteria andDvdCdNotLike(String value) {
            addCriterion("dvd_cd not like", value, "dvdCd");
            return (Criteria) this;
        }

        public Criteria andDvdCdIn(List<String> values) {
            addCriterion("dvd_cd in", values, "dvdCd");
            return (Criteria) this;
        }

        public Criteria andDvdCdNotIn(List<String> values) {
            addCriterion("dvd_cd not in", values, "dvdCd");
            return (Criteria) this;
        }

        public Criteria andDvdCdBetween(String value1, String value2) {
            addCriterion("dvd_cd between", value1, value2, "dvdCd");
            return (Criteria) this;
        }

        public Criteria andDvdCdNotBetween(String value1, String value2) {
            addCriterion("dvd_cd not between", value1, value2, "dvdCd");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationIsNull() {
            addCriterion("gps_navigation is null");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationIsNotNull() {
            addCriterion("gps_navigation is not null");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationEqualTo(String value) {
            addCriterion("gps_navigation =", value, "gpsNavigation");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationNotEqualTo(String value) {
            addCriterion("gps_navigation <>", value, "gpsNavigation");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationGreaterThan(String value) {
            addCriterion("gps_navigation >", value, "gpsNavigation");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationGreaterThanOrEqualTo(String value) {
            addCriterion("gps_navigation >=", value, "gpsNavigation");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationLessThan(String value) {
            addCriterion("gps_navigation <", value, "gpsNavigation");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationLessThanOrEqualTo(String value) {
            addCriterion("gps_navigation <=", value, "gpsNavigation");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationLike(String value) {
            addCriterion("gps_navigation like", value, "gpsNavigation");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationNotLike(String value) {
            addCriterion("gps_navigation not like", value, "gpsNavigation");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationIn(List<String> values) {
            addCriterion("gps_navigation in", values, "gpsNavigation");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationNotIn(List<String> values) {
            addCriterion("gps_navigation not in", values, "gpsNavigation");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationBetween(String value1, String value2) {
            addCriterion("gps_navigation between", value1, value2, "gpsNavigation");
            return (Criteria) this;
        }

        public Criteria andGpsNavigationNotBetween(String value1, String value2) {
            addCriterion("gps_navigation not between", value1, value2, "gpsNavigation");
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