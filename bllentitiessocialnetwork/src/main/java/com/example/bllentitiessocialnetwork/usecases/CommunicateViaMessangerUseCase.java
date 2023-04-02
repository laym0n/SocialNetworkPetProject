package com.example.bllentitiessocialnetwork.usecases;

import com.example.bllentitiessocialnetwork.entities.Message;


public interface CommunicateViaMessangerUseCase {
    void sendMessage(Message newMessage);
    void editMessage(Message editedMessage);
    void removeMessage(int idMessage);

}
