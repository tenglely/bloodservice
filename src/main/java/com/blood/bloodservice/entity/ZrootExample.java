package com.blood.bloodservice.entity;

import java.util.ArrayList;
import java.util.List;

public class ZrootExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZrootExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGsexIsNull() {
            addCriterion("gsex is null");
            return (Criteria) this;
        }

        public Criteria andGsexIsNotNull() {
            addCriterion("gsex is not null");
            return (Criteria) this;
        }

        public Criteria andGsexEqualTo(String value) {
            addCriterion("gsex =", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexNotEqualTo(String value) {
            addCriterion("gsex <>", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexGreaterThan(String value) {
            addCriterion("gsex >", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexGreaterThanOrEqualTo(String value) {
            addCriterion("gsex >=", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexLessThan(String value) {
            addCriterion("gsex <", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexLessThanOrEqualTo(String value) {
            addCriterion("gsex <=", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexLike(String value) {
            addCriterion("gsex like", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexNotLike(String value) {
            addCriterion("gsex not like", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexIn(List<String> values) {
            addCriterion("gsex in", values, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexNotIn(List<String> values) {
            addCriterion("gsex not in", values, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexBetween(String value1, String value2) {
            addCriterion("gsex between", value1, value2, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexNotBetween(String value1, String value2) {
            addCriterion("gsex not between", value1, value2, "gsex");
            return (Criteria) this;
        }

        public Criteria andGemailIsNull() {
            addCriterion("gemail is null");
            return (Criteria) this;
        }

        public Criteria andGemailIsNotNull() {
            addCriterion("gemail is not null");
            return (Criteria) this;
        }

        public Criteria andGemailEqualTo(String value) {
            addCriterion("gemail =", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailNotEqualTo(String value) {
            addCriterion("gemail <>", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailGreaterThan(String value) {
            addCriterion("gemail >", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailGreaterThanOrEqualTo(String value) {
            addCriterion("gemail >=", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailLessThan(String value) {
            addCriterion("gemail <", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailLessThanOrEqualTo(String value) {
            addCriterion("gemail <=", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailLike(String value) {
            addCriterion("gemail like", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailNotLike(String value) {
            addCriterion("gemail not like", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailIn(List<String> values) {
            addCriterion("gemail in", values, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailNotIn(List<String> values) {
            addCriterion("gemail not in", values, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailBetween(String value1, String value2) {
            addCriterion("gemail between", value1, value2, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailNotBetween(String value1, String value2) {
            addCriterion("gemail not between", value1, value2, "gemail");
            return (Criteria) this;
        }

        public Criteria andGphoneIsNull() {
            addCriterion("gphone is null");
            return (Criteria) this;
        }

        public Criteria andGphoneIsNotNull() {
            addCriterion("gphone is not null");
            return (Criteria) this;
        }

        public Criteria andGphoneEqualTo(String value) {
            addCriterion("gphone =", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneNotEqualTo(String value) {
            addCriterion("gphone <>", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneGreaterThan(String value) {
            addCriterion("gphone >", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneGreaterThanOrEqualTo(String value) {
            addCriterion("gphone >=", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneLessThan(String value) {
            addCriterion("gphone <", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneLessThanOrEqualTo(String value) {
            addCriterion("gphone <=", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneLike(String value) {
            addCriterion("gphone like", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneNotLike(String value) {
            addCriterion("gphone not like", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneIn(List<String> values) {
            addCriterion("gphone in", values, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneNotIn(List<String> values) {
            addCriterion("gphone not in", values, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneBetween(String value1, String value2) {
            addCriterion("gphone between", value1, value2, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneNotBetween(String value1, String value2) {
            addCriterion("gphone not between", value1, value2, "gphone");
            return (Criteria) this;
        }

        public Criteria andGdateIsNull() {
            addCriterion("gdate is null");
            return (Criteria) this;
        }

        public Criteria andGdateIsNotNull() {
            addCriterion("gdate is not null");
            return (Criteria) this;
        }

        public Criteria andGdateEqualTo(String value) {
            addCriterion("gdate =", value, "gdate");
            return (Criteria) this;
        }

        public Criteria andGdateNotEqualTo(String value) {
            addCriterion("gdate <>", value, "gdate");
            return (Criteria) this;
        }

        public Criteria andGdateGreaterThan(String value) {
            addCriterion("gdate >", value, "gdate");
            return (Criteria) this;
        }

        public Criteria andGdateGreaterThanOrEqualTo(String value) {
            addCriterion("gdate >=", value, "gdate");
            return (Criteria) this;
        }

        public Criteria andGdateLessThan(String value) {
            addCriterion("gdate <", value, "gdate");
            return (Criteria) this;
        }

        public Criteria andGdateLessThanOrEqualTo(String value) {
            addCriterion("gdate <=", value, "gdate");
            return (Criteria) this;
        }

        public Criteria andGdateLike(String value) {
            addCriterion("gdate like", value, "gdate");
            return (Criteria) this;
        }

        public Criteria andGdateNotLike(String value) {
            addCriterion("gdate not like", value, "gdate");
            return (Criteria) this;
        }

        public Criteria andGdateIn(List<String> values) {
            addCriterion("gdate in", values, "gdate");
            return (Criteria) this;
        }

        public Criteria andGdateNotIn(List<String> values) {
            addCriterion("gdate not in", values, "gdate");
            return (Criteria) this;
        }

        public Criteria andGdateBetween(String value1, String value2) {
            addCriterion("gdate between", value1, value2, "gdate");
            return (Criteria) this;
        }

        public Criteria andGdateNotBetween(String value1, String value2) {
            addCriterion("gdate not between", value1, value2, "gdate");
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