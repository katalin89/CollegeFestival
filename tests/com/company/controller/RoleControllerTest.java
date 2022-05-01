package com.company.controller;

import com.company.model.Role;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleControllerTest {
     private RoleController roleController;

     @BeforeEach
     public void preconditie(){
         roleController=new RoleController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\CollegeFestivalOrganizer\\src\\com\\company\\resurces\\roles.txt");
     }

    @Test
    void load() {
        Role role1=new Role("1,concert de primavara,sala Mare ");
        Role role2=new Role("2,concert de toamna,curtea Univ");
        Role role3=new Role("3,concert caritativ,Teatru de Stat");
        Role role4=new Role("4,concert de zilele universitatii,Curte");
        roleController.adauga(role1);
        roleController.adauga(role2);
        roleController.adauga(role3);
        roleController.adauga(role4);
        assertEquals(true,roleController.isRole("concert de primavara"));
        assertEquals(true,roleController.isRole("concert de toamna"));
        assertEquals(true,roleController.isRole("concert caritativ"));
        assertEquals(true,roleController.isRole("concert de zilele universitatii"));

        roleController.stergeRole("concert de primavara");
        roleController.stergeRole("concert de primavara");
        roleController.stergeRole("concert caritativ");
        roleController.stergeRole("concert de zilele universitatii");

        assertEquals(false,roleController.isRole("concert de primavara"));
        assertEquals(false,roleController.isRole("concert de primavara"));
        assertEquals(false,roleController.isRole("concert caritativ"));
        assertEquals(false,roleController.isRole("concert de zilele universitatii"));



    }

    @Test
    void afiseaza() {

        Role role1=new Role("1,concert de primavara,sala Mare ");
        Role role2=new Role("2,concert de toamna,curtea Univ");
        Role role3=new Role("3,concert caritativ,Teatru de Stat");
        Role role4=new Role("4,concert de zilele universitatii,Curte");
        roleController.adauga(role1);
        roleController.adauga(role2);
        roleController.adauga(role3);
        roleController.adauga(role4);

        roleController.afiseaza();
    }

    @Test
    void toSaveFisier() {
        Role role1=new Role("1,concert de primavara,sala Mare ");
        Role role2=new Role("2,concert de toamna,curtea Univ");
        Role role3=new Role("3,concert caritativ,Teatru de Stat");
        Role role4=new Role("4,concert de zilele universitatii,Curte");
        roleController.adauga(role1);
        roleController.adauga(role2);
        roleController.adauga(role3);
        roleController.adauga(role4);

        roleController.toSaveFisier();
    }

    @Test
    void updateDescr() {
        Role role1=new Role("1,concert de primavara,sala Mare ");
        Role role2=new Role("2,concert de toamna,curtea Univ");
        Role role3=new Role("3,concert caritativ,Teatru de Stat");
        Role role4=new Role("4,concert de zilele universitatii,Curte");
        roleController.adauga(role1);
        roleController.adauga(role2);
        roleController.adauga(role3);
        roleController.adauga(role4);

        roleController.updateDescr("concert de primavara","clasa");
        roleController.afiseaza();
    }

    @Test
    void isRole() {

        Role role1=new Role("1,concert de primavara,sala Mare ");
        Role role2=new Role("2,concert de toamna,curtea Univ");
        Role role3=new Role("3,concert caritativ,Teatru de Stat");
        Role role4=new Role("4,concert de zilele universitatii,Curte");
        roleController.adauga(role1);
        roleController.adauga(role2);
        roleController.adauga(role3);
        roleController.adauga(role4);

        assertEquals(true,roleController.isRole("concert de primavara"));
        assertEquals(true,roleController.isRole("concert de toamna"));
        assertEquals(true,roleController.isRole("concert caritativ"));
        assertEquals(true,roleController.isRole("concert de zilele universitatii"));
    }

    @Test
    void stergeRole() {

        Role role1=new Role("1,concert de primavara,sala Mare ");
        Role role2=new Role("2,concert de toamna,curtea Univ");
        Role role3=new Role("3,concert caritativ,Teatru de Stat");
        Role role4=new Role("4,concert de zilele universitatii,Curte");
        roleController.adauga(role1);
        roleController.adauga(role2);
        roleController.adauga(role3);
        roleController.adauga(role4);
        assertEquals(true,roleController.isRole("concert de primavara"));
        assertEquals(true,roleController.isRole("concert de toamna"));
        assertEquals(true,roleController.isRole("concert caritativ"));
        assertEquals(true,roleController.isRole("concert de zilele universitatii"));

        roleController.stergeRole("concert de primavara");
        roleController.stergeRole("concert de primavara");
        roleController.stergeRole("concert caritativ");
        roleController.stergeRole("concert de zilele universitatii");

        assertEquals(false,roleController.isRole("concert de primavara"));
        assertEquals(false,roleController.isRole("concert de primavara"));
        assertEquals(false,roleController.isRole("concert caritativ"));
        assertEquals(false,roleController.isRole("concert de zilele universitatii"));


    }

    @Test
    void returnDupaTitlu() {

        Role role1=new Role("1,concert de primavara,sala Mare ");
        Role role2=new Role("2,concert de toamna,curtea Univ");
        Role role3=new Role("3,concert caritativ,Teatru de Stat");
        Role role4=new Role("4,concert de zilele universitatii,Curte");
        roleController.adauga(role1);
        roleController.adauga(role2);
        roleController.adauga(role3);
        roleController.adauga(role4);
        System.out.println(roleController.returnDupaTitlu("concert de toamna"));
    }
}