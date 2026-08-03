package Tanha;

public class PropertySecurity {
    private String propertyId;
    private String propertyName;
    private String cctvStatus;
    private String alarmStatus;
    private String incidentAlert;

    public PropertySecurity(String propertyId, String propertyName, String cctvStatus, String alarmStatus, String incidentAlert) {
        this.propertyId = propertyId;
        this.propertyName = propertyName;
        this.cctvStatus = cctvStatus;
        this.alarmStatus = alarmStatus;
        this.incidentAlert = incidentAlert;

    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getCctvStatus() {
        return cctvStatus;
    }

    public void setCctvStatus(String cctvStatus) {
        this.cctvStatus = cctvStatus;
    }

    public String getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public String getIncidentAlert() {
        return incidentAlert;
    }

    public void setIncidentAlert(String incidentAlert) {
        this.incidentAlert = incidentAlert;
    }

    @Override
    public String toString() {
        return "PropertySecurity{" +
                "propertyId='" + propertyId + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", cctvStatus='" + cctvStatus + '\'' +
                ", alarmStatus='" + alarmStatus + '\'' +
                ", incidentAlert='" + incidentAlert + '\'' +
                '}';
    }
}
