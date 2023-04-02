package com.example.bllentitiessocialnetwork.entities;


import java.util.List;

public class User {
    private int id;
    private String userName;
    private String password;
    private Byte enabled;
    private byte[] avatar;
    private String firstName;
    private String secondName;
    private List<Authority> authorities;
    public boolean addAuthority(Authority newAuthority){
        boolean result;
        if(result = !authorities.contains(newAuthority))
            authorities.add(newAuthority);
        return result;
    }
    public boolean removeAuthority(Authority newAuthority){
        boolean result;
        if(result = authorities.contains(newAuthority))
            authorities.remove(newAuthority);
        return result;
    }

    public boolean updatePassword(String oldPassword, String newPassword){
        boolean result;
        if(result = password.equals(oldPassword))
            password = newPassword;
        return result;
    }
}
