package com.blood.bloodservice.entity;

import java.util.ArrayList;
import java.util.List;

public class ApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andYidIsNull() {
            addCriterion("yid is null");
            return (Criteria) this;
        }

        public Criteria andYidIsNotNull() {
            addCriterion("yid is not null");
            return (Criteria) this;
        }

        public Criteria andYidEqualTo(Integer value) {
            addCriterion("yid =", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidNotEqualTo(Integer value) {
            addCriterion("yid <>", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidGreaterThan(Integer value) {
            addCriterion("yid >", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yid >=", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidLessThan(Integer value) {
            addCriterion("yid <", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidLessThanOrEqualTo(Integer value) {
            addCriterion("yid <=", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidIn(List<Integer> values) {
            addCriterion("yid in", values, "yid");
            return (Criteria) this;
        }

        public Criteria andYidNotIn(List<Integer> values) {
            addCriterion("yid not in", values, "yid");
            return (Criteria) this;
        }

        public Criteria andYidBetween(Integer value1, Integer value2) {
            addCriterion("yid between", value1, value2, "yid");
            return (Criteria) this;
        }

        public Criteria andYidNotBetween(Integer value1, Integer value2) {
            addCriterion("yid not between", value1, value2, "yid");
            return (Criteria) this;
        }

        public Criteria andApplybloodIsNull() {
            addCriterion("applyblood is null");
            return (Criteria) this;
        }

        public Criteria andApplybloodIsNotNull() {
            addCriterion("applyblood is not null");
            return (Criteria) this;
        }

        public Criteria andApplybloodEqualTo(String value) {
            addCriterion("applyblood =", value, "applyblood");
            return (Criteria) this;
        }

        public Criteria andApplybloodNotEqualTo(String value) {
            addCriterion("applyblood <>", value, "applyblood");
            return (Criteria) this;
        }

        public Criteria andApplybloodGreaterThan(String value) {
            addCriterion("applyblood >", value, "applyblood");
            return (Criteria) this;
        }

        public Criteria andApplybloodGreaterThanOrEqualTo(String value) {
            addCriterion("applyblood >=", value, "applyblood");
            return (Criteria) this;
        }

        public Criteria andApplybloodLessThan(String value) {
            addCriterion("applyblood <", value, "applyblood");
            return (Criteria) this;
        }

        public Criteria andApplybloodLessThanOrEqualTo(String value) {
            addCriterion("applyblood <=", value, "applyblood");
            return (Criteria) this;
        }

        public Criteria andApplybloodLike(String value) {
            addCriterion("applyblood like", value, "applyblood");
            return (Criteria) this;
        }

        public Criteria andApplybloodNotLike(String value) {
            addCriterion("applyblood not like", value, "applyblood");
            return (Criteria) this;
        }

        public Criteria andApplybloodIn(List<String> values) {
            addCriterion("applyblood in", values, "applyblood");
            return (Criteria) this;
        }

        public Criteria andApplybloodNotIn(List<String> values) {
            addCriterion("applyblood not in", values, "applyblood");
            return (Criteria) this;
        }

        public Criteria andApplybloodBetween(String value1, String value2) {
            addCriterion("applyblood between", value1, value2, "applyblood");
            return (Criteria) this;
        }

        public Criteria andApplybloodNotBetween(String value1, String value2) {
            addCriterion("applyblood not between", value1, value2, "applyblood");
            return (Criteria) this;
        }

        public Criteria andApplyamountIsNull() {
            addCriterion("applyamount is null");
            return (Criteria) this;
        }

        public Criteria andApplyamountIsNotNull() {
            addCriterion("applyamount is not null");
            return (Criteria) this;
        }

        public Criteria andApplyamountEqualTo(Double value) {
            addCriterion("applyamount =", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotEqualTo(Double value) {
            addCriterion("applyamount <>", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountGreaterThan(Double value) {
            addCriterion("applyamount >", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountGreaterThanOrEqualTo(Double value) {
            addCriterion("applyamount >=", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountLessThan(Double value) {
            addCriterion("applyamount <", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountLessThanOrEqualTo(Double value) {
            addCriterion("applyamount <=", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountIn(List<Double> values) {
            addCriterion("applyamount in", values, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotIn(List<Double> values) {
            addCriterion("applyamount not in", values, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountBetween(Double value1, Double value2) {
            addCriterion("applyamount between", value1, value2, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotBetween(Double value1, Double value2) {
            addCriterion("applyamount not between", value1, value2, "applyamount");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAdateIsNull() {
            addCriterion("adate is null");
            return (Criteria) this;
        }

        public Criteria andAdateIsNotNull() {
            addCriterion("adate is not null");
            return (Criteria) this;
        }

        public Criteria andAdateEqualTo(String value) {
            addCriterion("adate =", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotEqualTo(String value) {
            addCriterion("adate <>", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateGreaterThan(String value) {
            addCriterion("adate >", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateGreaterThanOrEqualTo(String value) {
            addCriterion("adate >=", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLessThan(String value) {
            addCriterion("adate <", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLessThanOrEqualTo(String value) {
            addCriterion("adate <=", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLike(String value) {
            addCriterion("adate like", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotLike(String value) {
            addCriterion("adate not like", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateIn(List<String> values) {
            addCriterion("adate in", values, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotIn(List<String> values) {
            addCriterion("adate not in", values, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateBetween(String value1, String value2) {
            addCriterion("adate between", value1, value2, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotBetween(String value1, String value2) {
            addCriterion("adate not between", value1, value2, "adate");
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