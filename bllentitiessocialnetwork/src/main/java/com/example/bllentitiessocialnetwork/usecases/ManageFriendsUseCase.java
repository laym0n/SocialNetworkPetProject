package com.example.bllentitiessocialnetwork.usecases;

public interface ManageFriendsUseCase {
    void acceptFriendRequest(int idUserSender, int idFriendRequest);
    void cancelFriendRequest(int idUserSender, int idFriendRequest);
    void sendFriendRequest(int idUserSender, int idUserTarget);
    void removeFriend(int idUser, int idFriend);
}
