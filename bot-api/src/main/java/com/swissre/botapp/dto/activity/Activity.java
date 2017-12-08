
package com.swissre.botapp.dto.activity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "action",
    "attachments",
    "attachmentLayout",
    "channelData",
    "channelId",
    "code",
    "conversation",
    "entities",
    "from",
    "historyDisclosed",
    "id",
    "inputHint",
    "locale",
    "localTimestamp",
    "membersAdded",
    "membersRemoved",
    "name",
    "recipient",
    "relatesTo",
    "replyToId",
    "serviceUrl",
    "speak",
    "suggestedActions",
    "summary",
    "text",
    "textFormat",
    "topicName",
    "type",
    "timestamp",
    "value"
})
public class Activity implements Serializable
{

    @JsonProperty("action")
    private String action;
    @JsonProperty("attachments")
    private List<Attachment> attachments = null;
    @JsonProperty("attachmentLayout")
    private String attachmentLayout;
    @JsonProperty("channelData")
    private ChannelData channelData;
    @JsonProperty("channelId")
    private String channelId;
    @JsonProperty("code")
    private String code;
    @JsonProperty("conversation")
    private Conversation conversation;
    @JsonProperty("entities")
    private List<Entity> entities = null;
    @JsonProperty("from")
    private From from;
    @JsonProperty("historyDisclosed")
    private Boolean historyDisclosed;
    @JsonProperty("id")
    private String id;
    @JsonProperty("inputHint")
    private String inputHint;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("localTimestamp")
    private String localTimestamp;
    @JsonProperty("membersAdded")
    private List<MembersAdded> membersAdded = null;
    @JsonProperty("membersRemoved")
    private List<MembersRemoved> membersRemoved = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("recipient")
    private Recipient recipient;
    @JsonProperty("relatesTo")
    private String relatesTo;
    @JsonProperty("replyToId")
    private String replyToId;
    @JsonProperty("serviceUrl")
    private String serviceUrl;
    @JsonProperty("speak")
    private String speak;
    @JsonProperty("suggestedActions")
    private String suggestedActions;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("text")
    private String text;
    @JsonProperty("textFormat")
    private String textFormat;
    @JsonProperty("topicName")
    private String topicName;
    @JsonProperty("type")
    private String type;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("value")
    private Value value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6137619559411722693L;

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("attachments")
    public List<Attachment> getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("attachmentLayout")
    public String getAttachmentLayout() {
        return attachmentLayout;
    }

    @JsonProperty("attachmentLayout")
    public void setAttachmentLayout(String attachmentLayout) {
        this.attachmentLayout = attachmentLayout;
    }

    @JsonProperty("channelData")
    public ChannelData getChannelData() {
        return channelData;
    }

    @JsonProperty("channelData")
    public void setChannelData(ChannelData channelData) {
        this.channelData = channelData;
    }

    @JsonProperty("channelId")
    public String getChannelId() {
        return channelId;
    }

    @JsonProperty("channelId")
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("conversation")
    public Conversation getConversation() {
        return conversation;
    }

    @JsonProperty("conversation")
    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    @JsonProperty("entities")
    public List<Entity> getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    @JsonProperty("from")
    public From getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From from) {
        this.from = from;
    }

    @JsonProperty("historyDisclosed")
    public Boolean getHistoryDisclosed() {
        return historyDisclosed;
    }

    @JsonProperty("historyDisclosed")
    public void setHistoryDisclosed(Boolean historyDisclosed) {
        this.historyDisclosed = historyDisclosed;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("inputHint")
    public String getInputHint() {
        return inputHint;
    }

    @JsonProperty("inputHint")
    public void setInputHint(String inputHint) {
        this.inputHint = inputHint;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("localTimestamp")
    public String getLocalTimestamp() {
        return localTimestamp;
    }

    @JsonProperty("localTimestamp")
    public void setLocalTimestamp(String localTimestamp) {
        this.localTimestamp = localTimestamp;
    }

    @JsonProperty("membersAdded")
    public List<MembersAdded> getMembersAdded() {
        return membersAdded;
    }

    @JsonProperty("membersAdded")
    public void setMembersAdded(List<MembersAdded> membersAdded) {
        this.membersAdded = membersAdded;
    }

    @JsonProperty("membersRemoved")
    public List<MembersRemoved> getMembersRemoved() {
        return membersRemoved;
    }

    @JsonProperty("membersRemoved")
    public void setMembersRemoved(List<MembersRemoved> membersRemoved) {
        this.membersRemoved = membersRemoved;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("recipient")
    public Recipient getRecipient() {
        return recipient;
    }

    @JsonProperty("recipient")
    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    @JsonProperty("relatesTo")
    public String getRelatesTo() {
        return relatesTo;
    }

    @JsonProperty("relatesTo")
    public void setRelatesTo(String relatesTo) {
        this.relatesTo = relatesTo;
    }

    @JsonProperty("replyToId")
    public String getReplyToId() {
        return replyToId;
    }

    @JsonProperty("replyToId")
    public void setReplyToId(String replyToId) {
        this.replyToId = replyToId;
    }

    @JsonProperty("serviceUrl")
    public String getServiceUrl() {
        return serviceUrl;
    }

    @JsonProperty("serviceUrl")
    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    @JsonProperty("speak")
    public String getSpeak() {
        return speak;
    }

    @JsonProperty("speak")
    public void setSpeak(String speak) {
        this.speak = speak;
    }

    @JsonProperty("suggestedActions")
    public String getSuggestedActions() {
        return suggestedActions;
    }

    @JsonProperty("suggestedActions")
    public void setSuggestedActions(String suggestedActions) {
        this.suggestedActions = suggestedActions;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("textFormat")
    public String getTextFormat() {
        return textFormat;
    }

    @JsonProperty("textFormat")
    public void setTextFormat(String textFormat) {
        this.textFormat = textFormat;
    }

    @JsonProperty("topicName")
    public String getTopicName() {
        return topicName;
    }

    @JsonProperty("topicName")
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("value")
    public Value getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Value value) {
        this.value = value;
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
        return new ToStringBuilder(this).append("action", action).append("attachments", attachments).append("attachmentLayout", attachmentLayout).append("channelData", channelData).append("channelId", channelId).append("code", code).append("conversation", conversation).append("entities", entities).append("from", from).append("historyDisclosed", historyDisclosed).append("id", id).append("inputHint", inputHint).append("locale", locale).append("localTimestamp", localTimestamp).append("membersAdded", membersAdded).append("membersRemoved", membersRemoved).append("name", name).append("recipient", recipient).append("relatesTo", relatesTo).append("replyToId", replyToId).append("serviceUrl", serviceUrl).append("speak", speak).append("suggestedActions", suggestedActions).append("summary", summary).append("text", text).append("textFormat", textFormat).append("topicName", topicName).append("type", type).append("timestamp", timestamp).append("value", value).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(summary).append(suggestedActions).append(locale).append(attachmentLayout).append(from).append(type).append(recipient).append(timestamp).append(id).append(membersAdded).append(localTimestamp).append(textFormat).append(name).append(value).append(action).append(conversation).append(attachments).append(historyDisclosed).append(channelData).append(topicName).append(text).append(replyToId).append(channelId).append(speak).append(relatesTo).append(code).append(serviceUrl).append(entities).append(additionalProperties).append(inputHint).append(membersRemoved).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Activity) == false) {
            return false;
        }
        Activity rhs = ((Activity) other);
        return new EqualsBuilder().append(summary, rhs.summary).append(suggestedActions, rhs.suggestedActions).append(locale, rhs.locale).append(attachmentLayout, rhs.attachmentLayout).append(from, rhs.from).append(type, rhs.type).append(recipient, rhs.recipient).append(timestamp, rhs.timestamp).append(id, rhs.id).append(membersAdded, rhs.membersAdded).append(localTimestamp, rhs.localTimestamp).append(textFormat, rhs.textFormat).append(name, rhs.name).append(value, rhs.value).append(action, rhs.action).append(conversation, rhs.conversation).append(attachments, rhs.attachments).append(historyDisclosed, rhs.historyDisclosed).append(channelData, rhs.channelData).append(topicName, rhs.topicName).append(text, rhs.text).append(replyToId, rhs.replyToId).append(channelId, rhs.channelId).append(speak, rhs.speak).append(relatesTo, rhs.relatesTo).append(code, rhs.code).append(serviceUrl, rhs.serviceUrl).append(entities, rhs.entities).append(additionalProperties, rhs.additionalProperties).append(inputHint, rhs.inputHint).append(membersRemoved, rhs.membersRemoved).isEquals();
    }

}
