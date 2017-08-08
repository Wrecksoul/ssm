package com.taiji.basicDBService.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PopuBasic {
    private BigDecimal cardId;

    private BigDecimal idType;

    private String idNum;

    private BigDecimal familyId;

    private BigDecimal relationship;

    private String pname;

    private String oldname;

    private String sex;

    private Date birthday;

    private String nation;

    private String education;

    private String country;

    private BigDecimal hight;

    private String bloodtype;

    private String birthnum;

    private String birthplace;

    private String birthedit;

    private String birthdetail;

    private String pdegree;

    private String comunitee;

    private String riligion;

    private Date deaddate;

    private String deadnum;

    private String marry;

    public BigDecimal getCardId() {
        return cardId;
    }

    public void setCardId(BigDecimal cardId) {
        this.cardId = cardId;
    }

    public BigDecimal getIdType() {
        return idType;
    }

    public void setIdType(BigDecimal idType) {
        this.idType = idType;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
    }

    public BigDecimal getFamilyId() {
        return familyId;
    }

    public void setFamilyId(BigDecimal familyId) {
        this.familyId = familyId;
    }

    public BigDecimal getRelationship() {
        return relationship;
    }

    public void setRelationship(BigDecimal relationship) {
        this.relationship = relationship;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getOldname() {
        return oldname;
    }

    public void setOldname(String oldname) {
        this.oldname = oldname == null ? null : oldname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public BigDecimal getHight() {
        return hight;
    }

    public void setHight(BigDecimal hight) {
        this.hight = hight;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype == null ? null : bloodtype.trim();
    }

    public String getBirthnum() {
        return birthnum;
    }

    public void setBirthnum(String birthnum) {
        this.birthnum = birthnum == null ? null : birthnum.trim();
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }

    public String getBirthedit() {
        return birthedit;
    }

    public void setBirthedit(String birthedit) {
        this.birthedit = birthedit == null ? null : birthedit.trim();
    }

    public String getBirthdetail() {
        return birthdetail;
    }

    public void setBirthdetail(String birthdetail) {
        this.birthdetail = birthdetail == null ? null : birthdetail.trim();
    }

    public String getPdegree() {
        return pdegree;
    }

    public void setPdegree(String pdegree) {
        this.pdegree = pdegree == null ? null : pdegree.trim();
    }

    public String getComunitee() {
        return comunitee;
    }

    public void setComunitee(String comunitee) {
        this.comunitee = comunitee == null ? null : comunitee.trim();
    }

    public String getRiligion() {
        return riligion;
    }

    public void setRiligion(String riligion) {
        this.riligion = riligion == null ? null : riligion.trim();
    }

    public Date getDeaddate() {
        return deaddate;
    }

    public void setDeaddate(Date deaddate) {
        this.deaddate = deaddate;
    }

    public String getDeadnum() {
        return deadnum;
    }

    public void setDeadnum(String deadnum) {
        this.deadnum = deadnum == null ? null : deadnum.trim();
    }

    public String getMarry() {
        return marry;
    }

    public void setMarry(String marry) {
        this.marry = marry == null ? null : marry.trim();
    }
}