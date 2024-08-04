package School.Management.System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher priya = new Teacher(1,"priya",8000);
        Teacher rama = new Teacher(2,"rama",10000);
        Teacher giri = new Teacher(3,"giri",7000);

        List<Teacher> teacherlist = new ArrayList<>();
        teacherlist.add(priya);
        teacherlist.add(rama);
        teacherlist.add(giri);

        Student danish = new Student(1,"danish",5);
        Student vicky = new Student(2,"vicky",2);
        Student kamal = new Student(3,"kamalan",3);

        List<Student> studentlist = new ArrayList<>();
        studentlist.add(danish);
        studentlist.add(vicky);
        studentlist.add(kamal);

        School psm = new School(teacherlist,studentlist);
        danish.payFees(50000);
        vicky.payFees(80000);

        System.out.println("psm has earned Rs"+psm.getTotalMoneyEarned());

        priya.recieveSalary(priya.getSalary());
        System.out.println(priya.getSalary());
        System.out.println("psm has paid salary to " +priya.getName() +" and now has "+psm.getTotalMoneyEarned());

        rama.recieveSalary(rama.getSalary());

        System.out.println("psm has paid salary to " +rama.getName() +" and now has "+psm.getTotalMoneyEarned());

        System.out.println(vicky);
        System.out.println(rama);
        System.out.println(psm);
    }
}
