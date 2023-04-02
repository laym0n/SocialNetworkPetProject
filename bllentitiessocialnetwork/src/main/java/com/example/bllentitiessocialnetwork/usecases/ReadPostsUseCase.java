package com.example.bllentitiessocialnetwork.usecases;

import com.example.bllentitiessocialnetwork.entities.Post;

import java.util.List;

public interface ReadPostsUseCase {
    List<Post> getAllPostsFromNewsFeed(int idNewsFeed);
    List<Post> getNextPostsFromNewsFeed(int idNewsFeed, int orderLastPostInNewsFeed);
}
