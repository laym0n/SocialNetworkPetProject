package com.example.bllentitiessocialnetwork.usecases;

public interface AdministrateSocialNetworkUseCase {
    void blockUser(int idUser);
    void blockPost(int idPost);
    void blockComment(int idComment);
    void unblockUser(int idUser);
}
