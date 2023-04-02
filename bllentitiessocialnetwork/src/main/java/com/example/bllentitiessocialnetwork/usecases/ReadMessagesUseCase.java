package com.example.bllentitiessocialnetwork.usecases;

import com.example.bllentitiessocialnetwork.entities.Message;

import java.util.List;

public interface ReadMessagesUseCase {
    List<Message> getAllMessagesFromChat(int idChat);
    List<Message> getPreviousMessagesFromChat(int idChat, int lastMessageOrder);
    List<Message> getNextMessagesFromChat(int idChat, int lastMessageOrder);
}
