package Tanha;

public class LeadReport {
    private String reportId;
    private String reportPeriod;
    private int totalLeads;
    private float conversionRate;
    private String generatedDate;

    public LeadReport(String reportId, String reportPeriod, int totalLeads, float conversionRate, String generatedDate) {
        this.reportId = reportId;
        this.reportPeriod = reportPeriod;
        this.totalLeads = totalLeads;
        this.conversionRate = conversionRate;
        this.generatedDate = generatedDate;

    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportPeriod() {
        return reportPeriod;
    }

    public void setReportPeriod(String reportPeriod) {
        this.reportPeriod = reportPeriod;
    }

    public int getTotalLeads() {
        return totalLeads;
    }

    public void setTotalLeads(int totalLeads) {
        this.totalLeads = totalLeads;
    }

    public float getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(float conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(String generatedDate) {
        this.generatedDate = generatedDate;
    }

    @Override
    public String toString() {
        return "LeadReport{" +
                "reportId='" + reportId + '\'' +
                ", reportPeriod='" + reportPeriod + '\'' +
                ", totalLeads=" + totalLeads +
                ", conversionRate=" + conversionRate +
                ", generatedDate='" + generatedDate + '\'' +
                '}';
    }
}
