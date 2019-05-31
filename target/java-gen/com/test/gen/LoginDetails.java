
package com.test.gen;

import java.util.HashMap;
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
    "accountId",
    "account_balance",
    "email",
    "first_name",
    "last_name",
    "offer",
    "status"
})
public class LoginDetails {

    @JsonProperty("ASID")
    private Double aSID;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("account_balance")
    private Double accountBalance;
    @JsonProperty("email")
    private String email;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("offer")
    private Object offer;
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ASID")
    public Double getASID() {
        return aSID;
    }

    @JsonProperty("ASID")
    public void setASID(Double aSID) {
        this.aSID = aSID;
    }

    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("account_balance")
    public Double getAccountBalance() {
        return accountBalance;
    }

    @JsonProperty("account_balance")
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("offer")
    public Object getOffer() {
        return offer;
    }

    @JsonProperty("offer")
    public void setOffer(Object offer) {
        this.offer = offer;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
        return new HashCodeBuilder().append(aSID).append(accountId).append(accountBalance).append(email).append(firstName).append(lastName).append(offer).append(status).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoginDetails) == false) {
            return false;
        }
        LoginDetails rhs = ((LoginDetails) other);
        return new EqualsBuilder().append(aSID, rhs.aSID).append(accountId, rhs.accountId).append(accountBalance, rhs.accountBalance).append(email, rhs.email).append(firstName, rhs.firstName).append(lastName, rhs.lastName).append(offer, rhs.offer).append(status, rhs.status).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
