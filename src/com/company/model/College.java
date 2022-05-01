package com.company.model;

public class College {
    private int id;
    private String name;
    private String description;

    public  College(int id,String name,String description){
        this.id=id;
        this.name=name;
        this.description=description;
    }

    public  College(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.name=proprietati.split(",")[1];
        this.description=proprietati.split(",")[2];
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String descriere(){
        String desc="";
        desc+="\nId: "+id+"\nName: "+name+"\nDescription: "+description;
        return  desc;
    }

    @Override
    public  String toString(){
        String text="";
        text+=id+","+name+","+description;
        return  text;
    }

    @Override
    public  boolean equals(Object obj){
        College   college=(College) obj;
        return  college.id==this.id;
    }
}
