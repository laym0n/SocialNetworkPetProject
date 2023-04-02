package com.example.dal.entiies;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "post", schema = "social_network", catalog = "")
public class PostEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "text")
    private String text;
    @Basic
    @Column(name = "image")
    private byte[] image;
    @Basic
    @Column(name = "time_of_writing")
    private Timestamp timeOfWriting;
    @Basic
    @Column(name = "post_order")
    private int postOrder;
    @Basic
    @Column(name = "news_feed_id")
    private int newsFeedId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Timestamp getTimeOfWriting() {
        return timeOfWriting;
    }

    public void setTimeOfWriting(Timestamp timeOfWriting) {
        this.timeOfWriting = timeOfWriting;
    }

    public int getPostOrder() {
        return postOrder;
    }

    public void setPostOrder(int postOrder) {
        this.postOrder = postOrder;
    }

    public int getNewsFeedId() {
        return newsFeedId;
    }

    public void setNewsFeedId(int newsFeedId) {
        this.newsFeedId = newsFeedId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostEntity that = (PostEntity) o;
        return id == that.id && postOrder == that.postOrder && newsFeedId == that.newsFeedId && Objects.equals(text, that.text) && Arrays.equals(image, that.image) && Objects.equals(timeOfWriting, that.timeOfWriting);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, text, timeOfWriting, postOrder, newsFeedId);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }
}
