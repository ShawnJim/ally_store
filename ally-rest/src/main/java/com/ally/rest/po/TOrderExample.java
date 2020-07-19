package com.ally.rest.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderExample() {
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

        public Criteria andOrderuuidIsNull() {
            addCriterion("orderUUID is null");
            return (Criteria) this;
        }

        public Criteria andOrderuuidIsNotNull() {
            addCriterion("orderUUID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderuuidEqualTo(String value) {
            addCriterion("orderUUID =", value, "orderuuid");
            return (Criteria) this;
        }

        public Criteria andOrderuuidNotEqualTo(String value) {
            addCriterion("orderUUID <>", value, "orderuuid");
            return (Criteria) this;
        }

        public Criteria andOrderuuidGreaterThan(String value) {
            addCriterion("orderUUID >", value, "orderuuid");
            return (Criteria) this;
        }

        public Criteria andOrderuuidGreaterThanOrEqualTo(String value) {
            addCriterion("orderUUID >=", value, "orderuuid");
            return (Criteria) this;
        }

        public Criteria andOrderuuidLessThan(String value) {
            addCriterion("orderUUID <", value, "orderuuid");
            return (Criteria) this;
        }

        public Criteria andOrderuuidLessThanOrEqualTo(String value) {
            addCriterion("orderUUID <=", value, "orderuuid");
            return (Criteria) this;
        }

        public Criteria andOrderuuidLike(String value) {
            addCriterion("orderUUID like", value, "orderuuid");
            return (Criteria) this;
        }

        public Criteria andOrderuuidNotLike(String value) {
            addCriterion("orderUUID not like", value, "orderuuid");
            return (Criteria) this;
        }

        public Criteria andOrderuuidIn(List<String> values) {
            addCriterion("orderUUID in", values, "orderuuid");
            return (Criteria) this;
        }

        public Criteria andOrderuuidNotIn(List<String> values) {
            addCriterion("orderUUID not in", values, "orderuuid");
            return (Criteria) this;
        }

        public Criteria andOrderuuidBetween(String value1, String value2) {
            addCriterion("orderUUID between", value1, value2, "orderuuid");
            return (Criteria) this;
        }

        public Criteria andOrderuuidNotBetween(String value1, String value2) {
            addCriterion("orderUUID not between", value1, value2, "orderuuid");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeIsNull() {
            addCriterion("NameofConsignee is null");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeIsNotNull() {
            addCriterion("NameofConsignee is not null");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeEqualTo(String value) {
            addCriterion("NameofConsignee =", value, "nameofconsignee");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeNotEqualTo(String value) {
            addCriterion("NameofConsignee <>", value, "nameofconsignee");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeGreaterThan(String value) {
            addCriterion("NameofConsignee >", value, "nameofconsignee");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("NameofConsignee >=", value, "nameofconsignee");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeLessThan(String value) {
            addCriterion("NameofConsignee <", value, "nameofconsignee");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeLessThanOrEqualTo(String value) {
            addCriterion("NameofConsignee <=", value, "nameofconsignee");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeLike(String value) {
            addCriterion("NameofConsignee like", value, "nameofconsignee");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeNotLike(String value) {
            addCriterion("NameofConsignee not like", value, "nameofconsignee");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeIn(List<String> values) {
            addCriterion("NameofConsignee in", values, "nameofconsignee");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeNotIn(List<String> values) {
            addCriterion("NameofConsignee not in", values, "nameofconsignee");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeBetween(String value1, String value2) {
            addCriterion("NameofConsignee between", value1, value2, "nameofconsignee");
            return (Criteria) this;
        }

        public Criteria andNameofconsigneeNotBetween(String value1, String value2) {
            addCriterion("NameofConsignee not between", value1, value2, "nameofconsignee");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneIsNull() {
            addCriterion("consigneeTelephone is null");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneIsNotNull() {
            addCriterion("consigneeTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneEqualTo(String value) {
            addCriterion("consigneeTelephone =", value, "consigneetelephone");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneNotEqualTo(String value) {
            addCriterion("consigneeTelephone <>", value, "consigneetelephone");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneGreaterThan(String value) {
            addCriterion("consigneeTelephone >", value, "consigneetelephone");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("consigneeTelephone >=", value, "consigneetelephone");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneLessThan(String value) {
            addCriterion("consigneeTelephone <", value, "consigneetelephone");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneLessThanOrEqualTo(String value) {
            addCriterion("consigneeTelephone <=", value, "consigneetelephone");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneLike(String value) {
            addCriterion("consigneeTelephone like", value, "consigneetelephone");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneNotLike(String value) {
            addCriterion("consigneeTelephone not like", value, "consigneetelephone");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneIn(List<String> values) {
            addCriterion("consigneeTelephone in", values, "consigneetelephone");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneNotIn(List<String> values) {
            addCriterion("consigneeTelephone not in", values, "consigneetelephone");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneBetween(String value1, String value2) {
            addCriterion("consigneeTelephone between", value1, value2, "consigneetelephone");
            return (Criteria) this;
        }

        public Criteria andConsigneetelephoneNotBetween(String value1, String value2) {
            addCriterion("consigneeTelephone not between", value1, value2, "consigneetelephone");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(Integer value) {
            addCriterion("orderStatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(Integer value) {
            addCriterion("orderStatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(Integer value) {
            addCriterion("orderStatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderStatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(Integer value) {
            addCriterion("orderStatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(Integer value) {
            addCriterion("orderStatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<Integer> values) {
            addCriterion("orderStatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<Integer> values) {
            addCriterion("orderStatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("creationTime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("creationTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("creationTime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("creationTime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("creationTime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creationTime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("creationTime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("creationTime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("creationTime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("creationTime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("creationTime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("creationTime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productID like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productID not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andDestinationcountryidIsNull() {
            addCriterion("DestinationCountryID is null");
            return (Criteria) this;
        }

        public Criteria andDestinationcountryidIsNotNull() {
            addCriterion("DestinationCountryID is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationcountryidEqualTo(Integer value) {
            addCriterion("DestinationCountryID =", value, "destinationcountryid");
            return (Criteria) this;
        }

        public Criteria andDestinationcountryidNotEqualTo(Integer value) {
            addCriterion("DestinationCountryID <>", value, "destinationcountryid");
            return (Criteria) this;
        }

        public Criteria andDestinationcountryidGreaterThan(Integer value) {
            addCriterion("DestinationCountryID >", value, "destinationcountryid");
            return (Criteria) this;
        }

        public Criteria andDestinationcountryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DestinationCountryID >=", value, "destinationcountryid");
            return (Criteria) this;
        }

        public Criteria andDestinationcountryidLessThan(Integer value) {
            addCriterion("DestinationCountryID <", value, "destinationcountryid");
            return (Criteria) this;
        }

        public Criteria andDestinationcountryidLessThanOrEqualTo(Integer value) {
            addCriterion("DestinationCountryID <=", value, "destinationcountryid");
            return (Criteria) this;
        }

        public Criteria andDestinationcountryidIn(List<Integer> values) {
            addCriterion("DestinationCountryID in", values, "destinationcountryid");
            return (Criteria) this;
        }

        public Criteria andDestinationcountryidNotIn(List<Integer> values) {
            addCriterion("DestinationCountryID not in", values, "destinationcountryid");
            return (Criteria) this;
        }

        public Criteria andDestinationcountryidBetween(Integer value1, Integer value2) {
            addCriterion("DestinationCountryID between", value1, value2, "destinationcountryid");
            return (Criteria) this;
        }

        public Criteria andDestinationcountryidNotBetween(Integer value1, Integer value2) {
            addCriterion("DestinationCountryID not between", value1, value2, "destinationcountryid");
            return (Criteria) this;
        }

        public Criteria andStoidIsNull() {
            addCriterion("stoId is null");
            return (Criteria) this;
        }

        public Criteria andStoidIsNotNull() {
            addCriterion("stoId is not null");
            return (Criteria) this;
        }

        public Criteria andStoidEqualTo(Integer value) {
            addCriterion("stoId =", value, "stoid");
            return (Criteria) this;
        }

        public Criteria andStoidNotEqualTo(Integer value) {
            addCriterion("stoId <>", value, "stoid");
            return (Criteria) this;
        }

        public Criteria andStoidGreaterThan(Integer value) {
            addCriterion("stoId >", value, "stoid");
            return (Criteria) this;
        }

        public Criteria andStoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stoId >=", value, "stoid");
            return (Criteria) this;
        }

        public Criteria andStoidLessThan(Integer value) {
            addCriterion("stoId <", value, "stoid");
            return (Criteria) this;
        }

        public Criteria andStoidLessThanOrEqualTo(Integer value) {
            addCriterion("stoId <=", value, "stoid");
            return (Criteria) this;
        }

        public Criteria andStoidIn(List<Integer> values) {
            addCriterion("stoId in", values, "stoid");
            return (Criteria) this;
        }

        public Criteria andStoidNotIn(List<Integer> values) {
            addCriterion("stoId not in", values, "stoid");
            return (Criteria) this;
        }

        public Criteria andStoidBetween(Integer value1, Integer value2) {
            addCriterion("stoId between", value1, value2, "stoid");
            return (Criteria) this;
        }

        public Criteria andStoidNotBetween(Integer value1, Integer value2) {
            addCriterion("stoId not between", value1, value2, "stoid");
            return (Criteria) this;
        }

        public Criteria andBraidIsNull() {
            addCriterion("braId is null");
            return (Criteria) this;
        }

        public Criteria andBraidIsNotNull() {
            addCriterion("braId is not null");
            return (Criteria) this;
        }

        public Criteria andBraidEqualTo(Integer value) {
            addCriterion("braId =", value, "braid");
            return (Criteria) this;
        }

        public Criteria andBraidNotEqualTo(Integer value) {
            addCriterion("braId <>", value, "braid");
            return (Criteria) this;
        }

        public Criteria andBraidGreaterThan(Integer value) {
            addCriterion("braId >", value, "braid");
            return (Criteria) this;
        }

        public Criteria andBraidGreaterThanOrEqualTo(Integer value) {
            addCriterion("braId >=", value, "braid");
            return (Criteria) this;
        }

        public Criteria andBraidLessThan(Integer value) {
            addCriterion("braId <", value, "braid");
            return (Criteria) this;
        }

        public Criteria andBraidLessThanOrEqualTo(Integer value) {
            addCriterion("braId <=", value, "braid");
            return (Criteria) this;
        }

        public Criteria andBraidIn(List<Integer> values) {
            addCriterion("braId in", values, "braid");
            return (Criteria) this;
        }

        public Criteria andBraidNotIn(List<Integer> values) {
            addCriterion("braId not in", values, "braid");
            return (Criteria) this;
        }

        public Criteria andBraidBetween(Integer value1, Integer value2) {
            addCriterion("braId between", value1, value2, "braid");
            return (Criteria) this;
        }

        public Criteria andBraidNotBetween(Integer value1, Integer value2) {
            addCriterion("braId not between", value1, value2, "braid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNull() {
            addCriterion("warehouseId is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("warehouseId is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(Integer value) {
            addCriterion("warehouseId =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(Integer value) {
            addCriterion("warehouseId <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(Integer value) {
            addCriterion("warehouseId >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouseId >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(Integer value) {
            addCriterion("warehouseId <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(Integer value) {
            addCriterion("warehouseId <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<Integer> values) {
            addCriterion("warehouseId in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<Integer> values) {
            addCriterion("warehouseId not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(Integer value1, Integer value2) {
            addCriterion("warehouseId between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouseId not between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andLogisticidIsNull() {
            addCriterion("logisticID is null");
            return (Criteria) this;
        }

        public Criteria andLogisticidIsNotNull() {
            addCriterion("logisticID is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticidEqualTo(Integer value) {
            addCriterion("logisticID =", value, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidNotEqualTo(Integer value) {
            addCriterion("logisticID <>", value, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidGreaterThan(Integer value) {
            addCriterion("logisticID >", value, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidGreaterThanOrEqualTo(Integer value) {
            addCriterion("logisticID >=", value, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidLessThan(Integer value) {
            addCriterion("logisticID <", value, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidLessThanOrEqualTo(Integer value) {
            addCriterion("logisticID <=", value, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidIn(List<Integer> values) {
            addCriterion("logisticID in", values, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidNotIn(List<Integer> values) {
            addCriterion("logisticID not in", values, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidBetween(Integer value1, Integer value2) {
            addCriterion("logisticID between", value1, value2, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidNotBetween(Integer value1, Integer value2) {
            addCriterion("logisticID not between", value1, value2, "logisticid");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNull() {
            addCriterion("productNum is null");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNotNull() {
            addCriterion("productNum is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumEqualTo(Integer value) {
            addCriterion("productNum =", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotEqualTo(Integer value) {
            addCriterion("productNum <>", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThan(Integer value) {
            addCriterion("productNum >", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("productNum >=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThan(Integer value) {
            addCriterion("productNum <", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThanOrEqualTo(Integer value) {
            addCriterion("productNum <=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumIn(List<Integer> values) {
            addCriterion("productNum in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotIn(List<Integer> values) {
            addCriterion("productNum not in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumBetween(Integer value1, Integer value2) {
            addCriterion("productNum between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotBetween(Integer value1, Integer value2) {
            addCriterion("productNum not between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(Integer value) {
            addCriterion("totalPrice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(Integer value) {
            addCriterion("totalPrice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(Integer value) {
            addCriterion("totalPrice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalPrice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(Integer value) {
            addCriterion("totalPrice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(Integer value) {
            addCriterion("totalPrice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<Integer> values) {
            addCriterion("totalPrice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<Integer> values) {
            addCriterion("totalPrice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(Integer value1, Integer value2) {
            addCriterion("totalPrice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("totalPrice not between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
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