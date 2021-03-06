package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCommidIsNull() {
            addCriterion("commid is null");
            return (Criteria) this;
        }

        public Criteria andCommidIsNotNull() {
            addCriterion("commid is not null");
            return (Criteria) this;
        }

        public Criteria andCommidEqualTo(Integer value) {
            addCriterion("commid =", value, "commid");
            return (Criteria) this;
        }

        public Criteria andCommidNotEqualTo(Integer value) {
            addCriterion("commid <>", value, "commid");
            return (Criteria) this;
        }

        public Criteria andCommidGreaterThan(Integer value) {
            addCriterion("commid >", value, "commid");
            return (Criteria) this;
        }

        public Criteria andCommidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commid >=", value, "commid");
            return (Criteria) this;
        }

        public Criteria andCommidLessThan(Integer value) {
            addCriterion("commid <", value, "commid");
            return (Criteria) this;
        }

        public Criteria andCommidLessThanOrEqualTo(Integer value) {
            addCriterion("commid <=", value, "commid");
            return (Criteria) this;
        }

        public Criteria andCommidIn(List<Integer> values) {
            addCriterion("commid in", values, "commid");
            return (Criteria) this;
        }

        public Criteria andCommidNotIn(List<Integer> values) {
            addCriterion("commid not in", values, "commid");
            return (Criteria) this;
        }

        public Criteria andCommidBetween(Integer value1, Integer value2) {
            addCriterion("commid between", value1, value2, "commid");
            return (Criteria) this;
        }

        public Criteria andCommidNotBetween(Integer value1, Integer value2) {
            addCriterion("commid not between", value1, value2, "commid");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommtimeIsNull() {
            addCriterion("commtime is null");
            return (Criteria) this;
        }

        public Criteria andCommtimeIsNotNull() {
            addCriterion("commtime is not null");
            return (Criteria) this;
        }

        public Criteria andCommtimeEqualTo(Date value) {
            addCriterionForJDBCDate("commtime =", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("commtime <>", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("commtime >", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commtime >=", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeLessThan(Date value) {
            addCriterionForJDBCDate("commtime <", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commtime <=", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeIn(List<Date> values) {
            addCriterionForJDBCDate("commtime in", values, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("commtime not in", values, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commtime between", value1, value2, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commtime not between", value1, value2, "commtime");
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