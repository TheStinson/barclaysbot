
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
    "transaction_amount",
    "transaction_date",
    "transaction_id"
})
public class Transaction {

    @JsonProperty("category")
    private String category;
    @JsonProperty("transaction_amount")
    private Double transactionAmount;
    @JsonProperty("transaction_date")
    private String transactionDate;
    @JsonProperty("transaction_id")
    private String transactionId;
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

    @JsonProperty("transaction_amount")
    public Double getTransactionAmount() {
        return transactionAmount;
    }

    @JsonProperty("transaction_amount")
    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @JsonProperty("transaction_date")
    public String getTransactionDate() {
        return transactionDate;
    }

    @JsonProperty("transaction_date")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    @JsonProperty("transaction_id")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transaction_id")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
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
        return new HashCodeBuilder().append(category).append(transactionAmount).append(transactionDate).append(transactionId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transaction) == false) {
            return false;
        }
        Transaction rhs = ((Transaction) other);
        return new EqualsBuilder().append(category, rhs.category).append(transactionAmount, rhs.transactionAmount).append(transactionDate, rhs.transactionDate).append(transactionId, rhs.transactionId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
