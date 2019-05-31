
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
    "id",
    "page"
})
public class Datum {

    /**
     * The Id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String id = "";
    @JsonProperty("page")
    private Page page;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * The Id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("page")
    public Page getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Page page) {
        this.page = page;
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
        return new HashCodeBuilder().append(id).append(page).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum) == false) {
            return false;
        }
        Datum rhs = ((Datum) other);
        return new EqualsBuilder().append(id, rhs.id).append(page, rhs.page).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
