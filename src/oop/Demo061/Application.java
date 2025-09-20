package oop.Demo061;
import oop.Demo06.Student;

import java.util.Scanner;
public class Application {
    public static void main(String[] args) {

        //Object > String
        //Object > Person > Teacher
        //Object > Person > Student
        Object object = new Student();

        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//False
        System.out.println(object instanceof String);//False


    }


}
