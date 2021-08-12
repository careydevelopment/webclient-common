package us.careydevelopment.model.api;

import java.math.BigInteger;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


public class Video {

    private String id;
    private String description;
    private Long publishedAt;
    private List<String> tags;
    private String title;
    private BigInteger commentCount;
    private BigInteger dislikeCount;
    private BigInteger likeCount;
    private String thumbnailUrl;
    private Channel channel;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Long getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(Long publishedAt) {
        this.publishedAt = publishedAt;
    }
    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public BigInteger getCommentCount() {
        return commentCount;
    }
    public void setCommentCount(BigInteger commentCount) {
        this.commentCount = commentCount;
    }
    public BigInteger getDislikeCount() {
        return dislikeCount;
    }
    public void setDislikeCount(BigInteger dislikeCount) {
        this.dislikeCount = dislikeCount;
    }
    public BigInteger getLikeCount() {
        return likeCount;
    }
    public void setLikeCount(BigInteger likeCount) {
        this.likeCount = likeCount;
    }
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
    
    
    public Channel getChannel() {
        return channel;
    }
    public void setChannel(Channel channel) {
        this.channel = channel;
    }
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }    

}


