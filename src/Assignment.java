package studentmanagementsystem;

public class Assignment {

    private String studentId;
    private String title;
    private String dueDate;
    private String status;

    public Assignment(String studentId, String title, String dueDate) {

        this.studentId = studentId;
        this.title = title;
        this.dueDate = dueDate;
        this.status = "Pending";

    }

    public String getStudentId() {
        return studentId;
    }

    public String getTitle() {
        return title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}