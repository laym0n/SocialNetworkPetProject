package com.example.bllentitiessocialnetwork.dao;

import com.example.bllentitiessocialnetwork.entities.Message;

import java.util.List;

public interface ReadMessageService {
    List<Message> findAllMessagesFromChat(int idChat);
    List<Message> findPreviousMessagesFromChat(int idChat,int orderLastMessage, int countNextMessages);
    List<Message> findNextMessagesFromChat(int idChat,int orderLastMessage, int countNextMessages);
}
