package model;

import java.math.BigDecimal;

public class Swiadek {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.SWIADEK.WITNESS_ID
     *
     * @mbg.generated
     */
    private Integer witnessId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.SWIADEK.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.SWIADEK.SURNAME
     *
     * @mbg.generated
     */
    private String surname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.SWIADEK.PROFESSION
     *
     * @mbg.generated
     */
    private String profession;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.SWIADEK.LAWSUIT_ID
     *
     * @mbg.generated
     */
    private BigDecimal lawsuitId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.SWIADEK.WITNESS_ID
     *
     * @return the value of INF132340.SWIADEK.WITNESS_ID
     *
     * @mbg.generated
     */
    public Integer getWitnessId() {
        return witnessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.SWIADEK.WITNESS_ID
     *
     * @param witnessId the value for INF132340.SWIADEK.WITNESS_ID
     *
     * @mbg.generated
     */
    public void setWitnessId(Integer witnessId) {
        this.witnessId = witnessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.SWIADEK.NAME
     *
     * @return the value of INF132340.SWIADEK.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.SWIADEK.NAME
     *
     * @param name the value for INF132340.SWIADEK.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.SWIADEK.SURNAME
     *
     * @return the value of INF132340.SWIADEK.SURNAME
     *
     * @mbg.generated
     */
    public String getSurname() {
        return surname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.SWIADEK.SURNAME
     *
     * @param surname the value for INF132340.SWIADEK.SURNAME
     *
     * @mbg.generated
     */
    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.SWIADEK.PROFESSION
     *
     * @return the value of INF132340.SWIADEK.PROFESSION
     *
     * @mbg.generated
     */
    public String getProfession() {
        return profession;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.SWIADEK.PROFESSION
     *
     * @param profession the value for INF132340.SWIADEK.PROFESSION
     *
     * @mbg.generated
     */
    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.SWIADEK.LAWSUIT_ID
     *
     * @return the value of INF132340.SWIADEK.LAWSUIT_ID
     *
     * @mbg.generated
     */
    public BigDecimal getLawsuitId() {
        return lawsuitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.SWIADEK.LAWSUIT_ID
     *
     * @param lawsuitId the value for INF132340.SWIADEK.LAWSUIT_ID
     *
     * @mbg.generated
     */
    public void setLawsuitId(BigDecimal lawsuitId) {
        this.lawsuitId = lawsuitId;
    }
}