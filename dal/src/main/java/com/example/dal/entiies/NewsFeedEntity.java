package com.example.dal.entiies;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "news_feed", schema = "social_network", catalog = "")
public class NewsFeedEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsFeedEntity that = (NewsFeedEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
