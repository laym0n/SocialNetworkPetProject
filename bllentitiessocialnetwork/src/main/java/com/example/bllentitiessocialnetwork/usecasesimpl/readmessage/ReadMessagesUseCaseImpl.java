package com.example.bllentitiessocialnetwork.usecasesimpl.readmessage;

import com.example.bllentitiessocialnetwork.dao.ReadMessageService;
import com.example.bllentitiessocialnetwork.entities.Message;
import com.example.bllentitiessocialnetwork.usecases.ReadMessagesUseCase;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReadMessagesUseCaseImpl implements ReadMessagesUseCase {
    private int countMessages;
    private ReadMessageService readMessageService;

    public ReadMessagesUseCaseImpl(int countMessages, ReadMessageService readMessageService) {
        this.countMessages = countMessages;
        this.readMessageService = readMessageService;
    }

    @Override
    public List<Message> getAllMessagesFromChat(int idChat) {
        return readMessageService.findAllMessagesFromChat(idChat);
    }

    @Override
    public List<Message> getPreviousMessagesFromChat(int idChat, int lastMessageOrder) {
        return readMessageService.findPreviousMessagesFromChat(idChat, lastMessageOrder, countMessages);
    }

    @Override
    public List<Message> getNextMessagesFromChat(int idChat, int lastMessageOrder) {
        return readMessageService.findNextMessagesFromChat(idChat, lastMessageOrder, countMessages);
    }
}
