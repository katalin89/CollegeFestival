package com.company.controller;

import com.company.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    private UserController userController;

    @BeforeEach
    public  void preconditie(){
        userController=new UserController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\CollegeFestivalOrganizer\\src\\com\\company\\resurces\\users.txt");
    }

    @Test
    void load() {
        // public  User(int id,int role_id,String name,String email,String dob,String address){
        User user1=new User("1,1,Mihai,mihai@yahoo.com,2000-01-23,Libertatii nr 45");
        User user2=new User("2,2,Adrian,adi@yahoo.com,1999-03-09,Pacii nr 5");
        User user3=new User("3,4,Anca,ani@yahoo.com,1978-09-07,Dezrobirii nr 6");
        User user4=new User("4,1,Vali,vali@yahoo.com,1988-06-04,Morii nr 56");

        userController.adauga(user1);
        userController.adauga(user2);
        userController.adauga(user3);
        userController.adauga(user4);

        assertEquals(true,userController.isUser("Mihai"));
        assertEquals(true,userController.isUser("Adrian"));
        assertEquals(true,userController.isUser("Anca"));
        assertEquals(true,userController.isUser("Vali"));
    }

    @Test
    void afiseaza() {
        User user1=new User("1,1,Mihai,mihai@yahoo.com,2000-01-23,Libertatii nr 45");
        User user2=new User("2,2,Adrian,adi@yahoo.com,1999-03-09,Pacii nr 5");
        User user3=new User("3,4,Anca,ani@yahoo.com,1978-09-07,Dezrobirii nr 6");
        User user4=new User("4,1,Vali,vali@yahoo.com,1988-06-04,Morii nr 56");

        userController.adauga(user1);
        userController.adauga(user2);
        userController.adauga(user3);
        userController.adauga(user4);

        userController.afiseaza();
    }

    @Test
    void adauga() {
        User user1=new User("1,1,Mihai,mihai@yahoo.com,2000-01-23,Libertatii nr 45");
        User user2=new User("2,2,Adrian,adi@yahoo.com,1999-03-09,Pacii nr 5");
        User user3=new User("3,4,Anca,ani@yahoo.com,1978-09-07,Dezrobirii nr 6");
        User user4=new User("4,1,Vali,vali@yahoo.com,1988-06-04,Morii nr 56");

        userController.adauga(user1);
        userController.adauga(user2);
        userController.adauga(user3);
        userController.adauga(user4);

        assertEquals(true,userController.isUser("Mihai"));
        assertEquals(true,userController.isUser("Adrian"));
        assertEquals(true,userController.isUser("Anca"));
        assertEquals(true,userController.isUser("Vali"));
    }

    @Test
    void toSaveFisier() {

        User user1=new User("1,1,Mihai,mihai@yahoo.com,2000-01-23,Libertatii nr 45");
        User user2=new User("2,2,Adrian,adi@yahoo.com,1999-03-09,Pacii nr 5");
        User user3=new User("3,4,Anca,ani@yahoo.com,1978-09-07,Dezrobirii nr 6");
        User user4=new User("4,1,Vali,vali@yahoo.com,1988-06-04,Morii nr 56");

        userController.adauga(user1);
        userController.adauga(user2);
        userController.adauga(user3);
        userController.adauga(user4);

        assertEquals(true,userController.isUser("Mihai"));
        assertEquals(true,userController.isUser("Adrian"));
        assertEquals(true,userController.isUser("Anca"));
        assertEquals(true,userController.isUser("Vali"));

        userController.toSaveFisier();
    }

    @Test
    void updateAdress() {
        User user1=new User("1,1,Mihai,mihai@yahoo.com,2000-01-23,Libertatii nr 45");
        User user2=new User("2,2,Adrian,adi@yahoo.com,1999-03-09,Pacii nr 5");
        User user3=new User("3,4,Anca,ani@yahoo.com,1978-09-07,Dezrobirii nr 6");
        User user4=new User("4,1,Vali,vali@yahoo.com,1988-06-04,Morii nr 56");

        userController.adauga(user1);
        userController.adauga(user2);
        userController.adauga(user3);
        userController.adauga(user4);

        userController.updateAdress("Vali","test");
        userController.afiseaza();

    }

    @Test
    void isUser() {
        User user1=new User("1,1,Mihai,mihai@yahoo.com,2000-01-23,Libertatii nr 45");
        User user2=new User("2,2,Adrian,adi@yahoo.com,1999-03-09,Pacii nr 5");
        User user3=new User("3,4,Anca,ani@yahoo.com,1978-09-07,Dezrobirii nr 6");
        User user4=new User("4,1,Vali,vali@yahoo.com,1988-06-04,Morii nr 56");

        userController.adauga(user1);
        userController.adauga(user2);
        userController.adauga(user3);
        userController.adauga(user4);

        assertEquals(true,userController.isUser("Mihai"));
        assertEquals(true,userController.isUser("Adrian"));
        assertEquals(true,userController.isUser("Anca"));
        assertEquals(true,userController.isUser("Vali"));
    }

    @Test
    void stergeUser() {

        User user1=new User("1,1,Mihai,mihai@yahoo.com,2000-01-23,Libertatii nr 45");
        User user2=new User("2,2,Adrian,adi@yahoo.com,1999-03-09,Pacii nr 5");
        User user3=new User("3,4,Anca,ani@yahoo.com,1978-09-07,Dezrobirii nr 6");
        User user4=new User("4,1,Vali,vali@yahoo.com,1988-06-04,Morii nr 56");

        userController.adauga(user1);
        userController.adauga(user2);
        userController.adauga(user3);
        userController.adauga(user4);

        assertEquals(true,userController.isUser("Mihai"));
        assertEquals(true,userController.isUser("Adrian"));
        assertEquals(true,userController.isUser("Anca"));
        assertEquals(true,userController.isUser("Vali"));

        userController.stergeUser("Mihai");
        userController.stergeUser("Adrian");
        userController.stergeUser("Anca");
        userController.stergeUser("Vali");

        assertEquals(false,userController.isUser("Mihai"));
        assertEquals(false,userController.isUser("Adrian"));
        assertEquals(false,userController.isUser("Anca"));
        assertEquals(false,userController.isUser("Vali"));
    }

    @Test
    void returnDupaNume() {


        User user1=new User("1,1,Mihai,mihai@yahoo.com,2000-01-23,Libertatii nr 45");
        User user2=new User("2,2,Adrian,adi@yahoo.com,1999-03-09,Pacii nr 5");
        User user3=new User("3,4,Anca,ani@yahoo.com,1978-09-07,Dezrobirii nr 6");
        User user4=new User("4,1,Vali,vali@yahoo.com,1988-06-04,Morii nr 56");

        userController.adauga(user1);
        userController.adauga(user2);
        userController.adauga(user3);
        userController.adauga(user4);

        System.out.println(userController.returnDupaNume("Anca"));
    }
}