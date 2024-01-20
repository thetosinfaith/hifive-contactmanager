package service;

import data.models.Contact;
import dto.request.*;
import dto.response.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactManagerService {
    CreateAccountResponse createAccount(CreateAccountRequest request);

    String login(LoginRequest request);

    AddContactResponse addContact(AddContactRequest request);

    EditContactResponse editContact(EditContactRequest request);

    BlockContactResponse blockContact(BlockContactRequest request);

    SendMessageResponse sendMessage(SendMessageRequest request);
    void dialNumber (String phoneNumber);
    void unBlockContact(String name);
    List<Contact> getAllContacts(String name);
    List<Contact> seeBlockedContacts(String name);

    List<Contact> getAllContacts();

    List<Contact> seeBlockedContacts();

    List<Contact> searchContact(String name, String phoneNumber);
}
