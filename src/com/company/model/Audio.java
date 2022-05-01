package com.company.model;

public class Audio {
    private int id;
    private String title;
    private  String type;
    private String description;
    private String language;
    private String volume;

    public Audio(int id,String title,String type,String description,String language,String volume){
        this.id=id;
        this.title=title;
        this.type=type;
        this.description=description;
        this.language=language;
        this.volume=volume;
    }

    public Audio(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.title=proprietati.split(",")[1];
        this.type=proprietati.split(",")[2];
        this.description=proprietati.split(",")[3];
        this.language=proprietati.split(",")[4];
        this.volume=proprietati.split(",")[5];
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public  String descriere(){
        String desc="";
        desc+="\nId: "+id+"\nTitle: "+title+"\nType: "+type+"\nDescription: "+description+"\nLanguage: "+language+"\nVolume: "+volume;
        return  desc;
    }

    @Override
    public String toString(){
        String text="";
        text+=id+","+title+","+type+","+description+","+language+","+volume;
        return  text;
    }

    @Override
    public  boolean equals(Object obj){
        Audio audio=(Audio)obj;
        return audio.id==this.id;
    }
}
