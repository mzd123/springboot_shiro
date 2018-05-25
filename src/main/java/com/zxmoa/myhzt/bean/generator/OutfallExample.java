package com.zxmoa.myhzt.bean.generator;

import java.util.ArrayList;
import java.util.List;

public class OutfallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutfallExample() {
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

        public Criteria andOutfallidIsNull() {
            addCriterion("outfallid is null");
            return (Criteria) this;
        }

        public Criteria andOutfallidIsNotNull() {
            addCriterion("outfallid is not null");
            return (Criteria) this;
        }

        public Criteria andOutfallidEqualTo(String value) {
            addCriterion("outfallid =", value, "outfallid");
            return (Criteria) this;
        }

        public Criteria andOutfallidNotEqualTo(String value) {
            addCriterion("outfallid <>", value, "outfallid");
            return (Criteria) this;
        }

        public Criteria andOutfallidGreaterThan(String value) {
            addCriterion("outfallid >", value, "outfallid");
            return (Criteria) this;
        }

        public Criteria andOutfallidGreaterThanOrEqualTo(String value) {
            addCriterion("outfallid >=", value, "outfallid");
            return (Criteria) this;
        }

        public Criteria andOutfallidLessThan(String value) {
            addCriterion("outfallid <", value, "outfallid");
            return (Criteria) this;
        }

        public Criteria andOutfallidLessThanOrEqualTo(String value) {
            addCriterion("outfallid <=", value, "outfallid");
            return (Criteria) this;
        }

        public Criteria andOutfallidLike(String value) {
            addCriterion("outfallid like", value, "outfallid");
            return (Criteria) this;
        }

        public Criteria andOutfallidNotLike(String value) {
            addCriterion("outfallid not like", value, "outfallid");
            return (Criteria) this;
        }

        public Criteria andOutfallidIn(List<String> values) {
            addCriterion("outfallid in", values, "outfallid");
            return (Criteria) this;
        }

        public Criteria andOutfallidNotIn(List<String> values) {
            addCriterion("outfallid not in", values, "outfallid");
            return (Criteria) this;
        }

        public Criteria andOutfallidBetween(String value1, String value2) {
            addCriterion("outfallid between", value1, value2, "outfallid");
            return (Criteria) this;
        }

        public Criteria andOutfallidNotBetween(String value1, String value2) {
            addCriterion("outfallid not between", value1, value2, "outfallid");
            return (Criteria) this;
        }

        public Criteria andOutfallnameIsNull() {
            addCriterion("outfallname is null");
            return (Criteria) this;
        }

        public Criteria andOutfallnameIsNotNull() {
            addCriterion("outfallname is not null");
            return (Criteria) this;
        }

        public Criteria andOutfallnameEqualTo(String value) {
            addCriterion("outfallname =", value, "outfallname");
            return (Criteria) this;
        }

        public Criteria andOutfallnameNotEqualTo(String value) {
            addCriterion("outfallname <>", value, "outfallname");
            return (Criteria) this;
        }

        public Criteria andOutfallnameGreaterThan(String value) {
            addCriterion("outfallname >", value, "outfallname");
            return (Criteria) this;
        }

        public Criteria andOutfallnameGreaterThanOrEqualTo(String value) {
            addCriterion("outfallname >=", value, "outfallname");
            return (Criteria) this;
        }

        public Criteria andOutfallnameLessThan(String value) {
            addCriterion("outfallname <", value, "outfallname");
            return (Criteria) this;
        }

        public Criteria andOutfallnameLessThanOrEqualTo(String value) {
            addCriterion("outfallname <=", value, "outfallname");
            return (Criteria) this;
        }

        public Criteria andOutfallnameLike(String value) {
            addCriterion("outfallname like", value, "outfallname");
            return (Criteria) this;
        }

        public Criteria andOutfallnameNotLike(String value) {
            addCriterion("outfallname not like", value, "outfallname");
            return (Criteria) this;
        }

        public Criteria andOutfallnameIn(List<String> values) {
            addCriterion("outfallname in", values, "outfallname");
            return (Criteria) this;
        }

        public Criteria andOutfallnameNotIn(List<String> values) {
            addCriterion("outfallname not in", values, "outfallname");
            return (Criteria) this;
        }

        public Criteria andOutfallnameBetween(String value1, String value2) {
            addCriterion("outfallname between", value1, value2, "outfallname");
            return (Criteria) this;
        }

        public Criteria andOutfallnameNotBetween(String value1, String value2) {
            addCriterion("outfallname not between", value1, value2, "outfallname");
            return (Criteria) this;
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

        public Criteria andRiveridIsNull() {
            addCriterion("riverid is null");
            return (Criteria) this;
        }

        public Criteria andRiveridIsNotNull() {
            addCriterion("riverid is not null");
            return (Criteria) this;
        }

        public Criteria andRiveridEqualTo(String value) {
            addCriterion("riverid =", value, "riverid");
            return (Criteria) this;
        }

        public Criteria andRiveridNotEqualTo(String value) {
            addCriterion("riverid <>", value, "riverid");
            return (Criteria) this;
        }

        public Criteria andRiveridGreaterThan(String value) {
            addCriterion("riverid >", value, "riverid");
            return (Criteria) this;
        }

        public Criteria andRiveridGreaterThanOrEqualTo(String value) {
            addCriterion("riverid >=", value, "riverid");
            return (Criteria) this;
        }

        public Criteria andRiveridLessThan(String value) {
            addCriterion("riverid <", value, "riverid");
            return (Criteria) this;
        }

        public Criteria andRiveridLessThanOrEqualTo(String value) {
            addCriterion("riverid <=", value, "riverid");
            return (Criteria) this;
        }

        public Criteria andRiveridLike(String value) {
            addCriterion("riverid like", value, "riverid");
            return (Criteria) this;
        }

        public Criteria andRiveridNotLike(String value) {
            addCriterion("riverid not like", value, "riverid");
            return (Criteria) this;
        }

        public Criteria andRiveridIn(List<String> values) {
            addCriterion("riverid in", values, "riverid");
            return (Criteria) this;
        }

        public Criteria andRiveridNotIn(List<String> values) {
            addCriterion("riverid not in", values, "riverid");
            return (Criteria) this;
        }

        public Criteria andRiveridBetween(String value1, String value2) {
            addCriterion("riverid between", value1, value2, "riverid");
            return (Criteria) this;
        }

        public Criteria andRiveridNotBetween(String value1, String value2) {
            addCriterion("riverid not between", value1, value2, "riverid");
            return (Criteria) this;
        }

        public Criteria andOutfallnoIsNull() {
            addCriterion("outfallno is null");
            return (Criteria) this;
        }

        public Criteria andOutfallnoIsNotNull() {
            addCriterion("outfallno is not null");
            return (Criteria) this;
        }

        public Criteria andOutfallnoEqualTo(String value) {
            addCriterion("outfallno =", value, "outfallno");
            return (Criteria) this;
        }

        public Criteria andOutfallnoNotEqualTo(String value) {
            addCriterion("outfallno <>", value, "outfallno");
            return (Criteria) this;
        }

        public Criteria andOutfallnoGreaterThan(String value) {
            addCriterion("outfallno >", value, "outfallno");
            return (Criteria) this;
        }

        public Criteria andOutfallnoGreaterThanOrEqualTo(String value) {
            addCriterion("outfallno >=", value, "outfallno");
            return (Criteria) this;
        }

        public Criteria andOutfallnoLessThan(String value) {
            addCriterion("outfallno <", value, "outfallno");
            return (Criteria) this;
        }

        public Criteria andOutfallnoLessThanOrEqualTo(String value) {
            addCriterion("outfallno <=", value, "outfallno");
            return (Criteria) this;
        }

        public Criteria andOutfallnoLike(String value) {
            addCriterion("outfallno like", value, "outfallno");
            return (Criteria) this;
        }

        public Criteria andOutfallnoNotLike(String value) {
            addCriterion("outfallno not like", value, "outfallno");
            return (Criteria) this;
        }

        public Criteria andOutfallnoIn(List<String> values) {
            addCriterion("outfallno in", values, "outfallno");
            return (Criteria) this;
        }

        public Criteria andOutfallnoNotIn(List<String> values) {
            addCriterion("outfallno not in", values, "outfallno");
            return (Criteria) this;
        }

        public Criteria andOutfallnoBetween(String value1, String value2) {
            addCriterion("outfallno between", value1, value2, "outfallno");
            return (Criteria) this;
        }

        public Criteria andOutfallnoNotBetween(String value1, String value2) {
            addCriterion("outfallno not between", value1, value2, "outfallno");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(String value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(String value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(String value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(String value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(String value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(String value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLike(String value) {
            addCriterion("lng like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotLike(String value) {
            addCriterion("lng not like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<String> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<String> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(String value1, String value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(String value1, String value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andFallmethodIsNull() {
            addCriterion("fallmethod is null");
            return (Criteria) this;
        }

        public Criteria andFallmethodIsNotNull() {
            addCriterion("fallmethod is not null");
            return (Criteria) this;
        }

        public Criteria andFallmethodEqualTo(String value) {
            addCriterion("fallmethod =", value, "fallmethod");
            return (Criteria) this;
        }

        public Criteria andFallmethodNotEqualTo(String value) {
            addCriterion("fallmethod <>", value, "fallmethod");
            return (Criteria) this;
        }

        public Criteria andFallmethodGreaterThan(String value) {
            addCriterion("fallmethod >", value, "fallmethod");
            return (Criteria) this;
        }

        public Criteria andFallmethodGreaterThanOrEqualTo(String value) {
            addCriterion("fallmethod >=", value, "fallmethod");
            return (Criteria) this;
        }

        public Criteria andFallmethodLessThan(String value) {
            addCriterion("fallmethod <", value, "fallmethod");
            return (Criteria) this;
        }

        public Criteria andFallmethodLessThanOrEqualTo(String value) {
            addCriterion("fallmethod <=", value, "fallmethod");
            return (Criteria) this;
        }

        public Criteria andFallmethodLike(String value) {
            addCriterion("fallmethod like", value, "fallmethod");
            return (Criteria) this;
        }

        public Criteria andFallmethodNotLike(String value) {
            addCriterion("fallmethod not like", value, "fallmethod");
            return (Criteria) this;
        }

        public Criteria andFallmethodIn(List<String> values) {
            addCriterion("fallmethod in", values, "fallmethod");
            return (Criteria) this;
        }

        public Criteria andFallmethodNotIn(List<String> values) {
            addCriterion("fallmethod not in", values, "fallmethod");
            return (Criteria) this;
        }

        public Criteria andFallmethodBetween(String value1, String value2) {
            addCriterion("fallmethod between", value1, value2, "fallmethod");
            return (Criteria) this;
        }

        public Criteria andFallmethodNotBetween(String value1, String value2) {
            addCriterion("fallmethod not between", value1, value2, "fallmethod");
            return (Criteria) this;
        }

        public Criteria andInrivermethodIsNull() {
            addCriterion("inrivermethod is null");
            return (Criteria) this;
        }

        public Criteria andInrivermethodIsNotNull() {
            addCriterion("inrivermethod is not null");
            return (Criteria) this;
        }

        public Criteria andInrivermethodEqualTo(String value) {
            addCriterion("inrivermethod =", value, "inrivermethod");
            return (Criteria) this;
        }

        public Criteria andInrivermethodNotEqualTo(String value) {
            addCriterion("inrivermethod <>", value, "inrivermethod");
            return (Criteria) this;
        }

        public Criteria andInrivermethodGreaterThan(String value) {
            addCriterion("inrivermethod >", value, "inrivermethod");
            return (Criteria) this;
        }

        public Criteria andInrivermethodGreaterThanOrEqualTo(String value) {
            addCriterion("inrivermethod >=", value, "inrivermethod");
            return (Criteria) this;
        }

        public Criteria andInrivermethodLessThan(String value) {
            addCriterion("inrivermethod <", value, "inrivermethod");
            return (Criteria) this;
        }

        public Criteria andInrivermethodLessThanOrEqualTo(String value) {
            addCriterion("inrivermethod <=", value, "inrivermethod");
            return (Criteria) this;
        }

        public Criteria andInrivermethodLike(String value) {
            addCriterion("inrivermethod like", value, "inrivermethod");
            return (Criteria) this;
        }

        public Criteria andInrivermethodNotLike(String value) {
            addCriterion("inrivermethod not like", value, "inrivermethod");
            return (Criteria) this;
        }

        public Criteria andInrivermethodIn(List<String> values) {
            addCriterion("inrivermethod in", values, "inrivermethod");
            return (Criteria) this;
        }

        public Criteria andInrivermethodNotIn(List<String> values) {
            addCriterion("inrivermethod not in", values, "inrivermethod");
            return (Criteria) this;
        }

        public Criteria andInrivermethodBetween(String value1, String value2) {
            addCriterion("inrivermethod between", value1, value2, "inrivermethod");
            return (Criteria) this;
        }

        public Criteria andInrivermethodNotBetween(String value1, String value2) {
            addCriterion("inrivermethod not between", value1, value2, "inrivermethod");
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