package com.hjkj.hyjc.model.admin;

// default package
// Generated 2016-8-19 22:18:42 by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

/**
 * EfDictionaryProperty generated by hbm2java
 */
@Entity
@Table(name = "T_SYS_DICTIONARY_PROPERTY")
public class SysDictionaryProperty implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String dicProId;
    private int version;
    private String dicProCode;
    private String dicProTitle;
    private String dicId;
    private String memo;
    private String mark;
    private String maker;
    private Date maketime;
    private String updater;
    private Date updatetime;
    private SysDictionary dictionary;

    /**
     * 比较方法
     * 
     * @param p
     * @return
     */
    public boolean equals(Object p) {
        SysDictionaryProperty property = (SysDictionaryProperty) p;
        if (this == property) {
            return true;
        }
        if (this.dicProId.equals(property.getDicProId())) {
            return true;
        } else {
            return false;
        }

    }

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    @Column(name = "dic_pro_id", unique = true, nullable = false)
    public String getDicProId() {
        return this.dicProId;
    }

    public void setDicProId(String dicProId) {
        this.dicProId = dicProId;
    }

    @Version
    @Column(name = "version", nullable = false)
    public int getVersion() {
        return this.version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Column(name = "dic_pro_code", nullable = false, length = 100)
    public String getDicProCode() {
        return this.dicProCode;
    }

    public void setDicProCode(String dicProCode) {
        this.dicProCode = dicProCode;
    }

    @Column(name = "dic_pro_title", nullable = false, length = 100)
    public String getDicProTitle() {
        return this.dicProTitle;
    }

    public void setDicProTitle(String dicProTitle) {
        this.dicProTitle = dicProTitle;
    }

    @Column(name = "dic_id")
    public String getDicId() {
        return this.dicId;
    }

    public void setDicId(String dicId) {
        this.dicId = dicId;
    }

    @Column(name = "memo", length = 500)
    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Column(name = "mark", nullable = false, length = 1)
    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Column(name = "maker", nullable = false, length = 50)
    public String getMaker() {
        return this.maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "maketime", nullable = false, length = 19)
    public Date getMaketime() {
        return this.maketime;
    }

    public void setMaketime(Date maketime) {
        this.maketime = maketime;
    }

    @Column(name = "updater", nullable = false, length = 50)
    public String getUpdater() {
        return this.updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updatetime", nullable = false, length = 19)
    public Date getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dic_id", updatable = false, insertable = false)
    public SysDictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(SysDictionary dictionary) {
        this.dictionary = dictionary;
    }

}
