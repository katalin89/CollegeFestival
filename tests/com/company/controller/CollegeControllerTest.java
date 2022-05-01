package com.company.controller;

import com.company.model.College;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollegeControllerTest {
    private CollegeController collegeController;

    @BeforeEach
    public  void  preconditie(){
        collegeController=new CollegeController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\CollegeFestivalOrganizer\\src\\com\\company\\resurces\\college.txt");
    }

    @Test
    public  void load(){

        College college1=new College("1,Universitatea Petru Maior,din Tg Mures");
        College college2=new College("2,Universitatea UMF,din Tg Mures");
        College college3=new College("3,Universitatea Babes,din Cluj");

        collegeController.adauga(college1);
        collegeController.adauga(college2);
        collegeController.adauga(college3);

       assertEquals(true,collegeController.isCollege("Universitatea Petru Maior"));
        assertEquals(true,collegeController.isCollege("Universitatea UMF"));
        assertEquals(true,collegeController.isCollege("Universitatea Babes"));
    }

    @Test
    public  void saveFiser(){

        College college1=new College("1,Universitatea Petru Maior,din Tg Mures");
        College college2=new College("2,Universitatea UMF,din Tg Mures");
        College college3=new College("3,Universitatea Babes,din Cluj");

        collegeController.adauga(college1);
        collegeController.adauga(college2);
        collegeController.adauga(college3);

        collegeController.toSaveFisier();

        collegeController.afiseaza();
    }

    @Test
    public  void updateDesc(){

        College college1=new College("1,Universitatea Petru Maior,din Tg Mures");
        College college2=new College("2,Universitatea UMF,din Tg Mures");
        College college3=new College("3,Universitatea Babes,din Cluj");

        collegeController.adauga(college1);
        collegeController.adauga(college2);
        collegeController.adauga(college3);

        collegeController.updateDescr("Universitatea UMF","cel mai popular");

        collegeController.afiseaza();
    }

    @Test
    public  void isCollege(){

        College college1=new College("1,Universitatea Petru Maior,din Tg Mures");
        College college2=new College("2,Universitatea UMF,din Tg Mures");
        College college3=new College("3,Universitatea Babes,din Cluj");

        collegeController.adauga(college1);
        collegeController.adauga(college2);
        collegeController.adauga(college3);

        System.out.println(collegeController.isCollege("Universitatea UMF"));
    }


    @Test
    public  void sterge(){

        College college1=new College("1,Universitatea Petru Maior,din Tg Mures");
        College college2=new College("2,Universitatea UMF,din Tg Mures");
        College college3=new College("3,Universitatea Babes,din Cluj");

        collegeController.adauga(college1);
        collegeController.adauga(college2);
        collegeController.adauga(college3);

        collegeController.stergeCollege("Universitatea UMF");
        assertEquals(false,collegeController.isCollege("Universitatea UMF"));

    }


    @Test
    public  void returnCollege(){

        College college1=new College("1,Universitatea Petru Maior,din Tg Mures");
        College college2=new College("2,Universitatea UMF,din Tg Mures");
        College college3=new College("3,Universitatea Babes,din Cluj");

        collegeController.adauga(college1);
        collegeController.adauga(college2);
        collegeController.adauga(college3);

        System.out.println( collegeController.returnDupaNume("Universitatea UMF"));


    }
}