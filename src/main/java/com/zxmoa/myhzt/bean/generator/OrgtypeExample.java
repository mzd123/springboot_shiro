package com.zxmoa.myhzt.bean.generator;

import java.util.ArrayList;
import java.util.List;

public class OrgtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgtypeExample() {
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

        public Criteria andOrgtypeidIsNull() {
            addCriterion("orgtypeid is null");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidIsNotNull() {
            addCriterion("orgtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidEqualTo(String value) {
            addCriterion("orgtypeid =", value, "orgtypeid");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidNotEqualTo(String value) {
            addCriterion("orgtypeid <>", value, "orgtypeid");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidGreaterThan(String value) {
            addCriterion("orgtypeid >", value, "orgtypeid");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("orgtypeid >=", value, "orgtypeid");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidLessThan(String value) {
            addCriterion("orgtypeid <", value, "orgtypeid");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidLessThanOrEqualTo(String value) {
            addCriterion("orgtypeid <=", value, "orgtypeid");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidLike(String value) {
            addCriterion("orgtypeid like", value, "orgtypeid");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidNotLike(String value) {
            addCriterion("orgtypeid not like", value, "orgtypeid");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidIn(List<String> values) {
            addCriterion("orgtypeid in", values, "orgtypeid");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidNotIn(List<String> values) {
            addCriterion("orgtypeid not in", values, "orgtypeid");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidBetween(String value1, String value2) {
            addCriterion("orgtypeid between", value1, value2, "orgtypeid");
            return (Criteria) this;
        }

        public Criteria andOrgtypeidNotBetween(String value1, String value2) {
            addCriterion("orgtypeid not between", value1, value2, "orgtypeid");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameIsNull() {
            addCriterion("orgtypename is null");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameIsNotNull() {
            addCriterion("orgtypename is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameEqualTo(String value) {
            addCriterion("orgtypename =", value, "orgtypename");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameNotEqualTo(String value) {
            addCriterion("orgtypename <>", value, "orgtypename");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameGreaterThan(String value) {
            addCriterion("orgtypename >", value, "orgtypename");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("orgtypename >=", value, "orgtypename");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameLessThan(String value) {
            addCriterion("orgtypename <", value, "orgtypename");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameLessThanOrEqualTo(String value) {
            addCriterion("orgtypename <=", value, "orgtypename");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameLike(String value) {
            addCriterion("orgtypename like", value, "orgtypename");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameNotLike(String value) {
            addCriterion("orgtypename not like", value, "orgtypename");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameIn(List<String> values) {
            addCriterion("orgtypename in", values, "orgtypename");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameNotIn(List<String> values) {
            addCriterion("orgtypename not in", values, "orgtypename");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameBetween(String value1, String value2) {
            addCriterion("orgtypename between", value1, value2, "orgtypename");
            return (Criteria) this;
        }

        public Criteria andOrgtypenameNotBetween(String value1, String value2) {
            addCriterion("orgtypename not between", value1, value2, "orgtypename");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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