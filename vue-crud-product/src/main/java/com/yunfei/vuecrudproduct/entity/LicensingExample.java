package com.yunfei.vuecrudproduct.entity;

import java.util.ArrayList;
import java.util.List;

public class LicensingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LicensingExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andXkWshIsNull() {
            addCriterion("XK_WSH is null");
            return (Criteria) this;
        }

        public Criteria andXkWshIsNotNull() {
            addCriterion("XK_WSH is not null");
            return (Criteria) this;
        }

        public Criteria andXkWshEqualTo(String value) {
            addCriterion("XK_WSH =", value, "xkWsh");
            return (Criteria) this;
        }

        public Criteria andXkWshNotEqualTo(String value) {
            addCriterion("XK_WSH <>", value, "xkWsh");
            return (Criteria) this;
        }

        public Criteria andXkWshGreaterThan(String value) {
            addCriterion("XK_WSH >", value, "xkWsh");
            return (Criteria) this;
        }

        public Criteria andXkWshGreaterThanOrEqualTo(String value) {
            addCriterion("XK_WSH >=", value, "xkWsh");
            return (Criteria) this;
        }

        public Criteria andXkWshLessThan(String value) {
            addCriterion("XK_WSH <", value, "xkWsh");
            return (Criteria) this;
        }

        public Criteria andXkWshLessThanOrEqualTo(String value) {
            addCriterion("XK_WSH <=", value, "xkWsh");
            return (Criteria) this;
        }

        public Criteria andXkWshLike(String value) {
            addCriterion("XK_WSH like", value, "xkWsh");
            return (Criteria) this;
        }

        public Criteria andXkWshNotLike(String value) {
            addCriterion("XK_WSH not like", value, "xkWsh");
            return (Criteria) this;
        }

        public Criteria andXkWshIn(List<String> values) {
            addCriterion("XK_WSH in", values, "xkWsh");
            return (Criteria) this;
        }

        public Criteria andXkWshNotIn(List<String> values) {
            addCriterion("XK_WSH not in", values, "xkWsh");
            return (Criteria) this;
        }

        public Criteria andXkWshBetween(String value1, String value2) {
            addCriterion("XK_WSH between", value1, value2, "xkWsh");
            return (Criteria) this;
        }

        public Criteria andXkWshNotBetween(String value1, String value2) {
            addCriterion("XK_WSH not between", value1, value2, "xkWsh");
            return (Criteria) this;
        }

        public Criteria andXkXmmcIsNull() {
            addCriterion("XK_XMMC is null");
            return (Criteria) this;
        }

        public Criteria andXkXmmcIsNotNull() {
            addCriterion("XK_XMMC is not null");
            return (Criteria) this;
        }

        public Criteria andXkXmmcEqualTo(String value) {
            addCriterion("XK_XMMC =", value, "xkXmmc");
            return (Criteria) this;
        }

        public Criteria andXkXmmcNotEqualTo(String value) {
            addCriterion("XK_XMMC <>", value, "xkXmmc");
            return (Criteria) this;
        }

        public Criteria andXkXmmcGreaterThan(String value) {
            addCriterion("XK_XMMC >", value, "xkXmmc");
            return (Criteria) this;
        }

        public Criteria andXkXmmcGreaterThanOrEqualTo(String value) {
            addCriterion("XK_XMMC >=", value, "xkXmmc");
            return (Criteria) this;
        }

        public Criteria andXkXmmcLessThan(String value) {
            addCriterion("XK_XMMC <", value, "xkXmmc");
            return (Criteria) this;
        }

        public Criteria andXkXmmcLessThanOrEqualTo(String value) {
            addCriterion("XK_XMMC <=", value, "xkXmmc");
            return (Criteria) this;
        }

        public Criteria andXkXmmcLike(String value) {
            addCriterion("XK_XMMC like", value, "xkXmmc");
            return (Criteria) this;
        }

        public Criteria andXkXmmcNotLike(String value) {
            addCriterion("XK_XMMC not like", value, "xkXmmc");
            return (Criteria) this;
        }

        public Criteria andXkXmmcIn(List<String> values) {
            addCriterion("XK_XMMC in", values, "xkXmmc");
            return (Criteria) this;
        }

        public Criteria andXkXmmcNotIn(List<String> values) {
            addCriterion("XK_XMMC not in", values, "xkXmmc");
            return (Criteria) this;
        }

        public Criteria andXkXmmcBetween(String value1, String value2) {
            addCriterion("XK_XMMC between", value1, value2, "xkXmmc");
            return (Criteria) this;
        }

        public Criteria andXkXmmcNotBetween(String value1, String value2) {
            addCriterion("XK_XMMC not between", value1, value2, "xkXmmc");
            return (Criteria) this;
        }

        public Criteria andXkSplbIsNull() {
            addCriterion("XK_SPLB is null");
            return (Criteria) this;
        }

        public Criteria andXkSplbIsNotNull() {
            addCriterion("XK_SPLB is not null");
            return (Criteria) this;
        }

        public Criteria andXkSplbEqualTo(String value) {
            addCriterion("XK_SPLB =", value, "xkSplb");
            return (Criteria) this;
        }

        public Criteria andXkSplbNotEqualTo(String value) {
            addCriterion("XK_SPLB <>", value, "xkSplb");
            return (Criteria) this;
        }

        public Criteria andXkSplbGreaterThan(String value) {
            addCriterion("XK_SPLB >", value, "xkSplb");
            return (Criteria) this;
        }

        public Criteria andXkSplbGreaterThanOrEqualTo(String value) {
            addCriterion("XK_SPLB >=", value, "xkSplb");
            return (Criteria) this;
        }

        public Criteria andXkSplbLessThan(String value) {
            addCriterion("XK_SPLB <", value, "xkSplb");
            return (Criteria) this;
        }

        public Criteria andXkSplbLessThanOrEqualTo(String value) {
            addCriterion("XK_SPLB <=", value, "xkSplb");
            return (Criteria) this;
        }

        public Criteria andXkSplbLike(String value) {
            addCriterion("XK_SPLB like", value, "xkSplb");
            return (Criteria) this;
        }

        public Criteria andXkSplbNotLike(String value) {
            addCriterion("XK_SPLB not like", value, "xkSplb");
            return (Criteria) this;
        }

        public Criteria andXkSplbIn(List<String> values) {
            addCriterion("XK_SPLB in", values, "xkSplb");
            return (Criteria) this;
        }

        public Criteria andXkSplbNotIn(List<String> values) {
            addCriterion("XK_SPLB not in", values, "xkSplb");
            return (Criteria) this;
        }

        public Criteria andXkSplbBetween(String value1, String value2) {
            addCriterion("XK_SPLB between", value1, value2, "xkSplb");
            return (Criteria) this;
        }

        public Criteria andXkSplbNotBetween(String value1, String value2) {
            addCriterion("XK_SPLB not between", value1, value2, "xkSplb");
            return (Criteria) this;
        }

        public Criteria andXkXdrIsNull() {
            addCriterion("XK_XDR is null");
            return (Criteria) this;
        }

        public Criteria andXkXdrIsNotNull() {
            addCriterion("XK_XDR is not null");
            return (Criteria) this;
        }

        public Criteria andXkXdrEqualTo(String value) {
            addCriterion("XK_XDR =", value, "xkXdr");
            return (Criteria) this;
        }

        public Criteria andXkXdrNotEqualTo(String value) {
            addCriterion("XK_XDR <>", value, "xkXdr");
            return (Criteria) this;
        }

        public Criteria andXkXdrGreaterThan(String value) {
            addCriterion("XK_XDR >", value, "xkXdr");
            return (Criteria) this;
        }

        public Criteria andXkXdrGreaterThanOrEqualTo(String value) {
            addCriterion("XK_XDR >=", value, "xkXdr");
            return (Criteria) this;
        }

        public Criteria andXkXdrLessThan(String value) {
            addCriterion("XK_XDR <", value, "xkXdr");
            return (Criteria) this;
        }

        public Criteria andXkXdrLessThanOrEqualTo(String value) {
            addCriterion("XK_XDR <=", value, "xkXdr");
            return (Criteria) this;
        }

        public Criteria andXkXdrLike(String value) {
            addCriterion("XK_XDR like", value, "xkXdr");
            return (Criteria) this;
        }

        public Criteria andXkXdrNotLike(String value) {
            addCriterion("XK_XDR not like", value, "xkXdr");
            return (Criteria) this;
        }

        public Criteria andXkXdrIn(List<String> values) {
            addCriterion("XK_XDR in", values, "xkXdr");
            return (Criteria) this;
        }

        public Criteria andXkXdrNotIn(List<String> values) {
            addCriterion("XK_XDR not in", values, "xkXdr");
            return (Criteria) this;
        }

        public Criteria andXkXdrBetween(String value1, String value2) {
            addCriterion("XK_XDR between", value1, value2, "xkXdr");
            return (Criteria) this;
        }

        public Criteria andXkXdrNotBetween(String value1, String value2) {
            addCriterion("XK_XDR not between", value1, value2, "xkXdr");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmIsNull() {
            addCriterion("XK_SDR_XYDM is null");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmIsNotNull() {
            addCriterion("XK_SDR_XYDM is not null");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmEqualTo(String value) {
            addCriterion("XK_SDR_XYDM =", value, "xkSdrXydm");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmNotEqualTo(String value) {
            addCriterion("XK_SDR_XYDM <>", value, "xkSdrXydm");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmGreaterThan(String value) {
            addCriterion("XK_SDR_XYDM >", value, "xkSdrXydm");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmGreaterThanOrEqualTo(String value) {
            addCriterion("XK_SDR_XYDM >=", value, "xkSdrXydm");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmLessThan(String value) {
            addCriterion("XK_SDR_XYDM <", value, "xkSdrXydm");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmLessThanOrEqualTo(String value) {
            addCriterion("XK_SDR_XYDM <=", value, "xkSdrXydm");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmLike(String value) {
            addCriterion("XK_SDR_XYDM like", value, "xkSdrXydm");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmNotLike(String value) {
            addCriterion("XK_SDR_XYDM not like", value, "xkSdrXydm");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmIn(List<String> values) {
            addCriterion("XK_SDR_XYDM in", values, "xkSdrXydm");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmNotIn(List<String> values) {
            addCriterion("XK_SDR_XYDM not in", values, "xkSdrXydm");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmBetween(String value1, String value2) {
            addCriterion("XK_SDR_XYDM between", value1, value2, "xkSdrXydm");
            return (Criteria) this;
        }

        public Criteria andXkSdrXydmNotBetween(String value1, String value2) {
            addCriterion("XK_SDR_XYDM not between", value1, value2, "xkSdrXydm");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgIsNull() {
            addCriterion("XK_SDR_ZZJG is null");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgIsNotNull() {
            addCriterion("XK_SDR_ZZJG is not null");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgEqualTo(String value) {
            addCriterion("XK_SDR_ZZJG =", value, "xkSdrZzjg");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgNotEqualTo(String value) {
            addCriterion("XK_SDR_ZZJG <>", value, "xkSdrZzjg");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgGreaterThan(String value) {
            addCriterion("XK_SDR_ZZJG >", value, "xkSdrZzjg");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgGreaterThanOrEqualTo(String value) {
            addCriterion("XK_SDR_ZZJG >=", value, "xkSdrZzjg");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgLessThan(String value) {
            addCriterion("XK_SDR_ZZJG <", value, "xkSdrZzjg");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgLessThanOrEqualTo(String value) {
            addCriterion("XK_SDR_ZZJG <=", value, "xkSdrZzjg");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgLike(String value) {
            addCriterion("XK_SDR_ZZJG like", value, "xkSdrZzjg");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgNotLike(String value) {
            addCriterion("XK_SDR_ZZJG not like", value, "xkSdrZzjg");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgIn(List<String> values) {
            addCriterion("XK_SDR_ZZJG in", values, "xkSdrZzjg");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgNotIn(List<String> values) {
            addCriterion("XK_SDR_ZZJG not in", values, "xkSdrZzjg");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgBetween(String value1, String value2) {
            addCriterion("XK_SDR_ZZJG between", value1, value2, "xkSdrZzjg");
            return (Criteria) this;
        }

        public Criteria andXkSdrZzjgNotBetween(String value1, String value2) {
            addCriterion("XK_SDR_ZZJG not between", value1, value2, "xkSdrZzjg");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjIsNull() {
            addCriterion("XK_SDR_GSDJ is null");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjIsNotNull() {
            addCriterion("XK_SDR_GSDJ is not null");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjEqualTo(String value) {
            addCriterion("XK_SDR_GSDJ =", value, "xkSdrGsdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjNotEqualTo(String value) {
            addCriterion("XK_SDR_GSDJ <>", value, "xkSdrGsdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjGreaterThan(String value) {
            addCriterion("XK_SDR_GSDJ >", value, "xkSdrGsdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjGreaterThanOrEqualTo(String value) {
            addCriterion("XK_SDR_GSDJ >=", value, "xkSdrGsdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjLessThan(String value) {
            addCriterion("XK_SDR_GSDJ <", value, "xkSdrGsdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjLessThanOrEqualTo(String value) {
            addCriterion("XK_SDR_GSDJ <=", value, "xkSdrGsdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjLike(String value) {
            addCriterion("XK_SDR_GSDJ like", value, "xkSdrGsdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjNotLike(String value) {
            addCriterion("XK_SDR_GSDJ not like", value, "xkSdrGsdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjIn(List<String> values) {
            addCriterion("XK_SDR_GSDJ in", values, "xkSdrGsdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjNotIn(List<String> values) {
            addCriterion("XK_SDR_GSDJ not in", values, "xkSdrGsdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjBetween(String value1, String value2) {
            addCriterion("XK_SDR_GSDJ between", value1, value2, "xkSdrGsdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrGsdjNotBetween(String value1, String value2) {
            addCriterion("XK_SDR_GSDJ not between", value1, value2, "xkSdrGsdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjIsNull() {
            addCriterion("XK_SDR_SWDJ is null");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjIsNotNull() {
            addCriterion("XK_SDR_SWDJ is not null");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjEqualTo(String value) {
            addCriterion("XK_SDR_SWDJ =", value, "xkSdrSwdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjNotEqualTo(String value) {
            addCriterion("XK_SDR_SWDJ <>", value, "xkSdrSwdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjGreaterThan(String value) {
            addCriterion("XK_SDR_SWDJ >", value, "xkSdrSwdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjGreaterThanOrEqualTo(String value) {
            addCriterion("XK_SDR_SWDJ >=", value, "xkSdrSwdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjLessThan(String value) {
            addCriterion("XK_SDR_SWDJ <", value, "xkSdrSwdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjLessThanOrEqualTo(String value) {
            addCriterion("XK_SDR_SWDJ <=", value, "xkSdrSwdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjLike(String value) {
            addCriterion("XK_SDR_SWDJ like", value, "xkSdrSwdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjNotLike(String value) {
            addCriterion("XK_SDR_SWDJ not like", value, "xkSdrSwdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjIn(List<String> values) {
            addCriterion("XK_SDR_SWDJ in", values, "xkSdrSwdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjNotIn(List<String> values) {
            addCriterion("XK_SDR_SWDJ not in", values, "xkSdrSwdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjBetween(String value1, String value2) {
            addCriterion("XK_SDR_SWDJ between", value1, value2, "xkSdrSwdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSwdjNotBetween(String value1, String value2) {
            addCriterion("XK_SDR_SWDJ not between", value1, value2, "xkSdrSwdj");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzIsNull() {
            addCriterion("XK_SDR_SFZ is null");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzIsNotNull() {
            addCriterion("XK_SDR_SFZ is not null");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzEqualTo(String value) {
            addCriterion("XK_SDR_SFZ =", value, "xkSdrSfz");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzNotEqualTo(String value) {
            addCriterion("XK_SDR_SFZ <>", value, "xkSdrSfz");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzGreaterThan(String value) {
            addCriterion("XK_SDR_SFZ >", value, "xkSdrSfz");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzGreaterThanOrEqualTo(String value) {
            addCriterion("XK_SDR_SFZ >=", value, "xkSdrSfz");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzLessThan(String value) {
            addCriterion("XK_SDR_SFZ <", value, "xkSdrSfz");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzLessThanOrEqualTo(String value) {
            addCriterion("XK_SDR_SFZ <=", value, "xkSdrSfz");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzLike(String value) {
            addCriterion("XK_SDR_SFZ like", value, "xkSdrSfz");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzNotLike(String value) {
            addCriterion("XK_SDR_SFZ not like", value, "xkSdrSfz");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzIn(List<String> values) {
            addCriterion("XK_SDR_SFZ in", values, "xkSdrSfz");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzNotIn(List<String> values) {
            addCriterion("XK_SDR_SFZ not in", values, "xkSdrSfz");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzBetween(String value1, String value2) {
            addCriterion("XK_SDR_SFZ between", value1, value2, "xkSdrSfz");
            return (Criteria) this;
        }

        public Criteria andXkSdrSfzNotBetween(String value1, String value2) {
            addCriterion("XK_SDR_SFZ not between", value1, value2, "xkSdrSfz");
            return (Criteria) this;
        }

        public Criteria andXkFrIsNull() {
            addCriterion("XK_FR is null");
            return (Criteria) this;
        }

        public Criteria andXkFrIsNotNull() {
            addCriterion("XK_FR is not null");
            return (Criteria) this;
        }

        public Criteria andXkFrEqualTo(String value) {
            addCriterion("XK_FR =", value, "xkFr");
            return (Criteria) this;
        }

        public Criteria andXkFrNotEqualTo(String value) {
            addCriterion("XK_FR <>", value, "xkFr");
            return (Criteria) this;
        }

        public Criteria andXkFrGreaterThan(String value) {
            addCriterion("XK_FR >", value, "xkFr");
            return (Criteria) this;
        }

        public Criteria andXkFrGreaterThanOrEqualTo(String value) {
            addCriterion("XK_FR >=", value, "xkFr");
            return (Criteria) this;
        }

        public Criteria andXkFrLessThan(String value) {
            addCriterion("XK_FR <", value, "xkFr");
            return (Criteria) this;
        }

        public Criteria andXkFrLessThanOrEqualTo(String value) {
            addCriterion("XK_FR <=", value, "xkFr");
            return (Criteria) this;
        }

        public Criteria andXkFrLike(String value) {
            addCriterion("XK_FR like", value, "xkFr");
            return (Criteria) this;
        }

        public Criteria andXkFrNotLike(String value) {
            addCriterion("XK_FR not like", value, "xkFr");
            return (Criteria) this;
        }

        public Criteria andXkFrIn(List<String> values) {
            addCriterion("XK_FR in", values, "xkFr");
            return (Criteria) this;
        }

        public Criteria andXkFrNotIn(List<String> values) {
            addCriterion("XK_FR not in", values, "xkFr");
            return (Criteria) this;
        }

        public Criteria andXkFrBetween(String value1, String value2) {
            addCriterion("XK_FR between", value1, value2, "xkFr");
            return (Criteria) this;
        }

        public Criteria andXkFrNotBetween(String value1, String value2) {
            addCriterion("XK_FR not between", value1, value2, "xkFr");
            return (Criteria) this;
        }

        public Criteria andXkJdrqIsNull() {
            addCriterion("XK_JDRQ is null");
            return (Criteria) this;
        }

        public Criteria andXkJdrqIsNotNull() {
            addCriterion("XK_JDRQ is not null");
            return (Criteria) this;
        }

        public Criteria andXkJdrqEqualTo(String value) {
            addCriterion("XK_JDRQ =", value, "xkJdrq");
            return (Criteria) this;
        }

        public Criteria andXkJdrqNotEqualTo(String value) {
            addCriterion("XK_JDRQ <>", value, "xkJdrq");
            return (Criteria) this;
        }

        public Criteria andXkJdrqGreaterThan(String value) {
            addCriterion("XK_JDRQ >", value, "xkJdrq");
            return (Criteria) this;
        }

        public Criteria andXkJdrqGreaterThanOrEqualTo(String value) {
            addCriterion("XK_JDRQ >=", value, "xkJdrq");
            return (Criteria) this;
        }

        public Criteria andXkJdrqLessThan(String value) {
            addCriterion("XK_JDRQ <", value, "xkJdrq");
            return (Criteria) this;
        }

        public Criteria andXkJdrqLessThanOrEqualTo(String value) {
            addCriterion("XK_JDRQ <=", value, "xkJdrq");
            return (Criteria) this;
        }

        public Criteria andXkJdrqLike(String value) {
            addCriterion("XK_JDRQ like", value, "xkJdrq");
            return (Criteria) this;
        }

        public Criteria andXkJdrqNotLike(String value) {
            addCriterion("XK_JDRQ not like", value, "xkJdrq");
            return (Criteria) this;
        }

        public Criteria andXkJdrqIn(List<String> values) {
            addCriterion("XK_JDRQ in", values, "xkJdrq");
            return (Criteria) this;
        }

        public Criteria andXkJdrqNotIn(List<String> values) {
            addCriterion("XK_JDRQ not in", values, "xkJdrq");
            return (Criteria) this;
        }

        public Criteria andXkJdrqBetween(String value1, String value2) {
            addCriterion("XK_JDRQ between", value1, value2, "xkJdrq");
            return (Criteria) this;
        }

        public Criteria andXkJdrqNotBetween(String value1, String value2) {
            addCriterion("XK_JDRQ not between", value1, value2, "xkJdrq");
            return (Criteria) this;
        }

        public Criteria andXkJzrqIsNull() {
            addCriterion("XK_JZRQ is null");
            return (Criteria) this;
        }

        public Criteria andXkJzrqIsNotNull() {
            addCriterion("XK_JZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andXkJzrqEqualTo(String value) {
            addCriterion("XK_JZRQ =", value, "xkJzrq");
            return (Criteria) this;
        }

        public Criteria andXkJzrqNotEqualTo(String value) {
            addCriterion("XK_JZRQ <>", value, "xkJzrq");
            return (Criteria) this;
        }

        public Criteria andXkJzrqGreaterThan(String value) {
            addCriterion("XK_JZRQ >", value, "xkJzrq");
            return (Criteria) this;
        }

        public Criteria andXkJzrqGreaterThanOrEqualTo(String value) {
            addCriterion("XK_JZRQ >=", value, "xkJzrq");
            return (Criteria) this;
        }

        public Criteria andXkJzrqLessThan(String value) {
            addCriterion("XK_JZRQ <", value, "xkJzrq");
            return (Criteria) this;
        }

        public Criteria andXkJzrqLessThanOrEqualTo(String value) {
            addCriterion("XK_JZRQ <=", value, "xkJzrq");
            return (Criteria) this;
        }

        public Criteria andXkJzrqLike(String value) {
            addCriterion("XK_JZRQ like", value, "xkJzrq");
            return (Criteria) this;
        }

        public Criteria andXkJzrqNotLike(String value) {
            addCriterion("XK_JZRQ not like", value, "xkJzrq");
            return (Criteria) this;
        }

        public Criteria andXkJzrqIn(List<String> values) {
            addCriterion("XK_JZRQ in", values, "xkJzrq");
            return (Criteria) this;
        }

        public Criteria andXkJzrqNotIn(List<String> values) {
            addCriterion("XK_JZRQ not in", values, "xkJzrq");
            return (Criteria) this;
        }

        public Criteria andXkJzrqBetween(String value1, String value2) {
            addCriterion("XK_JZRQ between", value1, value2, "xkJzrq");
            return (Criteria) this;
        }

        public Criteria andXkJzrqNotBetween(String value1, String value2) {
            addCriterion("XK_JZRQ not between", value1, value2, "xkJzrq");
            return (Criteria) this;
        }

        public Criteria andXkJgIsNull() {
            addCriterion("XK_JG is null");
            return (Criteria) this;
        }

        public Criteria andXkJgIsNotNull() {
            addCriterion("XK_JG is not null");
            return (Criteria) this;
        }

        public Criteria andXkJgEqualTo(String value) {
            addCriterion("XK_JG =", value, "xkJg");
            return (Criteria) this;
        }

        public Criteria andXkJgNotEqualTo(String value) {
            addCriterion("XK_JG <>", value, "xkJg");
            return (Criteria) this;
        }

        public Criteria andXkJgGreaterThan(String value) {
            addCriterion("XK_JG >", value, "xkJg");
            return (Criteria) this;
        }

        public Criteria andXkJgGreaterThanOrEqualTo(String value) {
            addCriterion("XK_JG >=", value, "xkJg");
            return (Criteria) this;
        }

        public Criteria andXkJgLessThan(String value) {
            addCriterion("XK_JG <", value, "xkJg");
            return (Criteria) this;
        }

        public Criteria andXkJgLessThanOrEqualTo(String value) {
            addCriterion("XK_JG <=", value, "xkJg");
            return (Criteria) this;
        }

        public Criteria andXkJgLike(String value) {
            addCriterion("XK_JG like", value, "xkJg");
            return (Criteria) this;
        }

        public Criteria andXkJgNotLike(String value) {
            addCriterion("XK_JG not like", value, "xkJg");
            return (Criteria) this;
        }

        public Criteria andXkJgIn(List<String> values) {
            addCriterion("XK_JG in", values, "xkJg");
            return (Criteria) this;
        }

        public Criteria andXkJgNotIn(List<String> values) {
            addCriterion("XK_JG not in", values, "xkJg");
            return (Criteria) this;
        }

        public Criteria andXkJgBetween(String value1, String value2) {
            addCriterion("XK_JG between", value1, value2, "xkJg");
            return (Criteria) this;
        }

        public Criteria andXkJgNotBetween(String value1, String value2) {
            addCriterion("XK_JG not between", value1, value2, "xkJg");
            return (Criteria) this;
        }

        public Criteria andXkDqztIsNull() {
            addCriterion("XK_DQZT is null");
            return (Criteria) this;
        }

        public Criteria andXkDqztIsNotNull() {
            addCriterion("XK_DQZT is not null");
            return (Criteria) this;
        }

        public Criteria andXkDqztEqualTo(String value) {
            addCriterion("XK_DQZT =", value, "xkDqzt");
            return (Criteria) this;
        }

        public Criteria andXkDqztNotEqualTo(String value) {
            addCriterion("XK_DQZT <>", value, "xkDqzt");
            return (Criteria) this;
        }

        public Criteria andXkDqztGreaterThan(String value) {
            addCriterion("XK_DQZT >", value, "xkDqzt");
            return (Criteria) this;
        }

        public Criteria andXkDqztGreaterThanOrEqualTo(String value) {
            addCriterion("XK_DQZT >=", value, "xkDqzt");
            return (Criteria) this;
        }

        public Criteria andXkDqztLessThan(String value) {
            addCriterion("XK_DQZT <", value, "xkDqzt");
            return (Criteria) this;
        }

        public Criteria andXkDqztLessThanOrEqualTo(String value) {
            addCriterion("XK_DQZT <=", value, "xkDqzt");
            return (Criteria) this;
        }

        public Criteria andXkDqztLike(String value) {
            addCriterion("XK_DQZT like", value, "xkDqzt");
            return (Criteria) this;
        }

        public Criteria andXkDqztNotLike(String value) {
            addCriterion("XK_DQZT not like", value, "xkDqzt");
            return (Criteria) this;
        }

        public Criteria andXkDqztIn(List<String> values) {
            addCriterion("XK_DQZT in", values, "xkDqzt");
            return (Criteria) this;
        }

        public Criteria andXkDqztNotIn(List<String> values) {
            addCriterion("XK_DQZT not in", values, "xkDqzt");
            return (Criteria) this;
        }

        public Criteria andXkDqztBetween(String value1, String value2) {
            addCriterion("XK_DQZT between", value1, value2, "xkDqzt");
            return (Criteria) this;
        }

        public Criteria andXkDqztNotBetween(String value1, String value2) {
            addCriterion("XK_DQZT not between", value1, value2, "xkDqzt");
            return (Criteria) this;
        }

        public Criteria andDfbmIsNull() {
            addCriterion("DFBM is null");
            return (Criteria) this;
        }

        public Criteria andDfbmIsNotNull() {
            addCriterion("DFBM is not null");
            return (Criteria) this;
        }

        public Criteria andDfbmEqualTo(String value) {
            addCriterion("DFBM =", value, "dfbm");
            return (Criteria) this;
        }

        public Criteria andDfbmNotEqualTo(String value) {
            addCriterion("DFBM <>", value, "dfbm");
            return (Criteria) this;
        }

        public Criteria andDfbmGreaterThan(String value) {
            addCriterion("DFBM >", value, "dfbm");
            return (Criteria) this;
        }

        public Criteria andDfbmGreaterThanOrEqualTo(String value) {
            addCriterion("DFBM >=", value, "dfbm");
            return (Criteria) this;
        }

        public Criteria andDfbmLessThan(String value) {
            addCriterion("DFBM <", value, "dfbm");
            return (Criteria) this;
        }

        public Criteria andDfbmLessThanOrEqualTo(String value) {
            addCriterion("DFBM <=", value, "dfbm");
            return (Criteria) this;
        }

        public Criteria andDfbmLike(String value) {
            addCriterion("DFBM like", value, "dfbm");
            return (Criteria) this;
        }

        public Criteria andDfbmNotLike(String value) {
            addCriterion("DFBM not like", value, "dfbm");
            return (Criteria) this;
        }

        public Criteria andDfbmIn(List<String> values) {
            addCriterion("DFBM in", values, "dfbm");
            return (Criteria) this;
        }

        public Criteria andDfbmNotIn(List<String> values) {
            addCriterion("DFBM not in", values, "dfbm");
            return (Criteria) this;
        }

        public Criteria andDfbmBetween(String value1, String value2) {
            addCriterion("DFBM between", value1, value2, "dfbm");
            return (Criteria) this;
        }

        public Criteria andDfbmNotBetween(String value1, String value2) {
            addCriterion("DFBM not between", value1, value2, "dfbm");
            return (Criteria) this;
        }

        public Criteria andFbsjIsNull() {
            addCriterion("FBSJ is null");
            return (Criteria) this;
        }

        public Criteria andFbsjIsNotNull() {
            addCriterion("FBSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFbsjEqualTo(String value) {
            addCriterion("FBSJ =", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjNotEqualTo(String value) {
            addCriterion("FBSJ <>", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjGreaterThan(String value) {
            addCriterion("FBSJ >", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjGreaterThanOrEqualTo(String value) {
            addCriterion("FBSJ >=", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjLessThan(String value) {
            addCriterion("FBSJ <", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjLessThanOrEqualTo(String value) {
            addCriterion("FBSJ <=", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjLike(String value) {
            addCriterion("FBSJ like", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjNotLike(String value) {
            addCriterion("FBSJ not like", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjIn(List<String> values) {
            addCriterion("FBSJ in", values, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjNotIn(List<String> values) {
            addCriterion("FBSJ not in", values, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjBetween(String value1, String value2) {
            addCriterion("FBSJ between", value1, value2, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjNotBetween(String value1, String value2) {
            addCriterion("FBSJ not between", value1, value2, "fbsj");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andDwidIsNull() {
            addCriterion("DWID is null");
            return (Criteria) this;
        }

        public Criteria andDwidIsNotNull() {
            addCriterion("DWID is not null");
            return (Criteria) this;
        }

        public Criteria andDwidEqualTo(String value) {
            addCriterion("DWID =", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidNotEqualTo(String value) {
            addCriterion("DWID <>", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidGreaterThan(String value) {
            addCriterion("DWID >", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidGreaterThanOrEqualTo(String value) {
            addCriterion("DWID >=", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidLessThan(String value) {
            addCriterion("DWID <", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidLessThanOrEqualTo(String value) {
            addCriterion("DWID <=", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidLike(String value) {
            addCriterion("DWID like", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidNotLike(String value) {
            addCriterion("DWID not like", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidIn(List<String> values) {
            addCriterion("DWID in", values, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidNotIn(List<String> values) {
            addCriterion("DWID not in", values, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidBetween(String value1, String value2) {
            addCriterion("DWID between", value1, value2, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidNotBetween(String value1, String value2) {
            addCriterion("DWID not between", value1, value2, "dwid");
            return (Criteria) this;
        }

        public Criteria andCmsIdIsNull() {
            addCriterion("CMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmsIdIsNotNull() {
            addCriterion("CMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmsIdEqualTo(String value) {
            addCriterion("CMS_ID =", value, "cmsId");
            return (Criteria) this;
        }

        public Criteria andCmsIdNotEqualTo(String value) {
            addCriterion("CMS_ID <>", value, "cmsId");
            return (Criteria) this;
        }

        public Criteria andCmsIdGreaterThan(String value) {
            addCriterion("CMS_ID >", value, "cmsId");
            return (Criteria) this;
        }

        public Criteria andCmsIdGreaterThanOrEqualTo(String value) {
            addCriterion("CMS_ID >=", value, "cmsId");
            return (Criteria) this;
        }

        public Criteria andCmsIdLessThan(String value) {
            addCriterion("CMS_ID <", value, "cmsId");
            return (Criteria) this;
        }

        public Criteria andCmsIdLessThanOrEqualTo(String value) {
            addCriterion("CMS_ID <=", value, "cmsId");
            return (Criteria) this;
        }

        public Criteria andCmsIdLike(String value) {
            addCriterion("CMS_ID like", value, "cmsId");
            return (Criteria) this;
        }

        public Criteria andCmsIdNotLike(String value) {
            addCriterion("CMS_ID not like", value, "cmsId");
            return (Criteria) this;
        }

        public Criteria andCmsIdIn(List<String> values) {
            addCriterion("CMS_ID in", values, "cmsId");
            return (Criteria) this;
        }

        public Criteria andCmsIdNotIn(List<String> values) {
            addCriterion("CMS_ID not in", values, "cmsId");
            return (Criteria) this;
        }

        public Criteria andCmsIdBetween(String value1, String value2) {
            addCriterion("CMS_ID between", value1, value2, "cmsId");
            return (Criteria) this;
        }

        public Criteria andCmsIdNotBetween(String value1, String value2) {
            addCriterion("CMS_ID not between", value1, value2, "cmsId");
            return (Criteria) this;
        }

        public Criteria andCmsFbztIsNull() {
            addCriterion("CMS_FBZT is null");
            return (Criteria) this;
        }

        public Criteria andCmsFbztIsNotNull() {
            addCriterion("CMS_FBZT is not null");
            return (Criteria) this;
        }

        public Criteria andCmsFbztEqualTo(String value) {
            addCriterion("CMS_FBZT =", value, "cmsFbzt");
            return (Criteria) this;
        }

        public Criteria andCmsFbztNotEqualTo(String value) {
            addCriterion("CMS_FBZT <>", value, "cmsFbzt");
            return (Criteria) this;
        }

        public Criteria andCmsFbztGreaterThan(String value) {
            addCriterion("CMS_FBZT >", value, "cmsFbzt");
            return (Criteria) this;
        }

        public Criteria andCmsFbztGreaterThanOrEqualTo(String value) {
            addCriterion("CMS_FBZT >=", value, "cmsFbzt");
            return (Criteria) this;
        }

        public Criteria andCmsFbztLessThan(String value) {
            addCriterion("CMS_FBZT <", value, "cmsFbzt");
            return (Criteria) this;
        }

        public Criteria andCmsFbztLessThanOrEqualTo(String value) {
            addCriterion("CMS_FBZT <=", value, "cmsFbzt");
            return (Criteria) this;
        }

        public Criteria andCmsFbztLike(String value) {
            addCriterion("CMS_FBZT like", value, "cmsFbzt");
            return (Criteria) this;
        }

        public Criteria andCmsFbztNotLike(String value) {
            addCriterion("CMS_FBZT not like", value, "cmsFbzt");
            return (Criteria) this;
        }

        public Criteria andCmsFbztIn(List<String> values) {
            addCriterion("CMS_FBZT in", values, "cmsFbzt");
            return (Criteria) this;
        }

        public Criteria andCmsFbztNotIn(List<String> values) {
            addCriterion("CMS_FBZT not in", values, "cmsFbzt");
            return (Criteria) this;
        }

        public Criteria andCmsFbztBetween(String value1, String value2) {
            addCriterion("CMS_FBZT between", value1, value2, "cmsFbzt");
            return (Criteria) this;
        }

        public Criteria andCmsFbztNotBetween(String value1, String value2) {
            addCriterion("CMS_FBZT not between", value1, value2, "cmsFbzt");
            return (Criteria) this;
        }

        public Criteria andXkNrIsNull() {
            addCriterion("XK_NR is null");
            return (Criteria) this;
        }

        public Criteria andXkNrIsNotNull() {
            addCriterion("XK_NR is not null");
            return (Criteria) this;
        }

        public Criteria andXkNrEqualTo(String value) {
            addCriterion("XK_NR =", value, "xkNr");
            return (Criteria) this;
        }

        public Criteria andXkNrNotEqualTo(String value) {
            addCriterion("XK_NR <>", value, "xkNr");
            return (Criteria) this;
        }

        public Criteria andXkNrGreaterThan(String value) {
            addCriterion("XK_NR >", value, "xkNr");
            return (Criteria) this;
        }

        public Criteria andXkNrGreaterThanOrEqualTo(String value) {
            addCriterion("XK_NR >=", value, "xkNr");
            return (Criteria) this;
        }

        public Criteria andXkNrLessThan(String value) {
            addCriterion("XK_NR <", value, "xkNr");
            return (Criteria) this;
        }

        public Criteria andXkNrLessThanOrEqualTo(String value) {
            addCriterion("XK_NR <=", value, "xkNr");
            return (Criteria) this;
        }

        public Criteria andXkNrLike(String value) {
            addCriterion("XK_NR like", value, "xkNr");
            return (Criteria) this;
        }

        public Criteria andXkNrNotLike(String value) {
            addCriterion("XK_NR not like", value, "xkNr");
            return (Criteria) this;
        }

        public Criteria andXkNrIn(List<String> values) {
            addCriterion("XK_NR in", values, "xkNr");
            return (Criteria) this;
        }

        public Criteria andXkNrNotIn(List<String> values) {
            addCriterion("XK_NR not in", values, "xkNr");
            return (Criteria) this;
        }

        public Criteria andXkNrBetween(String value1, String value2) {
            addCriterion("XK_NR between", value1, value2, "xkNr");
            return (Criteria) this;
        }

        public Criteria andXkNrNotBetween(String value1, String value2) {
            addCriterion("XK_NR not between", value1, value2, "xkNr");
            return (Criteria) this;
        }

        public Criteria andSjgxsjIsNull() {
            addCriterion("SJGXSJ is null");
            return (Criteria) this;
        }

        public Criteria andSjgxsjIsNotNull() {
            addCriterion("SJGXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSjgxsjEqualTo(String value) {
            addCriterion("SJGXSJ =", value, "sjgxsj");
            return (Criteria) this;
        }

        public Criteria andSjgxsjNotEqualTo(String value) {
            addCriterion("SJGXSJ <>", value, "sjgxsj");
            return (Criteria) this;
        }

        public Criteria andSjgxsjGreaterThan(String value) {
            addCriterion("SJGXSJ >", value, "sjgxsj");
            return (Criteria) this;
        }

        public Criteria andSjgxsjGreaterThanOrEqualTo(String value) {
            addCriterion("SJGXSJ >=", value, "sjgxsj");
            return (Criteria) this;
        }

        public Criteria andSjgxsjLessThan(String value) {
            addCriterion("SJGXSJ <", value, "sjgxsj");
            return (Criteria) this;
        }

        public Criteria andSjgxsjLessThanOrEqualTo(String value) {
            addCriterion("SJGXSJ <=", value, "sjgxsj");
            return (Criteria) this;
        }

        public Criteria andSjgxsjLike(String value) {
            addCriterion("SJGXSJ like", value, "sjgxsj");
            return (Criteria) this;
        }

        public Criteria andSjgxsjNotLike(String value) {
            addCriterion("SJGXSJ not like", value, "sjgxsj");
            return (Criteria) this;
        }

        public Criteria andSjgxsjIn(List<String> values) {
            addCriterion("SJGXSJ in", values, "sjgxsj");
            return (Criteria) this;
        }

        public Criteria andSjgxsjNotIn(List<String> values) {
            addCriterion("SJGXSJ not in", values, "sjgxsj");
            return (Criteria) this;
        }

        public Criteria andSjgxsjBetween(String value1, String value2) {
            addCriterion("SJGXSJ between", value1, value2, "sjgxsj");
            return (Criteria) this;
        }

        public Criteria andSjgxsjNotBetween(String value1, String value2) {
            addCriterion("SJGXSJ not between", value1, value2, "sjgxsj");
            return (Criteria) this;
        }

        public Criteria andFjljIsNull() {
            addCriterion("FJLJ is null");
            return (Criteria) this;
        }

        public Criteria andFjljIsNotNull() {
            addCriterion("FJLJ is not null");
            return (Criteria) this;
        }

        public Criteria andFjljEqualTo(String value) {
            addCriterion("FJLJ =", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljNotEqualTo(String value) {
            addCriterion("FJLJ <>", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljGreaterThan(String value) {
            addCriterion("FJLJ >", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljGreaterThanOrEqualTo(String value) {
            addCriterion("FJLJ >=", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljLessThan(String value) {
            addCriterion("FJLJ <", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljLessThanOrEqualTo(String value) {
            addCriterion("FJLJ <=", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljLike(String value) {
            addCriterion("FJLJ like", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljNotLike(String value) {
            addCriterion("FJLJ not like", value, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljIn(List<String> values) {
            addCriterion("FJLJ in", values, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljNotIn(List<String> values) {
            addCriterion("FJLJ not in", values, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljBetween(String value1, String value2) {
            addCriterion("FJLJ between", value1, value2, "fjlj");
            return (Criteria) this;
        }

        public Criteria andFjljNotBetween(String value1, String value2) {
            addCriterion("FJLJ not between", value1, value2, "fjlj");
            return (Criteria) this;
        }

        public Criteria andGkfwIsNull() {
            addCriterion("GKFW is null");
            return (Criteria) this;
        }

        public Criteria andGkfwIsNotNull() {
            addCriterion("GKFW is not null");
            return (Criteria) this;
        }

        public Criteria andGkfwEqualTo(String value) {
            addCriterion("GKFW =", value, "gkfw");
            return (Criteria) this;
        }

        public Criteria andGkfwNotEqualTo(String value) {
            addCriterion("GKFW <>", value, "gkfw");
            return (Criteria) this;
        }

        public Criteria andGkfwGreaterThan(String value) {
            addCriterion("GKFW >", value, "gkfw");
            return (Criteria) this;
        }

        public Criteria andGkfwGreaterThanOrEqualTo(String value) {
            addCriterion("GKFW >=", value, "gkfw");
            return (Criteria) this;
        }

        public Criteria andGkfwLessThan(String value) {
            addCriterion("GKFW <", value, "gkfw");
            return (Criteria) this;
        }

        public Criteria andGkfwLessThanOrEqualTo(String value) {
            addCriterion("GKFW <=", value, "gkfw");
            return (Criteria) this;
        }

        public Criteria andGkfwLike(String value) {
            addCriterion("GKFW like", value, "gkfw");
            return (Criteria) this;
        }

        public Criteria andGkfwNotLike(String value) {
            addCriterion("GKFW not like", value, "gkfw");
            return (Criteria) this;
        }

        public Criteria andGkfwIn(List<String> values) {
            addCriterion("GKFW in", values, "gkfw");
            return (Criteria) this;
        }

        public Criteria andGkfwNotIn(List<String> values) {
            addCriterion("GKFW not in", values, "gkfw");
            return (Criteria) this;
        }

        public Criteria andGkfwBetween(String value1, String value2) {
            addCriterion("GKFW between", value1, value2, "gkfw");
            return (Criteria) this;
        }

        public Criteria andGkfwNotBetween(String value1, String value2) {
            addCriterion("GKFW not between", value1, value2, "gkfw");
            return (Criteria) this;
        }

        public Criteria andFbsj2IsNull() {
            addCriterion("FBSJ2 is null");
            return (Criteria) this;
        }

        public Criteria andFbsj2IsNotNull() {
            addCriterion("FBSJ2 is not null");
            return (Criteria) this;
        }

        public Criteria andFbsj2EqualTo(String value) {
            addCriterion("FBSJ2 =", value, "fbsj2");
            return (Criteria) this;
        }

        public Criteria andFbsj2NotEqualTo(String value) {
            addCriterion("FBSJ2 <>", value, "fbsj2");
            return (Criteria) this;
        }

        public Criteria andFbsj2GreaterThan(String value) {
            addCriterion("FBSJ2 >", value, "fbsj2");
            return (Criteria) this;
        }

        public Criteria andFbsj2GreaterThanOrEqualTo(String value) {
            addCriterion("FBSJ2 >=", value, "fbsj2");
            return (Criteria) this;
        }

        public Criteria andFbsj2LessThan(String value) {
            addCriterion("FBSJ2 <", value, "fbsj2");
            return (Criteria) this;
        }

        public Criteria andFbsj2LessThanOrEqualTo(String value) {
            addCriterion("FBSJ2 <=", value, "fbsj2");
            return (Criteria) this;
        }

        public Criteria andFbsj2Like(String value) {
            addCriterion("FBSJ2 like", value, "fbsj2");
            return (Criteria) this;
        }

        public Criteria andFbsj2NotLike(String value) {
            addCriterion("FBSJ2 not like", value, "fbsj2");
            return (Criteria) this;
        }

        public Criteria andFbsj2In(List<String> values) {
            addCriterion("FBSJ2 in", values, "fbsj2");
            return (Criteria) this;
        }

        public Criteria andFbsj2NotIn(List<String> values) {
            addCriterion("FBSJ2 not in", values, "fbsj2");
            return (Criteria) this;
        }

        public Criteria andFbsj2Between(String value1, String value2) {
            addCriterion("FBSJ2 between", value1, value2, "fbsj2");
            return (Criteria) this;
        }

        public Criteria andFbsj2NotBetween(String value1, String value2) {
            addCriterion("FBSJ2 not between", value1, value2, "fbsj2");
            return (Criteria) this;
        }

        public Criteria andDrbhIsNull() {
            addCriterion("DRBH is null");
            return (Criteria) this;
        }

        public Criteria andDrbhIsNotNull() {
            addCriterion("DRBH is not null");
            return (Criteria) this;
        }

        public Criteria andDrbhEqualTo(String value) {
            addCriterion("DRBH =", value, "drbh");
            return (Criteria) this;
        }

        public Criteria andDrbhNotEqualTo(String value) {
            addCriterion("DRBH <>", value, "drbh");
            return (Criteria) this;
        }

        public Criteria andDrbhGreaterThan(String value) {
            addCriterion("DRBH >", value, "drbh");
            return (Criteria) this;
        }

        public Criteria andDrbhGreaterThanOrEqualTo(String value) {
            addCriterion("DRBH >=", value, "drbh");
            return (Criteria) this;
        }

        public Criteria andDrbhLessThan(String value) {
            addCriterion("DRBH <", value, "drbh");
            return (Criteria) this;
        }

        public Criteria andDrbhLessThanOrEqualTo(String value) {
            addCriterion("DRBH <=", value, "drbh");
            return (Criteria) this;
        }

        public Criteria andDrbhLike(String value) {
            addCriterion("DRBH like", value, "drbh");
            return (Criteria) this;
        }

        public Criteria andDrbhNotLike(String value) {
            addCriterion("DRBH not like", value, "drbh");
            return (Criteria) this;
        }

        public Criteria andDrbhIn(List<String> values) {
            addCriterion("DRBH in", values, "drbh");
            return (Criteria) this;
        }

        public Criteria andDrbhNotIn(List<String> values) {
            addCriterion("DRBH not in", values, "drbh");
            return (Criteria) this;
        }

        public Criteria andDrbhBetween(String value1, String value2) {
            addCriterion("DRBH between", value1, value2, "drbh");
            return (Criteria) this;
        }

        public Criteria andDrbhNotBetween(String value1, String value2) {
            addCriterion("DRBH not between", value1, value2, "drbh");
            return (Criteria) this;
        }

        public Criteria andYhIdIsNull() {
            addCriterion("YH_ID is null");
            return (Criteria) this;
        }

        public Criteria andYhIdIsNotNull() {
            addCriterion("YH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andYhIdEqualTo(String value) {
            addCriterion("YH_ID =", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotEqualTo(String value) {
            addCriterion("YH_ID <>", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdGreaterThan(String value) {
            addCriterion("YH_ID >", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdGreaterThanOrEqualTo(String value) {
            addCriterion("YH_ID >=", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLessThan(String value) {
            addCriterion("YH_ID <", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLessThanOrEqualTo(String value) {
            addCriterion("YH_ID <=", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLike(String value) {
            addCriterion("YH_ID like", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotLike(String value) {
            addCriterion("YH_ID not like", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdIn(List<String> values) {
            addCriterion("YH_ID in", values, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotIn(List<String> values) {
            addCriterion("YH_ID not in", values, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdBetween(String value1, String value2) {
            addCriterion("YH_ID between", value1, value2, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotBetween(String value1, String value2) {
            addCriterion("YH_ID not between", value1, value2, "yhId");
            return (Criteria) this;
        }

        public Criteria andSkWshUkIsNull() {
            addCriterion("SK_WSH_UK is null");
            return (Criteria) this;
        }

        public Criteria andSkWshUkIsNotNull() {
            addCriterion("SK_WSH_UK is not null");
            return (Criteria) this;
        }

        public Criteria andSkWshUkEqualTo(String value) {
            addCriterion("SK_WSH_UK =", value, "skWshUk");
            return (Criteria) this;
        }

        public Criteria andSkWshUkNotEqualTo(String value) {
            addCriterion("SK_WSH_UK <>", value, "skWshUk");
            return (Criteria) this;
        }

        public Criteria andSkWshUkGreaterThan(String value) {
            addCriterion("SK_WSH_UK >", value, "skWshUk");
            return (Criteria) this;
        }

        public Criteria andSkWshUkGreaterThanOrEqualTo(String value) {
            addCriterion("SK_WSH_UK >=", value, "skWshUk");
            return (Criteria) this;
        }

        public Criteria andSkWshUkLessThan(String value) {
            addCriterion("SK_WSH_UK <", value, "skWshUk");
            return (Criteria) this;
        }

        public Criteria andSkWshUkLessThanOrEqualTo(String value) {
            addCriterion("SK_WSH_UK <=", value, "skWshUk");
            return (Criteria) this;
        }

        public Criteria andSkWshUkLike(String value) {
            addCriterion("SK_WSH_UK like", value, "skWshUk");
            return (Criteria) this;
        }

        public Criteria andSkWshUkNotLike(String value) {
            addCriterion("SK_WSH_UK not like", value, "skWshUk");
            return (Criteria) this;
        }

        public Criteria andSkWshUkIn(List<String> values) {
            addCriterion("SK_WSH_UK in", values, "skWshUk");
            return (Criteria) this;
        }

        public Criteria andSkWshUkNotIn(List<String> values) {
            addCriterion("SK_WSH_UK not in", values, "skWshUk");
            return (Criteria) this;
        }

        public Criteria andSkWshUkBetween(String value1, String value2) {
            addCriterion("SK_WSH_UK between", value1, value2, "skWshUk");
            return (Criteria) this;
        }

        public Criteria andSkWshUkNotBetween(String value1, String value2) {
            addCriterion("SK_WSH_UK not between", value1, value2, "skWshUk");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andIssuccIsNull() {
            addCriterion("ISSUCC is null");
            return (Criteria) this;
        }

        public Criteria andIssuccIsNotNull() {
            addCriterion("ISSUCC is not null");
            return (Criteria) this;
        }

        public Criteria andIssuccEqualTo(String value) {
            addCriterion("ISSUCC =", value, "issucc");
            return (Criteria) this;
        }

        public Criteria andIssuccNotEqualTo(String value) {
            addCriterion("ISSUCC <>", value, "issucc");
            return (Criteria) this;
        }

        public Criteria andIssuccGreaterThan(String value) {
            addCriterion("ISSUCC >", value, "issucc");
            return (Criteria) this;
        }

        public Criteria andIssuccGreaterThanOrEqualTo(String value) {
            addCriterion("ISSUCC >=", value, "issucc");
            return (Criteria) this;
        }

        public Criteria andIssuccLessThan(String value) {
            addCriterion("ISSUCC <", value, "issucc");
            return (Criteria) this;
        }

        public Criteria andIssuccLessThanOrEqualTo(String value) {
            addCriterion("ISSUCC <=", value, "issucc");
            return (Criteria) this;
        }

        public Criteria andIssuccLike(String value) {
            addCriterion("ISSUCC like", value, "issucc");
            return (Criteria) this;
        }

        public Criteria andIssuccNotLike(String value) {
            addCriterion("ISSUCC not like", value, "issucc");
            return (Criteria) this;
        }

        public Criteria andIssuccIn(List<String> values) {
            addCriterion("ISSUCC in", values, "issucc");
            return (Criteria) this;
        }

        public Criteria andIssuccNotIn(List<String> values) {
            addCriterion("ISSUCC not in", values, "issucc");
            return (Criteria) this;
        }

        public Criteria andIssuccBetween(String value1, String value2) {
            addCriterion("ISSUCC between", value1, value2, "issucc");
            return (Criteria) this;
        }

        public Criteria andIssuccNotBetween(String value1, String value2) {
            addCriterion("ISSUCC not between", value1, value2, "issucc");
            return (Criteria) this;
        }

        public Criteria andYdcsIsNull() {
            addCriterion("YDCS is null");
            return (Criteria) this;
        }

        public Criteria andYdcsIsNotNull() {
            addCriterion("YDCS is not null");
            return (Criteria) this;
        }

        public Criteria andYdcsEqualTo(String value) {
            addCriterion("YDCS =", value, "ydcs");
            return (Criteria) this;
        }

        public Criteria andYdcsNotEqualTo(String value) {
            addCriterion("YDCS <>", value, "ydcs");
            return (Criteria) this;
        }

        public Criteria andYdcsGreaterThan(String value) {
            addCriterion("YDCS >", value, "ydcs");
            return (Criteria) this;
        }

        public Criteria andYdcsGreaterThanOrEqualTo(String value) {
            addCriterion("YDCS >=", value, "ydcs");
            return (Criteria) this;
        }

        public Criteria andYdcsLessThan(String value) {
            addCriterion("YDCS <", value, "ydcs");
            return (Criteria) this;
        }

        public Criteria andYdcsLessThanOrEqualTo(String value) {
            addCriterion("YDCS <=", value, "ydcs");
            return (Criteria) this;
        }

        public Criteria andYdcsLike(String value) {
            addCriterion("YDCS like", value, "ydcs");
            return (Criteria) this;
        }

        public Criteria andYdcsNotLike(String value) {
            addCriterion("YDCS not like", value, "ydcs");
            return (Criteria) this;
        }

        public Criteria andYdcsIn(List<String> values) {
            addCriterion("YDCS in", values, "ydcs");
            return (Criteria) this;
        }

        public Criteria andYdcsNotIn(List<String> values) {
            addCriterion("YDCS not in", values, "ydcs");
            return (Criteria) this;
        }

        public Criteria andYdcsBetween(String value1, String value2) {
            addCriterion("YDCS between", value1, value2, "ydcs");
            return (Criteria) this;
        }

        public Criteria andYdcsNotBetween(String value1, String value2) {
            addCriterion("YDCS not between", value1, value2, "ydcs");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(String value) {
            addCriterion("addTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(String value) {
            addCriterion("addTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(String value) {
            addCriterion("addTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(String value) {
            addCriterion("addTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(String value) {
            addCriterion("addTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(String value) {
            addCriterion("addTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLike(String value) {
            addCriterion("addTime like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotLike(String value) {
            addCriterion("addTime not like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<String> values) {
            addCriterion("addTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<String> values) {
            addCriterion("addTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(String value1, String value2) {
            addCriterion("addTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(String value1, String value2) {
            addCriterion("addTime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andForsqzjidIsNull() {
            addCriterion("FORSQZJID is null");
            return (Criteria) this;
        }

        public Criteria andForsqzjidIsNotNull() {
            addCriterion("FORSQZJID is not null");
            return (Criteria) this;
        }

        public Criteria andForsqzjidEqualTo(String value) {
            addCriterion("FORSQZJID =", value, "forsqzjid");
            return (Criteria) this;
        }

        public Criteria andForsqzjidNotEqualTo(String value) {
            addCriterion("FORSQZJID <>", value, "forsqzjid");
            return (Criteria) this;
        }

        public Criteria andForsqzjidGreaterThan(String value) {
            addCriterion("FORSQZJID >", value, "forsqzjid");
            return (Criteria) this;
        }

        public Criteria andForsqzjidGreaterThanOrEqualTo(String value) {
            addCriterion("FORSQZJID >=", value, "forsqzjid");
            return (Criteria) this;
        }

        public Criteria andForsqzjidLessThan(String value) {
            addCriterion("FORSQZJID <", value, "forsqzjid");
            return (Criteria) this;
        }

        public Criteria andForsqzjidLessThanOrEqualTo(String value) {
            addCriterion("FORSQZJID <=", value, "forsqzjid");
            return (Criteria) this;
        }

        public Criteria andForsqzjidLike(String value) {
            addCriterion("FORSQZJID like", value, "forsqzjid");
            return (Criteria) this;
        }

        public Criteria andForsqzjidNotLike(String value) {
            addCriterion("FORSQZJID not like", value, "forsqzjid");
            return (Criteria) this;
        }

        public Criteria andForsqzjidIn(List<String> values) {
            addCriterion("FORSQZJID in", values, "forsqzjid");
            return (Criteria) this;
        }

        public Criteria andForsqzjidNotIn(List<String> values) {
            addCriterion("FORSQZJID not in", values, "forsqzjid");
            return (Criteria) this;
        }

        public Criteria andForsqzjidBetween(String value1, String value2) {
            addCriterion("FORSQZJID between", value1, value2, "forsqzjid");
            return (Criteria) this;
        }

        public Criteria andForsqzjidNotBetween(String value1, String value2) {
            addCriterion("FORSQZJID not between", value1, value2, "forsqzjid");
            return (Criteria) this;
        }

        public Criteria andIdkeyIsNull() {
            addCriterion("IDKEY is null");
            return (Criteria) this;
        }

        public Criteria andIdkeyIsNotNull() {
            addCriterion("IDKEY is not null");
            return (Criteria) this;
        }

        public Criteria andIdkeyEqualTo(String value) {
            addCriterion("IDKEY =", value, "idkey");
            return (Criteria) this;
        }

        public Criteria andIdkeyNotEqualTo(String value) {
            addCriterion("IDKEY <>", value, "idkey");
            return (Criteria) this;
        }

        public Criteria andIdkeyGreaterThan(String value) {
            addCriterion("IDKEY >", value, "idkey");
            return (Criteria) this;
        }

        public Criteria andIdkeyGreaterThanOrEqualTo(String value) {
            addCriterion("IDKEY >=", value, "idkey");
            return (Criteria) this;
        }

        public Criteria andIdkeyLessThan(String value) {
            addCriterion("IDKEY <", value, "idkey");
            return (Criteria) this;
        }

        public Criteria andIdkeyLessThanOrEqualTo(String value) {
            addCriterion("IDKEY <=", value, "idkey");
            return (Criteria) this;
        }

        public Criteria andIdkeyLike(String value) {
            addCriterion("IDKEY like", value, "idkey");
            return (Criteria) this;
        }

        public Criteria andIdkeyNotLike(String value) {
            addCriterion("IDKEY not like", value, "idkey");
            return (Criteria) this;
        }

        public Criteria andIdkeyIn(List<String> values) {
            addCriterion("IDKEY in", values, "idkey");
            return (Criteria) this;
        }

        public Criteria andIdkeyNotIn(List<String> values) {
            addCriterion("IDKEY not in", values, "idkey");
            return (Criteria) this;
        }

        public Criteria andIdkeyBetween(String value1, String value2) {
            addCriterion("IDKEY between", value1, value2, "idkey");
            return (Criteria) this;
        }

        public Criteria andIdkeyNotBetween(String value1, String value2) {
            addCriterion("IDKEY not between", value1, value2, "idkey");
            return (Criteria) this;
        }

        public Criteria andXkXkwsIsNull() {
            addCriterion("XK_XKWS is null");
            return (Criteria) this;
        }

        public Criteria andXkXkwsIsNotNull() {
            addCriterion("XK_XKWS is not null");
            return (Criteria) this;
        }

        public Criteria andXkXkwsEqualTo(String value) {
            addCriterion("XK_XKWS =", value, "xkXkws");
            return (Criteria) this;
        }

        public Criteria andXkXkwsNotEqualTo(String value) {
            addCriterion("XK_XKWS <>", value, "xkXkws");
            return (Criteria) this;
        }

        public Criteria andXkXkwsGreaterThan(String value) {
            addCriterion("XK_XKWS >", value, "xkXkws");
            return (Criteria) this;
        }

        public Criteria andXkXkwsGreaterThanOrEqualTo(String value) {
            addCriterion("XK_XKWS >=", value, "xkXkws");
            return (Criteria) this;
        }

        public Criteria andXkXkwsLessThan(String value) {
            addCriterion("XK_XKWS <", value, "xkXkws");
            return (Criteria) this;
        }

        public Criteria andXkXkwsLessThanOrEqualTo(String value) {
            addCriterion("XK_XKWS <=", value, "xkXkws");
            return (Criteria) this;
        }

        public Criteria andXkXkwsLike(String value) {
            addCriterion("XK_XKWS like", value, "xkXkws");
            return (Criteria) this;
        }

        public Criteria andXkXkwsNotLike(String value) {
            addCriterion("XK_XKWS not like", value, "xkXkws");
            return (Criteria) this;
        }

        public Criteria andXkXkwsIn(List<String> values) {
            addCriterion("XK_XKWS in", values, "xkXkws");
            return (Criteria) this;
        }

        public Criteria andXkXkwsNotIn(List<String> values) {
            addCriterion("XK_XKWS not in", values, "xkXkws");
            return (Criteria) this;
        }

        public Criteria andXkXkwsBetween(String value1, String value2) {
            addCriterion("XK_XKWS between", value1, value2, "xkXkws");
            return (Criteria) this;
        }

        public Criteria andXkXkwsNotBetween(String value1, String value2) {
            addCriterion("XK_XKWS not between", value1, value2, "xkXkws");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwIsNull() {
            addCriterion("XK_XDR_SYDW is null");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwIsNotNull() {
            addCriterion("XK_XDR_SYDW is not null");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwEqualTo(String value) {
            addCriterion("XK_XDR_SYDW =", value, "xkXdrSydw");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwNotEqualTo(String value) {
            addCriterion("XK_XDR_SYDW <>", value, "xkXdrSydw");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwGreaterThan(String value) {
            addCriterion("XK_XDR_SYDW >", value, "xkXdrSydw");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwGreaterThanOrEqualTo(String value) {
            addCriterion("XK_XDR_SYDW >=", value, "xkXdrSydw");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwLessThan(String value) {
            addCriterion("XK_XDR_SYDW <", value, "xkXdrSydw");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwLessThanOrEqualTo(String value) {
            addCriterion("XK_XDR_SYDW <=", value, "xkXdrSydw");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwLike(String value) {
            addCriterion("XK_XDR_SYDW like", value, "xkXdrSydw");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwNotLike(String value) {
            addCriterion("XK_XDR_SYDW not like", value, "xkXdrSydw");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwIn(List<String> values) {
            addCriterion("XK_XDR_SYDW in", values, "xkXdrSydw");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwNotIn(List<String> values) {
            addCriterion("XK_XDR_SYDW not in", values, "xkXdrSydw");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwBetween(String value1, String value2) {
            addCriterion("XK_XDR_SYDW between", value1, value2, "xkXdrSydw");
            return (Criteria) this;
        }

        public Criteria andXkXdrSydwNotBetween(String value1, String value2) {
            addCriterion("XK_XDR_SYDW not between", value1, value2, "xkXdrSydw");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzIsNull() {
            addCriterion("XK_XDR_SHZZ is null");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzIsNotNull() {
            addCriterion("XK_XDR_SHZZ is not null");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzEqualTo(String value) {
            addCriterion("XK_XDR_SHZZ =", value, "xkXdrShzz");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzNotEqualTo(String value) {
            addCriterion("XK_XDR_SHZZ <>", value, "xkXdrShzz");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzGreaterThan(String value) {
            addCriterion("XK_XDR_SHZZ >", value, "xkXdrShzz");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzGreaterThanOrEqualTo(String value) {
            addCriterion("XK_XDR_SHZZ >=", value, "xkXdrShzz");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzLessThan(String value) {
            addCriterion("XK_XDR_SHZZ <", value, "xkXdrShzz");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzLessThanOrEqualTo(String value) {
            addCriterion("XK_XDR_SHZZ <=", value, "xkXdrShzz");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzLike(String value) {
            addCriterion("XK_XDR_SHZZ like", value, "xkXdrShzz");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzNotLike(String value) {
            addCriterion("XK_XDR_SHZZ not like", value, "xkXdrShzz");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzIn(List<String> values) {
            addCriterion("XK_XDR_SHZZ in", values, "xkXdrShzz");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzNotIn(List<String> values) {
            addCriterion("XK_XDR_SHZZ not in", values, "xkXdrShzz");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzBetween(String value1, String value2) {
            addCriterion("XK_XDR_SHZZ between", value1, value2, "xkXdrShzz");
            return (Criteria) this;
        }

        public Criteria andXkXdrShzzNotBetween(String value1, String value2) {
            addCriterion("XK_XDR_SHZZ not between", value1, value2, "xkXdrShzz");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmIsNull() {
            addCriterion("XK_FR_ZJHM is null");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmIsNotNull() {
            addCriterion("XK_FR_ZJHM is not null");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmEqualTo(String value) {
            addCriterion("XK_FR_ZJHM =", value, "xkFrZjhm");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmNotEqualTo(String value) {
            addCriterion("XK_FR_ZJHM <>", value, "xkFrZjhm");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmGreaterThan(String value) {
            addCriterion("XK_FR_ZJHM >", value, "xkFrZjhm");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("XK_FR_ZJHM >=", value, "xkFrZjhm");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmLessThan(String value) {
            addCriterion("XK_FR_ZJHM <", value, "xkFrZjhm");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmLessThanOrEqualTo(String value) {
            addCriterion("XK_FR_ZJHM <=", value, "xkFrZjhm");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmLike(String value) {
            addCriterion("XK_FR_ZJHM like", value, "xkFrZjhm");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmNotLike(String value) {
            addCriterion("XK_FR_ZJHM not like", value, "xkFrZjhm");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmIn(List<String> values) {
            addCriterion("XK_FR_ZJHM in", values, "xkFrZjhm");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmNotIn(List<String> values) {
            addCriterion("XK_FR_ZJHM not in", values, "xkFrZjhm");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmBetween(String value1, String value2) {
            addCriterion("XK_FR_ZJHM between", value1, value2, "xkFrZjhm");
            return (Criteria) this;
        }

        public Criteria andXkFrZjhmNotBetween(String value1, String value2) {
            addCriterion("XK_FR_ZJHM not between", value1, value2, "xkFrZjhm");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxIsNull() {
            addCriterion("XK_XDR_ZJLX is null");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxIsNotNull() {
            addCriterion("XK_XDR_ZJLX is not null");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxEqualTo(String value) {
            addCriterion("XK_XDR_ZJLX =", value, "xkXdrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxNotEqualTo(String value) {
            addCriterion("XK_XDR_ZJLX <>", value, "xkXdrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxGreaterThan(String value) {
            addCriterion("XK_XDR_ZJLX >", value, "xkXdrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxGreaterThanOrEqualTo(String value) {
            addCriterion("XK_XDR_ZJLX >=", value, "xkXdrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxLessThan(String value) {
            addCriterion("XK_XDR_ZJLX <", value, "xkXdrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxLessThanOrEqualTo(String value) {
            addCriterion("XK_XDR_ZJLX <=", value, "xkXdrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxLike(String value) {
            addCriterion("XK_XDR_ZJLX like", value, "xkXdrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxNotLike(String value) {
            addCriterion("XK_XDR_ZJLX not like", value, "xkXdrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxIn(List<String> values) {
            addCriterion("XK_XDR_ZJLX in", values, "xkXdrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxNotIn(List<String> values) {
            addCriterion("XK_XDR_ZJLX not in", values, "xkXdrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxBetween(String value1, String value2) {
            addCriterion("XK_XDR_ZJLX between", value1, value2, "xkXdrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXdrZjlxNotBetween(String value1, String value2) {
            addCriterion("XK_XDR_ZJLX not between", value1, value2, "xkXdrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXkzsIsNull() {
            addCriterion("XK_XKZS is null");
            return (Criteria) this;
        }

        public Criteria andXkXkzsIsNotNull() {
            addCriterion("XK_XKZS is not null");
            return (Criteria) this;
        }

        public Criteria andXkXkzsEqualTo(String value) {
            addCriterion("XK_XKZS =", value, "xkXkzs");
            return (Criteria) this;
        }

        public Criteria andXkXkzsNotEqualTo(String value) {
            addCriterion("XK_XKZS <>", value, "xkXkzs");
            return (Criteria) this;
        }

        public Criteria andXkXkzsGreaterThan(String value) {
            addCriterion("XK_XKZS >", value, "xkXkzs");
            return (Criteria) this;
        }

        public Criteria andXkXkzsGreaterThanOrEqualTo(String value) {
            addCriterion("XK_XKZS >=", value, "xkXkzs");
            return (Criteria) this;
        }

        public Criteria andXkXkzsLessThan(String value) {
            addCriterion("XK_XKZS <", value, "xkXkzs");
            return (Criteria) this;
        }

        public Criteria andXkXkzsLessThanOrEqualTo(String value) {
            addCriterion("XK_XKZS <=", value, "xkXkzs");
            return (Criteria) this;
        }

        public Criteria andXkXkzsLike(String value) {
            addCriterion("XK_XKZS like", value, "xkXkzs");
            return (Criteria) this;
        }

        public Criteria andXkXkzsNotLike(String value) {
            addCriterion("XK_XKZS not like", value, "xkXkzs");
            return (Criteria) this;
        }

        public Criteria andXkXkzsIn(List<String> values) {
            addCriterion("XK_XKZS in", values, "xkXkzs");
            return (Criteria) this;
        }

        public Criteria andXkXkzsNotIn(List<String> values) {
            addCriterion("XK_XKZS not in", values, "xkXkzs");
            return (Criteria) this;
        }

        public Criteria andXkXkzsBetween(String value1, String value2) {
            addCriterion("XK_XKZS between", value1, value2, "xkXkzs");
            return (Criteria) this;
        }

        public Criteria andXkXkzsNotBetween(String value1, String value2) {
            addCriterion("XK_XKZS not between", value1, value2, "xkXkzs");
            return (Criteria) this;
        }

        public Criteria andXkXkbhIsNull() {
            addCriterion("XK_XKBH is null");
            return (Criteria) this;
        }

        public Criteria andXkXkbhIsNotNull() {
            addCriterion("XK_XKBH is not null");
            return (Criteria) this;
        }

        public Criteria andXkXkbhEqualTo(String value) {
            addCriterion("XK_XKBH =", value, "xkXkbh");
            return (Criteria) this;
        }

        public Criteria andXkXkbhNotEqualTo(String value) {
            addCriterion("XK_XKBH <>", value, "xkXkbh");
            return (Criteria) this;
        }

        public Criteria andXkXkbhGreaterThan(String value) {
            addCriterion("XK_XKBH >", value, "xkXkbh");
            return (Criteria) this;
        }

        public Criteria andXkXkbhGreaterThanOrEqualTo(String value) {
            addCriterion("XK_XKBH >=", value, "xkXkbh");
            return (Criteria) this;
        }

        public Criteria andXkXkbhLessThan(String value) {
            addCriterion("XK_XKBH <", value, "xkXkbh");
            return (Criteria) this;
        }

        public Criteria andXkXkbhLessThanOrEqualTo(String value) {
            addCriterion("XK_XKBH <=", value, "xkXkbh");
            return (Criteria) this;
        }

        public Criteria andXkXkbhLike(String value) {
            addCriterion("XK_XKBH like", value, "xkXkbh");
            return (Criteria) this;
        }

        public Criteria andXkXkbhNotLike(String value) {
            addCriterion("XK_XKBH not like", value, "xkXkbh");
            return (Criteria) this;
        }

        public Criteria andXkXkbhIn(List<String> values) {
            addCriterion("XK_XKBH in", values, "xkXkbh");
            return (Criteria) this;
        }

        public Criteria andXkXkbhNotIn(List<String> values) {
            addCriterion("XK_XKBH not in", values, "xkXkbh");
            return (Criteria) this;
        }

        public Criteria andXkXkbhBetween(String value1, String value2) {
            addCriterion("XK_XKBH between", value1, value2, "xkXkbh");
            return (Criteria) this;
        }

        public Criteria andXkXkbhNotBetween(String value1, String value2) {
            addCriterion("XK_XKBH not between", value1, value2, "xkXkbh");
            return (Criteria) this;
        }

        public Criteria andXkYxqzIsNull() {
            addCriterion("XK_YXQZ is null");
            return (Criteria) this;
        }

        public Criteria andXkYxqzIsNotNull() {
            addCriterion("XK_YXQZ is not null");
            return (Criteria) this;
        }

        public Criteria andXkYxqzEqualTo(String value) {
            addCriterion("XK_YXQZ =", value, "xkYxqz");
            return (Criteria) this;
        }

        public Criteria andXkYxqzNotEqualTo(String value) {
            addCriterion("XK_YXQZ <>", value, "xkYxqz");
            return (Criteria) this;
        }

        public Criteria andXkYxqzGreaterThan(String value) {
            addCriterion("XK_YXQZ >", value, "xkYxqz");
            return (Criteria) this;
        }

        public Criteria andXkYxqzGreaterThanOrEqualTo(String value) {
            addCriterion("XK_YXQZ >=", value, "xkYxqz");
            return (Criteria) this;
        }

        public Criteria andXkYxqzLessThan(String value) {
            addCriterion("XK_YXQZ <", value, "xkYxqz");
            return (Criteria) this;
        }

        public Criteria andXkYxqzLessThanOrEqualTo(String value) {
            addCriterion("XK_YXQZ <=", value, "xkYxqz");
            return (Criteria) this;
        }

        public Criteria andXkYxqzLike(String value) {
            addCriterion("XK_YXQZ like", value, "xkYxqz");
            return (Criteria) this;
        }

        public Criteria andXkYxqzNotLike(String value) {
            addCriterion("XK_YXQZ not like", value, "xkYxqz");
            return (Criteria) this;
        }

        public Criteria andXkYxqzIn(List<String> values) {
            addCriterion("XK_YXQZ in", values, "xkYxqz");
            return (Criteria) this;
        }

        public Criteria andXkYxqzNotIn(List<String> values) {
            addCriterion("XK_YXQZ not in", values, "xkYxqz");
            return (Criteria) this;
        }

        public Criteria andXkYxqzBetween(String value1, String value2) {
            addCriterion("XK_YXQZ between", value1, value2, "xkYxqz");
            return (Criteria) this;
        }

        public Criteria andXkYxqzNotBetween(String value1, String value2) {
            addCriterion("XK_YXQZ not between", value1, value2, "xkYxqz");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmIsNull() {
            addCriterion("XK_XKJGDM is null");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmIsNotNull() {
            addCriterion("XK_XKJGDM is not null");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmEqualTo(String value) {
            addCriterion("XK_XKJGDM =", value, "xkXkjgdm");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmNotEqualTo(String value) {
            addCriterion("XK_XKJGDM <>", value, "xkXkjgdm");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmGreaterThan(String value) {
            addCriterion("XK_XKJGDM >", value, "xkXkjgdm");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmGreaterThanOrEqualTo(String value) {
            addCriterion("XK_XKJGDM >=", value, "xkXkjgdm");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmLessThan(String value) {
            addCriterion("XK_XKJGDM <", value, "xkXkjgdm");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmLessThanOrEqualTo(String value) {
            addCriterion("XK_XKJGDM <=", value, "xkXkjgdm");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmLike(String value) {
            addCriterion("XK_XKJGDM like", value, "xkXkjgdm");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmNotLike(String value) {
            addCriterion("XK_XKJGDM not like", value, "xkXkjgdm");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmIn(List<String> values) {
            addCriterion("XK_XKJGDM in", values, "xkXkjgdm");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmNotIn(List<String> values) {
            addCriterion("XK_XKJGDM not in", values, "xkXkjgdm");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmBetween(String value1, String value2) {
            addCriterion("XK_XKJGDM between", value1, value2, "xkXkjgdm");
            return (Criteria) this;
        }

        public Criteria andXkXkjgdmNotBetween(String value1, String value2) {
            addCriterion("XK_XKJGDM not between", value1, value2, "xkXkjgdm");
            return (Criteria) this;
        }

        public Criteria andXkLydwIsNull() {
            addCriterion("XK_LYDW is null");
            return (Criteria) this;
        }

        public Criteria andXkLydwIsNotNull() {
            addCriterion("XK_LYDW is not null");
            return (Criteria) this;
        }

        public Criteria andXkLydwEqualTo(String value) {
            addCriterion("XK_LYDW =", value, "xkLydw");
            return (Criteria) this;
        }

        public Criteria andXkLydwNotEqualTo(String value) {
            addCriterion("XK_LYDW <>", value, "xkLydw");
            return (Criteria) this;
        }

        public Criteria andXkLydwGreaterThan(String value) {
            addCriterion("XK_LYDW >", value, "xkLydw");
            return (Criteria) this;
        }

        public Criteria andXkLydwGreaterThanOrEqualTo(String value) {
            addCriterion("XK_LYDW >=", value, "xkLydw");
            return (Criteria) this;
        }

        public Criteria andXkLydwLessThan(String value) {
            addCriterion("XK_LYDW <", value, "xkLydw");
            return (Criteria) this;
        }

        public Criteria andXkLydwLessThanOrEqualTo(String value) {
            addCriterion("XK_LYDW <=", value, "xkLydw");
            return (Criteria) this;
        }

        public Criteria andXkLydwLike(String value) {
            addCriterion("XK_LYDW like", value, "xkLydw");
            return (Criteria) this;
        }

        public Criteria andXkLydwNotLike(String value) {
            addCriterion("XK_LYDW not like", value, "xkLydw");
            return (Criteria) this;
        }

        public Criteria andXkLydwIn(List<String> values) {
            addCriterion("XK_LYDW in", values, "xkLydw");
            return (Criteria) this;
        }

        public Criteria andXkLydwNotIn(List<String> values) {
            addCriterion("XK_LYDW not in", values, "xkLydw");
            return (Criteria) this;
        }

        public Criteria andXkLydwBetween(String value1, String value2) {
            addCriterion("XK_LYDW between", value1, value2, "xkLydw");
            return (Criteria) this;
        }

        public Criteria andXkLydwNotBetween(String value1, String value2) {
            addCriterion("XK_LYDW not between", value1, value2, "xkLydw");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmIsNull() {
            addCriterion("XK_LYDWDM is null");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmIsNotNull() {
            addCriterion("XK_LYDWDM is not null");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmEqualTo(String value) {
            addCriterion("XK_LYDWDM =", value, "xkLydwdm");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmNotEqualTo(String value) {
            addCriterion("XK_LYDWDM <>", value, "xkLydwdm");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmGreaterThan(String value) {
            addCriterion("XK_LYDWDM >", value, "xkLydwdm");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmGreaterThanOrEqualTo(String value) {
            addCriterion("XK_LYDWDM >=", value, "xkLydwdm");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmLessThan(String value) {
            addCriterion("XK_LYDWDM <", value, "xkLydwdm");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmLessThanOrEqualTo(String value) {
            addCriterion("XK_LYDWDM <=", value, "xkLydwdm");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmLike(String value) {
            addCriterion("XK_LYDWDM like", value, "xkLydwdm");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmNotLike(String value) {
            addCriterion("XK_LYDWDM not like", value, "xkLydwdm");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmIn(List<String> values) {
            addCriterion("XK_LYDWDM in", values, "xkLydwdm");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmNotIn(List<String> values) {
            addCriterion("XK_LYDWDM not in", values, "xkLydwdm");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmBetween(String value1, String value2) {
            addCriterion("XK_LYDWDM between", value1, value2, "xkLydwdm");
            return (Criteria) this;
        }

        public Criteria andXkLydwdmNotBetween(String value1, String value2) {
            addCriterion("XK_LYDWDM not between", value1, value2, "xkLydwdm");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxIsNull() {
            addCriterion("XK_FR_ZJLX is null");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxIsNotNull() {
            addCriterion("XK_FR_ZJLX is not null");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxEqualTo(String value) {
            addCriterion("XK_FR_ZJLX =", value, "xkFrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxNotEqualTo(String value) {
            addCriterion("XK_FR_ZJLX <>", value, "xkFrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxGreaterThan(String value) {
            addCriterion("XK_FR_ZJLX >", value, "xkFrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxGreaterThanOrEqualTo(String value) {
            addCriterion("XK_FR_ZJLX >=", value, "xkFrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxLessThan(String value) {
            addCriterion("XK_FR_ZJLX <", value, "xkFrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxLessThanOrEqualTo(String value) {
            addCriterion("XK_FR_ZJLX <=", value, "xkFrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxLike(String value) {
            addCriterion("XK_FR_ZJLX like", value, "xkFrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxNotLike(String value) {
            addCriterion("XK_FR_ZJLX not like", value, "xkFrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxIn(List<String> values) {
            addCriterion("XK_FR_ZJLX in", values, "xkFrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxNotIn(List<String> values) {
            addCriterion("XK_FR_ZJLX not in", values, "xkFrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxBetween(String value1, String value2) {
            addCriterion("XK_FR_ZJLX between", value1, value2, "xkFrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkFrZjlxNotBetween(String value1, String value2) {
            addCriterion("XK_FR_ZJLX not between", value1, value2, "xkFrZjlx");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbIsNull() {
            addCriterion("XK_XDR_LB is null");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbIsNotNull() {
            addCriterion("XK_XDR_LB is not null");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbEqualTo(String value) {
            addCriterion("XK_XDR_LB =", value, "xkXdrLb");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbNotEqualTo(String value) {
            addCriterion("XK_XDR_LB <>", value, "xkXdrLb");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbGreaterThan(String value) {
            addCriterion("XK_XDR_LB >", value, "xkXdrLb");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbGreaterThanOrEqualTo(String value) {
            addCriterion("XK_XDR_LB >=", value, "xkXdrLb");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbLessThan(String value) {
            addCriterion("XK_XDR_LB <", value, "xkXdrLb");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbLessThanOrEqualTo(String value) {
            addCriterion("XK_XDR_LB <=", value, "xkXdrLb");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbLike(String value) {
            addCriterion("XK_XDR_LB like", value, "xkXdrLb");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbNotLike(String value) {
            addCriterion("XK_XDR_LB not like", value, "xkXdrLb");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbIn(List<String> values) {
            addCriterion("XK_XDR_LB in", values, "xkXdrLb");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbNotIn(List<String> values) {
            addCriterion("XK_XDR_LB not in", values, "xkXdrLb");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbBetween(String value1, String value2) {
            addCriterion("XK_XDR_LB between", value1, value2, "xkXdrLb");
            return (Criteria) this;
        }

        public Criteria andXkXdrLbNotBetween(String value1, String value2) {
            addCriterion("XK_XDR_LB not between", value1, value2, "xkXdrLb");
            return (Criteria) this;
        }
    }

    /**
     */
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