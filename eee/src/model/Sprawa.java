package model;

import java.math.BigDecimal;
import java.util.Date;

public class Sprawa {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.SPRAWA.LAWSUIT_ID
     *
     * @mbg.generated
     */
    private Integer lawsuitId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.SPRAWA.COURTROOM_ID
     *
     * @mbg.generated
     */
    private BigDecimal courtroomId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.SPRAWA.LAWSUIT_START_DATE
     *
     * @mbg.generated
     */
    private Date lawsuitStartDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.SPRAWA.LAWSUIT_END_DATE
     *
     * @mbg.generated
     */
    private Date lawsuitEndDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.SPRAWA.PROKURATOR_CARD_ID
     *
     * @mbg.generated
     */
    private BigDecimal prokuratorCardId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.SPRAWA.SEDZIA_CARD_ID
     *
     * @mbg.generated
     */
    private BigDecimal sedziaCardId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.SPRAWA.LAWSUIT_ID
     *
     * @return the value of INF132340.SPRAWA.LAWSUIT_ID
     *
     * @mbg.generated
     */
    public Integer getLawsuitId() {
        return lawsuitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.SPRAWA.LAWSUIT_ID
     *
     * @param lawsuitId the value for INF132340.SPRAWA.LAWSUIT_ID
     *
     * @mbg.generated
     */
    public void setLawsuitId(Integer lawsuitId) {
        this.lawsuitId = lawsuitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.SPRAWA.COURTROOM_ID
     *
     * @return the value of INF132340.SPRAWA.COURTROOM_ID
     *
     * @mbg.generated
     */
    public BigDecimal getCourtroomId() {
        return courtroomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.SPRAWA.COURTROOM_ID
     *
     * @param courtroomId the value for INF132340.SPRAWA.COURTROOM_ID
     *
     * @mbg.generated
     */
    public void setCourtroomId(BigDecimal courtroomId) {
        this.courtroomId = courtroomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.SPRAWA.LAWSUIT_START_DATE
     *
     * @return the value of INF132340.SPRAWA.LAWSUIT_START_DATE
     *
     * @mbg.generated
     */
    public Date getLawsuitStartDate() {
        return lawsuitStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.SPRAWA.LAWSUIT_START_DATE
     *
     * @param lawsuitStartDate the value for INF132340.SPRAWA.LAWSUIT_START_DATE
     *
     * @mbg.generated
     */
    public void setLawsuitStartDate(Date lawsuitStartDate) {
        this.lawsuitStartDate = lawsuitStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.SPRAWA.LAWSUIT_END_DATE
     *
     * @return the value of INF132340.SPRAWA.LAWSUIT_END_DATE
     *
     * @mbg.generated
     */
    public Date getLawsuitEndDate() {
        return lawsuitEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.SPRAWA.LAWSUIT_END_DATE
     *
     * @param lawsuitEndDate the value for INF132340.SPRAWA.LAWSUIT_END_DATE
     *
     * @mbg.generated
     */
    public void setLawsuitEndDate(Date lawsuitEndDate) {
        this.lawsuitEndDate = lawsuitEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.SPRAWA.PROKURATOR_CARD_ID
     *
     * @return the value of INF132340.SPRAWA.PROKURATOR_CARD_ID
     *
     * @mbg.generated
     */
    public BigDecimal getProkuratorCardId() {
        return prokuratorCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.SPRAWA.PROKURATOR_CARD_ID
     *
     * @param prokuratorCardId the value for INF132340.SPRAWA.PROKURATOR_CARD_ID
     *
     * @mbg.generated
     */
    public void setProkuratorCardId(BigDecimal prokuratorCardId) {
        this.prokuratorCardId = prokuratorCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.SPRAWA.SEDZIA_CARD_ID
     *
     * @return the value of INF132340.SPRAWA.SEDZIA_CARD_ID
     *
     * @mbg.generated
     */
    public BigDecimal getSedziaCardId() {
        return sedziaCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.SPRAWA.SEDZIA_CARD_ID
     *
     * @param sedziaCardId the value for INF132340.SPRAWA.SEDZIA_CARD_ID
     *
     * @mbg.generated
     */
    public void setSedziaCardId(BigDecimal sedziaCardId) {
        this.sedziaCardId = sedziaCardId;
    }
}