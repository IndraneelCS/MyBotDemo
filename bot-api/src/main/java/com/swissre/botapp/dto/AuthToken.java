
package com.swissre.botapp.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "token_type",
    "expires_in",
    "ext_expires_in",
    "access_token"
})
public class AuthToken implements Serializable
{

    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private Integer expiresIn;
    @JsonProperty("ext_expires_in")
    private Integer extExpiresIn;
    @JsonProperty("access_token")
    private String accessToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5730314805236210721L;

    @JsonProperty("token_type")
    public String getTokenType() {
        return tokenType;
    }

    @JsonProperty("token_type")
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @JsonProperty("expires_in")
    public Integer getExpiresIn() {
        return expiresIn;
    }

    @JsonProperty("expires_in")
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    @JsonProperty("ext_expires_in")
    public Integer getExtExpiresIn() {
        return extExpiresIn;
    }

    @JsonProperty("ext_expires_in")
    public void setExtExpiresIn(Integer extExpiresIn) {
        this.extExpiresIn = extExpiresIn;
    }

    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    @JsonProperty("access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
    public String toString() {
        return new ToStringBuilder(this).append("tokenType", tokenType).append("expiresIn", expiresIn).append("extExpiresIn", extExpiresIn).append("accessToken", accessToken).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tokenType).append(accessToken).append(extExpiresIn).append(additionalProperties).append(expiresIn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthToken) == false) {
            return false;
        }
        AuthToken rhs = ((AuthToken) other);
        return new EqualsBuilder().append(tokenType, rhs.tokenType).append(accessToken, rhs.accessToken).append(extExpiresIn, rhs.extExpiresIn).append(additionalProperties, rhs.additionalProperties).append(expiresIn, rhs.expiresIn).isEquals();
    }

}
