
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
    "clothes",
    "electronics",
    "entertainment",
    "food",
    "fuel",
    "medical",
    "travel"
})
public class ChargesCategory {

    @JsonProperty("clothes")
    private String clothes;
    @JsonProperty("electronics")
    private String electronics;
    @JsonProperty("entertainment")
    private String entertainment;
    @JsonProperty("food")
    private String food;
    @JsonProperty("fuel")
    private String fuel;
    @JsonProperty("medical")
    private String medical;
    @JsonProperty("travel")
    private String travel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("clothes")
    public String getClothes() {
        return clothes;
    }

    @JsonProperty("clothes")
    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    @JsonProperty("electronics")
    public String getElectronics() {
        return electronics;
    }

    @JsonProperty("electronics")
    public void setElectronics(String electronics) {
        this.electronics = electronics;
    }

    @JsonProperty("entertainment")
    public String getEntertainment() {
        return entertainment;
    }

    @JsonProperty("entertainment")
    public void setEntertainment(String entertainment) {
        this.entertainment = entertainment;
    }

    @JsonProperty("food")
    public String getFood() {
        return food;
    }

    @JsonProperty("food")
    public void setFood(String food) {
        this.food = food;
    }

    @JsonProperty("fuel")
    public String getFuel() {
        return fuel;
    }

    @JsonProperty("fuel")
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @JsonProperty("medical")
    public String getMedical() {
        return medical;
    }

    @JsonProperty("medical")
    public void setMedical(String medical) {
        this.medical = medical;
    }

    @JsonProperty("travel")
    public String getTravel() {
        return travel;
    }

    @JsonProperty("travel")
    public void setTravel(String travel) {
        this.travel = travel;
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
        return new HashCodeBuilder().append(clothes).append(electronics).append(entertainment).append(food).append(fuel).append(medical).append(travel).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChargesCategory) == false) {
            return false;
        }
        ChargesCategory rhs = ((ChargesCategory) other);
        return new EqualsBuilder().append(clothes, rhs.clothes).append(electronics, rhs.electronics).append(entertainment, rhs.entertainment).append(food, rhs.food).append(fuel, rhs.fuel).append(medical, rhs.medical).append(travel, rhs.travel).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
