package com.example.bllentitiessocialnetwork.usecases;

import com.example.bllentitiessocialnetwork.entities.Chat;

public interface ManageChatsUseCase {
    void createNewChat(Chat newChat, int idUserCreator);
    void removeChat(int idChat);
}
