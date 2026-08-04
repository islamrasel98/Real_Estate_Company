package Tanha;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class CCTVMonitoring {

    private String cameraId;
    private String location;
    private String alert;
    private String lastChecked;

    public CCTVMonitoring(String cameraId, String location, String cameraStatus, String alert, String lastChecked) {
        this.cameraId = cameraId;
        this.location = location;
        this.alert = alert;
        this.lastChecked = lastChecked;


    }

    public CCTVMonitoring(String text, String value, String alert, Callback<TableColumn.CellDataFeatures<CCTVMonitoring, String>, ObservableValue<String>> cellValueFactory) {
    }

    public String getCameraId() {
        return cameraId;
    }

    public void setCameraId(String cameraId) {
        this.cameraId = cameraId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getLastChecked() {
        return lastChecked;
    }

    public void setLastChecked(String lastChecked) {
        this.lastChecked = lastChecked;
    }

    @Override
    public String toString() {
        return "CCTVMonitoring{" +
                "cameraId='" + cameraId + '\'' +
                ", location='" + location + '\'' +
                ", alert='" + alert + '\'' +
                ", lastChecked='" + lastChecked + '\'' +
                '}';
    }
}
