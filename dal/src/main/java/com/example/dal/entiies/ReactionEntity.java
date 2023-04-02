package com.example.dal.entiies;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "reaction", schema = "social_network", catalog = "")
public class ReactionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Object id;
    @Basic
    @Column(name = "reaction_type_id")
    private int reactionTypeId;
    @Basic
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "post_id")
    private Integer postId;
    @Basic
    @Column(name = "comment_id")
    private Integer commentId;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public int getReactionTypeId() {
        return reactionTypeId;
    }

    public void setReactionTypeId(int reactionTypeId) {
        this.reactionTypeId = reactionTypeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReactionEntity that = (ReactionEntity) o;
        return reactionTypeId == that.reactionTypeId && userId == that.userId && Objects.equals(id, that.id) && Objects.equals(postId, that.postId) && Objects.equals(commentId, that.commentId) && Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reactionTypeId, userId, postId, commentId, createdAt);
    }
}
