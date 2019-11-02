package io.zipcoder;

import org.junit.Test;

public class ClassroomTest {


    @Test
    public void getAllAverageExamScoresTest() {


        // : Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student[] {s1, s2};


        Classroom classroom = new Classroom(students);

        // When
        Integer output = classroom.getAllAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void removeStudentTest(){


        // : Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student[] {s1, s2};
        Classroom classroom = new Classroom(students);
        //When
        classroom.removeStudent("student", "one" );

        //actual
        System.out.println(classroom.getStudents());

    }
    @Test
    public void getStudentsByScore() {


        // : Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};
        Double[] s3Scores = {300.0, 50.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student s3 = new Student("student", "three", s2Scores);

        Student[] students = new Student[] {s1, s2, s3};


        Classroom classroom = new Classroom(students);

        // When
         classroom.getStudentsByScore();

        // Then

    }
}
