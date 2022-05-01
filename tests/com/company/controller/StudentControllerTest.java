package com.company.controller;

import com.company.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    private StudentController studentController;

    @BeforeEach
    public  void  preconditie(){
        studentController=new StudentController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\CollegeFestivalOrganizer\\src\\com\\company\\resurces\\students.txt");
    }
//  public Student(int id,String name,String mobile,String email,String address,String password,String username,int collage_id)
    @Test
    void load() {
        Student student1=new Student("1,Anca,0788533,ani@yahoo.com,Morii nr 6,123,ani,2");
        Student student2=new Student("2,Adi,0734,adi@yahoo.com,Libertatii nr 7,234,adi,1");
        Student student3=new Student("3,Lucii,072425,luci@yahoo.com,Dezrobitii nr 45,123,lucii,3");
        Student student4=new Student("4,Vali,072353,vali@yahoo.com,Pacii nr 54,123,vali,4");

        studentController.adauga(student1);
        studentController.adauga(student2);
        studentController.adauga(student3);
        studentController.adauga(student4);

        assertEquals(true,studentController.isStudent("Anca"));
        assertEquals(true,studentController.isStudent("Adi"));
        assertEquals(true,studentController.isStudent("Lucii"));
        assertEquals(true,studentController.isStudent("Vali"));
    }

    @Test
    void afiseaza() {
        Student student1=new Student("1,Anca,0788533,ani@yahoo.com,Morii nr 6,123,ani,2");
        Student student2=new Student("2,Adi,0734,adi@yahoo.com,Libertatii nr 7,234,adi,1");
        Student student3=new Student("3,Lucii,072425,luci@yahoo.com,Dezrobitii nr 45,123,lucii,3");
        Student student4=new Student("4,Vali,072353,vali@yahoo.com,Pacii nr 54,123,vali,4");

        studentController.adauga(student1);
        studentController.adauga(student2);
        studentController.adauga(student3);
        studentController.adauga(student4);

        studentController.afiseaza();
    }

    @Test
    void adauga() {
        Student student1=new Student("1,Anca,0788533,ani@yahoo.com,Morii nr 6,123,ani,2");
        Student student2=new Student("2,Adi,0734,adi@yahoo.com,Libertatii nr 7,234,adi,1");
        Student student3=new Student("3,Lucii,072425,luci@yahoo.com,Dezrobitii nr 45,123,lucii,3");
        Student student4=new Student("4,Vali,072353,vali@yahoo.com,Pacii nr 54,123,vali,4");

        studentController.adauga(student1);
        studentController.adauga(student2);
        studentController.adauga(student3);
        studentController.adauga(student4);

        assertEquals(true,studentController.isStudent("Anca"));
        assertEquals(true,studentController.isStudent("Adi"));
        assertEquals(true,studentController.isStudent("Lucii"));
        assertEquals(true,studentController.isStudent("Vali"));


    }

    @Test
    void toSaveFisier() {
        Student student1=new Student("1,Anca,0788533,ani@yahoo.com,Morii nr 6,123,ani,2");
        Student student2=new Student("2,Adi,0734,adi@yahoo.com,Libertatii nr 7,234,adi,1");
        Student student3=new Student("3,Lucii,072425,luci@yahoo.com,Dezrobitii nr 45,123,lucii,3");
        Student student4=new Student("4,Vali,072353,vali@yahoo.com,Pacii nr 54,123,vali,4");

        studentController.adauga(student1);
        studentController.adauga(student2);
        studentController.adauga(student3);
        studentController.adauga(student4);

        studentController.toSaveFisier();

        assertEquals(true,studentController.isStudent("Anca"));
        assertEquals(true,studentController.isStudent("Adi"));
        assertEquals(true,studentController.isStudent("Lucii"));
        assertEquals(true,studentController.isStudent("Vali"));
    }

    @Test
    void updateMobil() {
        Student student1=new Student("1,Anca,0788533,ani@yahoo.com,Morii nr 6,123,ani,2");
        Student student2=new Student("2,Adi,0734,adi@yahoo.com,Libertatii nr 7,234,adi,1");
        Student student3=new Student("3,Lucii,072425,luci@yahoo.com,Dezrobitii nr 45,123,lucii,3");
        Student student4=new Student("4,Vali,072353,vali@yahoo.com,Pacii nr 54,123,vali,4");

        studentController.adauga(student1);
        studentController.adauga(student2);
        studentController.adauga(student3);
        studentController.adauga(student4);

        studentController.updateMobil("Vali","999");
        studentController.afiseaza();
    }

    @Test
    void isStudent() {
        Student student1=new Student("1,Anca,0788533,ani@yahoo.com,Morii nr 6,123,ani,2");
        Student student2=new Student("2,Adi,0734,adi@yahoo.com,Libertatii nr 7,234,adi,1");
        Student student3=new Student("3,Lucii,072425,luci@yahoo.com,Dezrobitii nr 45,123,lucii,3");
        Student student4=new Student("4,Vali,072353,vali@yahoo.com,Pacii nr 54,123,vali,4");

        studentController.adauga(student1);
        studentController.adauga(student2);
        studentController.adauga(student3);
        studentController.adauga(student4);

        assertEquals(true,studentController.isStudent("Anca"));
        assertEquals(true,studentController.isStudent("Adi"));
        assertEquals(true,studentController.isStudent("Lucii"));
        assertEquals(true,studentController.isStudent("Vali"));
    }

    @Test
    void stergeStudent() {
        Student student1=new Student("1,Anca,0788533,ani@yahoo.com,Morii nr 6,123,ani,2");
        Student student2=new Student("2,Adi,0734,adi@yahoo.com,Libertatii nr 7,234,adi,1");
        Student student3=new Student("3,Lucii,072425,luci@yahoo.com,Dezrobitii nr 45,123,lucii,3");
        Student student4=new Student("4,Vali,072353,vali@yahoo.com,Pacii nr 54,123,vali,4");

        studentController.adauga(student1);
        studentController.adauga(student2);
        studentController.adauga(student3);
        studentController.adauga(student4);

        assertEquals(true,studentController.isStudent("Anca"));
        assertEquals(true,studentController.isStudent("Adi"));
        assertEquals(true,studentController.isStudent("Lucii"));
        assertEquals(true,studentController.isStudent("Vali"));

        studentController.stergeStudent("Anca");
        studentController.stergeStudent("Adi");
        studentController.stergeStudent("Lucii");
        studentController.stergeStudent("Vali");


        assertEquals(false,studentController.isStudent("Anca"));
        assertEquals(false,studentController.isStudent("Adi"));
        assertEquals(false,studentController.isStudent("Lucii"));
        assertEquals(false,studentController.isStudent("Vali"));

    }

    @Test
    void returnDupaNume() {
        Student student1=new Student("1,Anca,0788533,ani@yahoo.com,Morii nr 6,123,ani,2");
        Student student2=new Student("2,Adi,0734,adi@yahoo.com,Libertatii nr 7,234,adi,1");
        Student student3=new Student("3,Lucii,072425,luci@yahoo.com,Dezrobitii nr 45,123,lucii,3");
        Student student4=new Student("4,Vali,072353,vali@yahoo.com,Pacii nr 54,123,vali,4");

        studentController.adauga(student1);
        studentController.adauga(student2);
        studentController.adauga(student3);
        studentController.adauga(student4);
        System.out.println(studentController.returnDupaNume("Anca"));
    }
}