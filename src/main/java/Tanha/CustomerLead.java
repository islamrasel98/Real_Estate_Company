package Tanha;

public class CustomerLead {
    private String leadId;
    private String customerName;
    private String phone;
    private String leadStatus;
    private String followUpDate;

    public CustomerLead(String leadId, String customerName, String phone, String leadStatus, String followUpDate) {
        this.leadId = leadId;
        this.customerName = customerName;
        this.phone = phone;
        this.leadStatus = leadStatus;
        this.followUpDate = followUpDate;

    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLeadStatus() {
        return leadStatus;
    }

    public void setLeadStatus(String leadStatus) {
        this.leadStatus = leadStatus;
    }

    public String getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(String followUpDate) {
        this.followUpDate = followUpDate;
    }

    @Override
    public String toString() {
        return "CustomerLead{" +
                "leadId='" + leadId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", phone='" + phone + '\'' +
                ", leadStatus='" + leadStatus + '\'' +
                ", followUpDate='" + followUpDate + '\'' +
                '}';
    }
}
