package com.company.controller;

import com.company.model.Permission;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PermissionController {
    ArrayList<Permission> permissions;
    private String cale;

    public PermissionController(String cale) {
        permissions = new ArrayList<>();
        this.cale = cale;
        load();
    }

    public void load() {
        File file = new File(cale);
        permissions.clear();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line != null && !line.isEmpty())
                    permissions.add(new Permission(line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afiseaza() {
        for (int i = 0; i < permissions.size(); i++) {
            System.out.println(permissions.get(i).descriere());
        }
    }

    public void adauga(Permission college) {
        permissions.add(college);
    }

    public String toSave() {
        String text = "";
        for (int i = 0; i < permissions.size(); i++) {
            text += permissions.get(i).toString() + "\n";

        }
        return text;
    }

    public void toSaveFisier() {
        File file = new File(cale);
        try {
            FileWriter w = new FileWriter(file);
            PrintWriter p = new PrintWriter(w);
            p.print(this.toSave());
            p.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateDescr(String name, String description) {
        for (int i = 0; i < permissions.size(); i++) {
            if (permissions.get(i).getTitle().equals(name)) {
                permissions.get(i).setDescription(description);
            }
        }
    }

    public boolean isPermission(String name) {
        for (Permission c : permissions) {
            if (c.getTitle().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void stergePermission(String name) {
        for (int i = 0; i < permissions.size(); i++) {
            if (permissions.get(i).getTitle().equals(name)) {
                permissions.remove(permissions.get(i));
            }
        }
    }

    public Permission returnDupaTitlu(String nume) {
        for (int i = 0; i < permissions.size(); i++) {
            if (permissions.get(i).getTitle().equals(nume)) {
                return permissions.get(i);
            }
        }
        return null;
    }
}
