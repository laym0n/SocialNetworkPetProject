package com.example.bllentitiessocialnetwork.entities;

public class Reaction<T> {
    private int id;
    private User user;
    private T t;
    private ReactionType reactionType;
}
