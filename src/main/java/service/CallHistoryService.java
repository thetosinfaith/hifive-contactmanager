package service;

import dto.request.LoginRequest;
import dto.request.CreateAccountRequest;
import dto.response.CreateAccountResponse;
import dto.response.LoginResponse;

public interface CallHistoryService {
    CreateAccountResponse createAccount(CreateAccountRequest request );
    LoginResponse login(LoginRequest request);
}
