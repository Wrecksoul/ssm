package com.taiji.basicDBService.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PopuBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PopuBasicExample() {
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

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(BigDecimal value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(BigDecimal value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(BigDecimal value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(BigDecimal value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<BigDecimal> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<BigDecimal> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(BigDecimal value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(BigDecimal value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(BigDecimal value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(BigDecimal value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<BigDecimal> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<BigDecimal> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNumIsNull() {
            addCriterion("ID_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIdNumIsNotNull() {
            addCriterion("ID_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumEqualTo(String value) {
            addCriterion("ID_NUM =", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotEqualTo(String value) {
            addCriterion("ID_NUM <>", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumGreaterThan(String value) {
            addCriterion("ID_NUM >", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NUM >=", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLessThan(String value) {
            addCriterion("ID_NUM <", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLessThanOrEqualTo(String value) {
            addCriterion("ID_NUM <=", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLike(String value) {
            addCriterion("ID_NUM like", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotLike(String value) {
            addCriterion("ID_NUM not like", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumIn(List<String> values) {
            addCriterion("ID_NUM in", values, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotIn(List<String> values) {
            addCriterion("ID_NUM not in", values, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumBetween(String value1, String value2) {
            addCriterion("ID_NUM between", value1, value2, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotBetween(String value1, String value2) {
            addCriterion("ID_NUM not between", value1, value2, "idNum");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNull() {
            addCriterion("FAMILY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNotNull() {
            addCriterion("FAMILY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdEqualTo(BigDecimal value) {
            addCriterion("FAMILY_ID =", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotEqualTo(BigDecimal value) {
            addCriterion("FAMILY_ID <>", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThan(BigDecimal value) {
            addCriterion("FAMILY_ID >", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAMILY_ID >=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThan(BigDecimal value) {
            addCriterion("FAMILY_ID <", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAMILY_ID <=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIn(List<BigDecimal> values) {
            addCriterion("FAMILY_ID in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotIn(List<BigDecimal> values) {
            addCriterion("FAMILY_ID not in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAMILY_ID between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAMILY_ID not between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNull() {
            addCriterion("RELATIONSHIP is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNotNull() {
            addCriterion("RELATIONSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipEqualTo(BigDecimal value) {
            addCriterion("RELATIONSHIP =", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotEqualTo(BigDecimal value) {
            addCriterion("RELATIONSHIP <>", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThan(BigDecimal value) {
            addCriterion("RELATIONSHIP >", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RELATIONSHIP >=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThan(BigDecimal value) {
            addCriterion("RELATIONSHIP <", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RELATIONSHIP <=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipIn(List<BigDecimal> values) {
            addCriterion("RELATIONSHIP in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotIn(List<BigDecimal> values) {
            addCriterion("RELATIONSHIP not in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELATIONSHIP between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELATIONSHIP not between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("PNAME is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("PNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("PNAME =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("PNAME <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("PNAME >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("PNAME >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("PNAME <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("PNAME <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("PNAME like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("PNAME not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("PNAME in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("PNAME not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("PNAME between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("PNAME not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andOldnameIsNull() {
            addCriterion("OLDNAME is null");
            return (Criteria) this;
        }

        public Criteria andOldnameIsNotNull() {
            addCriterion("OLDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOldnameEqualTo(String value) {
            addCriterion("OLDNAME =", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameNotEqualTo(String value) {
            addCriterion("OLDNAME <>", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameGreaterThan(String value) {
            addCriterion("OLDNAME >", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameGreaterThanOrEqualTo(String value) {
            addCriterion("OLDNAME >=", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameLessThan(String value) {
            addCriterion("OLDNAME <", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameLessThanOrEqualTo(String value) {
            addCriterion("OLDNAME <=", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameLike(String value) {
            addCriterion("OLDNAME like", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameNotLike(String value) {
            addCriterion("OLDNAME not like", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameIn(List<String> values) {
            addCriterion("OLDNAME in", values, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameNotIn(List<String> values) {
            addCriterion("OLDNAME not in", values, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameBetween(String value1, String value2) {
            addCriterion("OLDNAME between", value1, value2, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameNotBetween(String value1, String value2) {
            addCriterion("OLDNAME not between", value1, value2, "oldname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andHightIsNull() {
            addCriterion("HIGHT is null");
            return (Criteria) this;
        }

        public Criteria andHightIsNotNull() {
            addCriterion("HIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andHightEqualTo(BigDecimal value) {
            addCriterion("HIGHT =", value, "hight");
            return (Criteria) this;
        }

        public Criteria andHightNotEqualTo(BigDecimal value) {
            addCriterion("HIGHT <>", value, "hight");
            return (Criteria) this;
        }

        public Criteria andHightGreaterThan(BigDecimal value) {
            addCriterion("HIGHT >", value, "hight");
            return (Criteria) this;
        }

        public Criteria andHightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HIGHT >=", value, "hight");
            return (Criteria) this;
        }

        public Criteria andHightLessThan(BigDecimal value) {
            addCriterion("HIGHT <", value, "hight");
            return (Criteria) this;
        }

        public Criteria andHightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HIGHT <=", value, "hight");
            return (Criteria) this;
        }

        public Criteria andHightIn(List<BigDecimal> values) {
            addCriterion("HIGHT in", values, "hight");
            return (Criteria) this;
        }

        public Criteria andHightNotIn(List<BigDecimal> values) {
            addCriterion("HIGHT not in", values, "hight");
            return (Criteria) this;
        }

        public Criteria andHightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HIGHT between", value1, value2, "hight");
            return (Criteria) this;
        }

        public Criteria andHightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HIGHT not between", value1, value2, "hight");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIsNull() {
            addCriterion("BLOODTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIsNotNull() {
            addCriterion("BLOODTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeEqualTo(String value) {
            addCriterion("BLOODTYPE =", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotEqualTo(String value) {
            addCriterion("BLOODTYPE <>", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeGreaterThan(String value) {
            addCriterion("BLOODTYPE >", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeGreaterThanOrEqualTo(String value) {
            addCriterion("BLOODTYPE >=", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLessThan(String value) {
            addCriterion("BLOODTYPE <", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLessThanOrEqualTo(String value) {
            addCriterion("BLOODTYPE <=", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLike(String value) {
            addCriterion("BLOODTYPE like", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotLike(String value) {
            addCriterion("BLOODTYPE not like", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIn(List<String> values) {
            addCriterion("BLOODTYPE in", values, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotIn(List<String> values) {
            addCriterion("BLOODTYPE not in", values, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeBetween(String value1, String value2) {
            addCriterion("BLOODTYPE between", value1, value2, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotBetween(String value1, String value2) {
            addCriterion("BLOODTYPE not between", value1, value2, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBirthnumIsNull() {
            addCriterion("BIRTHNUM is null");
            return (Criteria) this;
        }

        public Criteria andBirthnumIsNotNull() {
            addCriterion("BIRTHNUM is not null");
            return (Criteria) this;
        }

        public Criteria andBirthnumEqualTo(String value) {
            addCriterion("BIRTHNUM =", value, "birthnum");
            return (Criteria) this;
        }

        public Criteria andBirthnumNotEqualTo(String value) {
            addCriterion("BIRTHNUM <>", value, "birthnum");
            return (Criteria) this;
        }

        public Criteria andBirthnumGreaterThan(String value) {
            addCriterion("BIRTHNUM >", value, "birthnum");
            return (Criteria) this;
        }

        public Criteria andBirthnumGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHNUM >=", value, "birthnum");
            return (Criteria) this;
        }

        public Criteria andBirthnumLessThan(String value) {
            addCriterion("BIRTHNUM <", value, "birthnum");
            return (Criteria) this;
        }

        public Criteria andBirthnumLessThanOrEqualTo(String value) {
            addCriterion("BIRTHNUM <=", value, "birthnum");
            return (Criteria) this;
        }

        public Criteria andBirthnumLike(String value) {
            addCriterion("BIRTHNUM like", value, "birthnum");
            return (Criteria) this;
        }

        public Criteria andBirthnumNotLike(String value) {
            addCriterion("BIRTHNUM not like", value, "birthnum");
            return (Criteria) this;
        }

        public Criteria andBirthnumIn(List<String> values) {
            addCriterion("BIRTHNUM in", values, "birthnum");
            return (Criteria) this;
        }

        public Criteria andBirthnumNotIn(List<String> values) {
            addCriterion("BIRTHNUM not in", values, "birthnum");
            return (Criteria) this;
        }

        public Criteria andBirthnumBetween(String value1, String value2) {
            addCriterion("BIRTHNUM between", value1, value2, "birthnum");
            return (Criteria) this;
        }

        public Criteria andBirthnumNotBetween(String value1, String value2) {
            addCriterion("BIRTHNUM not between", value1, value2, "birthnum");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNull() {
            addCriterion("BIRTHPLACE is null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNotNull() {
            addCriterion("BIRTHPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceEqualTo(String value) {
            addCriterion("BIRTHPLACE =", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotEqualTo(String value) {
            addCriterion("BIRTHPLACE <>", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThan(String value) {
            addCriterion("BIRTHPLACE >", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHPLACE >=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThan(String value) {
            addCriterion("BIRTHPLACE <", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("BIRTHPLACE <=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLike(String value) {
            addCriterion("BIRTHPLACE like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotLike(String value) {
            addCriterion("BIRTHPLACE not like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIn(List<String> values) {
            addCriterion("BIRTHPLACE in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotIn(List<String> values) {
            addCriterion("BIRTHPLACE not in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceBetween(String value1, String value2) {
            addCriterion("BIRTHPLACE between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotBetween(String value1, String value2) {
            addCriterion("BIRTHPLACE not between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirtheditIsNull() {
            addCriterion("BIRTHEDIT is null");
            return (Criteria) this;
        }

        public Criteria andBirtheditIsNotNull() {
            addCriterion("BIRTHEDIT is not null");
            return (Criteria) this;
        }

        public Criteria andBirtheditEqualTo(String value) {
            addCriterion("BIRTHEDIT =", value, "birthedit");
            return (Criteria) this;
        }

        public Criteria andBirtheditNotEqualTo(String value) {
            addCriterion("BIRTHEDIT <>", value, "birthedit");
            return (Criteria) this;
        }

        public Criteria andBirtheditGreaterThan(String value) {
            addCriterion("BIRTHEDIT >", value, "birthedit");
            return (Criteria) this;
        }

        public Criteria andBirtheditGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHEDIT >=", value, "birthedit");
            return (Criteria) this;
        }

        public Criteria andBirtheditLessThan(String value) {
            addCriterion("BIRTHEDIT <", value, "birthedit");
            return (Criteria) this;
        }

        public Criteria andBirtheditLessThanOrEqualTo(String value) {
            addCriterion("BIRTHEDIT <=", value, "birthedit");
            return (Criteria) this;
        }

        public Criteria andBirtheditLike(String value) {
            addCriterion("BIRTHEDIT like", value, "birthedit");
            return (Criteria) this;
        }

        public Criteria andBirtheditNotLike(String value) {
            addCriterion("BIRTHEDIT not like", value, "birthedit");
            return (Criteria) this;
        }

        public Criteria andBirtheditIn(List<String> values) {
            addCriterion("BIRTHEDIT in", values, "birthedit");
            return (Criteria) this;
        }

        public Criteria andBirtheditNotIn(List<String> values) {
            addCriterion("BIRTHEDIT not in", values, "birthedit");
            return (Criteria) this;
        }

        public Criteria andBirtheditBetween(String value1, String value2) {
            addCriterion("BIRTHEDIT between", value1, value2, "birthedit");
            return (Criteria) this;
        }

        public Criteria andBirtheditNotBetween(String value1, String value2) {
            addCriterion("BIRTHEDIT not between", value1, value2, "birthedit");
            return (Criteria) this;
        }

        public Criteria andBirthdetailIsNull() {
            addCriterion("BIRTHDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andBirthdetailIsNotNull() {
            addCriterion("BIRTHDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdetailEqualTo(String value) {
            addCriterion("BIRTHDETAIL =", value, "birthdetail");
            return (Criteria) this;
        }

        public Criteria andBirthdetailNotEqualTo(String value) {
            addCriterion("BIRTHDETAIL <>", value, "birthdetail");
            return (Criteria) this;
        }

        public Criteria andBirthdetailGreaterThan(String value) {
            addCriterion("BIRTHDETAIL >", value, "birthdetail");
            return (Criteria) this;
        }

        public Criteria andBirthdetailGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDETAIL >=", value, "birthdetail");
            return (Criteria) this;
        }

        public Criteria andBirthdetailLessThan(String value) {
            addCriterion("BIRTHDETAIL <", value, "birthdetail");
            return (Criteria) this;
        }

        public Criteria andBirthdetailLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDETAIL <=", value, "birthdetail");
            return (Criteria) this;
        }

        public Criteria andBirthdetailLike(String value) {
            addCriterion("BIRTHDETAIL like", value, "birthdetail");
            return (Criteria) this;
        }

        public Criteria andBirthdetailNotLike(String value) {
            addCriterion("BIRTHDETAIL not like", value, "birthdetail");
            return (Criteria) this;
        }

        public Criteria andBirthdetailIn(List<String> values) {
            addCriterion("BIRTHDETAIL in", values, "birthdetail");
            return (Criteria) this;
        }

        public Criteria andBirthdetailNotIn(List<String> values) {
            addCriterion("BIRTHDETAIL not in", values, "birthdetail");
            return (Criteria) this;
        }

        public Criteria andBirthdetailBetween(String value1, String value2) {
            addCriterion("BIRTHDETAIL between", value1, value2, "birthdetail");
            return (Criteria) this;
        }

        public Criteria andBirthdetailNotBetween(String value1, String value2) {
            addCriterion("BIRTHDETAIL not between", value1, value2, "birthdetail");
            return (Criteria) this;
        }

        public Criteria andPdegreeIsNull() {
            addCriterion("PDEGREE is null");
            return (Criteria) this;
        }

        public Criteria andPdegreeIsNotNull() {
            addCriterion("PDEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andPdegreeEqualTo(String value) {
            addCriterion("PDEGREE =", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeNotEqualTo(String value) {
            addCriterion("PDEGREE <>", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeGreaterThan(String value) {
            addCriterion("PDEGREE >", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("PDEGREE >=", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeLessThan(String value) {
            addCriterion("PDEGREE <", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeLessThanOrEqualTo(String value) {
            addCriterion("PDEGREE <=", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeLike(String value) {
            addCriterion("PDEGREE like", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeNotLike(String value) {
            addCriterion("PDEGREE not like", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeIn(List<String> values) {
            addCriterion("PDEGREE in", values, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeNotIn(List<String> values) {
            addCriterion("PDEGREE not in", values, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeBetween(String value1, String value2) {
            addCriterion("PDEGREE between", value1, value2, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeNotBetween(String value1, String value2) {
            addCriterion("PDEGREE not between", value1, value2, "pdegree");
            return (Criteria) this;
        }

        public Criteria andComuniteeIsNull() {
            addCriterion("COMUNITEE is null");
            return (Criteria) this;
        }

        public Criteria andComuniteeIsNotNull() {
            addCriterion("COMUNITEE is not null");
            return (Criteria) this;
        }

        public Criteria andComuniteeEqualTo(String value) {
            addCriterion("COMUNITEE =", value, "comunitee");
            return (Criteria) this;
        }

        public Criteria andComuniteeNotEqualTo(String value) {
            addCriterion("COMUNITEE <>", value, "comunitee");
            return (Criteria) this;
        }

        public Criteria andComuniteeGreaterThan(String value) {
            addCriterion("COMUNITEE >", value, "comunitee");
            return (Criteria) this;
        }

        public Criteria andComuniteeGreaterThanOrEqualTo(String value) {
            addCriterion("COMUNITEE >=", value, "comunitee");
            return (Criteria) this;
        }

        public Criteria andComuniteeLessThan(String value) {
            addCriterion("COMUNITEE <", value, "comunitee");
            return (Criteria) this;
        }

        public Criteria andComuniteeLessThanOrEqualTo(String value) {
            addCriterion("COMUNITEE <=", value, "comunitee");
            return (Criteria) this;
        }

        public Criteria andComuniteeLike(String value) {
            addCriterion("COMUNITEE like", value, "comunitee");
            return (Criteria) this;
        }

        public Criteria andComuniteeNotLike(String value) {
            addCriterion("COMUNITEE not like", value, "comunitee");
            return (Criteria) this;
        }

        public Criteria andComuniteeIn(List<String> values) {
            addCriterion("COMUNITEE in", values, "comunitee");
            return (Criteria) this;
        }

        public Criteria andComuniteeNotIn(List<String> values) {
            addCriterion("COMUNITEE not in", values, "comunitee");
            return (Criteria) this;
        }

        public Criteria andComuniteeBetween(String value1, String value2) {
            addCriterion("COMUNITEE between", value1, value2, "comunitee");
            return (Criteria) this;
        }

        public Criteria andComuniteeNotBetween(String value1, String value2) {
            addCriterion("COMUNITEE not between", value1, value2, "comunitee");
            return (Criteria) this;
        }

        public Criteria andRiligionIsNull() {
            addCriterion("RILIGION is null");
            return (Criteria) this;
        }

        public Criteria andRiligionIsNotNull() {
            addCriterion("RILIGION is not null");
            return (Criteria) this;
        }

        public Criteria andRiligionEqualTo(String value) {
            addCriterion("RILIGION =", value, "riligion");
            return (Criteria) this;
        }

        public Criteria andRiligionNotEqualTo(String value) {
            addCriterion("RILIGION <>", value, "riligion");
            return (Criteria) this;
        }

        public Criteria andRiligionGreaterThan(String value) {
            addCriterion("RILIGION >", value, "riligion");
            return (Criteria) this;
        }

        public Criteria andRiligionGreaterThanOrEqualTo(String value) {
            addCriterion("RILIGION >=", value, "riligion");
            return (Criteria) this;
        }

        public Criteria andRiligionLessThan(String value) {
            addCriterion("RILIGION <", value, "riligion");
            return (Criteria) this;
        }

        public Criteria andRiligionLessThanOrEqualTo(String value) {
            addCriterion("RILIGION <=", value, "riligion");
            return (Criteria) this;
        }

        public Criteria andRiligionLike(String value) {
            addCriterion("RILIGION like", value, "riligion");
            return (Criteria) this;
        }

        public Criteria andRiligionNotLike(String value) {
            addCriterion("RILIGION not like", value, "riligion");
            return (Criteria) this;
        }

        public Criteria andRiligionIn(List<String> values) {
            addCriterion("RILIGION in", values, "riligion");
            return (Criteria) this;
        }

        public Criteria andRiligionNotIn(List<String> values) {
            addCriterion("RILIGION not in", values, "riligion");
            return (Criteria) this;
        }

        public Criteria andRiligionBetween(String value1, String value2) {
            addCriterion("RILIGION between", value1, value2, "riligion");
            return (Criteria) this;
        }

        public Criteria andRiligionNotBetween(String value1, String value2) {
            addCriterion("RILIGION not between", value1, value2, "riligion");
            return (Criteria) this;
        }

        public Criteria andDeaddateIsNull() {
            addCriterion("DEADDATE is null");
            return (Criteria) this;
        }

        public Criteria andDeaddateIsNotNull() {
            addCriterion("DEADDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeaddateEqualTo(Date value) {
            addCriterionForJDBCDate("DEADDATE =", value, "deaddate");
            return (Criteria) this;
        }

        public Criteria andDeaddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEADDATE <>", value, "deaddate");
            return (Criteria) this;
        }

        public Criteria andDeaddateGreaterThan(Date value) {
            addCriterionForJDBCDate("DEADDATE >", value, "deaddate");
            return (Criteria) this;
        }

        public Criteria andDeaddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEADDATE >=", value, "deaddate");
            return (Criteria) this;
        }

        public Criteria andDeaddateLessThan(Date value) {
            addCriterionForJDBCDate("DEADDATE <", value, "deaddate");
            return (Criteria) this;
        }

        public Criteria andDeaddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEADDATE <=", value, "deaddate");
            return (Criteria) this;
        }

        public Criteria andDeaddateIn(List<Date> values) {
            addCriterionForJDBCDate("DEADDATE in", values, "deaddate");
            return (Criteria) this;
        }

        public Criteria andDeaddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEADDATE not in", values, "deaddate");
            return (Criteria) this;
        }

        public Criteria andDeaddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEADDATE between", value1, value2, "deaddate");
            return (Criteria) this;
        }

        public Criteria andDeaddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEADDATE not between", value1, value2, "deaddate");
            return (Criteria) this;
        }

        public Criteria andDeadnumIsNull() {
            addCriterion("DEADNUM is null");
            return (Criteria) this;
        }

        public Criteria andDeadnumIsNotNull() {
            addCriterion("DEADNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDeadnumEqualTo(String value) {
            addCriterion("DEADNUM =", value, "deadnum");
            return (Criteria) this;
        }

        public Criteria andDeadnumNotEqualTo(String value) {
            addCriterion("DEADNUM <>", value, "deadnum");
            return (Criteria) this;
        }

        public Criteria andDeadnumGreaterThan(String value) {
            addCriterion("DEADNUM >", value, "deadnum");
            return (Criteria) this;
        }

        public Criteria andDeadnumGreaterThanOrEqualTo(String value) {
            addCriterion("DEADNUM >=", value, "deadnum");
            return (Criteria) this;
        }

        public Criteria andDeadnumLessThan(String value) {
            addCriterion("DEADNUM <", value, "deadnum");
            return (Criteria) this;
        }

        public Criteria andDeadnumLessThanOrEqualTo(String value) {
            addCriterion("DEADNUM <=", value, "deadnum");
            return (Criteria) this;
        }

        public Criteria andDeadnumLike(String value) {
            addCriterion("DEADNUM like", value, "deadnum");
            return (Criteria) this;
        }

        public Criteria andDeadnumNotLike(String value) {
            addCriterion("DEADNUM not like", value, "deadnum");
            return (Criteria) this;
        }

        public Criteria andDeadnumIn(List<String> values) {
            addCriterion("DEADNUM in", values, "deadnum");
            return (Criteria) this;
        }

        public Criteria andDeadnumNotIn(List<String> values) {
            addCriterion("DEADNUM not in", values, "deadnum");
            return (Criteria) this;
        }

        public Criteria andDeadnumBetween(String value1, String value2) {
            addCriterion("DEADNUM between", value1, value2, "deadnum");
            return (Criteria) this;
        }

        public Criteria andDeadnumNotBetween(String value1, String value2) {
            addCriterion("DEADNUM not between", value1, value2, "deadnum");
            return (Criteria) this;
        }

        public Criteria andMarryIsNull() {
            addCriterion("MARRY is null");
            return (Criteria) this;
        }

        public Criteria andMarryIsNotNull() {
            addCriterion("MARRY is not null");
            return (Criteria) this;
        }

        public Criteria andMarryEqualTo(String value) {
            addCriterion("MARRY =", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotEqualTo(String value) {
            addCriterion("MARRY <>", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThan(String value) {
            addCriterion("MARRY >", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThanOrEqualTo(String value) {
            addCriterion("MARRY >=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThan(String value) {
            addCriterion("MARRY <", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThanOrEqualTo(String value) {
            addCriterion("MARRY <=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLike(String value) {
            addCriterion("MARRY like", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotLike(String value) {
            addCriterion("MARRY not like", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryIn(List<String> values) {
            addCriterion("MARRY in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotIn(List<String> values) {
            addCriterion("MARRY not in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryBetween(String value1, String value2) {
            addCriterion("MARRY between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotBetween(String value1, String value2) {
            addCriterion("MARRY not between", value1, value2, "marry");
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