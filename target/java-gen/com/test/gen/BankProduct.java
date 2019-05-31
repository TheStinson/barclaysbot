
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
    "car_loan",
    "demat_services",
    "fixed_deposit",
    "home_loan",
    "personal_loan"
})
public class BankProduct {

    @JsonProperty("car_loan")
    private Boolean carLoan;
    @JsonProperty("demat_services")
    private Boolean dematServices;
    @JsonProperty("fixed_deposit")
    private Boolean fixedDeposit;
    @JsonProperty("home_loan")
    private Boolean homeLoan;
    @JsonProperty("personal_loan")
    private Boolean personalLoan;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("car_loan")
    public Boolean getCarLoan() {
        return carLoan;
    }

    @JsonProperty("car_loan")
    public void setCarLoan(Boolean carLoan) {
        this.carLoan = carLoan;
    }

    @JsonProperty("demat_services")
    public Boolean getDematServices() {
        return dematServices;
    }

    @JsonProperty("demat_services")
    public void setDematServices(Boolean dematServices) {
        this.dematServices = dematServices;
    }

    @JsonProperty("fixed_deposit")
    public Boolean getFixedDeposit() {
        return fixedDeposit;
    }

    @JsonProperty("fixed_deposit")
    public void setFixedDeposit(Boolean fixedDeposit) {
        this.fixedDeposit = fixedDeposit;
    }

    @JsonProperty("home_loan")
    public Boolean getHomeLoan() {
        return homeLoan;
    }

    @JsonProperty("home_loan")
    public void setHomeLoan(Boolean homeLoan) {
        this.homeLoan = homeLoan;
    }

    @JsonProperty("personal_loan")
    public Boolean getPersonalLoan() {
        return personalLoan;
    }

    @JsonProperty("personal_loan")
    public void setPersonalLoan(Boolean personalLoan) {
        this.personalLoan = personalLoan;
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
        return new HashCodeBuilder().append(carLoan).append(dematServices).append(fixedDeposit).append(homeLoan).append(personalLoan).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BankProduct) == false) {
            return false;
        }
        BankProduct rhs = ((BankProduct) other);
        return new EqualsBuilder().append(carLoan, rhs.carLoan).append(dematServices, rhs.dematServices).append(fixedDeposit, rhs.fixedDeposit).append(homeLoan, rhs.homeLoan).append(personalLoan, rhs.personalLoan).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
