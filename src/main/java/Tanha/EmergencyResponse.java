package Tanha;

public class EmergencyResponse { private String emergencyId;
    private String emergencyType;
    private String location;
    private String responseTeam;
    private String responseStatus;
    public EmergencyResponse(String emergencyId, String emergencyType, String location, String responseTeam, String responseStatus) {
        this.emergencyId = emergencyId;
        this.emergencyType = emergencyType;
        this.location = location;
        this.responseTeam = responseTeam;
        this.responseStatus = responseStatus;
    }

    public String getEmergencyId() {
        return emergencyId;
    }

    public void setEmergencyId(String emergencyId) {
        this.emergencyId = emergencyId;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getResponseTeam() {
        return responseTeam;
    }

    public void setResponseTeam(String responseTeam) {
        this.responseTeam = responseTeam;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    @Override
    public String toString() {
        return "EmergencyResponse{" +
                "emergencyId='" + emergencyId + '\'' +
                ", emergencyType='" + emergencyType + '\'' +
                ", location='" + location + '\'' +
                ", responseTeam='" + responseTeam + '\'' +
                ", responseStatus='" + responseStatus + '\'' +
                '}';
    }
}
