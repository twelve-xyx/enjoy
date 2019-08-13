package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamicExample() {
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

        public Criteria andDynamictextIsNull() {
            addCriterion("dynamicText is null");
            return (Criteria) this;
        }

        public Criteria andDynamictextIsNotNull() {
            addCriterion("dynamicText is not null");
            return (Criteria) this;
        }

        public Criteria andDynamictextEqualTo(String value) {
            addCriterion("dynamicText =", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextNotEqualTo(String value) {
            addCriterion("dynamicText <>", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextGreaterThan(String value) {
            addCriterion("dynamicText >", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextGreaterThanOrEqualTo(String value) {
            addCriterion("dynamicText >=", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextLessThan(String value) {
            addCriterion("dynamicText <", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextLessThanOrEqualTo(String value) {
            addCriterion("dynamicText <=", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextLike(String value) {
            addCriterion("dynamicText like", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextNotLike(String value) {
            addCriterion("dynamicText not like", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextIn(List<String> values) {
            addCriterion("dynamicText in", values, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextNotIn(List<String> values) {
            addCriterion("dynamicText not in", values, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextBetween(String value1, String value2) {
            addCriterion("dynamicText between", value1, value2, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextNotBetween(String value1, String value2) {
            addCriterion("dynamicText not between", value1, value2, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamicimgIsNull() {
            addCriterion("dynamicImg is null");
            return (Criteria) this;
        }

        public Criteria andDynamicimgIsNotNull() {
            addCriterion("dynamicImg is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicimgEqualTo(String value) {
            addCriterion("dynamicImg =", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgNotEqualTo(String value) {
            addCriterion("dynamicImg <>", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgGreaterThan(String value) {
            addCriterion("dynamicImg >", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgGreaterThanOrEqualTo(String value) {
            addCriterion("dynamicImg >=", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgLessThan(String value) {
            addCriterion("dynamicImg <", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgLessThanOrEqualTo(String value) {
            addCriterion("dynamicImg <=", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgLike(String value) {
            addCriterion("dynamicImg like", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgNotLike(String value) {
            addCriterion("dynamicImg not like", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgIn(List<String> values) {
            addCriterion("dynamicImg in", values, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgNotIn(List<String> values) {
            addCriterion("dynamicImg not in", values, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgBetween(String value1, String value2) {
            addCriterion("dynamicImg between", value1, value2, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgNotBetween(String value1, String value2) {
            addCriterion("dynamicImg not between", value1, value2, "dynamicimg");
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

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpcountIsNull() {
            addCriterion("upcount is null");
            return (Criteria) this;
        }

        public Criteria andUpcountIsNotNull() {
            addCriterion("upcount is not null");
            return (Criteria) this;
        }

        public Criteria andUpcountEqualTo(Integer value) {
            addCriterion("upcount =", value, "upcount");
            return (Criteria) this;
        }

        public Criteria andUpcountNotEqualTo(Integer value) {
            addCriterion("upcount <>", value, "upcount");
            return (Criteria) this;
        }

        public Criteria andUpcountGreaterThan(Integer value) {
            addCriterion("upcount >", value, "upcount");
            return (Criteria) this;
        }

        public Criteria andUpcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("upcount >=", value, "upcount");
            return (Criteria) this;
        }

        public Criteria andUpcountLessThan(Integer value) {
            addCriterion("upcount <", value, "upcount");
            return (Criteria) this;
        }

        public Criteria andUpcountLessThanOrEqualTo(Integer value) {
            addCriterion("upcount <=", value, "upcount");
            return (Criteria) this;
        }

        public Criteria andUpcountIn(List<Integer> values) {
            addCriterion("upcount in", values, "upcount");
            return (Criteria) this;
        }

        public Criteria andUpcountNotIn(List<Integer> values) {
            addCriterion("upcount not in", values, "upcount");
            return (Criteria) this;
        }

        public Criteria andUpcountBetween(Integer value1, Integer value2) {
            addCriterion("upcount between", value1, value2, "upcount");
            return (Criteria) this;
        }

        public Criteria andUpcountNotBetween(Integer value1, Integer value2) {
            addCriterion("upcount not between", value1, value2, "upcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountIsNull() {
            addCriterion("commentcount is null");
            return (Criteria) this;
        }

        public Criteria andCommentcountIsNotNull() {
            addCriterion("commentcount is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcountEqualTo(Integer value) {
            addCriterion("commentcount =", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotEqualTo(Integer value) {
            addCriterion("commentcount <>", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountGreaterThan(Integer value) {
            addCriterion("commentcount >", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentcount >=", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountLessThan(Integer value) {
            addCriterion("commentcount <", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountLessThanOrEqualTo(Integer value) {
            addCriterion("commentcount <=", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountIn(List<Integer> values) {
            addCriterion("commentcount in", values, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotIn(List<Integer> values) {
            addCriterion("commentcount not in", values, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountBetween(Integer value1, Integer value2) {
            addCriterion("commentcount between", value1, value2, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotBetween(Integer value1, Integer value2) {
            addCriterion("commentcount not between", value1, value2, "commentcount");
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