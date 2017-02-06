package edu.kirkwood;
import edu.kirkwood.crcu.cis171.k0789546.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Student> missingStudents = new ArrayList<>();

        Student gage = new Student();
        gage.setName("Gage ", "Lake");

        Student andrewR = new Student();
        andrewR.setName("Andrew ", "Rompot");

        missingStudents.add(gage);
        missingStudents.add(andrewR);

        for (Student p : missingStudents){
            System.out.println(p.greet());
        }


    }
}
