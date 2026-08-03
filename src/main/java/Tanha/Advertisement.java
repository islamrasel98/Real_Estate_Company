package Tanha;

public class Advertisement { private String advertisementId;
    private String advertisementTitle;
    private String propertyName;
    private String description;
    private float budget;
    private String publicationDate;
    private String publicationChannel;
    private String status;

    public Advertisement(String advertisementId, String advertisementTitle, String propertyName, String description, float budget, String publicationDate, String publicationChannel, String status) {
        this.advertisementId = advertisementId;
        this.advertisementTitle = advertisementTitle;
        this.propertyName = propertyName;
        this.description = description;
        this.budget = budget;
        this.publicationDate = publicationDate;
        this.publicationChannel = publicationChannel;
        this.status = status;
    }

    public String getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(String advertisementId) {
        this.advertisementId = advertisementId;
    }

    public String getAdvertisementTitle() {
        return advertisementTitle;
    }

    public void setAdvertisementTitle(String advertisementTitle) {
        this.advertisementTitle = advertisementTitle;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPublicationChannel() {
        return publicationChannel;
    }

    public void setPublicationChannel(String publicationChannel) {
        this.publicationChannel = publicationChannel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "advertisementId='" + advertisementId + '\'' +
                ", advertisementTitle='" + advertisementTitle + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", description='" + description + '\'' +
                ", budget=" + budget +
                ", publicationDate='" + publicationDate + '\'' +
                ", publicationChannel='" + publicationChannel + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
