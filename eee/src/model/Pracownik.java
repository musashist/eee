package model;

public class Pracownik {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.PRACOWNIK.CARD_ID
     *
     * @mbg.generated
     */
    private Integer cardId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.PRACOWNIK.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.PRACOWNIK.SURNAME
     *
     * @mbg.generated
     */
    private String surname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INF132340.PRACOWNIK.ROLE
     *
     * @mbg.generated
     */
    private String role;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.PRACOWNIK.CARD_ID
     *
     * @return the value of INF132340.PRACOWNIK.CARD_ID
     *
     * @mbg.generated
     */
    public Integer getCardId() {
        return cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.PRACOWNIK.CARD_ID
     *
     * @param cardId the value for INF132340.PRACOWNIK.CARD_ID
     *
     * @mbg.generated
     */
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.PRACOWNIK.NAME
     *
     * @return the value of INF132340.PRACOWNIK.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.PRACOWNIK.NAME
     *
     * @param name the value for INF132340.PRACOWNIK.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.PRACOWNIK.SURNAME
     *
     * @return the value of INF132340.PRACOWNIK.SURNAME
     *
     * @mbg.generated
     */
    public String getSurname() {
        return surname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.PRACOWNIK.SURNAME
     *
     * @param surname the value for INF132340.PRACOWNIK.SURNAME
     *
     * @mbg.generated
     */
    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INF132340.PRACOWNIK.ROLE
     *
     * @return the value of INF132340.PRACOWNIK.ROLE
     *
     * @mbg.generated
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INF132340.PRACOWNIK.ROLE
     *
     * @param role the value for INF132340.PRACOWNIK.ROLE
     *
     * @mbg.generated
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}