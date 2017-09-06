package cn.reloading.cp.po;

import java.util.ArrayList;
import java.util.List;

public class CpPluginsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpPluginsExample() {
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

        public Criteria andPversionIsNull() {
            addCriterion("pversion is null");
            return (Criteria) this;
        }

        public Criteria andPversionIsNotNull() {
            addCriterion("pversion is not null");
            return (Criteria) this;
        }

        public Criteria andPversionEqualTo(String value) {
            addCriterion("pversion =", value, "pversion");
            return (Criteria) this;
        }

        public Criteria andPversionNotEqualTo(String value) {
            addCriterion("pversion <>", value, "pversion");
            return (Criteria) this;
        }

        public Criteria andPversionGreaterThan(String value) {
            addCriterion("pversion >", value, "pversion");
            return (Criteria) this;
        }

        public Criteria andPversionGreaterThanOrEqualTo(String value) {
            addCriterion("pversion >=", value, "pversion");
            return (Criteria) this;
        }

        public Criteria andPversionLessThan(String value) {
            addCriterion("pversion <", value, "pversion");
            return (Criteria) this;
        }

        public Criteria andPversionLessThanOrEqualTo(String value) {
            addCriterion("pversion <=", value, "pversion");
            return (Criteria) this;
        }

        public Criteria andPversionLike(String value) {
            addCriterion("pversion like", value, "pversion");
            return (Criteria) this;
        }

        public Criteria andPversionNotLike(String value) {
            addCriterion("pversion not like", value, "pversion");
            return (Criteria) this;
        }

        public Criteria andPversionIn(List<String> values) {
            addCriterion("pversion in", values, "pversion");
            return (Criteria) this;
        }

        public Criteria andPversionNotIn(List<String> values) {
            addCriterion("pversion not in", values, "pversion");
            return (Criteria) this;
        }

        public Criteria andPversionBetween(String value1, String value2) {
            addCriterion("pversion between", value1, value2, "pversion");
            return (Criteria) this;
        }

        public Criteria andPversionNotBetween(String value1, String value2) {
            addCriterion("pversion not between", value1, value2, "pversion");
            return (Criteria) this;
        }

        public Criteria andDlurlIsNull() {
            addCriterion("dlurl is null");
            return (Criteria) this;
        }

        public Criteria andDlurlIsNotNull() {
            addCriterion("dlurl is not null");
            return (Criteria) this;
        }

        public Criteria andDlurlEqualTo(String value) {
            addCriterion("dlurl =", value, "dlurl");
            return (Criteria) this;
        }

        public Criteria andDlurlNotEqualTo(String value) {
            addCriterion("dlurl <>", value, "dlurl");
            return (Criteria) this;
        }

        public Criteria andDlurlGreaterThan(String value) {
            addCriterion("dlurl >", value, "dlurl");
            return (Criteria) this;
        }

        public Criteria andDlurlGreaterThanOrEqualTo(String value) {
            addCriterion("dlurl >=", value, "dlurl");
            return (Criteria) this;
        }

        public Criteria andDlurlLessThan(String value) {
            addCriterion("dlurl <", value, "dlurl");
            return (Criteria) this;
        }

        public Criteria andDlurlLessThanOrEqualTo(String value) {
            addCriterion("dlurl <=", value, "dlurl");
            return (Criteria) this;
        }

        public Criteria andDlurlLike(String value) {
            addCriterion("dlurl like", value, "dlurl");
            return (Criteria) this;
        }

        public Criteria andDlurlNotLike(String value) {
            addCriterion("dlurl not like", value, "dlurl");
            return (Criteria) this;
        }

        public Criteria andDlurlIn(List<String> values) {
            addCriterion("dlurl in", values, "dlurl");
            return (Criteria) this;
        }

        public Criteria andDlurlNotIn(List<String> values) {
            addCriterion("dlurl not in", values, "dlurl");
            return (Criteria) this;
        }

        public Criteria andDlurlBetween(String value1, String value2) {
            addCriterion("dlurl between", value1, value2, "dlurl");
            return (Criteria) this;
        }

        public Criteria andDlurlNotBetween(String value1, String value2) {
            addCriterion("dlurl not between", value1, value2, "dlurl");
            return (Criteria) this;
        }

        public Criteria andPpicIsNull() {
            addCriterion("ppic is null");
            return (Criteria) this;
        }

        public Criteria andPpicIsNotNull() {
            addCriterion("ppic is not null");
            return (Criteria) this;
        }

        public Criteria andPpicEqualTo(String value) {
            addCriterion("ppic =", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicNotEqualTo(String value) {
            addCriterion("ppic <>", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicGreaterThan(String value) {
            addCriterion("ppic >", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicGreaterThanOrEqualTo(String value) {
            addCriterion("ppic >=", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicLessThan(String value) {
            addCriterion("ppic <", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicLessThanOrEqualTo(String value) {
            addCriterion("ppic <=", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicLike(String value) {
            addCriterion("ppic like", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicNotLike(String value) {
            addCriterion("ppic not like", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicIn(List<String> values) {
            addCriterion("ppic in", values, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicNotIn(List<String> values) {
            addCriterion("ppic not in", values, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicBetween(String value1, String value2) {
            addCriterion("ppic between", value1, value2, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicNotBetween(String value1, String value2) {
            addCriterion("ppic not between", value1, value2, "ppic");
            return (Criteria) this;
        }

        public Criteria andReadcountIsNull() {
            addCriterion("readcount is null");
            return (Criteria) this;
        }

        public Criteria andReadcountIsNotNull() {
            addCriterion("readcount is not null");
            return (Criteria) this;
        }

        public Criteria andReadcountEqualTo(Integer value) {
            addCriterion("readcount =", value, "readcount");
            return (Criteria) this;
        }

        public Criteria andReadcountNotEqualTo(Integer value) {
            addCriterion("readcount <>", value, "readcount");
            return (Criteria) this;
        }

        public Criteria andReadcountGreaterThan(Integer value) {
            addCriterion("readcount >", value, "readcount");
            return (Criteria) this;
        }

        public Criteria andReadcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("readcount >=", value, "readcount");
            return (Criteria) this;
        }

        public Criteria andReadcountLessThan(Integer value) {
            addCriterion("readcount <", value, "readcount");
            return (Criteria) this;
        }

        public Criteria andReadcountLessThanOrEqualTo(Integer value) {
            addCriterion("readcount <=", value, "readcount");
            return (Criteria) this;
        }

        public Criteria andReadcountIn(List<Integer> values) {
            addCriterion("readcount in", values, "readcount");
            return (Criteria) this;
        }

        public Criteria andReadcountNotIn(List<Integer> values) {
            addCriterion("readcount not in", values, "readcount");
            return (Criteria) this;
        }

        public Criteria andReadcountBetween(Integer value1, Integer value2) {
            addCriterion("readcount between", value1, value2, "readcount");
            return (Criteria) this;
        }

        public Criteria andReadcountNotBetween(Integer value1, Integer value2) {
            addCriterion("readcount not between", value1, value2, "readcount");
            return (Criteria) this;
        }

        public Criteria andDlcountIsNull() {
            addCriterion("dlcount is null");
            return (Criteria) this;
        }

        public Criteria andDlcountIsNotNull() {
            addCriterion("dlcount is not null");
            return (Criteria) this;
        }

        public Criteria andDlcountEqualTo(Integer value) {
            addCriterion("dlcount =", value, "dlcount");
            return (Criteria) this;
        }

        public Criteria andDlcountNotEqualTo(Integer value) {
            addCriterion("dlcount <>", value, "dlcount");
            return (Criteria) this;
        }

        public Criteria andDlcountGreaterThan(Integer value) {
            addCriterion("dlcount >", value, "dlcount");
            return (Criteria) this;
        }

        public Criteria andDlcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dlcount >=", value, "dlcount");
            return (Criteria) this;
        }

        public Criteria andDlcountLessThan(Integer value) {
            addCriterion("dlcount <", value, "dlcount");
            return (Criteria) this;
        }

        public Criteria andDlcountLessThanOrEqualTo(Integer value) {
            addCriterion("dlcount <=", value, "dlcount");
            return (Criteria) this;
        }

        public Criteria andDlcountIn(List<Integer> values) {
            addCriterion("dlcount in", values, "dlcount");
            return (Criteria) this;
        }

        public Criteria andDlcountNotIn(List<Integer> values) {
            addCriterion("dlcount not in", values, "dlcount");
            return (Criteria) this;
        }

        public Criteria andDlcountBetween(Integer value1, Integer value2) {
            addCriterion("dlcount between", value1, value2, "dlcount");
            return (Criteria) this;
        }

        public Criteria andDlcountNotBetween(Integer value1, Integer value2) {
            addCriterion("dlcount not between", value1, value2, "dlcount");
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

        public Criteria andCreatetimeEqualTo(Integer value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Integer value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Integer value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Integer value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Integer> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Integer> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Integer value1, Integer value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Integer value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Integer value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Integer value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Integer value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Integer> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Integer> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Integer value1, Integer value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isdel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isdel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(Byte value) {
            addCriterion("isdel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Byte value) {
            addCriterion("isdel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Byte value) {
            addCriterion("isdel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Byte value) {
            addCriterion("isdel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Byte value) {
            addCriterion("isdel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Byte value) {
            addCriterion("isdel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Byte> values) {
            addCriterion("isdel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Byte> values) {
            addCriterion("isdel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Byte value1, Byte value2) {
            addCriterion("isdel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Byte value1, Byte value2) {
            addCriterion("isdel not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andTag1IsNull() {
            addCriterion("tag1 is null");
            return (Criteria) this;
        }

        public Criteria andTag1IsNotNull() {
            addCriterion("tag1 is not null");
            return (Criteria) this;
        }

        public Criteria andTag1EqualTo(String value) {
            addCriterion("tag1 =", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1NotEqualTo(String value) {
            addCriterion("tag1 <>", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1GreaterThan(String value) {
            addCriterion("tag1 >", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1GreaterThanOrEqualTo(String value) {
            addCriterion("tag1 >=", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1LessThan(String value) {
            addCriterion("tag1 <", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1LessThanOrEqualTo(String value) {
            addCriterion("tag1 <=", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1Like(String value) {
            addCriterion("tag1 like", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1NotLike(String value) {
            addCriterion("tag1 not like", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1In(List<String> values) {
            addCriterion("tag1 in", values, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1NotIn(List<String> values) {
            addCriterion("tag1 not in", values, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1Between(String value1, String value2) {
            addCriterion("tag1 between", value1, value2, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1NotBetween(String value1, String value2) {
            addCriterion("tag1 not between", value1, value2, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag2IsNull() {
            addCriterion("tag2 is null");
            return (Criteria) this;
        }

        public Criteria andTag2IsNotNull() {
            addCriterion("tag2 is not null");
            return (Criteria) this;
        }

        public Criteria andTag2EqualTo(String value) {
            addCriterion("tag2 =", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2NotEqualTo(String value) {
            addCriterion("tag2 <>", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2GreaterThan(String value) {
            addCriterion("tag2 >", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2GreaterThanOrEqualTo(String value) {
            addCriterion("tag2 >=", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2LessThan(String value) {
            addCriterion("tag2 <", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2LessThanOrEqualTo(String value) {
            addCriterion("tag2 <=", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2Like(String value) {
            addCriterion("tag2 like", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2NotLike(String value) {
            addCriterion("tag2 not like", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2In(List<String> values) {
            addCriterion("tag2 in", values, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2NotIn(List<String> values) {
            addCriterion("tag2 not in", values, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2Between(String value1, String value2) {
            addCriterion("tag2 between", value1, value2, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2NotBetween(String value1, String value2) {
            addCriterion("tag2 not between", value1, value2, "tag2");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
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