package Tanha;

public class SecurityIncident {
    private String incidentId;
    private String incidentType;
    private String location;
    private String incidentDate;
    private String status;

    public SecurityIncident(String incidentId, String incidentType, String location, String incidentDate, String status) {
        this.incidentId = incidentId;
        this.incidentType = incidentType;
        this.location = location;
        this.incidentDate = incidentDate;
        this.status = status;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(String incidentDate) {
        this.incidentDate = incidentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SecurityIncident{" +
                "incidentId='" + incidentId + '\'' +
                ", incidentType='" + incidentType + '\'' +
                ", location='" + location + '\'' +
                ", incidentDate='" + incidentDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
