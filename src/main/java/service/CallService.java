package service;

public interface CallService {
        void dialNumber(String phoneNumber);
        void endCall();
        void muteCall();
        void unmuteCall();
        void holdCall();
        void resumeCall();
        void transferCall(String phoneNumber);
        boolean isCallActive();
    }

