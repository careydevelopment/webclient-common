package us.careydevelopment.model.api.youtube;

import java.math.BigInteger;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


public abstract class Video {

    private String videoId;
    private String description;
    private Long publishedAt;
    private List<String> tags;
    private String title;
    private Integer commentCount;
    private Integer dislikeCount;
    private Integer likeCount;
    private String thumbnailUrl;
    private Channel channel;
    private Integer viewCount;
    

    public String getVideoId() {
        return videoId;
    }
    public void setVideoId(String videoId) {
        this.videoId = videoId;
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

    public Integer getCommentCount() {
        return commentCount;
    }
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }
    public Integer getDislikeCount() {
        return dislikeCount;
    }
    public void setDislikeCount(Integer dislikeCount) {
        this.dislikeCount = dislikeCount;
    }
    public Integer getLikeCount() {
        return likeCount;
    }
    public void setLikeCount(Integer likeCount) {
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
    
    public Integer getViewCount() {
        return viewCount;
    }
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }    
}


