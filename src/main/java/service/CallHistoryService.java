package service;

import dto.request.CreateAccountRequest;
import dto.request.LoginRequest;
import dto.response.CreateAccountResponse;
import dto.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface CallHistoryService {
    CreateAccountResponse createAccount(CreateAccountRequest request );
    LoginResponse login(LoginRequest request);
}
