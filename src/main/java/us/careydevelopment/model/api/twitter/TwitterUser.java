package us.careydevelopment.model.api.twitter;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TwitterUser {

    private String id;
    private String name;
    private String username;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }    
}
