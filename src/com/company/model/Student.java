package com.company.model;

public class Student extends Volunteers{

    private int collage_id;

    public Student(int id,String name,String mobile,String email,String address,String password,String username,int collage_id){
        super(id,name,mobile,email,address,password,username);
        this.collage_id=collage_id;
    }

    public Student(String proprietati){
        super(Integer.parseInt(proprietati.split(",")[0]),proprietati.split(",")[1],proprietati.split(",")[2],proprietati.split(",")[3],
                proprietati.split(",")[4],proprietati.split(",")[5],proprietati.split(",")[6]    );

        this.collage_id=Integer.parseInt(proprietati.split(",")[7]);
    }



    public int getCollage_id() {
        return collage_id;
    }

    public void setCollage_id(int collage_id) {
        this.collage_id = collage_id;
    }

    public  String descriere(){
        String desc="";
        desc+="\nId: "+super.getId()+"\nName: "+super.getName()+"\nMobile: "+super.getMobile()+"\nEmail: "+
                super.getEmail()+"\nAddress: "+super.getAddress()+"\nPassword: "+super.getPassword()+"\nUsername: "+
                super.getUsername()+"\nCollage id: "+collage_id;
        return  desc;

    }
    @Override
    public  String toString(){
        String text="";
        text+=super.getId()+","+super.getName()+","+super.getMobile()+","+super.getEmail()+","+super.getAddress()+","
                +super.getPassword()+","+super.getUsername()+","+collage_id;
        return  text;

    }

    @Override
    public  boolean equals(Object obj){
        Student student= (Student) obj;
        return  student.collage_id==this.collage_id;

    }
}
