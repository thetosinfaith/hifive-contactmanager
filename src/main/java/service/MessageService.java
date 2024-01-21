package service;

import data.models.Message;

import java.util.List;

public interface MessageService {
        void sendMessage(Message message);
        List<Message> getAllMessages(String user);
        void deleteMessage(Message message);
        List<Message> getUnreadMessages(String user);
        void markMessageAsRead(Message message);
        void markAllMessagesAsRead(String user);
        List<Message> getSentMessages(String user);
        List<Message> getReceivedMessages(String user);
    }
