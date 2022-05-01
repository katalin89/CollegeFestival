package com.company.controller;

import com.company.model.Role;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RoleController {
    ArrayList<Role> roles;
    private String cale;

    public RoleController(String cale) {
        roles = new ArrayList<>();
        this.cale = cale;
        load();
    }

    public void load() {
        File file = new File(cale);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line != null && !line.isEmpty())
                    roles.add(new Role(line));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afiseaza() {
        for (int i = 0; i < roles.size(); i++) {
            System.out.println(roles.get(i).descriere());
        }
    }

    public void adauga(Role college) {
        roles.add(college);
    }

    public String toSave() {
        String text = "";
        for (int i = 0; i < roles.size(); i++) {
            text += roles.get(i).toString() + "\n";

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
        for (int i = 0; i < roles.size(); i++) {
            if (roles.get(i).getTitle().equals(name)) {
                roles.get(i).setDescription(description);
            }
        }
    }

    public boolean isRole(String name) {
        for (Role c : roles) {
            if (c.getTitle().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void stergeRole(String name) {
        for (int i = 0; i < roles.size(); i++) {
            if (roles.get(i).getTitle().equals(name)) {
                roles.remove(roles.get(i));
            }
        }
    }

    public Role returnDupaTitlu(String nume) {
        for (int i = 0; i < roles.size(); i++) {
            if (roles.get(i).getTitle().equals(nume)) {
                return roles.get(i);
            }
        }
        return null;
    }
}
