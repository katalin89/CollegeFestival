package com.company.controller;

import com.company.model.Permission;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermissionControllerTest {

    private  PermissionController permissionController;

    @BeforeEach
    public void preconditie() {
        permissionController = new PermissionController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\CollegeFestivalOrganizer\\src\\com\\company\\resurces\\permission.txt");
    }

    @Test

    public  void load(){
        Permission permission1=new Permission("1,1,concert1,scolar,balul bobocilor");
        Permission permission2=new Permission("2,2,concert2,festival,zilele studentilor");
        Permission permission3=new Permission("3,3,concert3,universitate,caritativ");
        Permission permission4=new Permission("4,4,concert4,festival,zilele universitatii");

        permissionController.adauga(permission1);
        permissionController.adauga(permission2);
        permissionController.adauga(permission3);
        permissionController.adauga(permission4);

        permissionController.toSaveFisier();
        permissionController.load();
        assertEquals(true,permissionController.isPermission("concert1"));
        assertEquals(true,permissionController.isPermission("concert2"));
        assertEquals(true,permissionController.isPermission("concert3"));
        assertEquals(true,permissionController.isPermission("concert4"));

        permissionController.stergePermission("concert1");
        permissionController.stergePermission("concert2");
        permissionController.stergePermission("concert3");
        permissionController.stergePermission("concert4");

        permissionController.toSaveFisier();
        permissionController.load();
        assertEquals(false,permissionController.isPermission("concert1"));
        assertEquals(false,permissionController.isPermission("concert2"));
        assertEquals(false,permissionController.isPermission("concert3"));
        assertEquals(false,permissionController.isPermission("concert4"));
    }
    @Test

    public  void afiseaza() {
        Permission permission1 = new Permission("1,1,concert1,scolar,balul bobocilor");
        Permission permission2 = new Permission("2,2,concert2,festival,zilele studentilor");
        Permission permission3 = new Permission("3,3,concert3,universitate,caritativ");
        Permission permission4 = new Permission("4,4,concert4,festival,zilele universitatii");

        permissionController.adauga(permission1);
        permissionController.adauga(permission2);
        permissionController.adauga(permission3);
        permissionController.adauga(permission4);

        permissionController.afiseaza();
    }


    @Test

    public  void saveFiser(){
        Permission permission1=new Permission("1,1,concert1,scolar,balul bobocilor");
        Permission permission2=new Permission("2,2,concert2,festival,zilele studentilor");
        Permission permission3=new Permission("3,3,concert3,universitate,caritativ");
        Permission permission4=new Permission("4,4,concert4,festival,zilele universitatii");

        permissionController.adauga(permission1);
        permissionController.adauga(permission2);
        permissionController.adauga(permission3);
        permissionController.adauga(permission4);

        permissionController.toSaveFisier();
        permissionController.load();
        assertEquals(true,permissionController.isPermission("concert1"));
        assertEquals(true,permissionController.isPermission("concert2"));
        assertEquals(true,permissionController.isPermission("concert3"));
        assertEquals(true,permissionController.isPermission("concert4"));

        permissionController.stergePermission("concert1");
        permissionController.stergePermission("concert2");
        permissionController.stergePermission("concert3");
        permissionController.stergePermission("concert4");

        permissionController.toSaveFisier();
        permissionController.load();
        assertEquals(false,permissionController.isPermission("concert1"));
        assertEquals(false,permissionController.isPermission("concert2"));
        assertEquals(false,permissionController.isPermission("concert3"));
        assertEquals(false,permissionController.isPermission("concert4"));
    }
    @Test

    public  void isPermission() {
        Permission permission1 = new Permission("1,1,concert1,scolar,balul bobocilor");
        Permission permission2 = new Permission("2,2,concert2,festival,zilele studentilor");
        Permission permission3 = new Permission("3,3,concert3,universitate,caritativ");
        Permission permission4 = new Permission("4,4,concert4,festival,zilele universitatii");

        permissionController.adauga(permission1);
        permissionController.adauga(permission2);
        permissionController.adauga(permission3);
        permissionController.adauga(permission4);

        assertEquals(true,permissionController.isPermission("concert1"));
        assertEquals(true,permissionController.isPermission("concert2"));
        assertEquals(true,permissionController.isPermission("concert3"));
        assertEquals(true,permissionController.isPermission("concert4"));

    }


}


