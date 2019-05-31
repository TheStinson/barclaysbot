
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
    "name",
    "id"
})
public class Page {

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
     * The Id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Object id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * The Id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * The Id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
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
        return new HashCodeBuilder().append(name).append(id).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Page) == false) {
            return false;
        }
        Page rhs = ((Page) other);
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
