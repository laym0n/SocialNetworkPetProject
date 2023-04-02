package com.example.bllentitiessocialnetwork.entities;


import java.util.ArrayList;
import java.util.List;

public class ChatMember {
    private int id;
    private User user;
    private List<ChatMemberRole> roles;

    public ChatMember(User user) {
        this.user = user;
    }

    public ChatMember(User user, List<ChatMemberRole> roles) {
        this.user = user;
        this.roles = roles;
    }

    public boolean addRole(ChatMemberRole chatMemberRole){
        boolean result;
        roles = roles == null? new ArrayList<>() : roles;
        if(result = !roles.contains(chatMemberRole)) {
            roles.add(chatMemberRole);
        }
        return result;
    }
    public boolean removeRole(ChatMemberRole chatMemberRole){
        boolean result;
        roles = roles == null? new ArrayList<>() : roles;
        if(result = roles.contains(chatMemberRole)) {
            roles.remove(chatMemberRole);
        }
        return result;
    }

}
