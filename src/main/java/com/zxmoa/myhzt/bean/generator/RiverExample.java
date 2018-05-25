package com.zxmoa.myhzt.bean.generator;

import java.util.ArrayList;
import java.util.List;

public class RiverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiverExample() {
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

        public Criteria andRivernameIsNull() {
            addCriterion("rivername is null");
            return (Criteria) this;
        }

        public Criteria andRivernameIsNotNull() {
            addCriterion("rivername is not null");
            return (Criteria) this;
        }

        public Criteria andRivernameEqualTo(String value) {
            addCriterion("rivername =", value, "rivername");
            return (Criteria) this;
        }

        public Criteria andRivernameNotEqualTo(String value) {
            addCriterion("rivername <>", value, "rivername");
            return (Criteria) this;
        }

        public Criteria andRivernameGreaterThan(String value) {
            addCriterion("rivername >", value, "rivername");
            return (Criteria) this;
        }

        public Criteria andRivernameGreaterThanOrEqualTo(String value) {
            addCriterion("rivername >=", value, "rivername");
            return (Criteria) this;
        }

        public Criteria andRivernameLessThan(String value) {
            addCriterion("rivername <", value, "rivername");
            return (Criteria) this;
        }

        public Criteria andRivernameLessThanOrEqualTo(String value) {
            addCriterion("rivername <=", value, "rivername");
            return (Criteria) this;
        }

        public Criteria andRivernameLike(String value) {
            addCriterion("rivername like", value, "rivername");
            return (Criteria) this;
        }

        public Criteria andRivernameNotLike(String value) {
            addCriterion("rivername not like", value, "rivername");
            return (Criteria) this;
        }

        public Criteria andRivernameIn(List<String> values) {
            addCriterion("rivername in", values, "rivername");
            return (Criteria) this;
        }

        public Criteria andRivernameNotIn(List<String> values) {
            addCriterion("rivername not in", values, "rivername");
            return (Criteria) this;
        }

        public Criteria andRivernameBetween(String value1, String value2) {
            addCriterion("rivername between", value1, value2, "rivername");
            return (Criteria) this;
        }

        public Criteria andRivernameNotBetween(String value1, String value2) {
            addCriterion("rivername not between", value1, value2, "rivername");
            return (Criteria) this;
        }

        public Criteria andRiveraliasIsNull() {
            addCriterion("riveralias is null");
            return (Criteria) this;
        }

        public Criteria andRiveraliasIsNotNull() {
            addCriterion("riveralias is not null");
            return (Criteria) this;
        }

        public Criteria andRiveraliasEqualTo(String value) {
            addCriterion("riveralias =", value, "riveralias");
            return (Criteria) this;
        }

        public Criteria andRiveraliasNotEqualTo(String value) {
            addCriterion("riveralias <>", value, "riveralias");
            return (Criteria) this;
        }

        public Criteria andRiveraliasGreaterThan(String value) {
            addCriterion("riveralias >", value, "riveralias");
            return (Criteria) this;
        }

        public Criteria andRiveraliasGreaterThanOrEqualTo(String value) {
            addCriterion("riveralias >=", value, "riveralias");
            return (Criteria) this;
        }

        public Criteria andRiveraliasLessThan(String value) {
            addCriterion("riveralias <", value, "riveralias");
            return (Criteria) this;
        }

        public Criteria andRiveraliasLessThanOrEqualTo(String value) {
            addCriterion("riveralias <=", value, "riveralias");
            return (Criteria) this;
        }

        public Criteria andRiveraliasLike(String value) {
            addCriterion("riveralias like", value, "riveralias");
            return (Criteria) this;
        }

        public Criteria andRiveraliasNotLike(String value) {
            addCriterion("riveralias not like", value, "riveralias");
            return (Criteria) this;
        }

        public Criteria andRiveraliasIn(List<String> values) {
            addCriterion("riveralias in", values, "riveralias");
            return (Criteria) this;
        }

        public Criteria andRiveraliasNotIn(List<String> values) {
            addCriterion("riveralias not in", values, "riveralias");
            return (Criteria) this;
        }

        public Criteria andRiveraliasBetween(String value1, String value2) {
            addCriterion("riveralias between", value1, value2, "riveralias");
            return (Criteria) this;
        }

        public Criteria andRiveraliasNotBetween(String value1, String value2) {
            addCriterion("riveralias not between", value1, value2, "riveralias");
            return (Criteria) this;
        }

        public Criteria andRivernoIsNull() {
            addCriterion("riverno is null");
            return (Criteria) this;
        }

        public Criteria andRivernoIsNotNull() {
            addCriterion("riverno is not null");
            return (Criteria) this;
        }

        public Criteria andRivernoEqualTo(String value) {
            addCriterion("riverno =", value, "riverno");
            return (Criteria) this;
        }

        public Criteria andRivernoNotEqualTo(String value) {
            addCriterion("riverno <>", value, "riverno");
            return (Criteria) this;
        }

        public Criteria andRivernoGreaterThan(String value) {
            addCriterion("riverno >", value, "riverno");
            return (Criteria) this;
        }

        public Criteria andRivernoGreaterThanOrEqualTo(String value) {
            addCriterion("riverno >=", value, "riverno");
            return (Criteria) this;
        }

        public Criteria andRivernoLessThan(String value) {
            addCriterion("riverno <", value, "riverno");
            return (Criteria) this;
        }

        public Criteria andRivernoLessThanOrEqualTo(String value) {
            addCriterion("riverno <=", value, "riverno");
            return (Criteria) this;
        }

        public Criteria andRivernoLike(String value) {
            addCriterion("riverno like", value, "riverno");
            return (Criteria) this;
        }

        public Criteria andRivernoNotLike(String value) {
            addCriterion("riverno not like", value, "riverno");
            return (Criteria) this;
        }

        public Criteria andRivernoIn(List<String> values) {
            addCriterion("riverno in", values, "riverno");
            return (Criteria) this;
        }

        public Criteria andRivernoNotIn(List<String> values) {
            addCriterion("riverno not in", values, "riverno");
            return (Criteria) this;
        }

        public Criteria andRivernoBetween(String value1, String value2) {
            addCriterion("riverno between", value1, value2, "riverno");
            return (Criteria) this;
        }

        public Criteria andRivernoNotBetween(String value1, String value2) {
            addCriterion("riverno not between", value1, value2, "riverno");
            return (Criteria) this;
        }

        public Criteria andRiverlengthIsNull() {
            addCriterion("riverlength is null");
            return (Criteria) this;
        }

        public Criteria andRiverlengthIsNotNull() {
            addCriterion("riverlength is not null");
            return (Criteria) this;
        }

        public Criteria andRiverlengthEqualTo(String value) {
            addCriterion("riverlength =", value, "riverlength");
            return (Criteria) this;
        }

        public Criteria andRiverlengthNotEqualTo(String value) {
            addCriterion("riverlength <>", value, "riverlength");
            return (Criteria) this;
        }

        public Criteria andRiverlengthGreaterThan(String value) {
            addCriterion("riverlength >", value, "riverlength");
            return (Criteria) this;
        }

        public Criteria andRiverlengthGreaterThanOrEqualTo(String value) {
            addCriterion("riverlength >=", value, "riverlength");
            return (Criteria) this;
        }

        public Criteria andRiverlengthLessThan(String value) {
            addCriterion("riverlength <", value, "riverlength");
            return (Criteria) this;
        }

        public Criteria andRiverlengthLessThanOrEqualTo(String value) {
            addCriterion("riverlength <=", value, "riverlength");
            return (Criteria) this;
        }

        public Criteria andRiverlengthLike(String value) {
            addCriterion("riverlength like", value, "riverlength");
            return (Criteria) this;
        }

        public Criteria andRiverlengthNotLike(String value) {
            addCriterion("riverlength not like", value, "riverlength");
            return (Criteria) this;
        }

        public Criteria andRiverlengthIn(List<String> values) {
            addCriterion("riverlength in", values, "riverlength");
            return (Criteria) this;
        }

        public Criteria andRiverlengthNotIn(List<String> values) {
            addCriterion("riverlength not in", values, "riverlength");
            return (Criteria) this;
        }

        public Criteria andRiverlengthBetween(String value1, String value2) {
            addCriterion("riverlength between", value1, value2, "riverlength");
            return (Criteria) this;
        }

        public Criteria andRiverlengthNotBetween(String value1, String value2) {
            addCriterion("riverlength not between", value1, value2, "riverlength");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgid is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("orgid =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("orgid <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("orgid >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("orgid >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("orgid <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("orgid <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("orgid like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("orgid not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("orgid in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("orgid not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("orgid between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("orgid not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andLxbmIsNull() {
            addCriterion("lxbm is null");
            return (Criteria) this;
        }

        public Criteria andLxbmIsNotNull() {
            addCriterion("lxbm is not null");
            return (Criteria) this;
        }

        public Criteria andLxbmEqualTo(String value) {
            addCriterion("lxbm =", value, "lxbm");
            return (Criteria) this;
        }

        public Criteria andLxbmNotEqualTo(String value) {
            addCriterion("lxbm <>", value, "lxbm");
            return (Criteria) this;
        }

        public Criteria andLxbmGreaterThan(String value) {
            addCriterion("lxbm >", value, "lxbm");
            return (Criteria) this;
        }

        public Criteria andLxbmGreaterThanOrEqualTo(String value) {
            addCriterion("lxbm >=", value, "lxbm");
            return (Criteria) this;
        }

        public Criteria andLxbmLessThan(String value) {
            addCriterion("lxbm <", value, "lxbm");
            return (Criteria) this;
        }

        public Criteria andLxbmLessThanOrEqualTo(String value) {
            addCriterion("lxbm <=", value, "lxbm");
            return (Criteria) this;
        }

        public Criteria andLxbmLike(String value) {
            addCriterion("lxbm like", value, "lxbm");
            return (Criteria) this;
        }

        public Criteria andLxbmNotLike(String value) {
            addCriterion("lxbm not like", value, "lxbm");
            return (Criteria) this;
        }

        public Criteria andLxbmIn(List<String> values) {
            addCriterion("lxbm in", values, "lxbm");
            return (Criteria) this;
        }

        public Criteria andLxbmNotIn(List<String> values) {
            addCriterion("lxbm not in", values, "lxbm");
            return (Criteria) this;
        }

        public Criteria andLxbmBetween(String value1, String value2) {
            addCriterion("lxbm between", value1, value2, "lxbm");
            return (Criteria) this;
        }

        public Criteria andLxbmNotBetween(String value1, String value2) {
            addCriterion("lxbm not between", value1, value2, "lxbm");
            return (Criteria) this;
        }

        public Criteria andStartpointIsNull() {
            addCriterion("startpoint is null");
            return (Criteria) this;
        }

        public Criteria andStartpointIsNotNull() {
            addCriterion("startpoint is not null");
            return (Criteria) this;
        }

        public Criteria andStartpointEqualTo(String value) {
            addCriterion("startpoint =", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointNotEqualTo(String value) {
            addCriterion("startpoint <>", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointGreaterThan(String value) {
            addCriterion("startpoint >", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointGreaterThanOrEqualTo(String value) {
            addCriterion("startpoint >=", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointLessThan(String value) {
            addCriterion("startpoint <", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointLessThanOrEqualTo(String value) {
            addCriterion("startpoint <=", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointLike(String value) {
            addCriterion("startpoint like", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointNotLike(String value) {
            addCriterion("startpoint not like", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointIn(List<String> values) {
            addCriterion("startpoint in", values, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointNotIn(List<String> values) {
            addCriterion("startpoint not in", values, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointBetween(String value1, String value2) {
            addCriterion("startpoint between", value1, value2, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointNotBetween(String value1, String value2) {
            addCriterion("startpoint not between", value1, value2, "startpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointIsNull() {
            addCriterion("endpoint is null");
            return (Criteria) this;
        }

        public Criteria andEndpointIsNotNull() {
            addCriterion("endpoint is not null");
            return (Criteria) this;
        }

        public Criteria andEndpointEqualTo(String value) {
            addCriterion("endpoint =", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotEqualTo(String value) {
            addCriterion("endpoint <>", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointGreaterThan(String value) {
            addCriterion("endpoint >", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointGreaterThanOrEqualTo(String value) {
            addCriterion("endpoint >=", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLessThan(String value) {
            addCriterion("endpoint <", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLessThanOrEqualTo(String value) {
            addCriterion("endpoint <=", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLike(String value) {
            addCriterion("endpoint like", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotLike(String value) {
            addCriterion("endpoint not like", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointIn(List<String> values) {
            addCriterion("endpoint in", values, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotIn(List<String> values) {
            addCriterion("endpoint not in", values, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointBetween(String value1, String value2) {
            addCriterion("endpoint between", value1, value2, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotBetween(String value1, String value2) {
            addCriterion("endpoint not between", value1, value2, "endpoint");
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