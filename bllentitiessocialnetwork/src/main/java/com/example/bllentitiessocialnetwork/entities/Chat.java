package com.example.bllentitiessocialnetwork.entities;

import java.util.List;

public class Chat {
    private int id;
    private String name;
    private byte[] avatar;
    private List<ChatMember> chatMembers;
    private List<Message> messages;
    public boolean addChatMember(ChatMember newChatMember){
        boolean result;
        if(result = !chatMembers.contains(newChatMember))
            chatMembers.add(newChatMember);
        return result;
    }
    public boolean removeChatMember(ChatMember newChatMember){
        boolean result;
        if(result = chatMembers.contains(newChatMember))
            chatMembers.remove(newChatMember);
        return result;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
