package com.example.bllentitiessocialnetwork.dao;

import com.example.bllentitiessocialnetwork.entities.Chat;
import com.example.bllentitiessocialnetwork.entities.ChatMember;
import com.example.bllentitiessocialnetwork.entities.User;

public interface ChatDAService {
    Chat findChatById(int id);
    void create(Chat chat);
    void update(Chat chat);
    User findUserById(int idUser);
    ChatMember findChatMember(int idChatMember);
}
