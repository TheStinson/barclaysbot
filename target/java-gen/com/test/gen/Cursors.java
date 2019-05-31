
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
    "before",
    "after"
})
public class Cursors {

    /**
     * The Before Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("before")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String before = "";
    /**
     * The After Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("after")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String after = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Before Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("before")
    public String getBefore() {
        return before;
    }

    /**
     * The Before Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("before")
    public void setBefore(String before) {
        this.before = before;
    }

    /**
     * The After Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("after")
    public String getAfter() {
        return after;
    }

    /**
     * The After Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("after")
    public void setAfter(String after) {
        this.after = after;
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
        return new HashCodeBuilder().append(before).append(after).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cursors) == false) {
            return false;
        }
        Cursors rhs = ((Cursors) other);
        return new EqualsBuilder().append(before, rhs.before).append(after, rhs.after).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
