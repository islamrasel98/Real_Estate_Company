package Tanha;

public class CampaignAnalysis {
    private String campaignId;
    private String campaignName;
    private float conversionRate;
    private String status;

    public CampaignAnalysis(String campaignId, String campaignName, float conversionRate, String status) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.conversionRate = conversionRate;
        this.status = status;

    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public float getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(float conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CampaignAnalysis{" +
                "campaignId='" + campaignId + '\'' +
                ", campaignName='" + campaignName + '\'' +
                ", conversionRate=" + conversionRate +
                ", status='" + status + '\'' +
                '}';
    }
}
