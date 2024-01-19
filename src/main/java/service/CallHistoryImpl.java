package service;

import data.models.CallHistory;
import data.repositories.CallHistoryRepository;
import data.repositories.ContactRepository;
import dto.request.CreateAccountRequest;
import dto.request.LoginRequest;
import dto.response.CreateAccountResponse;
import dto.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Service
public class CallHistoryImpl implements CallHistoryService {
    private final CallHistoryRepository repository;
    @Autowired
    public CallHistoryImpl(CallHistoryRepository repository) {
        this.repository = repository;
    }
    @Override
    public CreateAccountResponse createAccount(CreateAccountRequest request) {
        Pattern pattern = Pattern.compile("^(?!\\d+$)\\w{8,20}$");
        Matcher userPassword = pattern.matcher(request.getCreatePassword());

        String fullName = request.getFullName();
        String createPassword = request.getCreatePassword();
        String confirmPassword = request.getConfirmPassword();

        if (userExist(CreateAccountRequest.getPhoneNumber()){

        }


        CreateAccuntResponse createAccountResponse ()


        if (CreateAccountResponse != null && CreateAccountResponse.isSuccess()) {
            return new CreateAccountResponse("Account created successfully");
        } else {
            return new CreateAccountResponse("Failed to create account. Please, try again.");
        }
    }

    private boolean userExist(String phoneNumber) {
        ContactRepository foundUser = repository.findByPhoneNumber(phoneNumber);
        return foundUser != null;
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        return null;
    }

    String emailAddress = request.getEmailAddress();
        if (isEmailRegisteredBefore(emailAddress)){
            return new CreateAccountResponse("Email already exists. Please, use a different email.");
        }



        if (response != )
    }

    private boolean isEmailRegisteredBefore(String emailAddress) {
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        return null;
    }
}
