package com.blood.bloodservice.entity;

import java.util.ArrayList;
import java.util.List;

public class SendbloodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SendbloodExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
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

        public Criteria andSbnumberIsNull() {
            addCriterion("sbnumber is null");
            return (Criteria) this;
        }

        public Criteria andSbnumberIsNotNull() {
            addCriterion("sbnumber is not null");
            return (Criteria) this;
        }

        public Criteria andSbnumberEqualTo(Integer value) {
            addCriterion("sbnumber =", value, "sbnumber");
            return (Criteria) this;
        }

        public Criteria andSbnumberNotEqualTo(Integer value) {
            addCriterion("sbnumber <>", value, "sbnumber");
            return (Criteria) this;
        }

        public Criteria andSbnumberGreaterThan(Integer value) {
            addCriterion("sbnumber >", value, "sbnumber");
            return (Criteria) this;
        }

        public Criteria andSbnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sbnumber >=", value, "sbnumber");
            return (Criteria) this;
        }

        public Criteria andSbnumberLessThan(Integer value) {
            addCriterion("sbnumber <", value, "sbnumber");
            return (Criteria) this;
        }

        public Criteria andSbnumberLessThanOrEqualTo(Integer value) {
            addCriterion("sbnumber <=", value, "sbnumber");
            return (Criteria) this;
        }

        public Criteria andSbnumberIn(List<Integer> values) {
            addCriterion("sbnumber in", values, "sbnumber");
            return (Criteria) this;
        }

        public Criteria andSbnumberNotIn(List<Integer> values) {
            addCriterion("sbnumber not in", values, "sbnumber");
            return (Criteria) this;
        }

        public Criteria andSbnumberBetween(Integer value1, Integer value2) {
            addCriterion("sbnumber between", value1, value2, "sbnumber");
            return (Criteria) this;
        }

        public Criteria andSbnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("sbnumber not between", value1, value2, "sbnumber");
            return (Criteria) this;
        }

        public Criteria andSbtypeIsNull() {
            addCriterion("sbtype is null");
            return (Criteria) this;
        }

        public Criteria andSbtypeIsNotNull() {
            addCriterion("sbtype is not null");
            return (Criteria) this;
        }

        public Criteria andSbtypeEqualTo(String value) {
            addCriterion("sbtype =", value, "sbtype");
            return (Criteria) this;
        }

        public Criteria andSbtypeNotEqualTo(String value) {
            addCriterion("sbtype <>", value, "sbtype");
            return (Criteria) this;
        }

        public Criteria andSbtypeGreaterThan(String value) {
            addCriterion("sbtype >", value, "sbtype");
            return (Criteria) this;
        }

        public Criteria andSbtypeGreaterThanOrEqualTo(String value) {
            addCriterion("sbtype >=", value, "sbtype");
            return (Criteria) this;
        }

        public Criteria andSbtypeLessThan(String value) {
            addCriterion("sbtype <", value, "sbtype");
            return (Criteria) this;
        }

        public Criteria andSbtypeLessThanOrEqualTo(String value) {
            addCriterion("sbtype <=", value, "sbtype");
            return (Criteria) this;
        }

        public Criteria andSbtypeLike(String value) {
            addCriterion("sbtype like", value, "sbtype");
            return (Criteria) this;
        }

        public Criteria andSbtypeNotLike(String value) {
            addCriterion("sbtype not like", value, "sbtype");
            return (Criteria) this;
        }

        public Criteria andSbtypeIn(List<String> values) {
            addCriterion("sbtype in", values, "sbtype");
            return (Criteria) this;
        }

        public Criteria andSbtypeNotIn(List<String> values) {
            addCriterion("sbtype not in", values, "sbtype");
            return (Criteria) this;
        }

        public Criteria andSbtypeBetween(String value1, String value2) {
            addCriterion("sbtype between", value1, value2, "sbtype");
            return (Criteria) this;
        }

        public Criteria andSbtypeNotBetween(String value1, String value2) {
            addCriterion("sbtype not between", value1, value2, "sbtype");
            return (Criteria) this;
        }

        public Criteria andBlessIsNull() {
            addCriterion("bless is null");
            return (Criteria) this;
        }

        public Criteria andBlessIsNotNull() {
            addCriterion("bless is not null");
            return (Criteria) this;
        }

        public Criteria andBlessEqualTo(String value) {
            addCriterion("bless =", value, "bless");
            return (Criteria) this;
        }

        public Criteria andBlessNotEqualTo(String value) {
            addCriterion("bless <>", value, "bless");
            return (Criteria) this;
        }

        public Criteria andBlessGreaterThan(String value) {
            addCriterion("bless >", value, "bless");
            return (Criteria) this;
        }

        public Criteria andBlessGreaterThanOrEqualTo(String value) {
            addCriterion("bless >=", value, "bless");
            return (Criteria) this;
        }

        public Criteria andBlessLessThan(String value) {
            addCriterion("bless <", value, "bless");
            return (Criteria) this;
        }

        public Criteria andBlessLessThanOrEqualTo(String value) {
            addCriterion("bless <=", value, "bless");
            return (Criteria) this;
        }

        public Criteria andBlessLike(String value) {
            addCriterion("bless like", value, "bless");
            return (Criteria) this;
        }

        public Criteria andBlessNotLike(String value) {
            addCriterion("bless not like", value, "bless");
            return (Criteria) this;
        }

        public Criteria andBlessIn(List<String> values) {
            addCriterion("bless in", values, "bless");
            return (Criteria) this;
        }

        public Criteria andBlessNotIn(List<String> values) {
            addCriterion("bless not in", values, "bless");
            return (Criteria) this;
        }

        public Criteria andBlessBetween(String value1, String value2) {
            addCriterion("bless between", value1, value2, "bless");
            return (Criteria) this;
        }

        public Criteria andBlessNotBetween(String value1, String value2) {
            addCriterion("bless not between", value1, value2, "bless");
            return (Criteria) this;
        }

        public Criteria andSbaddressIsNull() {
            addCriterion("sbaddress is null");
            return (Criteria) this;
        }

        public Criteria andSbaddressIsNotNull() {
            addCriterion("sbaddress is not null");
            return (Criteria) this;
        }

        public Criteria andSbaddressEqualTo(String value) {
            addCriterion("sbaddress =", value, "sbaddress");
            return (Criteria) this;
        }

        public Criteria andSbaddressNotEqualTo(String value) {
            addCriterion("sbaddress <>", value, "sbaddress");
            return (Criteria) this;
        }

        public Criteria andSbaddressGreaterThan(String value) {
            addCriterion("sbaddress >", value, "sbaddress");
            return (Criteria) this;
        }

        public Criteria andSbaddressGreaterThanOrEqualTo(String value) {
            addCriterion("sbaddress >=", value, "sbaddress");
            return (Criteria) this;
        }

        public Criteria andSbaddressLessThan(String value) {
            addCriterion("sbaddress <", value, "sbaddress");
            return (Criteria) this;
        }

        public Criteria andSbaddressLessThanOrEqualTo(String value) {
            addCriterion("sbaddress <=", value, "sbaddress");
            return (Criteria) this;
        }

        public Criteria andSbaddressLike(String value) {
            addCriterion("sbaddress like", value, "sbaddress");
            return (Criteria) this;
        }

        public Criteria andSbaddressNotLike(String value) {
            addCriterion("sbaddress not like", value, "sbaddress");
            return (Criteria) this;
        }

        public Criteria andSbaddressIn(List<String> values) {
            addCriterion("sbaddress in", values, "sbaddress");
            return (Criteria) this;
        }

        public Criteria andSbaddressNotIn(List<String> values) {
            addCriterion("sbaddress not in", values, "sbaddress");
            return (Criteria) this;
        }

        public Criteria andSbaddressBetween(String value1, String value2) {
            addCriterion("sbaddress between", value1, value2, "sbaddress");
            return (Criteria) this;
        }

        public Criteria andSbaddressNotBetween(String value1, String value2) {
            addCriterion("sbaddress not between", value1, value2, "sbaddress");
            return (Criteria) this;
        }

        public Criteria andSbpeopleIsNull() {
            addCriterion("sbpeople is null");
            return (Criteria) this;
        }

        public Criteria andSbpeopleIsNotNull() {
            addCriterion("sbpeople is not null");
            return (Criteria) this;
        }

        public Criteria andSbpeopleEqualTo(String value) {
            addCriterion("sbpeople =", value, "sbpeople");
            return (Criteria) this;
        }

        public Criteria andSbpeopleNotEqualTo(String value) {
            addCriterion("sbpeople <>", value, "sbpeople");
            return (Criteria) this;
        }

        public Criteria andSbpeopleGreaterThan(String value) {
            addCriterion("sbpeople >", value, "sbpeople");
            return (Criteria) this;
        }

        public Criteria andSbpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("sbpeople >=", value, "sbpeople");
            return (Criteria) this;
        }

        public Criteria andSbpeopleLessThan(String value) {
            addCriterion("sbpeople <", value, "sbpeople");
            return (Criteria) this;
        }

        public Criteria andSbpeopleLessThanOrEqualTo(String value) {
            addCriterion("sbpeople <=", value, "sbpeople");
            return (Criteria) this;
        }

        public Criteria andSbpeopleLike(String value) {
            addCriterion("sbpeople like", value, "sbpeople");
            return (Criteria) this;
        }

        public Criteria andSbpeopleNotLike(String value) {
            addCriterion("sbpeople not like", value, "sbpeople");
            return (Criteria) this;
        }

        public Criteria andSbpeopleIn(List<String> values) {
            addCriterion("sbpeople in", values, "sbpeople");
            return (Criteria) this;
        }

        public Criteria andSbpeopleNotIn(List<String> values) {
            addCriterion("sbpeople not in", values, "sbpeople");
            return (Criteria) this;
        }

        public Criteria andSbpeopleBetween(String value1, String value2) {
            addCriterion("sbpeople between", value1, value2, "sbpeople");
            return (Criteria) this;
        }

        public Criteria andSbpeopleNotBetween(String value1, String value2) {
            addCriterion("sbpeople not between", value1, value2, "sbpeople");
            return (Criteria) this;
        }

        public Criteria andSbdateIsNull() {
            addCriterion("sbdate is null");
            return (Criteria) this;
        }

        public Criteria andSbdateIsNotNull() {
            addCriterion("sbdate is not null");
            return (Criteria) this;
        }

        public Criteria andSbdateEqualTo(String value) {
            addCriterion("sbdate =", value, "sbdate");
            return (Criteria) this;
        }

        public Criteria andSbdateNotEqualTo(String value) {
            addCriterion("sbdate <>", value, "sbdate");
            return (Criteria) this;
        }

        public Criteria andSbdateGreaterThan(String value) {
            addCriterion("sbdate >", value, "sbdate");
            return (Criteria) this;
        }

        public Criteria andSbdateGreaterThanOrEqualTo(String value) {
            addCriterion("sbdate >=", value, "sbdate");
            return (Criteria) this;
        }

        public Criteria andSbdateLessThan(String value) {
            addCriterion("sbdate <", value, "sbdate");
            return (Criteria) this;
        }

        public Criteria andSbdateLessThanOrEqualTo(String value) {
            addCriterion("sbdate <=", value, "sbdate");
            return (Criteria) this;
        }

        public Criteria andSbdateLike(String value) {
            addCriterion("sbdate like", value, "sbdate");
            return (Criteria) this;
        }

        public Criteria andSbdateNotLike(String value) {
            addCriterion("sbdate not like", value, "sbdate");
            return (Criteria) this;
        }

        public Criteria andSbdateIn(List<String> values) {
            addCriterion("sbdate in", values, "sbdate");
            return (Criteria) this;
        }

        public Criteria andSbdateNotIn(List<String> values) {
            addCriterion("sbdate not in", values, "sbdate");
            return (Criteria) this;
        }

        public Criteria andSbdateBetween(String value1, String value2) {
            addCriterion("sbdate between", value1, value2, "sbdate");
            return (Criteria) this;
        }

        public Criteria andSbdateNotBetween(String value1, String value2) {
            addCriterion("sbdate not between", value1, value2, "sbdate");
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