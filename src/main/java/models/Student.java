package models;

public class Student {
    private String firstName;
    private String lastName;
    private String address;
    private String dateOfBirth;
    private String studentId;

    public Student(String firstName, String lastName, String address, String dateOfBirth, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.studentId = studentId;
    }
}
