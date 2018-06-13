import models.Student;

import java.util.ArrayList;

public class DoubleMajor extends Student implements TwoMajors, Noisy{ //class extends and implements!

    boolean doubleMajor = true;
    String majorOne;
    String majorTwo;
    String mathLabAccess;
    String travelAbroad;

    public DoubleMajor(String firstName, String lastName, String address, String dateOfBirth, String studentId, String majorOne, String majorTwo, String mathLabAccess, String travelAbroad) {
        super(firstName, lastName, address, dateOfBirth, studentId);
        this.majorOne = majorOne;
        this.majorTwo = majorTwo;
        this.mathLabAccess = mathLabAccess;
        this.travelAbroad = travelAbroad;
    }

    @Override
    public ArrayList<String> reportAccessCorrectly() { //i gotta be here
        ArrayList<String> accessList = new ArrayList<>();


        //logic to calculate list of places student has access to
        return accessList;
    }

    @Override
    public ArrayList<String> canDoStudyAbroadWhere() { //me too
        ArrayList<String> studyAbroad = new ArrayList<>();

        //logic to calculate all parts of world student can do study abroad.
        return studyAbroad;
    }

    @Override
    public void angryNoise() {
        System.out.println("I AM SO OVERWORKED!!");
    }

    @Override
    public void happyNoise() {
        System.out.println("I AM SO INTELLECTUALLY STIMULATED");

    }
}