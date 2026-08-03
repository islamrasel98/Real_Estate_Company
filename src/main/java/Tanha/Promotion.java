package Tanha;

public class Promotion {
    private String promotionId;
    private String promotionName;
    private float discount;
    private String propertyName;
    private String startDate;
    private String endDate;

    public Promotion(String promotionId, String promotionName, float discount, String propertyName, String startDate, String endDate) {
        this.promotionId = promotionId;
        this.promotionName = promotionName;
        this.discount = discount;
        this.propertyName = propertyName;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "promotionId='" + promotionId + '\'' +
                ", promotionName='" + promotionName + '\'' +
                ", discount=" + discount +
                ", propertyName='" + propertyName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
