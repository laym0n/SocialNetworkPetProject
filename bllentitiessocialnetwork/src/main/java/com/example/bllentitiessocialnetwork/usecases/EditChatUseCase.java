package com.example.bllentitiessocialnetwork.usecases;

import com.example.bllentitiessocialnetwork.entities.ChatMemberRole;

public interface EditChatUseCase {
    void setNameById(int idChat, String newName);
    void setAvatarById(int idChat, byte[] newAvatar);
    void addNewMember(int idChat, int idUser);
    void removeChatMemberFromChat(int idChat, int idMember);
    void addRoleToChatMember(int idChatMember, ChatMemberRole newRole);
    void removeRoleFromChatMember(int idChatMember, ChatMemberRole removableRole);
}
