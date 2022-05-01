package com.company.controller;

import com.company.model.Audio;
import com.company.model.College;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CollegeController {
    ArrayList<College>colleges;
    private String cale;

    public  CollegeController(String cale){
        colleges=new ArrayList<>();
        this.cale=cale;
        load();
    }

    public void load() {
        File file = new File(cale);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line!=null && !line.isEmpty())
                    colleges.add(new College(line));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void afiseaza(){
        for(int i=0;i< colleges.size();i++){
            System.out.println(colleges.get(i).descriere());
        }
    }

    public void adauga(College college){
        colleges.add(college);
    }

    public  String toSave(){
        String text="";
        for (int i=0;i< colleges.size();i++){
            text+=colleges.get(i).toString()+"\n";

        }
        return  text;
    }

    public void toSaveFisier(){
        File file=new File(cale);
        try{
            FileWriter w=new FileWriter(file);
            PrintWriter p=new PrintWriter(w);
            p.print(this.toSave());
            p.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public  void updateDescr(String name,String description){
        for(int i=0;i<colleges.size();i++){
            if(colleges.get(i).getName().equals(name)){
                colleges.get(i).setDescription(description);
            }
        }

    }

    public boolean isCollege(String name){
        for(College c:colleges){
            if(c.getName().equals(name)){
                return  true;
            }
        }
        return  false;
    }

    public  void stergeCollege(String name){
        for(int i=0;i<colleges.size();i++){
            if(colleges.get(i).getName().equals(name)){
                colleges.remove(colleges.get(i));
            }
        }
    }

    public College returnDupaNume(String nume){
        for(int i=0;i<colleges.size();i++){
            if(colleges.get(i).getName().equals(nume)){
                return  colleges.get(i);
            }
        }

        return  null;
    }
}
