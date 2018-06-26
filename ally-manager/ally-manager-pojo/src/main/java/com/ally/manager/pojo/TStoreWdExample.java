package com.ally.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class TStoreWdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStoreWdExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andWwwnameIsNull() {
            addCriterion("wwwName is null");
            return (Criteria) this;
        }

        public Criteria andWwwnameIsNotNull() {
            addCriterion("wwwName is not null");
            return (Criteria) this;
        }

        public Criteria andWwwnameEqualTo(String value) {
            addCriterion("wwwName =", value, "wwwname");
            return (Criteria) this;
        }

        public Criteria andWwwnameNotEqualTo(String value) {
            addCriterion("wwwName <>", value, "wwwname");
            return (Criteria) this;
        }

        public Criteria andWwwnameGreaterThan(String value) {
            addCriterion("wwwName >", value, "wwwname");
            return (Criteria) this;
        }

        public Criteria andWwwnameGreaterThanOrEqualTo(String value) {
            addCriterion("wwwName >=", value, "wwwname");
            return (Criteria) this;
        }

        public Criteria andWwwnameLessThan(String value) {
            addCriterion("wwwName <", value, "wwwname");
            return (Criteria) this;
        }

        public Criteria andWwwnameLessThanOrEqualTo(String value) {
            addCriterion("wwwName <=", value, "wwwname");
            return (Criteria) this;
        }

        public Criteria andWwwnameLike(String value) {
            addCriterion("wwwName like", value, "wwwname");
            return (Criteria) this;
        }

        public Criteria andWwwnameNotLike(String value) {
            addCriterion("wwwName not like", value, "wwwname");
            return (Criteria) this;
        }

        public Criteria andWwwnameIn(List<String> values) {
            addCriterion("wwwName in", values, "wwwname");
            return (Criteria) this;
        }

        public Criteria andWwwnameNotIn(List<String> values) {
            addCriterion("wwwName not in", values, "wwwname");
            return (Criteria) this;
        }

        public Criteria andWwwnameBetween(String value1, String value2) {
            addCriterion("wwwName between", value1, value2, "wwwname");
            return (Criteria) this;
        }

        public Criteria andWwwnameNotBetween(String value1, String value2) {
            addCriterion("wwwName not between", value1, value2, "wwwname");
            return (Criteria) this;
        }

        public Criteria andWwwIsNull() {
            addCriterion("www is null");
            return (Criteria) this;
        }

        public Criteria andWwwIsNotNull() {
            addCriterion("www is not null");
            return (Criteria) this;
        }

        public Criteria andWwwEqualTo(String value) {
            addCriterion("www =", value, "www");
            return (Criteria) this;
        }

        public Criteria andWwwNotEqualTo(String value) {
            addCriterion("www <>", value, "www");
            return (Criteria) this;
        }

        public Criteria andWwwGreaterThan(String value) {
            addCriterion("www >", value, "www");
            return (Criteria) this;
        }

        public Criteria andWwwGreaterThanOrEqualTo(String value) {
            addCriterion("www >=", value, "www");
            return (Criteria) this;
        }

        public Criteria andWwwLessThan(String value) {
            addCriterion("www <", value, "www");
            return (Criteria) this;
        }

        public Criteria andWwwLessThanOrEqualTo(String value) {
            addCriterion("www <=", value, "www");
            return (Criteria) this;
        }

        public Criteria andWwwLike(String value) {
            addCriterion("www like", value, "www");
            return (Criteria) this;
        }

        public Criteria andWwwNotLike(String value) {
            addCriterion("www not like", value, "www");
            return (Criteria) this;
        }

        public Criteria andWwwIn(List<String> values) {
            addCriterion("www in", values, "www");
            return (Criteria) this;
        }

        public Criteria andWwwNotIn(List<String> values) {
            addCriterion("www not in", values, "www");
            return (Criteria) this;
        }

        public Criteria andWwwBetween(String value1, String value2) {
            addCriterion("www between", value1, value2, "www");
            return (Criteria) this;
        }

        public Criteria andWwwNotBetween(String value1, String value2) {
            addCriterion("www not between", value1, value2, "www");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
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