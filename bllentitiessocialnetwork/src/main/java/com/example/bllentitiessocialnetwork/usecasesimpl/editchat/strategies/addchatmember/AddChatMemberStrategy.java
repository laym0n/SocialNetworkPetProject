package com.example.bllentitiessocialnetwork.usecasesimpl.editchat.strategies.addchatmember;

import com.example.bllentitiessocialnetwork.entities.Chat;
import com.example.bllentitiessocialnetwork.entities.User;

public abstract class AddChatMemberStrategy {
    public abstract boolean addNewMember(User userForAdd, Chat chat);
}
