package com.example.bllentitiessocialnetwork.dao;

import com.example.bllentitiessocialnetwork.entities.Friend;
import com.example.bllentitiessocialnetwork.entities.FriendRequest;

public interface ManageFriendsDAService {
    void createFriendRequest(FriendRequest newFriendRequest);
    void deleteFriendRequest(FriendRequest removableFriendRequest);
    void createFriend(Friend newFriend);
    void deleteFriend(Friend removableFriend);
}
