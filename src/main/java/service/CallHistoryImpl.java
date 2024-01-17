package service;

import data.repositories.CallHistoryRepository;
import dto.request.CreateAccountRequest;
import dto.request.LoginRequest;
import dto.response.CreateAccountResponse;
import dto.response.LoginResponse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CallHistoryImpl implements CallHistoryService {
    private final CallHistoryRepository implementation;

    public CallHistoryImpl(CallHistoryRepository implementation) {
        this.implementation = implementation;
    }

    @Override
    public CreateAccountResponse createAccount(CreateAccountRequest request) {
        Pattern pattern = Pattern.compile("^(?!\\d+$)\\w{8,20}$");
        Matcher userPassword = pattern.matcher(request.getCreatePassword());

        String fullName = request.getFullName();
        String phoneNumber = request.getPhoneNumber();
        String createPassword = request.getCreatePassword();
        String confirmPassword = request.getConfirmPassword();


        if (CreateAccountResponse != null && CreateAccountResponse.isSuccess()) {
            return new CreateAccountResponse("Account created successfully");
        } else {
            return new CreateAccountResponse("Failed to create account. Please, try again.");
        }
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
