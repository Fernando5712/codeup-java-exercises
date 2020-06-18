package Grades;

import java.util.ArrayList;

public class Student {
    private String name;
    ArrayList<Integer> grades = new ArrayList<>();


    public Student(String name) {
        this.name = name;
    }
    public Student(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
       grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for (int i = 0; i < grades.size(); i++){
          total += grades.get(i);
        }
        return total/grades.size();
    }


    public static void main(String[] args) {
        Student studentName = new Student("Mike");
        studentName.addGrade(86);
        studentName.addGrade(75);
        studentName.addGrade(85);
        studentName.addGrade(50);

        System.out.println(studentName.name);
        System.out.println(studentName.grades);
        System.out.println(studentName.getGradeAverage());
    }
}

