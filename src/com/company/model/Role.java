package com.company.model;

public class Role {
    private int id;
    private String title;
    private  String description;

    public  Role(int id,String title,String description){
        this.id=id;
        this.title=title;
        this.description=description;
    }

    public  Role(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.title=proprietati.split(",")[1];
        this.description=proprietati.split(",")[2];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String descriere(){
        String desc="";
        desc+="\nId: "+id+"\nTitle: "+title+"\nDescription: "+description;
        return  desc;
    }

    @Override
    public  String toString(){
        String text="";
        text+=id+","+title+","+description;
        return  text;
    }

    @Override
    public  boolean equals(Object obj){
        Role role=(Role )obj;
        return  role.id==this.id;
    }
}
