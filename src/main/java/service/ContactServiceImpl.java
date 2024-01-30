package service;

import data.models.Contact;
import data.models.User;
import data.repositories.*;
import dto.request.*;
import dto.response.*;
import exceptions.ContactNotFoundException;
import exceptions.LoginException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contacts;
    @Autowired
    private UserRepository user;
    @Autowired

    @Override
    public CreateAccountResponse createAccount(CreateAccountRequest request) {
        User newUser = new User();

        newUser.setFirstName(request.getFirstName());
        newUser.setLastName(request.getLastName());
        newUser.setPhoneNumber(request.getPhoneNumber());
        newUser.setEmailAddress(request.getEmailAddress());
        newUser.setCreatePassword(request.getCreatePassword());
        newUser.setConfirmPassword(request.getConfirmPassword());

        user.save(newUser);

        CreateAccountResponse response = new CreateAccountResponse();
        response.setMessage("Account created successfully");
        return response;
    }
    @Override
    public String login(LoginRequest request) {
        Optional<User> userExist = user.findByEmail(request.getEmail());

        if (userExist.isEmpty()) {
            throw new LoginException("Sorry, user not found.");
        }
        if (!userExist.get().getConfirmPassword().equals(request.getPassword())) {
            throw new LoginException("Incorrect password. Please try again.");
        }
        return "You've successfully logged in!";
    }
    @Override
    public AddContactResponse addContact(AddContactRequest request) {
        Contact newContact = new Contact();
        newContact.setProfilePicture(request.getProfilePicture());
        newContact.setFirstName(request.getFirstName());
        newContact.setLastName(request.getLastName());
        newContact.setPhoneNumber(request.getPhoneNumber());
        newContact.setEmail(request.getEmail());
        newContact.setGroup(request.getGroup());

        contacts.save(newContact);

        AddContactResponse response = new AddContactResponse();
        response.setMessage(newContact.getFirstName() + " " + newContact.getLastName() + " added successfully!");
        return response;
    }
    @Override
    public EditContactResponse editContact(EditContactRequest request) {
        Optional<Contact> editContact = contacts.findByPhoneNumber(request.getPhoneNumber());

        if (editContact.isPresent()) {
            Contact foundContact = editContact.get();

            foundContact.setProfilePicture(request.getProfilePicture());
            foundContact.setFirstName(request.getFirstName());
            foundContact.setLastName(request.getLastName());
            foundContact.setPhoneNumber(request.getPhoneNumber());
            foundContact.setEmail(request.getEmail());
            foundContact.setGroup(request.getGroup());

            contacts.save(foundContact);

            EditContactResponse response = new EditContactResponse();
            response.setMessage(foundContact.getFirstName() + " " + foundContact.getLastName() + " edited successfully!");

            return response;
        } else {
            throw new ContactNotFoundException("Contact not found.");
        }
    }

    @Override
    public BlockContactResponse blockContact(BlockContactRequest request) {
        Optional<Contact> blockContact = contacts.findByPhoneNumber(request.getPhoneNumber());

        if (blockContact.isEmpty()) {
            BlockContactResponse errorResponse = new BlockContactResponse();
            errorResponse.setMessage(request.getPhoneNumber() + " not found");
            return errorResponse;
        }

        Contact contactToBlock = blockContact.get();
        contacts.blocked(contactToBlock);

        BlockContactResponse response = new BlockContactResponse();
        response.setMessage(contactToBlock.getPhoneNumber() + " has been blocked");

        return response;
    }
    @Override
    public UnblockContactResponse unBlockContact(String phoneNumber) {
        Optional<Contact> blockedContact = contacts.findByPhoneNumber(phoneNumber);

        UnblockContactResponse response = new UnblockContactResponse();

        if (blockedContact.isPresent()) {
            response.setMessage(blockedContact.get().getPhoneNumber() + " unblocked");
        } else {
            response.setMessage("Contact not found");
        }
        return response;
    }
    @Override
    public List<Contact> seeBlockedContacts(String phoneNumber) {

        return contacts.findAll();
    }
    @Override
    public List<Contact> searchContact(String name, String phoneNumber) {
        return contacts.findAll();
    }
}
