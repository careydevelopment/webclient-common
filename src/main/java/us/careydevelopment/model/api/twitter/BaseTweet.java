package us.careydevelopment.model.api.twitter;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public abstract class BaseTweet  {
    
    private String tweetId;
    private TwitterUser author;
    private String text;
    private Long createdAt;
    private Integer score;
    private ReferencedTweet referencedTweet;
    
    public TwitterUser getAuthor() {
        return author;
    }
    public void setAuthor(TwitterUser author) {
        this.author = author;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Long getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    
    public ReferencedTweet getReferencedTweet() {
        return referencedTweet;
    }
    public void setReferencedTweet(ReferencedTweet referencedTweet) {
        this.referencedTweet = referencedTweet;
    }
    
    public String getTweetId() {
        return tweetId;
    }
    public void setTweetId(String tweetId) {
        this.tweetId = tweetId;
    }
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
