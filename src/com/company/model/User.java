package com.company.model;

public class User {
    private int id;
    private int role_id;
    private String  name;
    private String email;
    //dob=date of birth
    private String dob;
    private String  address;

    public  User(int id,int role_id,String name,String email,String dob,String address){
        this.id=id;
        this.role_id=role_id;
        this.name=name;
        this.email=email;
        this.dob=dob;
        this.address=address;
    }

    public  User(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.role_id=Integer.parseInt(proprietati.split(",")[1]);
        this.name=proprietati.split(",")[2];
        this.email=proprietati.split(",")[3];
        this.dob=proprietati.split(",")[4];
        this.address=proprietati.split(",")[5];

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  String descriere(){
        String desc="";
        desc+="\nId: "+ id+"\nRrole id: "+role_id+"\nName: "+name+"\nEmail: "+ email+"\nDate of birth: "+dob+"\nAddress: "+address;
        return  desc;
    }

    @Override
    public  String toString(){
        String text="";
        text+=id+","+role_id+","+name+","+email+","+dob+","+address;
        return  text;
    }

    @Override
    public  boolean equals(Object obj){
        User user=(User )obj;
        return user.id==this.id;
    }
}

