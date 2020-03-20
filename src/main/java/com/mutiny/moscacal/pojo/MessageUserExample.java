package com.mutiny.moscacal.pojo;

import java.util.ArrayList;
import java.util.List;

public class MessageUserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public MessageUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
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

        public Criteria andMessageUserIdIsNull() {
            addCriterion("Message_User_ID is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdIsNotNull() {
            addCriterion("Message_User_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdEqualTo(Integer value) {
            addCriterion("Message_User_ID =", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotEqualTo(Integer value) {
            addCriterion("Message_User_ID <>", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdGreaterThan(Integer value) {
            addCriterion("Message_User_ID >", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Message_User_ID >=", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdLessThan(Integer value) {
            addCriterion("Message_User_ID <", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("Message_User_ID <=", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdIn(List<Integer> values) {
            addCriterion("Message_User_ID in", values, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotIn(List<Integer> values) {
            addCriterion("Message_User_ID not in", values, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdBetween(Integer value1, Integer value2) {
            addCriterion("Message_User_ID between", value1, value2, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Message_User_ID not between", value1, value2, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMessageInfoIdIsNull() {
            addCriterion("Message_Info_ID is null");
            return (Criteria) this;
        }

        public Criteria andMessageInfoIdIsNotNull() {
            addCriterion("Message_Info_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageInfoIdEqualTo(Integer value) {
            addCriterion("Message_Info_ID =", value, "messageInfoId");
            return (Criteria) this;
        }

        public Criteria andMessageInfoIdNotEqualTo(Integer value) {
            addCriterion("Message_Info_ID <>", value, "messageInfoId");
            return (Criteria) this;
        }

        public Criteria andMessageInfoIdGreaterThan(Integer value) {
            addCriterion("Message_Info_ID >", value, "messageInfoId");
            return (Criteria) this;
        }

        public Criteria andMessageInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Message_Info_ID >=", value, "messageInfoId");
            return (Criteria) this;
        }

        public Criteria andMessageInfoIdLessThan(Integer value) {
            addCriterion("Message_Info_ID <", value, "messageInfoId");
            return (Criteria) this;
        }

        public Criteria andMessageInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("Message_Info_ID <=", value, "messageInfoId");
            return (Criteria) this;
        }

        public Criteria andMessageInfoIdIn(List<Integer> values) {
            addCriterion("Message_Info_ID in", values, "messageInfoId");
            return (Criteria) this;
        }

        public Criteria andMessageInfoIdNotIn(List<Integer> values) {
            addCriterion("Message_Info_ID not in", values, "messageInfoId");
            return (Criteria) this;
        }

        public Criteria andMessageInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("Message_Info_ID between", value1, value2, "messageInfoId");
            return (Criteria) this;
        }

        public Criteria andMessageInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Message_Info_ID not between", value1, value2, "messageInfoId");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Message_User
     *
     * @mbg.generated do_not_delete_during_merge 2020-03-20 17:46:49
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
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