package com.company.controller;

import com.company.model.Event;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EventController {
    ArrayList<Event> events;
    private String cale;

    public EventController(String cale) {
        events = new ArrayList<>();
        this.cale = cale;
        load();
    }

    public void load() {
        File file = new File(cale);
        events.clear();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line != null && !line.isEmpty())
                    events.add(new Event(line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afiseaza() {
        for (int i = 0; i < events.size(); i++) {
            System.out.println(events.get(i).descriere());
        }
    }

    public void adauga(Event Event) {
        events.add(Event);
    }

    public String toSave() {
        String text = "";
        for (int i = 0; i < events.size(); i++) {
            text += events.get(i).toString() + "\n";

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
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getName().equals(name)) {
                events.get(i).setDescription(description);
            }
        }

    }

    public boolean isEvent(String name) {
        for (Event c : events) {
            if (c.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void stergeEvent(String name) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getName().equals(name)) {
                events.remove(events.get(i));
            }
        }
    }

    public void  afisare(){
        for(int i=0;i< events.size();i++){
            System.out.println(events.get(i).descriere());
        }
    }

    public Event returnDupaNume(String nume) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getName().equals(nume)) {
                return events.get(i);
            }
        }
        return null;
    }

    //returneaza poz cartii dupa id
    public  int poz(int id){
        for(int i=0;i< events.size();i++){
            if(events.get(i).getId()==id){
                return  i;
            }
        }
        return -1;
    }

    public  ArrayList<Event>returnLista(int studentId){
        ArrayList<Event>eventPerStudent=new ArrayList<>();
        for(int i=0;i<events.size();i++){
            if(eventPerStudent.get(i).getStudent_id()==studentId){
                eventPerStudent.add(events.get(i));
            }
        }
        return eventPerStudent;
    }

    public Event returnEvent(int eventId){
        for(int i=0;i<events.size();i++){
            if(events.get(i).getId()==eventId){
                return events.get(i);
            }
        }
        return null;
    }


}
