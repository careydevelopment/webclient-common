package us.careydevelopment.model.api.twitter;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ReferencedTweet {
    
    private String id;
    private String type;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
