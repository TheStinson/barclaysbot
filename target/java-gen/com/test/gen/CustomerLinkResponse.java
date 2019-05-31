
package com.test.gen;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "error",
    "id_user",
    "name",
    "email",
    "fb_id",
    "customer_id",
    "secure_pin"
})
public class CustomerLinkResponse {

    /**
     * The error Schema.
     * <p>
     * True if customer not linked.
     * 
     */
    @JsonProperty("error")
    @JsonPropertyDescription("True if customer not linked.")
    private Boolean error = false;
    /**
     * The Id_user Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("id_user")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String idUser = "";
    /**
     * The Name Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String name = "";
    /**
     * The Email Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String email = "";
    /**
     * The Fb_id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("fb_id")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String fbId = "";
    /**
     * The Customer_id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("customer_id")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String customerId = "";
    /**
     * The Secure_pin Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("secure_pin")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String securePin = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The error Schema.
     * <p>
     * True if customer not linked.
     * 
     */
    @JsonProperty("error")
    public Boolean getError() {
        return error;
    }

    /**
     * The error Schema.
     * <p>
     * True if customer not linked.
     * 
     */
    @JsonProperty("error")
    public void setError(Boolean error) {
        this.error = error;
    }

    /**
     * The Id_user Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("id_user")
    public String getIdUser() {
        return idUser;
    }

    /**
     * The Id_user Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("id_user")
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    /**
     * The Name Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The Name Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The Email Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * The Email Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The Fb_id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("fb_id")
    public String getFbId() {
        return fbId;
    }

    /**
     * The Fb_id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("fb_id")
    public void setFbId(String fbId) {
        this.fbId = fbId;
    }

    /**
     * The Customer_id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    /**
     * The Customer_id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * The Secure_pin Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("secure_pin")
    public String getSecurePin() {
        return securePin;
    }

    /**
     * The Secure_pin Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("secure_pin")
    public void setSecurePin(String securePin) {
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
        return new HashCodeBuilder().append(error).append(idUser).append(name).append(email).append(fbId).append(customerId).append(securePin).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomerLinkResponse) == false) {
            return false;
        }
        CustomerLinkResponse rhs = ((CustomerLinkResponse) other);
        return new EqualsBuilder().append(error, rhs.error).append(idUser, rhs.idUser).append(name, rhs.name).append(email, rhs.email).append(fbId, rhs.fbId).append(customerId, rhs.customerId).append(securePin, rhs.securePin).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
