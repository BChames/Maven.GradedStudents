package io.zipcoder;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {


    private String firstName;
    private String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName,  Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();

    }
    public void setExamScore(int examNumber, double newScore){
       examScores.add(examNumber+1, newScore);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        String examStr = "Exam Scores:\n";
        int count = 1;
        for(int i = 0; i < examScores.size(); i++){
            examStr+= "Exam " + count++ + " -> "+ examScores.get(i) +"\n";
        }

        return examStr;
    }
    public ArrayList<Double> getExamScores1(){
      return  this.examScores;
    }
    public void addExamScore(Double input){
         examScores.add(input);
    }

    @Override
    public String toString() {
        String examStr = "";
        int count = 1;

          for (int i = 0; i < examScores.size(); i++) {
              Integer value = examScores.get(i).intValue();
              examStr += "Exam " + count++ + " -> " + value + "\n";
        }



        return "Student Name: " + firstName + ' ' + lastName + "\n" +
                "> Average Score: " + getAverageExamScore() + "\n" +
                "> Exam Scores: " + "\n" + examStr;
    }



    public Integer getAverageExamScore(){

        Double result = 0.0;
        Double count = 0.0;//Get length of arraylist
        for(int i = 1; i < examScores.size(); i++){
            result+= examScores.get(i);
           // result / examScores.size() - 1;
            count++;
        }
        Double result2 = result / count;
        Integer value = result2.intValue();
        return value;
    }
}

