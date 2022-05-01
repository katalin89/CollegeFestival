package com.company.controller;

import com.company.model.User;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class UserController {
    ArrayList<User> users;
    private String cale;

    public UserController(String cale) {
        users = new ArrayList<>();
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
                    users.add(new User(line));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afiseaza() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).descriere());
        }
    }

    public void adauga(User college) {
        users.add(college);
    }

    public String toSave() {
        String text = "";
        for (int i = 0; i < users.size(); i++) {
            text += users.get(i).toString() + "\n";

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

    public void updateAdress(String name, String adress) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name)) {
                users.get(i).setAddress(adress);
            }
        }
    }

    public boolean isUser(String name) {
        for (User c : users) {
            if (c.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void stergeUser(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name)) {
                users.remove(users.get(i));
            }
        }
    }

    public User returnDupaNume(String nume) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(nume)) {
                return users.get(i);
            }
        }
        return null;
    }
}
