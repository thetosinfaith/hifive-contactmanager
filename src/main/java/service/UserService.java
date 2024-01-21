package service;

import dto.request.CreateAccountRequest;
import dto.request.LoginRequest;
import dto.response.CreateAccountResponse;

public interface UserService {
        CreateAccountResponse createAccount(CreateAccountRequest request);
        String login(LoginRequest request);
        void logout(String username);
        boolean isUserLoggedIn(String username);
        void changePassword(String username, String newPassword);
        <UserProfile> UserProfile getUserProfile(String username);
        <UserProfile> void updateUserProfile(String username, UserProfile updatedProfile);
        void deleteAccount(String username);
    }
