package cn.htjovi.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by 13041 on 2018/2/1.
 */
@Entity
@Table(name = "card", schema = "public", catalog = "LCIndustry3")
public class CardEntity {
    private BigDecimal length;
    private String remark;
    private Timestamp timeofopencard;
    private BigDecimal weight;
    private BigDecimal reallength;
    private BigDecimal realweight;
    private Integer status;
    private long cardid;
    private Integer colourstatus;
    private Timestamp timeoffillfabric;

    @Basic
    @Column(name = "length", nullable = true, precision = 0)
    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = -1)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "timeofopencard", nullable = true)
    public Timestamp getTimeofopencard() {
        return timeofopencard;
    }

    public void setTimeofopencard(Timestamp timeofopencard) {
        this.timeofopencard = timeofopencard;
    }

    @Basic
    @Column(name = "weight", nullable = true, precision = 0)
    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "reallength", nullable = true, precision = 0)
    public BigDecimal getReallength() {
        return reallength;
    }

    public void setReallength(BigDecimal reallength) {
        this.reallength = reallength;
    }

    @Basic
    @Column(name = "realweight", nullable = true, precision = 0)
    public BigDecimal getRealweight() {
        return realweight;
    }

    public void setRealweight(BigDecimal realweight) {
        this.realweight = realweight;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Id
    @GeneratedValue
    @Column(name = "cardid", nullable = false)
    public long getCardid() {
        return cardid;
    }

    public void setCardid(long cardid) {
        this.cardid = cardid;
    }

    @Basic
    @Column(name = "colourstatus", nullable = true)
    public Integer getColourstatus() {
        return colourstatus;
    }

    public void setColourstatus(Integer colourstatus) {
        this.colourstatus = colourstatus;
    }

    @Basic
    @Column(name = "timeoffillfabric", nullable = true)
    public Timestamp getTimeoffillfabric() {
        return timeoffillfabric;
    }

    public void setTimeoffillfabric(Timestamp timeoffillfabric) {
        this.timeoffillfabric = timeoffillfabric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CardEntity that = (CardEntity) o;

        if (cardid != that.cardid) return false;
        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (timeofopencard != null ? !timeofopencard.equals(that.timeofopencard) : that.timeofopencard != null)
            return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (reallength != null ? !reallength.equals(that.reallength) : that.reallength != null) return false;
        if (realweight != null ? !realweight.equals(that.realweight) : that.realweight != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (colourstatus != null ? !colourstatus.equals(that.colourstatus) : that.colourstatus != null) return false;
        if (timeoffillfabric != null ? !timeoffillfabric.equals(that.timeoffillfabric) : that.timeoffillfabric != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = length != null ? length.hashCode() : 0;
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (timeofopencard != null ? timeofopencard.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (reallength != null ? reallength.hashCode() : 0);
        result = 31 * result + (realweight != null ? realweight.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (int) (cardid ^ (cardid >>> 32));
        result = 31 * result + (colourstatus != null ? colourstatus.hashCode() : 0);
        result = 31 * result + (timeoffillfabric != null ? timeoffillfabric.hashCode() : 0);
        return result;
    }
}
