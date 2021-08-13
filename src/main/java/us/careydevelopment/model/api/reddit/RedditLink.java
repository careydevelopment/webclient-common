package us.careydevelopment.model.api.reddit;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RedditLink extends RedditContent {

    private String url;
    
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
