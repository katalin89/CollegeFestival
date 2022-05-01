package com.company.controller;

import com.company.model.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    ArrayList<Student> students;
    private String cale;

    public StudentController(String cale) {
        students = new ArrayList<>();
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
                    students.add(new Student(line));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afiseaza() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).descriere());
        }
    }

    public void adauga(Student college) {
        students.add(college);
    }

    public String toSave() {
        String text = "";
        for (int i = 0; i < students.size(); i++) {
            text += students.get(i).toString() + "\n";

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

    public void updateMobil(String name, String mobile) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.get(i).setMobile(mobile);
            }
        }
    }

    public boolean isStudent(String name) {
        for (Student c : students) {
            if (c.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void stergeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(students.get(i));
            }
        }
    }

    public Student returnDupaNume(String nume) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(nume)) {
                return students.get(i);
            }
        }
        return null;
    }
}
