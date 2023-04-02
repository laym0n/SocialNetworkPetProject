package com.example.bllentitiessocialnetwork.usecasesimpl.edituser;

import com.example.bllentitiessocialnetwork.dao.CRUDService;
import com.example.bllentitiessocialnetwork.entities.Authority;
import com.example.bllentitiessocialnetwork.entities.User;
import com.example.bllentitiessocialnetwork.usecases.EditUserUseCase;
import jakarta.persistence.EntityNotFoundException;

import java.util.Optional;

public class EditUserUseCaseImpl implements EditUserUseCase {
    private CRUDService<User> userCRUDService;

    @Override
    public void updatePassword(int idUser, String oldPassword, String newPassword) {
        User userForEdit = getUserById(idUser);
        if(userForEdit.updatePassword(oldPassword, newPassword))
            userCRUDService.update(userForEdit);
    }

    @Override
    public void updateUser(User user) {
        userCRUDService.update(user);
    }
    @Override
    public void addAuthority(int idUser, Authority newAuthority) {
        User userForEdit = getUserById(idUser);
        if(userForEdit.addAuthority(newAuthority))
            userCRUDService.update(userForEdit);
    }

    @Override
    public void removeAuthority(int idUser, Authority removableAuthority) {
        User userForEdit = getUserById(idUser);
        if(userForEdit.removeAuthority(removableAuthority))
            userCRUDService.update(userForEdit);
    }
    private User getUserById(int idUser){
        Optional<User> optionalUserForEdit = userCRUDService.findById(idUser);
        if(!optionalUserForEdit.isPresent())
            throw new EntityNotFoundException(String.format("User with id equals %d not found", idUser));
        return optionalUserForEdit.get();
    }
}
