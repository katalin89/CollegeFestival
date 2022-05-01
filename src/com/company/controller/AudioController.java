package com.company.controller;

import com.company.model.Audio;
import com.company.model.Permission;

import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AudioController {
    ArrayList<Audio>audios;
    private String cale;

    public  AudioController(String cale){
        audios=new ArrayList<>();
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
                audios.add(new Audio(line));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void afiseaza(){
        for(int i=0;i< audios.size();i++){
            System.out.println(audios.get(i).descriere());
        }
    }

    public void adauga(Audio audio){
        audios.add(audio);
    }

    public  String toSave(){
        String text="";
        for(int i=0;i< audios.size();i++){
            text+=audios.get(i).toString()+"\n";
        }
        return  text;
    }

    public  void saveFisier(){
        File file=new File(cale);
        try{
            FileWriter w=new FileWriter(file);
            PrintWriter p=new PrintWriter(w);
            p.print(this.toSave());
            p.close();
        }catch ( Exception e){
            e.printStackTrace();
        }
    }

    public  void updateVolum(String title,String volum){
        for(int i=0;i<audios.size();i++){
            if(audios.get(i).getTitle().equals(title)){
                audios.get(i).setVolume(volum);
            }
        }
    }

    public  ArrayList<Audio>getAudios(){
        return  audios;
    }

    public int poz(int audioId){
        for(int i=0;i<audios.size();i++){
            if(audios.get(i).getId()==audioId){
                return  i;
            }
        }
        return -1;
    }

    public  void sterge(int id){
        for(int i=0;i< audios.size();i++){
            if(audios.get(i).getId()==id){
                audios.remove(i);
            }
        }
    }

    public boolean isAudio(String titlu){

        for(Audio a:audios){
            if(a.getTitle().equals(titlu)){
                return true;
            }
        }
        return false;
    }

}
