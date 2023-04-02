package com.example.bllentitiessocialnetwork.entities;

import java.util.Date;
import java.util.List;

public class Post {
    private int id;
    private String text;
    private byte[] image;
    private Date timeOfWriting;
    private int postOrder;
    private int newsFeedId;
    private List<Comment> comments;
}
