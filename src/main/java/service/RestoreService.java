package service;

public interface RestoreService {
    void restoreData();
    void restoreFromExternalDrive(String drivePath);
    void restoreFromCloudStorage(String cloudProvider, String accessToken);
}
