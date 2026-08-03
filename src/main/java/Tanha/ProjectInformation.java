package Tanha;

public class ProjectInformation {
    private String projectId;
    private String projectName;
    private String description;
    private String content;
    private String status;

    public ProjectInformation(String projectId, String projectName, String description, String content, String status) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.description = description;
        this.content = content;
        this.status = status;

    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ProjectInformation{" +
                "projectId='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
