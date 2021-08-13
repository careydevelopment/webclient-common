package us.careydevelopment.model.api.reddit;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public abstract class RedditContent {

    private BigDecimal upvoteRatio;
    private Integer ups;
    private Integer totalAwardsReceived;
    private Long created;
    private String permalink;
    private String subreddit;
    private String title;
    private String thumbnail;
    private Integer score;
    
    public BigDecimal getUpvoteRatio() {
        return upvoteRatio;
    }
    public void setUpvoteRatio(BigDecimal upvoteRatio) {
        this.upvoteRatio = upvoteRatio;
    }
    public Integer getUps() {
        return ups;
    }
    public void setUps(Integer ups) {
        this.ups = ups;
    }
    public Integer getTotalAwardsReceived() {
        return totalAwardsReceived;
    }
    public void setTotalAwardsReceived(Integer totalAwardsReceived) {
        this.totalAwardsReceived = totalAwardsReceived;
    }
    public Long getCreated() {
        return created;
    }
    public void setCreated(Long created) {
        this.created = created;
    }
    public String getPermalink() {
        return permalink;
    }
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }
    public String getSubreddit() {
        return subreddit;
    }
    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }    
    
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public String getThumbnail() {
        return thumbnail;
    }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
