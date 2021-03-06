package com.rosegun.plugin.sample.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Profit implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit.id
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit.date
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit.profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    private BigDecimal profit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profit.created_date
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    private Date createdDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit.id
     *
     * @return the value of profit.id
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    public Profit withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit.id
     *
     * @param id the value for profit.id
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit.date
     *
     * @return the value of profit.date
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    public Profit withDate(Date date) {
        this.setDate(date);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit.date
     *
     * @param date the value for profit.date
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit.profit
     *
     * @return the value of profit.profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    public BigDecimal getProfit() {
        return profit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    public Profit withProfit(BigDecimal profit) {
        this.setProfit(profit);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit.profit
     *
     * @param profit the value for profit.profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profit.created_date
     *
     * @return the value of profit.created_date
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    public Profit withCreatedDate(Date createdDate) {
        this.setCreatedDate(createdDate);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profit.created_date
     *
     * @param createdDate the value for profit.created_date
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", profit=").append(profit);
        sb.append(", createdDate=").append(createdDate);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
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
        Profit other = (Profit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()))
            && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        result = prime * result + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return result;
    }
}