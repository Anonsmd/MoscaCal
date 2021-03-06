package com.mutiny.moscacal.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    public MessageInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
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
     * This method corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("text is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("text is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("text =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("text <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("text >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("text >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("text <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("text <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("text like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("text not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("text in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("text not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("text between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("text not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andMessageUrlIsNull() {
            addCriterion("message_url is null");
            return (Criteria) this;
        }

        public Criteria andMessageUrlIsNotNull() {
            addCriterion("message_url is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUrlEqualTo(String value) {
            addCriterion("message_url =", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlNotEqualTo(String value) {
            addCriterion("message_url <>", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlGreaterThan(String value) {
            addCriterion("message_url >", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("message_url >=", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlLessThan(String value) {
            addCriterion("message_url <", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlLessThanOrEqualTo(String value) {
            addCriterion("message_url <=", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlLike(String value) {
            addCriterion("message_url like", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlNotLike(String value) {
            addCriterion("message_url not like", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlIn(List<String> values) {
            addCriterion("message_url in", values, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlNotIn(List<String> values) {
            addCriterion("message_url not in", values, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlBetween(String value1, String value2) {
            addCriterion("message_url between", value1, value2, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlNotBetween(String value1, String value2) {
            addCriterion("message_url not between", value1, value2, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNull() {
            addCriterion("push_time is null");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNotNull() {
            addCriterion("push_time is not null");
            return (Criteria) this;
        }

        public Criteria andPushTimeEqualTo(Date value) {
            addCriterion("push_time =", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotEqualTo(Date value) {
            addCriterion("push_time <>", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThan(Date value) {
            addCriterion("push_time >", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("push_time >=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThan(Date value) {
            addCriterion("push_time <", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThanOrEqualTo(Date value) {
            addCriterion("push_time <=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIn(List<Date> values) {
            addCriterion("push_time in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotIn(List<Date> values) {
            addCriterion("push_time not in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeBetween(Date value1, Date value2) {
            addCriterion("push_time between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotBetween(Date value1, Date value2) {
            addCriterion("push_time not between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSNumIsNull() {
            addCriterion("s_num is null");
            return (Criteria) this;
        }

        public Criteria andSNumIsNotNull() {
            addCriterion("s_num is not null");
            return (Criteria) this;
        }

        public Criteria andSNumEqualTo(Integer value) {
            addCriterion("s_num =", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumNotEqualTo(Integer value) {
            addCriterion("s_num <>", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumGreaterThan(Integer value) {
            addCriterion("s_num >", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_num >=", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumLessThan(Integer value) {
            addCriterion("s_num <", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumLessThanOrEqualTo(Integer value) {
            addCriterion("s_num <=", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumIn(List<Integer> values) {
            addCriterion("s_num in", values, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumNotIn(List<Integer> values) {
            addCriterion("s_num not in", values, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumBetween(Integer value1, Integer value2) {
            addCriterion("s_num between", value1, value2, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumNotBetween(Integer value1, Integer value2) {
            addCriterion("s_num not between", value1, value2, "sNum");
            return (Criteria) this;
        }

        public Criteria andNNumIsNull() {
            addCriterion("n_num is null");
            return (Criteria) this;
        }

        public Criteria andNNumIsNotNull() {
            addCriterion("n_num is not null");
            return (Criteria) this;
        }

        public Criteria andNNumEqualTo(Integer value) {
            addCriterion("n_num =", value, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumNotEqualTo(Integer value) {
            addCriterion("n_num <>", value, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumGreaterThan(Integer value) {
            addCriterion("n_num >", value, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_num >=", value, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumLessThan(Integer value) {
            addCriterion("n_num <", value, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumLessThanOrEqualTo(Integer value) {
            addCriterion("n_num <=", value, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumIn(List<Integer> values) {
            addCriterion("n_num in", values, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumNotIn(List<Integer> values) {
            addCriterion("n_num not in", values, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumBetween(Integer value1, Integer value2) {
            addCriterion("n_num between", value1, value2, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumNotBetween(Integer value1, Integer value2) {
            addCriterion("n_num not between", value1, value2, "nNum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Message_Info
     *
     * @mbg.generated do_not_delete_during_merge 2020-03-21 14:33:35
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-21 14:33:35
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