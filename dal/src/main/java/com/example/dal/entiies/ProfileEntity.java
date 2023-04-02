package com.example.dal.entiies;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "profile", schema = "social_network", catalog = "")
public class ProfileEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "news_feed_id")
    private int newsFeedId;
    @Basic
    @Column(name = "birthday")
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNewsFeedId() {
        return newsFeedId;
    }

    public void setNewsFeedId(int newsFeedId) {
        this.newsFeedId = newsFeedId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfileEntity that = (ProfileEntity) o;
        return id == that.id && newsFeedId == that.newsFeedId && Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, newsFeedId, birthday);
    }
}
