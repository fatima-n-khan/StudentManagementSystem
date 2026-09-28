/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
package studentmanagementsystem;

public class Student extends Person implements Manageable {

    private String department;  //encapsulation
    private String semester;

    public Student(String id, String name,
                   String department, String semester) {
        

        this.id = id;
        this.name = name;
        this.department = department;
        this.semester = semester;
    }
    
    @Override
    public void displayInfo() {  //polymorphism
        System.out.println("Student Information");
    }
    
    @Override
    public void saveData() {
        System.out.println("Student Data Saved");
    }    
    
    public void displayStudent() {  //Method overloading

    System.out.println(name);

}

    public void displayStudent(String department) { //Method overloading

    System.out.println(name + " - " + department);

}
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getSemester() {
        return semester;
    }
}



