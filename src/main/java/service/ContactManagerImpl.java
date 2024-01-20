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
public class ContactManagerImpl implements ContactManagerService {
    @Autowired
    private BackupRepository backup;
    @Autowired
    private CallRepository calls;
    @Autowired
    private ContactRepository contacts;
    @Autowired
    private MessageRepository messages;
    @Autowired
    private UserRepository user;
    @Autowired
    private RestoreRepository restore;

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
        Optional<Contact> optionalContact = contacts.findByPhoneNumber(request.getPhoneNumber());

        if (optionalContact.isPresent()) {
            Contact foundContact = optionalContact.get();

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
            // Throw a ContactNotFoundException when the contact is not found
            throw new ContactNotFoundException("Contact not found.");
        }
    }

    @Override
    public BlockContactResponse blockContact(BlockContactRequest request) {
        return null;
    }

    @Override
    public SendMessageResponse sendMessage(SendMessageRequest request) {
        return null;
    }

    @Override
    public void dialNumber(String phoneNumber) {

    }

    @Override
    public void unBlockContact(String name) {

    }

    @Override
    public List<Contact> getAllContacts(String name) {
        return null;
    }

    @Override
    public List<Contact> seeBlockedContacts(String name) {
        return null;
    }

    @Override
    public List<Contact> getAllContacts() {
        return null;
    }

    @Override
    public List<Contact> seeBlockedContacts() {
        return null;
    }

    @Override
    public List<Contact> searchContact(String name, String phoneNumber) {
        return null;
    }


    }
