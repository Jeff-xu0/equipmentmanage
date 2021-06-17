package com.paki.equip.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
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

        public Criteria andRepairidIsNull() {
            addCriterion("repairid is null");
            return (Criteria) this;
        }

        public Criteria andRepairidIsNotNull() {
            addCriterion("repairid is not null");
            return (Criteria) this;
        }

        public Criteria andRepairidEqualTo(Integer value) {
            addCriterion("repairid =", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidNotEqualTo(Integer value) {
            addCriterion("repairid <>", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidGreaterThan(Integer value) {
            addCriterion("repairid >", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidGreaterThanOrEqualTo(Integer value) {
            addCriterion("repairid >=", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidLessThan(Integer value) {
            addCriterion("repairid <", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidLessThanOrEqualTo(Integer value) {
            addCriterion("repairid <=", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidIn(List<Integer> values) {
            addCriterion("repairid in", values, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidNotIn(List<Integer> values) {
            addCriterion("repairid not in", values, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidBetween(Integer value1, Integer value2) {
            addCriterion("repairid between", value1, value2, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidNotBetween(Integer value1, Integer value2) {
            addCriterion("repairid not between", value1, value2, "repairid");
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

        public Criteria andRepairtimeIsNull() {
            addCriterion("repairtime is null");
            return (Criteria) this;
        }

        public Criteria andRepairtimeIsNotNull() {
            addCriterion("repairtime is not null");
            return (Criteria) this;
        }

        public Criteria andRepairtimeEqualTo(Date value) {
            addCriterion("repairtime =", value, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeNotEqualTo(Date value) {
            addCriterion("repairtime <>", value, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeGreaterThan(Date value) {
            addCriterion("repairtime >", value, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("repairtime >=", value, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeLessThan(Date value) {
            addCriterion("repairtime <", value, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeLessThanOrEqualTo(Date value) {
            addCriterion("repairtime <=", value, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeIn(List<Date> values) {
            addCriterion("repairtime in", values, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeNotIn(List<Date> values) {
            addCriterion("repairtime not in", values, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeBetween(Date value1, Date value2) {
            addCriterion("repairtime between", value1, value2, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeNotBetween(Date value1, Date value2) {
            addCriterion("repairtime not between", value1, value2, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairmanidIsNull() {
            addCriterion("repairmanid is null");
            return (Criteria) this;
        }

        public Criteria andRepairmanidIsNotNull() {
            addCriterion("repairmanid is not null");
            return (Criteria) this;
        }

        public Criteria andRepairmanidEqualTo(Integer value) {
            addCriterion("repairmanid =", value, "repairmanid");
            return (Criteria) this;
        }

        public Criteria andRepairmanidNotEqualTo(Integer value) {
            addCriterion("repairmanid <>", value, "repairmanid");
            return (Criteria) this;
        }

        public Criteria andRepairmanidGreaterThan(Integer value) {
            addCriterion("repairmanid >", value, "repairmanid");
            return (Criteria) this;
        }

        public Criteria andRepairmanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("repairmanid >=", value, "repairmanid");
            return (Criteria) this;
        }

        public Criteria andRepairmanidLessThan(Integer value) {
            addCriterion("repairmanid <", value, "repairmanid");
            return (Criteria) this;
        }

        public Criteria andRepairmanidLessThanOrEqualTo(Integer value) {
            addCriterion("repairmanid <=", value, "repairmanid");
            return (Criteria) this;
        }

        public Criteria andRepairmanidIn(List<Integer> values) {
            addCriterion("repairmanid in", values, "repairmanid");
            return (Criteria) this;
        }

        public Criteria andRepairmanidNotIn(List<Integer> values) {
            addCriterion("repairmanid not in", values, "repairmanid");
            return (Criteria) this;
        }

        public Criteria andRepairmanidBetween(Integer value1, Integer value2) {
            addCriterion("repairmanid between", value1, value2, "repairmanid");
            return (Criteria) this;
        }

        public Criteria andRepairmanidNotBetween(Integer value1, Integer value2) {
            addCriterion("repairmanid not between", value1, value2, "repairmanid");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Boolean value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Boolean value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Boolean value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Boolean value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Boolean value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Boolean> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Boolean> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Boolean value1, Boolean value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("result not between", value1, value2, "result");
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