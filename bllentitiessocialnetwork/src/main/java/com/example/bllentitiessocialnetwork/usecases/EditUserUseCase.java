package com.example.bllentitiessocialnetwork.usecases;

import com.example.bllentitiessocialnetwork.entities.Authority;
import com.example.bllentitiessocialnetwork.entities.User;

public interface EditUserUseCase {
    void updatePassword(int idUser,String oldPassword, String newPassword);
    void updateUser(User user);
    void addAuthority(int idUser, Authority newAuthority);
    void removeAuthority(int idUser, Authority removableAuthority);
}
