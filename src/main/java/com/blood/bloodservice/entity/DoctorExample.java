package com.blood.bloodservice.entity;

import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDnameIsNull() {
            addCriterion("dname is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("dname is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("dname =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("dname <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("dname >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("dname >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("dname <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("dname <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("dname like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("dname not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("dname in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("dname not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("dname between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("dname not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDsexIsNull() {
            addCriterion("dsex is null");
            return (Criteria) this;
        }

        public Criteria andDsexIsNotNull() {
            addCriterion("dsex is not null");
            return (Criteria) this;
        }

        public Criteria andDsexEqualTo(String value) {
            addCriterion("dsex =", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotEqualTo(String value) {
            addCriterion("dsex <>", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexGreaterThan(String value) {
            addCriterion("dsex >", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexGreaterThanOrEqualTo(String value) {
            addCriterion("dsex >=", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLessThan(String value) {
            addCriterion("dsex <", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLessThanOrEqualTo(String value) {
            addCriterion("dsex <=", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLike(String value) {
            addCriterion("dsex like", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotLike(String value) {
            addCriterion("dsex not like", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexIn(List<String> values) {
            addCriterion("dsex in", values, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotIn(List<String> values) {
            addCriterion("dsex not in", values, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexBetween(String value1, String value2) {
            addCriterion("dsex between", value1, value2, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotBetween(String value1, String value2) {
            addCriterion("dsex not between", value1, value2, "dsex");
            return (Criteria) this;
        }

        public Criteria andDidentityIsNull() {
            addCriterion("didentity is null");
            return (Criteria) this;
        }

        public Criteria andDidentityIsNotNull() {
            addCriterion("didentity is not null");
            return (Criteria) this;
        }

        public Criteria andDidentityEqualTo(String value) {
            addCriterion("didentity =", value, "didentity");
            return (Criteria) this;
        }

        public Criteria andDidentityNotEqualTo(String value) {
            addCriterion("didentity <>", value, "didentity");
            return (Criteria) this;
        }

        public Criteria andDidentityGreaterThan(String value) {
            addCriterion("didentity >", value, "didentity");
            return (Criteria) this;
        }

        public Criteria andDidentityGreaterThanOrEqualTo(String value) {
            addCriterion("didentity >=", value, "didentity");
            return (Criteria) this;
        }

        public Criteria andDidentityLessThan(String value) {
            addCriterion("didentity <", value, "didentity");
            return (Criteria) this;
        }

        public Criteria andDidentityLessThanOrEqualTo(String value) {
            addCriterion("didentity <=", value, "didentity");
            return (Criteria) this;
        }

        public Criteria andDidentityLike(String value) {
            addCriterion("didentity like", value, "didentity");
            return (Criteria) this;
        }

        public Criteria andDidentityNotLike(String value) {
            addCriterion("didentity not like", value, "didentity");
            return (Criteria) this;
        }

        public Criteria andDidentityIn(List<String> values) {
            addCriterion("didentity in", values, "didentity");
            return (Criteria) this;
        }

        public Criteria andDidentityNotIn(List<String> values) {
            addCriterion("didentity not in", values, "didentity");
            return (Criteria) this;
        }

        public Criteria andDidentityBetween(String value1, String value2) {
            addCriterion("didentity between", value1, value2, "didentity");
            return (Criteria) this;
        }

        public Criteria andDidentityNotBetween(String value1, String value2) {
            addCriterion("didentity not between", value1, value2, "didentity");
            return (Criteria) this;
        }

        public Criteria andDaddressIsNull() {
            addCriterion("daddress is null");
            return (Criteria) this;
        }

        public Criteria andDaddressIsNotNull() {
            addCriterion("daddress is not null");
            return (Criteria) this;
        }

        public Criteria andDaddressEqualTo(String value) {
            addCriterion("daddress =", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotEqualTo(String value) {
            addCriterion("daddress <>", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressGreaterThan(String value) {
            addCriterion("daddress >", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressGreaterThanOrEqualTo(String value) {
            addCriterion("daddress >=", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressLessThan(String value) {
            addCriterion("daddress <", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressLessThanOrEqualTo(String value) {
            addCriterion("daddress <=", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressLike(String value) {
            addCriterion("daddress like", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotLike(String value) {
            addCriterion("daddress not like", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressIn(List<String> values) {
            addCriterion("daddress in", values, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotIn(List<String> values) {
            addCriterion("daddress not in", values, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressBetween(String value1, String value2) {
            addCriterion("daddress between", value1, value2, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotBetween(String value1, String value2) {
            addCriterion("daddress not between", value1, value2, "daddress");
            return (Criteria) this;
        }

        public Criteria andDnationIsNull() {
            addCriterion("dnation is null");
            return (Criteria) this;
        }

        public Criteria andDnationIsNotNull() {
            addCriterion("dnation is not null");
            return (Criteria) this;
        }

        public Criteria andDnationEqualTo(String value) {
            addCriterion("dnation =", value, "dnation");
            return (Criteria) this;
        }

        public Criteria andDnationNotEqualTo(String value) {
            addCriterion("dnation <>", value, "dnation");
            return (Criteria) this;
        }

        public Criteria andDnationGreaterThan(String value) {
            addCriterion("dnation >", value, "dnation");
            return (Criteria) this;
        }

        public Criteria andDnationGreaterThanOrEqualTo(String value) {
            addCriterion("dnation >=", value, "dnation");
            return (Criteria) this;
        }

        public Criteria andDnationLessThan(String value) {
            addCriterion("dnation <", value, "dnation");
            return (Criteria) this;
        }

        public Criteria andDnationLessThanOrEqualTo(String value) {
            addCriterion("dnation <=", value, "dnation");
            return (Criteria) this;
        }

        public Criteria andDnationLike(String value) {
            addCriterion("dnation like", value, "dnation");
            return (Criteria) this;
        }

        public Criteria andDnationNotLike(String value) {
            addCriterion("dnation not like", value, "dnation");
            return (Criteria) this;
        }

        public Criteria andDnationIn(List<String> values) {
            addCriterion("dnation in", values, "dnation");
            return (Criteria) this;
        }

        public Criteria andDnationNotIn(List<String> values) {
            addCriterion("dnation not in", values, "dnation");
            return (Criteria) this;
        }

        public Criteria andDnationBetween(String value1, String value2) {
            addCriterion("dnation between", value1, value2, "dnation");
            return (Criteria) this;
        }

        public Criteria andDnationNotBetween(String value1, String value2) {
            addCriterion("dnation not between", value1, value2, "dnation");
            return (Criteria) this;
        }

        public Criteria andDphoneIsNull() {
            addCriterion("dphone is null");
            return (Criteria) this;
        }

        public Criteria andDphoneIsNotNull() {
            addCriterion("dphone is not null");
            return (Criteria) this;
        }

        public Criteria andDphoneEqualTo(String value) {
            addCriterion("dphone =", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneNotEqualTo(String value) {
            addCriterion("dphone <>", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneGreaterThan(String value) {
            addCriterion("dphone >", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneGreaterThanOrEqualTo(String value) {
            addCriterion("dphone >=", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneLessThan(String value) {
            addCriterion("dphone <", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneLessThanOrEqualTo(String value) {
            addCriterion("dphone <=", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneLike(String value) {
            addCriterion("dphone like", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneNotLike(String value) {
            addCriterion("dphone not like", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneIn(List<String> values) {
            addCriterion("dphone in", values, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneNotIn(List<String> values) {
            addCriterion("dphone not in", values, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneBetween(String value1, String value2) {
            addCriterion("dphone between", value1, value2, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneNotBetween(String value1, String value2) {
            addCriterion("dphone not between", value1, value2, "dphone");
            return (Criteria) this;
        }

        public Criteria andDemailIsNull() {
            addCriterion("demail is null");
            return (Criteria) this;
        }

        public Criteria andDemailIsNotNull() {
            addCriterion("demail is not null");
            return (Criteria) this;
        }

        public Criteria andDemailEqualTo(String value) {
            addCriterion("demail =", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailNotEqualTo(String value) {
            addCriterion("demail <>", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailGreaterThan(String value) {
            addCriterion("demail >", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailGreaterThanOrEqualTo(String value) {
            addCriterion("demail >=", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailLessThan(String value) {
            addCriterion("demail <", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailLessThanOrEqualTo(String value) {
            addCriterion("demail <=", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailLike(String value) {
            addCriterion("demail like", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailNotLike(String value) {
            addCriterion("demail not like", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailIn(List<String> values) {
            addCriterion("demail in", values, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailNotIn(List<String> values) {
            addCriterion("demail not in", values, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailBetween(String value1, String value2) {
            addCriterion("demail between", value1, value2, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailNotBetween(String value1, String value2) {
            addCriterion("demail not between", value1, value2, "demail");
            return (Criteria) this;
        }

        public Criteria andDworkIsNull() {
            addCriterion("dwork is null");
            return (Criteria) this;
        }

        public Criteria andDworkIsNotNull() {
            addCriterion("dwork is not null");
            return (Criteria) this;
        }

        public Criteria andDworkEqualTo(String value) {
            addCriterion("dwork =", value, "dwork");
            return (Criteria) this;
        }

        public Criteria andDworkNotEqualTo(String value) {
            addCriterion("dwork <>", value, "dwork");
            return (Criteria) this;
        }

        public Criteria andDworkGreaterThan(String value) {
            addCriterion("dwork >", value, "dwork");
            return (Criteria) this;
        }

        public Criteria andDworkGreaterThanOrEqualTo(String value) {
            addCriterion("dwork >=", value, "dwork");
            return (Criteria) this;
        }

        public Criteria andDworkLessThan(String value) {
            addCriterion("dwork <", value, "dwork");
            return (Criteria) this;
        }

        public Criteria andDworkLessThanOrEqualTo(String value) {
            addCriterion("dwork <=", value, "dwork");
            return (Criteria) this;
        }

        public Criteria andDworkLike(String value) {
            addCriterion("dwork like", value, "dwork");
            return (Criteria) this;
        }

        public Criteria andDworkNotLike(String value) {
            addCriterion("dwork not like", value, "dwork");
            return (Criteria) this;
        }

        public Criteria andDworkIn(List<String> values) {
            addCriterion("dwork in", values, "dwork");
            return (Criteria) this;
        }

        public Criteria andDworkNotIn(List<String> values) {
            addCriterion("dwork not in", values, "dwork");
            return (Criteria) this;
        }

        public Criteria andDworkBetween(String value1, String value2) {
            addCriterion("dwork between", value1, value2, "dwork");
            return (Criteria) this;
        }

        public Criteria andDworkNotBetween(String value1, String value2) {
            addCriterion("dwork not between", value1, value2, "dwork");
            return (Criteria) this;
        }

        public Criteria andDphotoIsNull() {
            addCriterion("dphoto is null");
            return (Criteria) this;
        }

        public Criteria andDphotoIsNotNull() {
            addCriterion("dphoto is not null");
            return (Criteria) this;
        }

        public Criteria andDphotoEqualTo(String value) {
            addCriterion("dphoto =", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoNotEqualTo(String value) {
            addCriterion("dphoto <>", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoGreaterThan(String value) {
            addCriterion("dphoto >", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoGreaterThanOrEqualTo(String value) {
            addCriterion("dphoto >=", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoLessThan(String value) {
            addCriterion("dphoto <", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoLessThanOrEqualTo(String value) {
            addCriterion("dphoto <=", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoLike(String value) {
            addCriterion("dphoto like", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoNotLike(String value) {
            addCriterion("dphoto not like", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoIn(List<String> values) {
            addCriterion("dphoto in", values, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoNotIn(List<String> values) {
            addCriterion("dphoto not in", values, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoBetween(String value1, String value2) {
            addCriterion("dphoto between", value1, value2, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoNotBetween(String value1, String value2) {
            addCriterion("dphoto not between", value1, value2, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDstateIsNull() {
            addCriterion("dstate is null");
            return (Criteria) this;
        }

        public Criteria andDstateIsNotNull() {
            addCriterion("dstate is not null");
            return (Criteria) this;
        }

        public Criteria andDstateEqualTo(Boolean value) {
            addCriterion("dstate =", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotEqualTo(Boolean value) {
            addCriterion("dstate <>", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateGreaterThan(Boolean value) {
            addCriterion("dstate >", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dstate >=", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateLessThan(Boolean value) {
            addCriterion("dstate <", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateLessThanOrEqualTo(Boolean value) {
            addCriterion("dstate <=", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateIn(List<Boolean> values) {
            addCriterion("dstate in", values, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotIn(List<Boolean> values) {
            addCriterion("dstate not in", values, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateBetween(Boolean value1, Boolean value2) {
            addCriterion("dstate between", value1, value2, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dstate not between", value1, value2, "dstate");
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