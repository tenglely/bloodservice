package com.blood.bloodservice.entity;

import java.util.ArrayList;
import java.util.List;

public class CheckresultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckresultExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andBlvIsNull() {
            addCriterion("blv is null");
            return (Criteria) this;
        }

        public Criteria andBlvIsNotNull() {
            addCriterion("blv is not null");
            return (Criteria) this;
        }

        public Criteria andBlvEqualTo(Integer value) {
            addCriterion("blv =", value, "blv");
            return (Criteria) this;
        }

        public Criteria andBlvNotEqualTo(Integer value) {
            addCriterion("blv <>", value, "blv");
            return (Criteria) this;
        }

        public Criteria andBlvGreaterThan(Integer value) {
            addCriterion("blv >", value, "blv");
            return (Criteria) this;
        }

        public Criteria andBlvGreaterThanOrEqualTo(Integer value) {
            addCriterion("blv >=", value, "blv");
            return (Criteria) this;
        }

        public Criteria andBlvLessThan(Integer value) {
            addCriterion("blv <", value, "blv");
            return (Criteria) this;
        }

        public Criteria andBlvLessThanOrEqualTo(Integer value) {
            addCriterion("blv <=", value, "blv");
            return (Criteria) this;
        }

        public Criteria andBlvIn(List<Integer> values) {
            addCriterion("blv in", values, "blv");
            return (Criteria) this;
        }

        public Criteria andBlvNotIn(List<Integer> values) {
            addCriterion("blv not in", values, "blv");
            return (Criteria) this;
        }

        public Criteria andBlvBetween(Integer value1, Integer value2) {
            addCriterion("blv between", value1, value2, "blv");
            return (Criteria) this;
        }

        public Criteria andBlvNotBetween(Integer value1, Integer value2) {
            addCriterion("blv not between", value1, value2, "blv");
            return (Criteria) this;
        }

        public Criteria andByaIsNull() {
            addCriterion("bya is null");
            return (Criteria) this;
        }

        public Criteria andByaIsNotNull() {
            addCriterion("bya is not null");
            return (Criteria) this;
        }

        public Criteria andByaEqualTo(String value) {
            addCriterion("bya =", value, "bya");
            return (Criteria) this;
        }

        public Criteria andByaNotEqualTo(String value) {
            addCriterion("bya <>", value, "bya");
            return (Criteria) this;
        }

        public Criteria andByaGreaterThan(String value) {
            addCriterion("bya >", value, "bya");
            return (Criteria) this;
        }

        public Criteria andByaGreaterThanOrEqualTo(String value) {
            addCriterion("bya >=", value, "bya");
            return (Criteria) this;
        }

        public Criteria andByaLessThan(String value) {
            addCriterion("bya <", value, "bya");
            return (Criteria) this;
        }

        public Criteria andByaLessThanOrEqualTo(String value) {
            addCriterion("bya <=", value, "bya");
            return (Criteria) this;
        }

        public Criteria andByaLike(String value) {
            addCriterion("bya like", value, "bya");
            return (Criteria) this;
        }

        public Criteria andByaNotLike(String value) {
            addCriterion("bya not like", value, "bya");
            return (Criteria) this;
        }

        public Criteria andByaIn(List<String> values) {
            addCriterion("bya in", values, "bya");
            return (Criteria) this;
        }

        public Criteria andByaNotIn(List<String> values) {
            addCriterion("bya not in", values, "bya");
            return (Criteria) this;
        }

        public Criteria andByaBetween(String value1, String value2) {
            addCriterion("bya between", value1, value2, "bya");
            return (Criteria) this;
        }

        public Criteria andByaNotBetween(String value1, String value2) {
            addCriterion("bya not between", value1, value2, "bya");
            return (Criteria) this;
        }

        public Criteria andBtypeIsNull() {
            addCriterion("btype is null");
            return (Criteria) this;
        }

        public Criteria andBtypeIsNotNull() {
            addCriterion("btype is not null");
            return (Criteria) this;
        }

        public Criteria andBtypeEqualTo(String value) {
            addCriterion("btype =", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotEqualTo(String value) {
            addCriterion("btype <>", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeGreaterThan(String value) {
            addCriterion("btype >", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeGreaterThanOrEqualTo(String value) {
            addCriterion("btype >=", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeLessThan(String value) {
            addCriterion("btype <", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeLessThanOrEqualTo(String value) {
            addCriterion("btype <=", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeLike(String value) {
            addCriterion("btype like", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotLike(String value) {
            addCriterion("btype not like", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeIn(List<String> values) {
            addCriterion("btype in", values, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotIn(List<String> values) {
            addCriterion("btype not in", values, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeBetween(String value1, String value2) {
            addCriterion("btype between", value1, value2, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotBetween(String value1, String value2) {
            addCriterion("btype not between", value1, value2, "btype");
            return (Criteria) this;
        }

        public Criteria andBdanIsNull() {
            addCriterion("bdan is null");
            return (Criteria) this;
        }

        public Criteria andBdanIsNotNull() {
            addCriterion("bdan is not null");
            return (Criteria) this;
        }

        public Criteria andBdanEqualTo(String value) {
            addCriterion("bdan =", value, "bdan");
            return (Criteria) this;
        }

        public Criteria andBdanNotEqualTo(String value) {
            addCriterion("bdan <>", value, "bdan");
            return (Criteria) this;
        }

        public Criteria andBdanGreaterThan(String value) {
            addCriterion("bdan >", value, "bdan");
            return (Criteria) this;
        }

        public Criteria andBdanGreaterThanOrEqualTo(String value) {
            addCriterion("bdan >=", value, "bdan");
            return (Criteria) this;
        }

        public Criteria andBdanLessThan(String value) {
            addCriterion("bdan <", value, "bdan");
            return (Criteria) this;
        }

        public Criteria andBdanLessThanOrEqualTo(String value) {
            addCriterion("bdan <=", value, "bdan");
            return (Criteria) this;
        }

        public Criteria andBdanLike(String value) {
            addCriterion("bdan like", value, "bdan");
            return (Criteria) this;
        }

        public Criteria andBdanNotLike(String value) {
            addCriterion("bdan not like", value, "bdan");
            return (Criteria) this;
        }

        public Criteria andBdanIn(List<String> values) {
            addCriterion("bdan in", values, "bdan");
            return (Criteria) this;
        }

        public Criteria andBdanNotIn(List<String> values) {
            addCriterion("bdan not in", values, "bdan");
            return (Criteria) this;
        }

        public Criteria andBdanBetween(String value1, String value2) {
            addCriterion("bdan between", value1, value2, "bdan");
            return (Criteria) this;
        }

        public Criteria andBdanNotBetween(String value1, String value2) {
            addCriterion("bdan not between", value1, value2, "bdan");
            return (Criteria) this;
        }

        public Criteria andByiIsNull() {
            addCriterion("byi is null");
            return (Criteria) this;
        }

        public Criteria andByiIsNotNull() {
            addCriterion("byi is not null");
            return (Criteria) this;
        }

        public Criteria andByiEqualTo(Boolean value) {
            addCriterion("byi =", value, "byi");
            return (Criteria) this;
        }

        public Criteria andByiNotEqualTo(Boolean value) {
            addCriterion("byi <>", value, "byi");
            return (Criteria) this;
        }

        public Criteria andByiGreaterThan(Boolean value) {
            addCriterion("byi >", value, "byi");
            return (Criteria) this;
        }

        public Criteria andByiGreaterThanOrEqualTo(Boolean value) {
            addCriterion("byi >=", value, "byi");
            return (Criteria) this;
        }

        public Criteria andByiLessThan(Boolean value) {
            addCriterion("byi <", value, "byi");
            return (Criteria) this;
        }

        public Criteria andByiLessThanOrEqualTo(Boolean value) {
            addCriterion("byi <=", value, "byi");
            return (Criteria) this;
        }

        public Criteria andByiIn(List<Boolean> values) {
            addCriterion("byi in", values, "byi");
            return (Criteria) this;
        }

        public Criteria andByiNotIn(List<Boolean> values) {
            addCriterion("byi not in", values, "byi");
            return (Criteria) this;
        }

        public Criteria andByiBetween(Boolean value1, Boolean value2) {
            addCriterion("byi between", value1, value2, "byi");
            return (Criteria) this;
        }

        public Criteria andByiNotBetween(Boolean value1, Boolean value2) {
            addCriterion("byi not between", value1, value2, "byi");
            return (Criteria) this;
        }

        public Criteria andBmeiIsNull() {
            addCriterion("bmei is null");
            return (Criteria) this;
        }

        public Criteria andBmeiIsNotNull() {
            addCriterion("bmei is not null");
            return (Criteria) this;
        }

        public Criteria andBmeiEqualTo(Integer value) {
            addCriterion("bmei =", value, "bmei");
            return (Criteria) this;
        }

        public Criteria andBmeiNotEqualTo(Integer value) {
            addCriterion("bmei <>", value, "bmei");
            return (Criteria) this;
        }

        public Criteria andBmeiGreaterThan(Integer value) {
            addCriterion("bmei >", value, "bmei");
            return (Criteria) this;
        }

        public Criteria andBmeiGreaterThanOrEqualTo(Integer value) {
            addCriterion("bmei >=", value, "bmei");
            return (Criteria) this;
        }

        public Criteria andBmeiLessThan(Integer value) {
            addCriterion("bmei <", value, "bmei");
            return (Criteria) this;
        }

        public Criteria andBmeiLessThanOrEqualTo(Integer value) {
            addCriterion("bmei <=", value, "bmei");
            return (Criteria) this;
        }

        public Criteria andBmeiIn(List<Integer> values) {
            addCriterion("bmei in", values, "bmei");
            return (Criteria) this;
        }

        public Criteria andBmeiNotIn(List<Integer> values) {
            addCriterion("bmei not in", values, "bmei");
            return (Criteria) this;
        }

        public Criteria andBmeiBetween(Integer value1, Integer value2) {
            addCriterion("bmei between", value1, value2, "bmei");
            return (Criteria) this;
        }

        public Criteria andBmeiNotBetween(Integer value1, Integer value2) {
            addCriterion("bmei not between", value1, value2, "bmei");
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

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(String value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(String value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(String value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(String value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(String value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLike(String value) {
            addCriterion("ctime like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotLike(String value) {
            addCriterion("ctime not like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<String> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<String> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(String value1, String value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(String value1, String value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCstateIsNull() {
            addCriterion("cstate is null");
            return (Criteria) this;
        }

        public Criteria andCstateIsNotNull() {
            addCriterion("cstate is not null");
            return (Criteria) this;
        }

        public Criteria andCstateEqualTo(Boolean value) {
            addCriterion("cstate =", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotEqualTo(Boolean value) {
            addCriterion("cstate <>", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateGreaterThan(Boolean value) {
            addCriterion("cstate >", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cstate >=", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateLessThan(Boolean value) {
            addCriterion("cstate <", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateLessThanOrEqualTo(Boolean value) {
            addCriterion("cstate <=", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateIn(List<Boolean> values) {
            addCriterion("cstate in", values, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotIn(List<Boolean> values) {
            addCriterion("cstate not in", values, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateBetween(Boolean value1, Boolean value2) {
            addCriterion("cstate between", value1, value2, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cstate not between", value1, value2, "cstate");
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