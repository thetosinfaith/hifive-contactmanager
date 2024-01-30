package service;

import data.models.Contact;
import dto.request.*;
import dto.response.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {
    CreateAccountResponse createAccount(CreateAccountRequest request);
    String login(LoginRequest request);
    AddContactResponse addContact(AddContactRequest request);
    EditContactResponse editContact(EditContactRequest request);
    BlockContactResponse blockContact(BlockContactRequest request);
    UnblockContactResponse unBlockContact(String phoneNumber);
    List<Contact> seeBlockedContacts(String phoneNumber);
    List<Contact> searchContact(String name, String phoneNumber);
}