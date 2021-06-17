package com.paki.equip.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RentExample() {
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

        public Criteria andRentdepidIsNull() {
            addCriterion("rentdepid is null");
            return (Criteria) this;
        }

        public Criteria andRentdepidIsNotNull() {
            addCriterion("rentdepid is not null");
            return (Criteria) this;
        }

        public Criteria andRentdepidEqualTo(Integer value) {
            addCriterion("rentdepid =", value, "rentdepid");
            return (Criteria) this;
        }

        public Criteria andRentdepidNotEqualTo(Integer value) {
            addCriterion("rentdepid <>", value, "rentdepid");
            return (Criteria) this;
        }

        public Criteria andRentdepidGreaterThan(Integer value) {
            addCriterion("rentdepid >", value, "rentdepid");
            return (Criteria) this;
        }

        public Criteria andRentdepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rentdepid >=", value, "rentdepid");
            return (Criteria) this;
        }

        public Criteria andRentdepidLessThan(Integer value) {
            addCriterion("rentdepid <", value, "rentdepid");
            return (Criteria) this;
        }

        public Criteria andRentdepidLessThanOrEqualTo(Integer value) {
            addCriterion("rentdepid <=", value, "rentdepid");
            return (Criteria) this;
        }

        public Criteria andRentdepidIn(List<Integer> values) {
            addCriterion("rentdepid in", values, "rentdepid");
            return (Criteria) this;
        }

        public Criteria andRentdepidNotIn(List<Integer> values) {
            addCriterion("rentdepid not in", values, "rentdepid");
            return (Criteria) this;
        }

        public Criteria andRentdepidBetween(Integer value1, Integer value2) {
            addCriterion("rentdepid between", value1, value2, "rentdepid");
            return (Criteria) this;
        }

        public Criteria andRentdepidNotBetween(Integer value1, Integer value2) {
            addCriterion("rentdepid not between", value1, value2, "rentdepid");
            return (Criteria) this;
        }

        public Criteria andRentmanidIsNull() {
            addCriterion("rentmanid is null");
            return (Criteria) this;
        }

        public Criteria andRentmanidIsNotNull() {
            addCriterion("rentmanid is not null");
            return (Criteria) this;
        }

        public Criteria andRentmanidEqualTo(Integer value) {
            addCriterion("rentmanid =", value, "rentmanid");
            return (Criteria) this;
        }

        public Criteria andRentmanidNotEqualTo(Integer value) {
            addCriterion("rentmanid <>", value, "rentmanid");
            return (Criteria) this;
        }

        public Criteria andRentmanidGreaterThan(Integer value) {
            addCriterion("rentmanid >", value, "rentmanid");
            return (Criteria) this;
        }

        public Criteria andRentmanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rentmanid >=", value, "rentmanid");
            return (Criteria) this;
        }

        public Criteria andRentmanidLessThan(Integer value) {
            addCriterion("rentmanid <", value, "rentmanid");
            return (Criteria) this;
        }

        public Criteria andRentmanidLessThanOrEqualTo(Integer value) {
            addCriterion("rentmanid <=", value, "rentmanid");
            return (Criteria) this;
        }

        public Criteria andRentmanidIn(List<Integer> values) {
            addCriterion("rentmanid in", values, "rentmanid");
            return (Criteria) this;
        }

        public Criteria andRentmanidNotIn(List<Integer> values) {
            addCriterion("rentmanid not in", values, "rentmanid");
            return (Criteria) this;
        }

        public Criteria andRentmanidBetween(Integer value1, Integer value2) {
            addCriterion("rentmanid between", value1, value2, "rentmanid");
            return (Criteria) this;
        }

        public Criteria andRentmanidNotBetween(Integer value1, Integer value2) {
            addCriterion("rentmanid not between", value1, value2, "rentmanid");
            return (Criteria) this;
        }

        public Criteria andRentuseIsNull() {
            addCriterion("rentuse is null");
            return (Criteria) this;
        }

        public Criteria andRentuseIsNotNull() {
            addCriterion("rentuse is not null");
            return (Criteria) this;
        }

        public Criteria andRentuseEqualTo(String value) {
            addCriterion("rentuse =", value, "rentuse");
            return (Criteria) this;
        }

        public Criteria andRentuseNotEqualTo(String value) {
            addCriterion("rentuse <>", value, "rentuse");
            return (Criteria) this;
        }

        public Criteria andRentuseGreaterThan(String value) {
            addCriterion("rentuse >", value, "rentuse");
            return (Criteria) this;
        }

        public Criteria andRentuseGreaterThanOrEqualTo(String value) {
            addCriterion("rentuse >=", value, "rentuse");
            return (Criteria) this;
        }

        public Criteria andRentuseLessThan(String value) {
            addCriterion("rentuse <", value, "rentuse");
            return (Criteria) this;
        }

        public Criteria andRentuseLessThanOrEqualTo(String value) {
            addCriterion("rentuse <=", value, "rentuse");
            return (Criteria) this;
        }

        public Criteria andRentuseLike(String value) {
            addCriterion("rentuse like", value, "rentuse");
            return (Criteria) this;
        }

        public Criteria andRentuseNotLike(String value) {
            addCriterion("rentuse not like", value, "rentuse");
            return (Criteria) this;
        }

        public Criteria andRentuseIn(List<String> values) {
            addCriterion("rentuse in", values, "rentuse");
            return (Criteria) this;
        }

        public Criteria andRentuseNotIn(List<String> values) {
            addCriterion("rentuse not in", values, "rentuse");
            return (Criteria) this;
        }

        public Criteria andRentuseBetween(String value1, String value2) {
            addCriterion("rentuse between", value1, value2, "rentuse");
            return (Criteria) this;
        }

        public Criteria andRentuseNotBetween(String value1, String value2) {
            addCriterion("rentuse not between", value1, value2, "rentuse");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNull() {
            addCriterion("returntime is null");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNotNull() {
            addCriterion("returntime is not null");
            return (Criteria) this;
        }

        public Criteria andReturntimeEqualTo(Date value) {
            addCriterion("returntime =", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotEqualTo(Date value) {
            addCriterion("returntime <>", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThan(Date value) {
            addCriterion("returntime >", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("returntime >=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThan(Date value) {
            addCriterion("returntime <", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThanOrEqualTo(Date value) {
            addCriterion("returntime <=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIn(List<Date> values) {
            addCriterion("returntime in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotIn(List<Date> values) {
            addCriterion("returntime not in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeBetween(Date value1, Date value2) {
            addCriterion("returntime between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotBetween(Date value1, Date value2) {
            addCriterion("returntime not between", value1, value2, "returntime");
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