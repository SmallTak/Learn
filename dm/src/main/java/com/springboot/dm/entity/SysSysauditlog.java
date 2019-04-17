package com.springboot.dm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_sysauditlog
 * @author 
 */
public class SysSysauditlog implements Serializable {
    private Integer userid;

    private String username;

    private Date sysdate;

    private String ip;

    private String handlename;

    private String handledetail;

    private String handleflag;

    private Integer flag;

    private String alias;

    private String code;

    private String memo;

    private Integer btype;

    private String dataid;

    private String bcolumnid;

    private Date outdate;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getSysdate() {
        return sysdate;
    }

    public void setSysdate(Date sysdate) {
        this.sysdate = sysdate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHandlename() {
        return handlename;
    }

    public void setHandlename(String handlename) {
        this.handlename = handlename;
    }

    public String getHandledetail() {
        return handledetail;
    }

    public void setHandledetail(String handledetail) {
        this.handledetail = handledetail;
    }

    public String getHandleflag() {
        return handleflag;
    }

    public void setHandleflag(String handleflag) {
        this.handleflag = handleflag;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getBtype() {
        return btype;
    }

    public void setBtype(Integer btype) {
        this.btype = btype;
    }

    public String getDataid() {
        return dataid;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid;
    }

    public String getBcolumnid() {
        return bcolumnid;
    }

    public void setBcolumnid(String bcolumnid) {
        this.bcolumnid = bcolumnid;
    }

    public Date getOutdate() {
        return outdate;
    }

    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysSysauditlog other = (SysSysauditlog) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getSysdate() == null ? other.getSysdate() == null : this.getSysdate().equals(other.getSysdate()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getHandlename() == null ? other.getHandlename() == null : this.getHandlename().equals(other.getHandlename()))
            && (this.getHandledetail() == null ? other.getHandledetail() == null : this.getHandledetail().equals(other.getHandledetail()))
            && (this.getHandleflag() == null ? other.getHandleflag() == null : this.getHandleflag().equals(other.getHandleflag()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getBtype() == null ? other.getBtype() == null : this.getBtype().equals(other.getBtype()))
            && (this.getDataid() == null ? other.getDataid() == null : this.getDataid().equals(other.getDataid()))
            && (this.getBcolumnid() == null ? other.getBcolumnid() == null : this.getBcolumnid().equals(other.getBcolumnid()))
            && (this.getOutdate() == null ? other.getOutdate() == null : this.getOutdate().equals(other.getOutdate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getSysdate() == null) ? 0 : getSysdate().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getHandlename() == null) ? 0 : getHandlename().hashCode());
        result = prime * result + ((getHandledetail() == null) ? 0 : getHandledetail().hashCode());
        result = prime * result + ((getHandleflag() == null) ? 0 : getHandleflag().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getBtype() == null) ? 0 : getBtype().hashCode());
        result = prime * result + ((getDataid() == null) ? 0 : getDataid().hashCode());
        result = prime * result + ((getBcolumnid() == null) ? 0 : getBcolumnid().hashCode());
        result = prime * result + ((getOutdate() == null) ? 0 : getOutdate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", sysdate=").append(sysdate);
        sb.append(", ip=").append(ip);
        sb.append(", handlename=").append(handlename);
        sb.append(", handledetail=").append(handledetail);
        sb.append(", handleflag=").append(handleflag);
        sb.append(", flag=").append(flag);
        sb.append(", alias=").append(alias);
        sb.append(", code=").append(code);
        sb.append(", memo=").append(memo);
        sb.append(", btype=").append(btype);
        sb.append(", dataid=").append(dataid);
        sb.append(", bcolumnid=").append(bcolumnid);
        sb.append(", outdate=").append(outdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}