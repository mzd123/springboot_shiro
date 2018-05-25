package com.zxmoa.myhzt.bean.generator;

import java.util.ArrayList;
import java.util.List;

public class OutfalltypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutfalltypeExample() {
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

        public Criteria andOutfalltypeidIsNull() {
            addCriterion("outfalltypeid is null");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidIsNotNull() {
            addCriterion("outfalltypeid is not null");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidEqualTo(String value) {
            addCriterion("outfalltypeid =", value, "outfalltypeid");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidNotEqualTo(String value) {
            addCriterion("outfalltypeid <>", value, "outfalltypeid");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidGreaterThan(String value) {
            addCriterion("outfalltypeid >", value, "outfalltypeid");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidGreaterThanOrEqualTo(String value) {
            addCriterion("outfalltypeid >=", value, "outfalltypeid");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidLessThan(String value) {
            addCriterion("outfalltypeid <", value, "outfalltypeid");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidLessThanOrEqualTo(String value) {
            addCriterion("outfalltypeid <=", value, "outfalltypeid");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidLike(String value) {
            addCriterion("outfalltypeid like", value, "outfalltypeid");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidNotLike(String value) {
            addCriterion("outfalltypeid not like", value, "outfalltypeid");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidIn(List<String> values) {
            addCriterion("outfalltypeid in", values, "outfalltypeid");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidNotIn(List<String> values) {
            addCriterion("outfalltypeid not in", values, "outfalltypeid");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidBetween(String value1, String value2) {
            addCriterion("outfalltypeid between", value1, value2, "outfalltypeid");
            return (Criteria) this;
        }

        public Criteria andOutfalltypeidNotBetween(String value1, String value2) {
            addCriterion("outfalltypeid not between", value1, value2, "outfalltypeid");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameIsNull() {
            addCriterion("outfalltypename is null");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameIsNotNull() {
            addCriterion("outfalltypename is not null");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameEqualTo(String value) {
            addCriterion("outfalltypename =", value, "outfalltypename");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameNotEqualTo(String value) {
            addCriterion("outfalltypename <>", value, "outfalltypename");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameGreaterThan(String value) {
            addCriterion("outfalltypename >", value, "outfalltypename");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameGreaterThanOrEqualTo(String value) {
            addCriterion("outfalltypename >=", value, "outfalltypename");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameLessThan(String value) {
            addCriterion("outfalltypename <", value, "outfalltypename");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameLessThanOrEqualTo(String value) {
            addCriterion("outfalltypename <=", value, "outfalltypename");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameLike(String value) {
            addCriterion("outfalltypename like", value, "outfalltypename");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameNotLike(String value) {
            addCriterion("outfalltypename not like", value, "outfalltypename");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameIn(List<String> values) {
            addCriterion("outfalltypename in", values, "outfalltypename");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameNotIn(List<String> values) {
            addCriterion("outfalltypename not in", values, "outfalltypename");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameBetween(String value1, String value2) {
            addCriterion("outfalltypename between", value1, value2, "outfalltypename");
            return (Criteria) this;
        }

        public Criteria andOutfalltypenameNotBetween(String value1, String value2) {
            addCriterion("outfalltypename not between", value1, value2, "outfalltypename");
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

        public Criteria andCreateuseridIsNull() {
            addCriterion("createuserid is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("createuserid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("createuserid =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("createuserid <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("createuserid >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("createuserid >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("createuserid <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("createuserid <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("createuserid like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("createuserid not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("createuserid in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("createuserid not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("createuserid between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("createuserid not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridIsNull() {
            addCriterion("modifyuserid is null");
            return (Criteria) this;
        }

        public Criteria andModifyuseridIsNotNull() {
            addCriterion("modifyuserid is not null");
            return (Criteria) this;
        }

        public Criteria andModifyuseridEqualTo(String value) {
            addCriterion("modifyuserid =", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridNotEqualTo(String value) {
            addCriterion("modifyuserid <>", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridGreaterThan(String value) {
            addCriterion("modifyuserid >", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridGreaterThanOrEqualTo(String value) {
            addCriterion("modifyuserid >=", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridLessThan(String value) {
            addCriterion("modifyuserid <", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridLessThanOrEqualTo(String value) {
            addCriterion("modifyuserid <=", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridLike(String value) {
            addCriterion("modifyuserid like", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridNotLike(String value) {
            addCriterion("modifyuserid not like", value, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridIn(List<String> values) {
            addCriterion("modifyuserid in", values, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridNotIn(List<String> values) {
            addCriterion("modifyuserid not in", values, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridBetween(String value1, String value2) {
            addCriterion("modifyuserid between", value1, value2, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifyuseridNotBetween(String value1, String value2) {
            addCriterion("modifyuserid not between", value1, value2, "modifyuserid");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifytime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(String value) {
            addCriterion("modifytime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(String value) {
            addCriterion("modifytime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(String value) {
            addCriterion("modifytime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("modifytime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(String value) {
            addCriterion("modifytime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(String value) {
            addCriterion("modifytime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLike(String value) {
            addCriterion("modifytime like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotLike(String value) {
            addCriterion("modifytime not like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<String> values) {
            addCriterion("modifytime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<String> values) {
            addCriterion("modifytime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(String value1, String value2) {
            addCriterion("modifytime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(String value1, String value2) {
            addCriterion("modifytime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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