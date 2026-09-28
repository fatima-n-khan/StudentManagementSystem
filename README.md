# STUDENT MANAGEMENT SYSTEM

A desktop-based **Student Management System** developed in **Java Swing** using **Apache NetBeans**.  
The project demonstrates core **Object-Oriented Programming (OOP)** concepts while providing a practical interface for managing students and their academic activities.

> **Project Type:** Java Desktop Application  
> **UI:** Java Swing  
> **IDE:** Apache NetBeans  
> **Java:** JDK 25  
> **External Library:** JCalendar 1.4

---

## Project Overview

The **Student Management System** is designed to organize common student and academic management tasks in one desktop application.

The application provides modules for:

- Student registration and management
- Student search and deletion
- Course enrollment
- Assignment management
- Assignment completion tracking
- CGPA calculation
- User account creation and login
- Viewing students, assignments, and enrollments
- Input validation and error handling

The project was developed as an OOP-focused Java application, with separate classes for students, accounts, assignments, enrollments, and reusable OOP structures.

---

## Main Features

### 1. User Authentication

The application starts with a login screen.

**Login**
- Username and password validation
- Empty-field validation
- Invalid credential detection
- Opens the main dashboard after successful login

**Create Account**
- Create a new username and password
- Empty-field validation
- Duplicate username prevention
- Success confirmation after account creation

---

### 2. Student Management

The Student Management module provides the following operations:

#### Add Student
Users can add a student using:

- Student ID
- Name
- Department
- Semester

Validation includes:

- Required-field validation
- Negative ID prevention
- Positive numeric ID validation
- Alphanumeric IDs are supported
- Duplicate Student ID prevention

Examples:

| Student ID | Result |
|---|---|
| `1` | ✅ Allowed |
| `25` | ✅ Allowed |
| `S01` | ✅ Allowed |
| `STD15` | ✅ Allowed |
| `0` | ❌ Rejected |
| `00` | ❌ Rejected |
| `-1` | ❌ Rejected |
| `S-01` | ❌ Rejected |

#### View Students
Displays all registered students in a read-only table containing:

- ID
- Name
- Department
- Semester

#### Search Student
Searches for a student using Student ID and displays the student's information.

#### Delete Student
Deletes a student after validation and confirmation.

When a student is deleted, the system also removes that student's:

- Course enrollments
- Assignments

This keeps related academic records synchronized.

---

### 3. Assignment Management

The Assignment Management module allows assignments to be associated with specific students.

#### Add Assignment

Users enter:

- Student ID
- Assignment Title
- Due Date

Features include:

- Required-field validation
- Student ID existence validation
- Calendar-based date selection using **JCalendar**
- Future due-date validation
- Success confirmation

#### View Assignments

Displays assignment records in a read-only table:

- Student ID
- Title
- Due Date
- Status

#### Complete Assignment

An assignment can be marked as completed using:

- Student ID
- Assignment Title

The system also prevents an already completed assignment from being completed again.

---

### 4. Course Enrollment

The Course Enrollment module allows an existing student to enroll in a course.

The system checks:

- Required fields
- Whether the Student ID exists
- Duplicate enrollment for the same student and course

Enrollments can then be viewed through the **View Enrollments** screen.

---

### 5. CGPA Calculator

The CGPA Calculator accepts four subject GPAs.

It provides:

- Empty-field validation
- Numeric input validation
- GPA range validation from 0.00 to 4.00
- Average CGPA calculation
- Result displayed to two decimal places

The current implementation calculates the simple average of the four entered GPA values.

**Formula:**

```text
CGPA = (GPA1 + GPA2 + GPA3 + GPA4) / 4
```

---

## Object-Oriented Programming Concepts

A major purpose of this project is to demonstrate practical OOP concepts.

| OOP Concept | Implementation |
|---|---|
| **Encapsulation** | Student, Account, Assignment and Enrollment data are stored in private fields with getters/setters where required. |
| **Inheritance** | `Person` extends `User`, while `Student` extends `Person`. |
| **Abstraction** | `User` is an abstract class containing the abstract `displayInfo()` method. |
| **Interface** | `Manageable` defines the `saveData()` contract, implemented by `Student`. |
| **Method Overriding** | `Student` overrides `displayInfo()` and `saveData()`. |
| **Method Overloading** | `Student` provides overloaded `displayStudent()` methods. |
| **Polymorphism** | Overridden methods allow a `Student` object to provide its own implementation of inherited behavior. |

### OOP Class Relationship

```text
                 User (abstract)
                       │
                       ▼
                Person (abstract)
                       │
                       ▼
             Student implements
                 Manageable
                       │
              ┌────────┴────────┐
              │                 │
       Student Data       saveData()
```

Other model classes:

```text
Account
Assignment
Enrollment
Manageable (interface)
```

---

## Project Architecture

The project separates its data model from the Swing-based user interface.

### Model / OOP Classes

```text
src/
├── Account.java
├── Assignment.java
├── Enrollment.java
├── Manageable.java
├── Person.java
├── Student.java
└── User.java
```

### User Interface Classes

```text
src/studentmanagementsystem/
├── Login.java
├── CreateAccount.java
├── Dashboard.java
├── AddStudent.java
├── ViewStudents.java
├── SearchStudent.java
├── DeleteStudent.java
├── AddAssignment.java
├── ViewAssignments.java
├── CompleteAssignment.java
├── EnrollCourse.java
├── ViewEnrollments.java
├── CGPACalculator.java
└── StudentManagementSystem.java
```

### Resources

```text
src/studentmanagementsystem/
├── xyz.png
└── book1.png
```

### External Library

```text
lib/
└── jcalendar-1.4.jar
```

JCalendar is used for the calendar-based due-date selector in the Add Assignment screen.

---

## Application Flow

```text
Application Start
       │
       ▼
     Login
       │
       ├── Create Account
       │
       └── Successful Login
               │
               ▼
          Dashboard
               │
       ┌───────┴───────────────────────────┐
       │                                   │
       ▼                                   ▼
Student Management                 Academic Management
       │                                   │
       ├── Add Student                     ├── Add Assignment
       ├── View Students                   ├── View Assignments
       ├── Search Student                  ├── Complete Assignment
       └── Delete Student                  ├── Enroll Course
                                           ├── View Enrollments
                                           └── CGPA Calculator
```

---

## Validation & Error Handling

The application includes validation to prevent common invalid inputs and inconsistent records.

Examples include:

- Empty-field checks
- Invalid login credentials
- Duplicate usernames
- Duplicate Student IDs
- Invalid/negative Student IDs
- Zero numeric Student IDs
- Student ID not found
- Duplicate course enrollment
- Missing assignment due date
- Assignment due date that is not in the future
- Invalid GPA input
- GPA values outside the `0–4` range
- Attempting to complete an already completed assignment
- Attempting to delete a non-existing student

User feedback is provided through Swing dialog messages.

---

## User Interface

The application uses a consistent desktop UI theme based around a teal color palette.

The interface includes:

- Login screen
- Account creation screen
- Dashboard
- Form-based management screens
- Read-only data tables
- Navigation buttons
- Dialog-based validation messages
- Calendar date selection
- Application/resource images

The main dashboard provides centralized access to student and academic management features.

---

## Technologies Used

| Technology | Purpose |
|---|---|
| **Java** | Core programming language |
| **Java Swing** | Desktop graphical user interface |
| **Apache NetBeans** | Development environment and GUI Builder |
| **JCalendar 1.4** | Calendar/date selection |
| **ArrayList** | In-memory data storage |
| **Git** | Version control |
| **GitHub** | Project hosting and portfolio presentation |

---

## How to Run the Project

### Requirements

Before running the project, install:

1. **JDK 25**
2. **Apache NetBeans**
3. A Java-compatible desktop environment

The project already contains the required JCalendar library inside:

```text
lib/jcalendar-1.4.jar
```

The project uses a relative library path, so the external JCalendar dependency does not rely on a personal computer path.

---

### Run Using Apache NetBeans

1. Download or clone this repository.
2. Open **Apache NetBeans**.
3. Select:

```text
File → Open Project
```

4. Select the `StudentManagementSystem` project folder.
5. Allow NetBeans to load the project.
6. Right-click the project.
7. Select:

```text
Clean and Build
```

8. After a successful build, click:

```text
Run Project
```

The application starts from:

```text
studentmanagementsystem.StudentManagementSystem
```

and opens the Login screen.

---

## Important Project Files

```text
StudentManagementSystem/
│
├── lib/
│   └── jcalendar-1.4.jar
│
├── src/
│   ├── OOP model classes
│   └── Swing UI classes
│
├── nbproject/
│   ├── project.properties
│   └── project.xml
│
├── .gitignore
├── build.xml
├── manifest.mf
└── README.md
```

The `.gitignore` file excludes generated/build-related files such as:

```text
build/
dist/
nbproject/private/
*.class
```

This keeps the GitHub repository cleaner and avoids committing generated files or NetBeans private configuration.

---

## Data Storage

The current version uses Java `ArrayList` collections for data storage.

The following lists are maintained by the Dashboard:

```java
ArrayList<Student>
ArrayList<Assignment>
ArrayList<Enrollment>
ArrayList<Account>
```

### Important Note

This version does **not** use a database or permanent file-based storage.

Therefore:

> Data is stored in memory while the application is running and is reset when the application is restarted.

This is intentional for the current OOP-focused version of the project.

---

## Security Note

User account credentials are currently stored in memory for demonstration purposes.

For a production-level application, authentication could be improved by adding:

- Password hashing
- Database-backed user accounts
- Role-based access control
- Secure session management

---

## Current Project Scope

### Included

- ✅ Java Swing desktop application
- ✅ User login
- ✅ Account creation
- ✅ Student CRUD-style management
- ✅ Student search
- ✅ Student deletion with related-record cleanup
- ✅ Course enrollment
- ✅ Duplicate enrollment prevention
- ✅ Assignment creation
- ✅ Calendar-based due dates
- ✅ Assignment completion
- ✅ Assignment status tracking
- ✅ CGPA calculator
- ✅ Input validation
- ✅ OOP concepts
- ✅ External library integration
- ✅ Git-ready project structure

### Not Included Yet

- ❌ Database
- ❌ Permanent data storage
- ❌ Password hashing
- ❌ Online/cloud functionality
- ❌ Multi-user network access

---

## Learning Objectives

This project was created to practice and demonstrate:

- Java fundamentals
- Object-Oriented Programming
- Java Swing GUI development
- Event-driven programming
- Classes and objects
- Inheritance
- Abstraction
- Interfaces
- Encapsulation
- Method overriding
- Method overloading
- ArrayList collections
- Input validation
- Basic application architecture
- Third-party library integration
- NetBeans GUI Builder
- Git and GitHub project management

---

## Project Status

**Status:** Completed academic OOP project and prepared for GitHub presentation.

The current version focuses on demonstrating Java OOP concepts through a functional desktop application.

---

## Repository Purpose

This project is part of my software engineering learning journey and demonstrates my practical work with **Java, Object-Oriented Programming, GUI development, validation, and application design**.

If you find the project useful for learning, feel free to explore the source code and its OOP structure.

---

## License

This project is currently shared for **educational and portfolio purposes**.
