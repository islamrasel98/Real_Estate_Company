package Tanha;

public class Visitor {
    private String visitorId;
    private String visitorName;
    private String hostName;
    private String entryTime;
    private String exitTime;

    public Visitor(String visitorId, String visitorName, String hostName, String entryTime, String exitTime) {
        this.visitorId = visitorId;
        this.visitorName = visitorName;
        this.hostName = hostName;
        this.entryTime = entryTime;
        this.exitTime = exitTime;

    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "visitorId='" + visitorId + '\'' +
                ", visitorName='" + visitorName + '\'' +
                ", hostName='" + hostName + '\'' +
                ", entryTime='" + entryTime + '\'' +
                ", exitTime='" + exitTime + '\'' +
                '}';
    }
}
