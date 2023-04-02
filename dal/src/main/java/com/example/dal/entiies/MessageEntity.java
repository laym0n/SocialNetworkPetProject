package com.example.dal.entiies;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "message", schema = "social_network", catalog = "")
public class MessageEntity {
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
    @Column(name = "message_order")
    private int messageOrder;
    @Basic
    @Column(name = "member_author_id")
    private int memberAuthorId;
    @Basic
    @Column(name = "chat_id")
    private int chatId;

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

    public int getMessageOrder() {
        return messageOrder;
    }

    public void setMessageOrder(int messageOrder) {
        this.messageOrder = messageOrder;
    }

    public int getMemberAuthorId() {
        return memberAuthorId;
    }

    public void setMemberAuthorId(int memberAuthorId) {
        this.memberAuthorId = memberAuthorId;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageEntity that = (MessageEntity) o;
        return id == that.id && messageOrder == that.messageOrder && memberAuthorId == that.memberAuthorId && chatId == that.chatId && Objects.equals(text, that.text) && Arrays.equals(image, that.image) && Objects.equals(timeOfWriting, that.timeOfWriting);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, text, timeOfWriting, messageOrder, memberAuthorId, chatId);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }
}
