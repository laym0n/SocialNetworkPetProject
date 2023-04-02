package com.example.bllentitiessocialnetwork.usecasesimpl.editchat.strategies.addchatmember;

import com.example.bllentitiessocialnetwork.entities.Chat;
import com.example.bllentitiessocialnetwork.entities.ChatMember;
import com.example.bllentitiessocialnetwork.entities.ChatMemberRole;
import com.example.bllentitiessocialnetwork.entities.User;

import java.util.ArrayList;
import java.util.List;

public class SimpleAddChatMemberImpl extends AddChatMemberStrategy{
    @Override
    public boolean addNewMember(User userForAdd, Chat chat) {
        List<ChatMemberRole> roles = new ArrayList<>();
        roles.add(ChatMemberRole.SIMPLE_MEMBER);
        ChatMember newChatMember = new ChatMember(userForAdd, roles);
        return chat.addChatMember(newChatMember);
    }
}
