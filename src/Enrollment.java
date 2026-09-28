/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
package studentmanagementsystem;

public class Enrollment {

    private String studentId;
    private String courseName;

    public Enrollment(String studentId, String courseName) {
        this.studentId = studentId;
        this.courseName = courseName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourseName() {
        return courseName;
    }
}
