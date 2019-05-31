
package com.test.gen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ASID",
    "_id",
    "account_balance",
    "apr",
    "bank_product",
    "branch",
    "charges_category",
    "credit_score",
    "email",
    "fees",
    "first_name",
    "gender",
    "last_name",
    "password",
    "phone",
    "secure_pin"
})
public class AccountDetails {

    @JsonProperty("ASID")
    private String aSID;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("account_balance")
    private Double accountBalance;
    @JsonProperty("apr")
    private Double apr;
    @JsonProperty("bank_product")
    private List<BankProduct> bankProduct = new ArrayList<BankProduct>();
    @JsonProperty("branch")
    private Branch branch;
    @JsonProperty("charges_category")
    private List<ChargesCategory> chargesCategory = new ArrayList<ChargesCategory>();
    @JsonProperty("credit_score")
    private Double creditScore;
    @JsonProperty("email")
    private String email;
    @JsonProperty("fees")
    private Double fees;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("secure_pin")
    private Double securePin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ASID")
    public String getASID() {
        return aSID;
    }

    @JsonProperty("ASID")
    public void setASID(String aSID) {
        this.aSID = aSID;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("account_balance")
    public Double getAccountBalance() {
        return accountBalance;
    }

    @JsonProperty("account_balance")
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @JsonProperty("apr")
    public Double getApr() {
        return apr;
    }

    @JsonProperty("apr")
    public void setApr(Double apr) {
        this.apr = apr;
    }

    @JsonProperty("bank_product")
    public List<BankProduct> getBankProduct() {
        return bankProduct;
    }

    @JsonProperty("bank_product")
    public void setBankProduct(List<BankProduct> bankProduct) {
        this.bankProduct = bankProduct;
    }

    @JsonProperty("branch")
    public Branch getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @JsonProperty("charges_category")
    public List<ChargesCategory> getChargesCategory() {
        return chargesCategory;
    }

    @JsonProperty("charges_category")
    public void setChargesCategory(List<ChargesCategory> chargesCategory) {
        this.chargesCategory = chargesCategory;
    }

    @JsonProperty("credit_score")
    public Double getCreditScore() {
        return creditScore;
    }

    @JsonProperty("credit_score")
    public void setCreditScore(Double creditScore) {
        this.creditScore = creditScore;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("fees")
    public Double getFees() {
        return fees;
    }

    @JsonProperty("fees")
    public void setFees(Double fees) {
        this.fees = fees;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("secure_pin")
    public Double getSecurePin() {
        return securePin;
    }

    @JsonProperty("secure_pin")
    public void setSecurePin(Double securePin) {
        this.securePin = securePin;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aSID).append(id).append(accountBalance).append(apr).append(bankProduct).append(branch).append(chargesCategory).append(creditScore).append(email).append(fees).append(firstName).append(gender).append(lastName).append(password).append(phone).append(securePin).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetails) == false) {
            return false;
        }
        AccountDetails rhs = ((AccountDetails) other);
        return new EqualsBuilder().append(aSID, rhs.aSID).append(id, rhs.id).append(accountBalance, rhs.accountBalance).append(apr, rhs.apr).append(bankProduct, rhs.bankProduct).append(branch, rhs.branch).append(chargesCategory, rhs.chargesCategory).append(creditScore, rhs.creditScore).append(email, rhs.email).append(fees, rhs.fees).append(firstName, rhs.firstName).append(gender, rhs.gender).append(lastName, rhs.lastName).append(password, rhs.password).append(phone, rhs.phone).append(securePin, rhs.securePin).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
