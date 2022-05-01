package com.company;

import View.ViewStudent;
import com.company.model.*;

public class Main {

    public static void main(String[] args) {
        Student student=new Student("1,Vali,072424,vali@yahoo.com,Libertatii ne 5,123,vali,2,1");
     ViewStudent viewStudent=new ViewStudent(student);
     viewStudent.play();

    }
}
