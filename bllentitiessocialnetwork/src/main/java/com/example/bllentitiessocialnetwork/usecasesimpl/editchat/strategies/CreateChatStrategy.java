package com.example.bllentitiessocialnetwork.usecasesimpl.editchat.strategies;

import com.example.bllentitiessocialnetwork.entities.Chat;
import com.example.bllentitiessocialnetwork.entities.User;

public abstract class CreateChatStrategy {
    public abstract boolean createNewChat(User creator, Chat newChat);
}
