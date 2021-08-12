package us.careydevelopment.model.api.reddit;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RedditVideo extends RedditContent {

    private Integer height;
    private Integer width;
    private Integer duration;
    
    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }
    public Integer getWidth() {
        return width;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
