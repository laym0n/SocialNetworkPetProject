package com.example.dal.entiies;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "chat_member", schema = "social_network", catalog = "")
public class ChatMemberEntity {
    @Basic
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "chat_id")
    private int chatId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

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
        ChatMemberEntity that = (ChatMemberEntity) o;
        return userId == that.userId && chatId == that.chatId && id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, chatId, id);
    }
}
