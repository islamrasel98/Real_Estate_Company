package Tanha;

public class AccessControl {
    private String deviceId;
    private String securityZone;
    private String permission;
    private String deviceStatus;
    private String lastUpdated;

    public AccessControl(String deviceId, String securityZone, String permission, String deviceStatus, String lastUpdated) {
        this.deviceId = deviceId;
        this.securityZone = securityZone;
        this.permission = permission;
        this.deviceStatus = deviceStatus;
        this.lastUpdated = lastUpdated;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSecurityZone() {
        return securityZone;
    }

    public void setSecurityZone(String securityZone) {
        this.securityZone = securityZone;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "AccessControl{" +
                "deviceId='" + deviceId + '\'' +
                ", securityZone='" + securityZone + '\'' +
                ", permission='" + permission + '\'' +
                ", deviceStatus='" + deviceStatus + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
