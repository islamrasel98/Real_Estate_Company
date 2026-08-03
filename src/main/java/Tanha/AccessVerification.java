package Tanha;

public class AccessVerification {
    private String employeeId;
    private String employeeName;
    private String accessArea;
    private String verificationTime;
    private String accessStatus;

    public AccessVerification(String employeeId, String employeeName, String accessArea, String verificationTime, String accessStatus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.accessArea = accessArea;
        this.verificationTime = verificationTime;
        this.accessStatus = accessStatus;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAccessArea() {
        return accessArea;
    }

    public void setAccessArea(String accessArea) {
        this.accessArea = accessArea;
    }

    public String getVerificationTime() {
        return verificationTime;
    }

    public void setVerificationTime(String verificationTime) {
        this.verificationTime = verificationTime;
    }

    public String getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
    }

    @Override
    public String toString() {
        return "AccessVerification{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", accessArea='" + accessArea + '\'' +
                ", verificationTime='" + verificationTime + '\'' +
                ", accessStatus='" + accessStatus + '\'' +
                '}';
    }
}
