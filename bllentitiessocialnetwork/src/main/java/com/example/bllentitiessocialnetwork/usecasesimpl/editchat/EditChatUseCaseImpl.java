package com.example.bllentitiessocialnetwork.usecasesimpl.editchat;

import com.example.bllentitiessocialnetwork.dao.ChatDAService;
import com.example.bllentitiessocialnetwork.entities.Chat;
import com.example.bllentitiessocialnetwork.entities.ChatMember;
import com.example.bllentitiessocialnetwork.entities.ChatMemberRole;
import com.example.bllentitiessocialnetwork.entities.User;
import com.example.bllentitiessocialnetwork.usecases.EditChatUseCase;
import com.example.bllentitiessocialnetwork.usecasesimpl.editchat.strategies.CreateChatStrategy;
import com.example.bllentitiessocialnetwork.usecasesimpl.editchat.strategies.addchatmember.AddChatMemberStrategy;

public class EditChatUseCaseImpl implements EditChatUseCase {
    private ChatDAService chatDAService;
    private AddChatMemberStrategy addNewMember;
    private CreateChatStrategy createChatStrategy;

    public EditChatUseCaseImpl(ChatDAService chatDAService) {
        this.chatDAService = chatDAService;
    }

    @Override
    public void setNameById(int idChat, String newName) {

    }

    @Override
    public void setAvatarById(int idChat, byte[] newAvatar) {

    }

    @Override
    public void addNewMember(int idChat, int idUser) {

    }

    @Override
    public void removeChatMemberFromChat(int idChat, int idMember) {

    }

    @Override
    public void addRoleToChatMember(int idChatMember, ChatMemberRole newRole) {

    }

    @Override
    public void removeRoleFromChatMember(int idChatMember, ChatMemberRole removableRole) {

    }
}
