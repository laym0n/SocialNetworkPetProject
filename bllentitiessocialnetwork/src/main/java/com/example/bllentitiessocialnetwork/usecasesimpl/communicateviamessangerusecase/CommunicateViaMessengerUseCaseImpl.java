package com.example.bllentitiessocialnetwork.usecasesimpl.communicateviamessangerusecase;

import com.example.bllentitiessocialnetwork.dao.CRUDService;
import com.example.bllentitiessocialnetwork.entities.Message;
import com.example.bllentitiessocialnetwork.usecases.CommunicateViaMessangerUseCase;

public class CommunicateViaMessengerUseCaseImpl implements CommunicateViaMessangerUseCase {
    private CRUDService<Message> messageCRUDService;
    @Override
    public void sendMessage(Message newMessage) {
        messageCRUDService.create(newMessage);
    }

    @Override
    public void editMessage(Message editedMessage) {
        messageCRUDService.update(editedMessage);
    }

    @Override
    public void removeMessage(int idMessage) {
        messageCRUDService.delete(idMessage);
    }
}
