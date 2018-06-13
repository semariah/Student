package models;

public class MathStudent extends Student {
    private boolean mathLabAccess = true;
    private String currentMathclass;
    private boolean mathLetesMember = true;


    public MathStudent(String firstName, String lastName, String address, String dateOfBirth, String studentId, boolean mathLabAccess, String currentMathclass, boolean mathLetesMember) {
        super(firstName, lastName, address, dateOfBirth, studentId);
        this.mathLabAccess = mathLabAccess;
        this.currentMathclass = currentMathclass;
        this.mathLetesMember = mathLetesMember;
    }
}
