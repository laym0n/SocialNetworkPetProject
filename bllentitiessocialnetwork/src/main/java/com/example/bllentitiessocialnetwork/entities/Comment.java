package com.example.bllentitiessocialnetwork.entities;


import java.util.Date;

public class Comment {
    private int id;
    private String text;
    private byte[] image;
    private Date timeOfWriting;
    private int postId;
    private User author;

}
