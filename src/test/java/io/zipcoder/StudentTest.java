package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void getFirstNameTest(){

        //GIVEN
        Student nameTest = new Student("Jeff",null , null);
        String expected = "Jeff";
        //WHEN
        String actual = nameTest.getFirstName();
        //THEN
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getLastNameTest(){

        //GIVEN
        Student nameTest = new Student(null,"Blob" , null);
        String expected = "Blob";
        //WHEN
        String actual = nameTest.getLastName();
        //THEN
        Assert.assertEquals(expected, actual);
    }
//Come back to this test
    @Test
    public void getNumberOfExamsTakenTest(){

        //GIVEN
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        Integer expected = 4;
        //WHEN
        Integer actual = student.getNumberOfExamsTaken();
        //THEN
        Assert.assertEquals(expected, actual);
    }
    //Come back to this test
    @Test
    public void getExamScoreTest(){

        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n" + "Exam 1 -> 100.0\n" + "Exam 2 -> 95.0\n" + "Exam 3 -> 123.0\n" + "Exam 4 -> 96.0";

        String actual = student.getExamScores();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAverageTest(){

        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        Integer expected = 104;

        Integer actual = student.getAverageExamScore();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void toStringOverrideTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.toString();

        System.out.println(actual);
    }



}