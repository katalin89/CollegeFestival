package com.company.model;

public class Event {
    private int id;
    private  String name;
    private  String type;
    private  String description;
    private int college_id;
    private int student_id;
    private  String place;


    public  Event(int id,String name,String type,String description,int college_id,int student_id,String place){
        this.id=id;
        this.name=name;
        this.type=type;
        this.description=description;
        this.college_id=college_id;
        this.student_id=student_id;
        this.place=place;
    }


    public  Event(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.name=proprietati.split(",")[1];
        this.type=proprietati.split(",")[2];
        this.description=proprietati.split(",")[3];
        this.college_id=Integer.parseInt(proprietati.split(",")[4]);
        this.student_id=Integer.parseInt(proprietati.split(",")[5]);
        this.place=proprietati.split(",")[6];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCollege_id() {
        return college_id;
    }

    public void setCollege_id(int college_id) {
        this.college_id = college_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    public  String descriere(){
        String desc="";
        desc+="\nId: "+id+"\nName: "+name+"\nType: "+type+"\nDescription: "+description+"\nCollage id: "+college_id+
                "\nStudent id: "+student_id+"\nPlace: "+place;
        return  desc;
    }

    @Override
    public String toString(){
        String text="";
        text+=id+","+name+","+type+","+description+","+college_id+","+student_id+","+place;
        return  text;
    }
    @Override
    public  boolean equals(Object obj){
        Event event=(Event) obj;
        return event.id==this.id;


    }

}
