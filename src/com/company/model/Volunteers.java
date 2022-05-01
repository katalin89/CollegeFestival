package com.company.model;

public class Volunteers {
    private int id;
    private String name;
    private String mobile;
    private String email;
    private String password;
    private String address;
    private String username;

    public Volunteers(int id,String name,String mobile,String email,String password,String address,String username){
        this.id=id;
        this.name=name;
        this.mobile=mobile;
        this.email=email;
        this.password=password;
        this.address=address;
        this.username=username;
    }

    public Volunteers(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.name=proprietati.split(",")[1];
        this.mobile=proprietati.split(",")[2];
        this.email=proprietati.split(",")[3];
        this.password=proprietati.split(",")[4];
        this.address=proprietati.split(",")[5];
        this.username=proprietati.split(",")[6];
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public  String descriere(){
        String desc="";
        desc+="\nId: "+id+"\nName: "+name+"\nMobile: "+mobile+"\nEmail: "+email+"\nPassword: "+password+"\nAddress: "+address+"\nUsename: "+username;
        return  desc;
    }

    @Override
    public  String toString(){
        String text="";
        text+=id+","+name+ ","+mobile+ ","+email+ ","+password+","+address+","+username;
        return  text;
    }

    @Override
    public  boolean equals(Object obj){
        Volunteers volunteers=(Volunteers) obj;
        return volunteers.id==this.id;
    }
}
