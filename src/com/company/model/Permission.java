package com.company.model;

public class Permission {
    private int id;
    private  int role_id;
    private String title;
    private String module;
    private String description;


    public  Permission(int id,int role_id,String title,String module,String description){
        this.id=id;
        this.role_id=role_id;
        this.title=title;
        this.module=module;
        this.description=description;
    }

    public Permission(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.role_id=Integer.parseInt(proprietati.split(",")[1]);
        this.title=proprietati.split(",")[2];
        this.module=proprietati.split(",")[3];
        this.description=proprietati.split(",")[4];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public  String descriere(){
        String desc="";
        desc+="\nId: "+ id+"\nRole id: "+role_id+"\nTitle: "+title+"\nModule: "+module+"\nDescription: "+description;
        return  desc;
    }
    @Override
    public  String toString(){
        String text="";
        text+=id+","+role_id+","+title+","+module+","+description;
        return text;
    }

    @Override
    public  boolean equals(Object obj){
        Permission permission=(Permission) obj;
        return permission.id==this.id;
    }
}
