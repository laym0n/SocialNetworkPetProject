package com.example.bllentitiessocialnetwork.usecases;

import com.example.bllentitiessocialnetwork.entities.Post;

public interface ManagePostsUseCase {
    void createPost(int idNewsFeed, Post post);
    void editPost(Post editedPost);
    void removePost(int idPost);
}
