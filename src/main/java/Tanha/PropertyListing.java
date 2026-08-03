package Tanha;

public class PropertyListing {
    private String propertyId;
    private String propertyName;
    private String propertyType;
    private float listingPrice;
    private String contactNumber;
    private String publicationDate;

    public PropertyListing(String propertyId, String propertyName, String propertyType, float listingPrice, String contactNumber, String publicationDate) {
        this.propertyId = propertyId;
        this.propertyName = propertyName;
        this.propertyType = propertyType;
        this.listingPrice = listingPrice;
        this.contactNumber = contactNumber;
        this.publicationDate = publicationDate;

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

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public float getListingPrice() {
        return listingPrice;
    }

    public void setListingPrice(float listingPrice) {
        this.listingPrice = listingPrice;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "PropertyListing{" +
                "propertyId='" + propertyId + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", listingPrice=" + listingPrice +
                ", contactNumber='" + contactNumber + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
