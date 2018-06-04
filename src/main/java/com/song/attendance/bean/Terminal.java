package com.song.attendance.bean;

import java.io.Serializable;
import java.util.Date;

public class Terminal implements Serializable {
    private Integer id;

    private String terminalMac;

    private Byte isControl;

    private String socketOn;

    private Integer userId;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTerminalMac() {
        return terminalMac;
    }

    public void setTerminalMac(String terminalMac) {
        this.terminalMac = terminalMac == null ? null : terminalMac.trim();
    }

    public Byte getIsControl() {
        return isControl;
    }

    public void setIsControl(Byte isControl) {
        this.isControl = isControl;
    }

    public String getSocketOn() {
        return socketOn;
    }

    public void setSocketOn(String socketOn) {
        this.socketOn = socketOn == null ? null : socketOn.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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
        Terminal other = (Terminal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTerminalMac() == null ? other.getTerminalMac() == null : this.getTerminalMac().equals(other.getTerminalMac()))
            && (this.getIsControl() == null ? other.getIsControl() == null : this.getIsControl().equals(other.getIsControl()))
            && (this.getSocketOn() == null ? other.getSocketOn() == null : this.getSocketOn().equals(other.getSocketOn()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTerminalMac() == null) ? 0 : getTerminalMac().hashCode());
        result = prime * result + ((getIsControl() == null) ? 0 : getIsControl().hashCode());
        result = prime * result + ((getSocketOn() == null) ? 0 : getSocketOn().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}