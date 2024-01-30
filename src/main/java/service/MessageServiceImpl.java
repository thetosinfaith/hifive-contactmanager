package service;

import data.enums.MessageType;
import data.models.Message;
import data.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceImpl implements MessageService{
    @Autowired
    private BackupRepository backUp;
    @Autowired
    private CallRepository call;
    @Autowired
    private CallRepository contact;
    @Autowired
    private MessageRepository message;
    @Autowired
    private RestoreRepository restore;
    @Autowired
    private UserRepository user;

    @Override
    public void sendMessage(Message message) {
        notify();
        return id ;

        Boolean isSent;

        Message newMessage = new Message();
        newMessage.setMessageType();
        newMessage.setMessageContent();

        if(userMessage.)



        newMessage.setMessageContent("");
        newMessage.setMessageType(MessageType.TEXT);
        newMessage.setMessageType(MessageType.FILE);
        newMessage.setMessageType(MessageType.AUDIO);
        newMessage.setMessageType(MessageType.IMAGE);
        newMessage.setMessageType(MessageType.VIDEO);

        if (newMessage.isSent())
            Message messageType = newMessage.getSentDateTime();

        newMessage.isSent();



    }

    @Override
    public List<Message> getAllMessages(String user){
        return message.findAll();
    }

    @Override
    public void deleteMessage(Message message) {

    }

    @Override
    public List<Message> getUnreadMessages(String user) {
        return null;
    }

    @Override
    public void markMessageAsRead(Message message) {

    }

    @Override
    public void markAllMessagesAsRead(String user) {

    }

    @Override
    public List<Message> getSentMessages(String user) {
        return null;
    }

    @Override
    public List<Message> getReceivedMessages(String user) {
        return null;
    }

}
