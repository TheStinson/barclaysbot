
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
    "category",
    "discount",
    "fees",
    "offer_id"
})
public class OfferDetails {

    @JsonProperty("category")
    private String category;
    @JsonProperty("discount")
    private String discount;
    @JsonProperty("fees")
    private String fees;
    @JsonProperty("offer_id")
    private Double offerId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("discount")
    public String getDiscount() {
        return discount;
    }

    @JsonProperty("discount")
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @JsonProperty("fees")
    public String getFees() {
        return fees;
    }

    @JsonProperty("fees")
    public void setFees(String fees) {
        this.fees = fees;
    }

    @JsonProperty("offer_id")
    public Double getOfferId() {
        return offerId;
    }

    @JsonProperty("offer_id")
    public void setOfferId(Double offerId) {
        this.offerId = offerId;
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
        return new HashCodeBuilder().append(category).append(discount).append(fees).append(offerId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OfferDetails) == false) {
            return false;
        }
        OfferDetails rhs = ((OfferDetails) other);
        return new EqualsBuilder().append(category, rhs.category).append(discount, rhs.discount).append(fees, rhs.fees).append(offerId, rhs.offerId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
