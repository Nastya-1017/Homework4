package fmi.informatics.gui;

import fmi.informatics.extending.Person;
import fmi.informatics.extending.Student;

public class GUIUnitTest {

    public static void peopleCountTester(int numOfPeople){
        int expectedNumber = 25;

        if (numOfPeople==expectedNumber){
            System.out.printf("Test has passed, there are %d in the list\n",numOfPeople);
        }else {
            System.out.printf("The number from the table (%d)of people do " +
                    "not match the expected number of people(%d)",numOfPeople,expectedNumber);
        }
    }
    public static void studentCountTester(Person[] people){
        int expectedResult = 12;
        int actualResult=0;
        for (Person person : people) {
            if (person instanceof Student){
                actualResult++;
            }
        }
        if (expectedResult==actualResult){
            System.out.println("The number of Students is as to be expected");
        }
        else {
            System.out.printf("The number of students (%d) does not match the expected number (%d)",actualResult,expectedResult);
        }
    }
}
