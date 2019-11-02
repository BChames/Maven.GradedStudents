package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {

  private Student[] students;
  ArrayList<Student> studentList;

    public Classroom(int maxNumberOfStudents){
      Student[] maxClassroom = new Student[30];

  }
  public Classroom(Student[] students){
         this.students = students;
  }
  public Classroom(){
      Student[] students = new Student[30];
  }

 public String getStudents(){
      return students.toString();
 }

 public Integer getAllAverageExamScore(){
     //Define a getter which returns the sum of all exams divded by the number of exams.
     //sum of all exams first
    //double loop
     Double numberOfExams = 0.0;
     Double examScoresTotal = 0.0;
     Double result = 0.0;
     for(int i = 0; i < students.length; i++) {
         for (int j = 0; j < students.length; j++) {
             examScoresTotal += students[i].getExamScores1().get(j);
             numberOfExams++;
         }
     }

     result = examScoresTotal / numberOfExams;
     Integer value = result.intValue();
     return value;
 }


 public void addStudent(Student student){
    studentList.add(student);
  }
 public void removeStudent(String firstName, String lastName) {
     String result = "";
     boolean removed = false;

     for (int i = 0; i < students.length; i++) {
         if(students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName) ) {
             students[i] = null;
             removed = true;
;         }
         else if (removed == true){
             students[i -1] = students[i];
         }
     }
 }

 public void getStudentsByScore(){


 }
    /*
    public Integer getAllAverageExamScore(){

        Double result = 0.0;
        Double count = 0.0;//Get length of arraylist
        for(int i = 1; i < examScores.size() +1 - 1; i++){
            result+= examScores.get(i);
            // result / examScores.size() - 1;
            count++;
        }
        Double result2 = result / count;
        Integer value = result2.intValue();
        return value;
    }

 */
}
