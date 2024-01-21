package service;

import data.models.Contact;
import dto.request.*;
import dto.response.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {
    AddContactResponse addContact(AddContactRequest request);
    EditContactResponse editContact(EditContactRequest request);
    BlockContactResponse blockContact(BlockContactRequest request);
    List<Contact> unBlockContact(String phoneNumber);
    List<Contact> getAllContacts(String name);
    List<Contact> seeBlockedContacts(String name);
    List<Contact> getAllContacts();
    List<Contact> seeBlockedContacts();
    List<Contact> searchContact(String name, String phoneNumber);
}