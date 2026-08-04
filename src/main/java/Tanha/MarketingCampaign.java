package Tanha;

public class MarketingCampaign {
    private String campaignId;
    private String campaignName;
    private float budget;
    private String startDate;
    private String endDate;
    private String channel;

    public MarketingCampaign(String campaignId, String campaignName,float budget, String startDate, String endDate, String channel) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.budget = budget;
        this.startDate = startDate;
        this.endDate = endDate;
        this.channel = channel;

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

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
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

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "MarketingCampaign{" +
                "campaignId='" + campaignId + '\'' +
                ", campaignName='" + campaignName + '\'' +
                ", budget=" + budget +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", channel='" + channel + '\'' +
                '}';
    }
}
