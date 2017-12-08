
package com.swissre.botapp.dto.activity;

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
    "contentType",
    "contentUrl",
    "content",
    "name",
    "thumbnailUrl"
})
public class Attachment implements Serializable
{

    @JsonProperty("contentType")
    private String contentType;
    @JsonProperty("contentUrl")
    private String contentUrl;
    @JsonProperty("content")
    private Content content;
    @JsonProperty("name")
    private String name;
    @JsonProperty("thumbnailUrl")
    private String thumbnailUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3006499545165177481L;

    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("contentUrl")
    public String getContentUrl() {
        return contentUrl;
    }

    @JsonProperty("contentUrl")
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    @JsonProperty("content")
    public Content getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(Content content) {
        this.content = content;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("thumbnailUrl")
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    @JsonProperty("thumbnailUrl")
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
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
        return new ToStringBuilder(this).append("contentType", contentType).append("contentUrl", contentUrl).append("content", content).append("name", name).append("thumbnailUrl", thumbnailUrl).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(content).append(additionalProperties).append(contentUrl).append(thumbnailUrl).append(name).append(contentType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attachment) == false) {
            return false;
        }
        Attachment rhs = ((Attachment) other);
        return new EqualsBuilder().append(content, rhs.content).append(additionalProperties, rhs.additionalProperties).append(contentUrl, rhs.contentUrl).append(thumbnailUrl, rhs.thumbnailUrl).append(name, rhs.name).append(contentType, rhs.contentType).isEquals();
    }

}
