package com.example.bllentitiessocialnetwork.usecasesimpl.managefriends;

import com.example.bllentitiessocialnetwork.dao.ManageFriendsDAService;
import com.example.bllentitiessocialnetwork.usecases.ManageFriendsUseCase;

public class ManageFriendsUseCaseImpl implements ManageFriendsUseCase {
    private ManageFriendsDAService manageFriendsDAService;
    @Override
    public void acceptFriendRequest(int idUserSender, int idFriendRequest) {

    }

    @Override
    public void cancelFriendRequest(int idUserSender, int idFriendRequest) {

    }

    @Override
    public void sendFriendRequest(int idUserSender, int idUserTarget) {

    }
    @Override
    public void removeFriend(int idUser, int idFriend) {

    }
}
