package us.careydevelopment.model.api.reddit;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public abstract class BaseRedditImage extends RedditContent {

    private Integer height;
    private Integer width;
    
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
    
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
