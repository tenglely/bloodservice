package com.blood.bloodservice.entity;

import java.util.ArrayList;
import java.util.List;

public class BtargetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BtargetExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCdanIsNull() {
            addCriterion("cdan is null");
            return (Criteria) this;
        }

        public Criteria andCdanIsNotNull() {
            addCriterion("cdan is not null");
            return (Criteria) this;
        }

        public Criteria andCdanEqualTo(String value) {
            addCriterion("cdan =", value, "cdan");
            return (Criteria) this;
        }

        public Criteria andCdanNotEqualTo(String value) {
            addCriterion("cdan <>", value, "cdan");
            return (Criteria) this;
        }

        public Criteria andCdanGreaterThan(String value) {
            addCriterion("cdan >", value, "cdan");
            return (Criteria) this;
        }

        public Criteria andCdanGreaterThanOrEqualTo(String value) {
            addCriterion("cdan >=", value, "cdan");
            return (Criteria) this;
        }

        public Criteria andCdanLessThan(String value) {
            addCriterion("cdan <", value, "cdan");
            return (Criteria) this;
        }

        public Criteria andCdanLessThanOrEqualTo(String value) {
            addCriterion("cdan <=", value, "cdan");
            return (Criteria) this;
        }

        public Criteria andCdanLike(String value) {
            addCriterion("cdan like", value, "cdan");
            return (Criteria) this;
        }

        public Criteria andCdanNotLike(String value) {
            addCriterion("cdan not like", value, "cdan");
            return (Criteria) this;
        }

        public Criteria andCdanIn(List<String> values) {
            addCriterion("cdan in", values, "cdan");
            return (Criteria) this;
        }

        public Criteria andCdanNotIn(List<String> values) {
            addCriterion("cdan not in", values, "cdan");
            return (Criteria) this;
        }

        public Criteria andCdanBetween(String value1, String value2) {
            addCriterion("cdan between", value1, value2, "cdan");
            return (Criteria) this;
        }

        public Criteria andCdanNotBetween(String value1, String value2) {
            addCriterion("cdan not between", value1, value2, "cdan");
            return (Criteria) this;
        }

        public Criteria andCyiIsNull() {
            addCriterion("cyi is null");
            return (Criteria) this;
        }

        public Criteria andCyiIsNotNull() {
            addCriterion("cyi is not null");
            return (Criteria) this;
        }

        public Criteria andCyiEqualTo(Boolean value) {
            addCriterion("cyi =", value, "cyi");
            return (Criteria) this;
        }

        public Criteria andCyiNotEqualTo(Boolean value) {
            addCriterion("cyi <>", value, "cyi");
            return (Criteria) this;
        }

        public Criteria andCyiGreaterThan(Boolean value) {
            addCriterion("cyi >", value, "cyi");
            return (Criteria) this;
        }

        public Criteria andCyiGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cyi >=", value, "cyi");
            return (Criteria) this;
        }

        public Criteria andCyiLessThan(Boolean value) {
            addCriterion("cyi <", value, "cyi");
            return (Criteria) this;
        }

        public Criteria andCyiLessThanOrEqualTo(Boolean value) {
            addCriterion("cyi <=", value, "cyi");
            return (Criteria) this;
        }

        public Criteria andCyiIn(List<Boolean> values) {
            addCriterion("cyi in", values, "cyi");
            return (Criteria) this;
        }

        public Criteria andCyiNotIn(List<Boolean> values) {
            addCriterion("cyi not in", values, "cyi");
            return (Criteria) this;
        }

        public Criteria andCyiBetween(Boolean value1, Boolean value2) {
            addCriterion("cyi between", value1, value2, "cyi");
            return (Criteria) this;
        }

        public Criteria andCyiNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cyi not between", value1, value2, "cyi");
            return (Criteria) this;
        }

        public Criteria andCmeiIsNull() {
            addCriterion("cmei is null");
            return (Criteria) this;
        }

        public Criteria andCmeiIsNotNull() {
            addCriterion("cmei is not null");
            return (Criteria) this;
        }

        public Criteria andCmeiEqualTo(Integer value) {
            addCriterion("cmei =", value, "cmei");
            return (Criteria) this;
        }

        public Criteria andCmeiNotEqualTo(Integer value) {
            addCriterion("cmei <>", value, "cmei");
            return (Criteria) this;
        }

        public Criteria andCmeiGreaterThan(Integer value) {
            addCriterion("cmei >", value, "cmei");
            return (Criteria) this;
        }

        public Criteria andCmeiGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmei >=", value, "cmei");
            return (Criteria) this;
        }

        public Criteria andCmeiLessThan(Integer value) {
            addCriterion("cmei <", value, "cmei");
            return (Criteria) this;
        }

        public Criteria andCmeiLessThanOrEqualTo(Integer value) {
            addCriterion("cmei <=", value, "cmei");
            return (Criteria) this;
        }

        public Criteria andCmeiIn(List<Integer> values) {
            addCriterion("cmei in", values, "cmei");
            return (Criteria) this;
        }

        public Criteria andCmeiNotIn(List<Integer> values) {
            addCriterion("cmei not in", values, "cmei");
            return (Criteria) this;
        }

        public Criteria andCmeiBetween(Integer value1, Integer value2) {
            addCriterion("cmei between", value1, value2, "cmei");
            return (Criteria) this;
        }

        public Criteria andCmeiNotBetween(Integer value1, Integer value2) {
            addCriterion("cmei not between", value1, value2, "cmei");
            return (Criteria) this;
        }

        public Criteria andCbingIsNull() {
            addCriterion("cbing is null");
            return (Criteria) this;
        }

        public Criteria andCbingIsNotNull() {
            addCriterion("cbing is not null");
            return (Criteria) this;
        }

        public Criteria andCbingEqualTo(Boolean value) {
            addCriterion("cbing =", value, "cbing");
            return (Criteria) this;
        }

        public Criteria andCbingNotEqualTo(Boolean value) {
            addCriterion("cbing <>", value, "cbing");
            return (Criteria) this;
        }

        public Criteria andCbingGreaterThan(Boolean value) {
            addCriterion("cbing >", value, "cbing");
            return (Criteria) this;
        }

        public Criteria andCbingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cbing >=", value, "cbing");
            return (Criteria) this;
        }

        public Criteria andCbingLessThan(Boolean value) {
            addCriterion("cbing <", value, "cbing");
            return (Criteria) this;
        }

        public Criteria andCbingLessThanOrEqualTo(Boolean value) {
            addCriterion("cbing <=", value, "cbing");
            return (Criteria) this;
        }

        public Criteria andCbingIn(List<Boolean> values) {
            addCriterion("cbing in", values, "cbing");
            return (Criteria) this;
        }

        public Criteria andCbingNotIn(List<Boolean> values) {
            addCriterion("cbing not in", values, "cbing");
            return (Criteria) this;
        }

        public Criteria andCbingBetween(Boolean value1, Boolean value2) {
            addCriterion("cbing between", value1, value2, "cbing");
            return (Criteria) this;
        }

        public Criteria andCbingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cbing not between", value1, value2, "cbing");
            return (Criteria) this;
        }

        public Criteria andCmeiduIsNull() {
            addCriterion("cmeidu is null");
            return (Criteria) this;
        }

        public Criteria andCmeiduIsNotNull() {
            addCriterion("cmeidu is not null");
            return (Criteria) this;
        }

        public Criteria andCmeiduEqualTo(Boolean value) {
            addCriterion("cmeidu =", value, "cmeidu");
            return (Criteria) this;
        }

        public Criteria andCmeiduNotEqualTo(Boolean value) {
            addCriterion("cmeidu <>", value, "cmeidu");
            return (Criteria) this;
        }

        public Criteria andCmeiduGreaterThan(Boolean value) {
            addCriterion("cmeidu >", value, "cmeidu");
            return (Criteria) this;
        }

        public Criteria andCmeiduGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cmeidu >=", value, "cmeidu");
            return (Criteria) this;
        }

        public Criteria andCmeiduLessThan(Boolean value) {
            addCriterion("cmeidu <", value, "cmeidu");
            return (Criteria) this;
        }

        public Criteria andCmeiduLessThanOrEqualTo(Boolean value) {
            addCriterion("cmeidu <=", value, "cmeidu");
            return (Criteria) this;
        }

        public Criteria andCmeiduIn(List<Boolean> values) {
            addCriterion("cmeidu in", values, "cmeidu");
            return (Criteria) this;
        }

        public Criteria andCmeiduNotIn(List<Boolean> values) {
            addCriterion("cmeidu not in", values, "cmeidu");
            return (Criteria) this;
        }

        public Criteria andCmeiduBetween(Boolean value1, Boolean value2) {
            addCriterion("cmeidu between", value1, value2, "cmeidu");
            return (Criteria) this;
        }

        public Criteria andCmeiduNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cmeidu not between", value1, value2, "cmeidu");
            return (Criteria) this;
        }

        public Criteria andChivIsNull() {
            addCriterion("chiv is null");
            return (Criteria) this;
        }

        public Criteria andChivIsNotNull() {
            addCriterion("chiv is not null");
            return (Criteria) this;
        }

        public Criteria andChivEqualTo(Boolean value) {
            addCriterion("chiv =", value, "chiv");
            return (Criteria) this;
        }

        public Criteria andChivNotEqualTo(Boolean value) {
            addCriterion("chiv <>", value, "chiv");
            return (Criteria) this;
        }

        public Criteria andChivGreaterThan(Boolean value) {
            addCriterion("chiv >", value, "chiv");
            return (Criteria) this;
        }

        public Criteria andChivGreaterThanOrEqualTo(Boolean value) {
            addCriterion("chiv >=", value, "chiv");
            return (Criteria) this;
        }

        public Criteria andChivLessThan(Boolean value) {
            addCriterion("chiv <", value, "chiv");
            return (Criteria) this;
        }

        public Criteria andChivLessThanOrEqualTo(Boolean value) {
            addCriterion("chiv <=", value, "chiv");
            return (Criteria) this;
        }

        public Criteria andChivIn(List<Boolean> values) {
            addCriterion("chiv in", values, "chiv");
            return (Criteria) this;
        }

        public Criteria andChivNotIn(List<Boolean> values) {
            addCriterion("chiv not in", values, "chiv");
            return (Criteria) this;
        }

        public Criteria andChivBetween(Boolean value1, Boolean value2) {
            addCriterion("chiv between", value1, value2, "chiv");
            return (Criteria) this;
        }

        public Criteria andChivNotBetween(Boolean value1, Boolean value2) {
            addCriterion("chiv not between", value1, value2, "chiv");
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