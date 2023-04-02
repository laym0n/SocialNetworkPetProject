package com.example.bllentitiessocialnetwork.usecasesimpl.signup;

import com.example.bllentitiessocialnetwork.dao.CRUDService;
import com.example.bllentitiessocialnetwork.entities.User;
import com.example.bllentitiessocialnetwork.usecases.SignUpUseCase;

public class SignUpUseCaseImpl implements SignUpUseCase {
    private CRUDService<User> userCRUDService;
    @Override
    public void signUp(User newUser) {

    }
}
