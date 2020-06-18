package Grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student s1 = new Student("Dylan");
        Student s2 = new Student("Fernando");
        Student s3 = new Student("Jay");
        Student s4 = new Student("Armando");

        s1.addGrade(80);
        s1.addGrade(75);
        s1.addGrade(50);
        s2.addGrade(80);
        s2.addGrade(90);
        s2.addGrade(60);
        s3.addGrade(100);
        s3.addGrade(100);
        s3.addGrade(100);
        s4.addGrade(90);
        s4.addGrade(80);
        s4.addGrade(70);



        students.put("Dylan98",s1);
        students.put("Fernando117",s2);
        students.put("Jay45",s3);
        students.put("Armando92",s4);


        System.out.println("Hey there!");
        System.out.println("Which username would you like to see");
        System.out.println("|Dylan98| " + " |Fernando117| " + " |Jay45| " + " |Armando92|");
        System.out.println(" What Student would you like more info on ?");
        searchStudent(students);
//        Form of getting user input
//        System.out.println(Student.get("Dylan98").getName());
    }
    public static void searchStudent(HashMap<String,Student> students){
        Scanner sc = new Scanner(System.in);
        String sStudent = sc.nextLine();
        if (students.containsKey(sStudent)){
            System.out.println("Name: " + students.get(sStudent).getName());
            System.out.println("Average grade: " + students.get(sStudent).getGradeAverage());
        } else
            System.out.println("These are not the students you are looking for " + sStudent + ".");
            System.out.println("Would you like to look for another student");
            String input = sc.next();
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
                System.out.println("Enter another student");
                searchStudent(students);
            } else {
                System.out.println("Goodbye see you next time !");
            }
    }
}
