package service;

public interface BackupService {
    void backupData();
    void backupToExternalDrive(String drivePath);
    void backupToCloudStorage(String cloudProvider, String accessToken);
}
