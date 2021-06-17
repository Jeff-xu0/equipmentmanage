package com.paki.equip.pojo;

import java.util.ArrayList;
import java.util.List;

public class DamageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DamageExample() {
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

        public Criteria andDamageidIsNull() {
            addCriterion("damageid is null");
            return (Criteria) this;
        }

        public Criteria andDamageidIsNotNull() {
            addCriterion("damageid is not null");
            return (Criteria) this;
        }

        public Criteria andDamageidEqualTo(Integer value) {
            addCriterion("damageid =", value, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidNotEqualTo(Integer value) {
            addCriterion("damageid <>", value, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidGreaterThan(Integer value) {
            addCriterion("damageid >", value, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("damageid >=", value, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidLessThan(Integer value) {
            addCriterion("damageid <", value, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidLessThanOrEqualTo(Integer value) {
            addCriterion("damageid <=", value, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidIn(List<Integer> values) {
            addCriterion("damageid in", values, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidNotIn(List<Integer> values) {
            addCriterion("damageid not in", values, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidBetween(Integer value1, Integer value2) {
            addCriterion("damageid between", value1, value2, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidNotBetween(Integer value1, Integer value2) {
            addCriterion("damageid not between", value1, value2, "damageid");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andAgreemanIsNull() {
            addCriterion("agreeman is null");
            return (Criteria) this;
        }

        public Criteria andAgreemanIsNotNull() {
            addCriterion("agreeman is not null");
            return (Criteria) this;
        }

        public Criteria andAgreemanEqualTo(Integer value) {
            addCriterion("agreeman =", value, "agreeman");
            return (Criteria) this;
        }

        public Criteria andAgreemanNotEqualTo(Integer value) {
            addCriterion("agreeman <>", value, "agreeman");
            return (Criteria) this;
        }

        public Criteria andAgreemanGreaterThan(Integer value) {
            addCriterion("agreeman >", value, "agreeman");
            return (Criteria) this;
        }

        public Criteria andAgreemanGreaterThanOrEqualTo(Integer value) {
            addCriterion("agreeman >=", value, "agreeman");
            return (Criteria) this;
        }

        public Criteria andAgreemanLessThan(Integer value) {
            addCriterion("agreeman <", value, "agreeman");
            return (Criteria) this;
        }

        public Criteria andAgreemanLessThanOrEqualTo(Integer value) {
            addCriterion("agreeman <=", value, "agreeman");
            return (Criteria) this;
        }

        public Criteria andAgreemanIn(List<Integer> values) {
            addCriterion("agreeman in", values, "agreeman");
            return (Criteria) this;
        }

        public Criteria andAgreemanNotIn(List<Integer> values) {
            addCriterion("agreeman not in", values, "agreeman");
            return (Criteria) this;
        }

        public Criteria andAgreemanBetween(Integer value1, Integer value2) {
            addCriterion("agreeman between", value1, value2, "agreeman");
            return (Criteria) this;
        }

        public Criteria andAgreemanNotBetween(Integer value1, Integer value2) {
            addCriterion("agreeman not between", value1, value2, "agreeman");
            return (Criteria) this;
        }

        public Criteria andHandlemanIsNull() {
            addCriterion("handleman is null");
            return (Criteria) this;
        }

        public Criteria andHandlemanIsNotNull() {
            addCriterion("handleman is not null");
            return (Criteria) this;
        }

        public Criteria andHandlemanEqualTo(Integer value) {
            addCriterion("handleman =", value, "handleman");
            return (Criteria) this;
        }

        public Criteria andHandlemanNotEqualTo(Integer value) {
            addCriterion("handleman <>", value, "handleman");
            return (Criteria) this;
        }

        public Criteria andHandlemanGreaterThan(Integer value) {
            addCriterion("handleman >", value, "handleman");
            return (Criteria) this;
        }

        public Criteria andHandlemanGreaterThanOrEqualTo(Integer value) {
            addCriterion("handleman >=", value, "handleman");
            return (Criteria) this;
        }

        public Criteria andHandlemanLessThan(Integer value) {
            addCriterion("handleman <", value, "handleman");
            return (Criteria) this;
        }

        public Criteria andHandlemanLessThanOrEqualTo(Integer value) {
            addCriterion("handleman <=", value, "handleman");
            return (Criteria) this;
        }

        public Criteria andHandlemanIn(List<Integer> values) {
            addCriterion("handleman in", values, "handleman");
            return (Criteria) this;
        }

        public Criteria andHandlemanNotIn(List<Integer> values) {
            addCriterion("handleman not in", values, "handleman");
            return (Criteria) this;
        }

        public Criteria andHandlemanBetween(Integer value1, Integer value2) {
            addCriterion("handleman between", value1, value2, "handleman");
            return (Criteria) this;
        }

        public Criteria andHandlemanNotBetween(Integer value1, Integer value2) {
            addCriterion("handleman not between", value1, value2, "handleman");
            return (Criteria) this;
        }

        public Criteria andWayIsNull() {
            addCriterion("way is null");
            return (Criteria) this;
        }

        public Criteria andWayIsNotNull() {
            addCriterion("way is not null");
            return (Criteria) this;
        }

        public Criteria andWayEqualTo(String value) {
            addCriterion("way =", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotEqualTo(String value) {
            addCriterion("way <>", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThan(String value) {
            addCriterion("way >", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThanOrEqualTo(String value) {
            addCriterion("way >=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThan(String value) {
            addCriterion("way <", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThanOrEqualTo(String value) {
            addCriterion("way <=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLike(String value) {
            addCriterion("way like", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotLike(String value) {
            addCriterion("way not like", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayIn(List<String> values) {
            addCriterion("way in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotIn(List<String> values) {
            addCriterion("way not in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayBetween(String value1, String value2) {
            addCriterion("way between", value1, value2, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotBetween(String value1, String value2) {
            addCriterion("way not between", value1, value2, "way");
            return (Criteria) this;
        }

        public Criteria andEquidIsNull() {
            addCriterion("equid is null");
            return (Criteria) this;
        }

        public Criteria andEquidIsNotNull() {
            addCriterion("equid is not null");
            return (Criteria) this;
        }

        public Criteria andEquidEqualTo(Integer value) {
            addCriterion("equid =", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidNotEqualTo(Integer value) {
            addCriterion("equid <>", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidGreaterThan(Integer value) {
            addCriterion("equid >", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidGreaterThanOrEqualTo(Integer value) {
            addCriterion("equid >=", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidLessThan(Integer value) {
            addCriterion("equid <", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidLessThanOrEqualTo(Integer value) {
            addCriterion("equid <=", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidIn(List<Integer> values) {
            addCriterion("equid in", values, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidNotIn(List<Integer> values) {
            addCriterion("equid not in", values, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidBetween(Integer value1, Integer value2) {
            addCriterion("equid between", value1, value2, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidNotBetween(Integer value1, Integer value2) {
            addCriterion("equid not between", value1, value2, "equid");
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