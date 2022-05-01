package com.company.controller;

import com.company.model.Audio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class AudioControllerTest {

    private AudioController audioController;

    @BeforeEach

    public  void  preconditie(){
        audioController=new AudioController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\CollegeFestivalOrganizer\\src\\com\\company\\resurces\\audios.txt");
    }

    @Test
    public  void load(){
        Audio audio=new Audio("1,Ploaia,rock,alternativ de Cargo,romana,mediu");
        Audio audio2=new Audio("2,Nemo,rock,alternativ de Nightwish,engleza,max");
        Audio audio3=new Audio("3,Relax,rock,pop de Mika,engleza,mediu");

        audioController.adauga(audio);
        audioController.adauga(audio2);
        audioController.adauga(audio3);

       audioController.saveFisier();

        audioController.afiseaza();
    }

    @Test
    public  void saveFisier(){
        Audio audio=new Audio("1,Ploaia,rock,alternativ de Cargo,romana,mediu");
        Audio audio2=new Audio("2,Nemo,rock,alternativ de Nightwish,engleza,max");
        Audio audio3=new Audio("3,Relax,rock,pop de Mika,engleza,mediu");

        audioController.adauga(audio);
        audioController.adauga(audio2);
        audioController.adauga(audio3);

        audioController.saveFisier();
    }
    @Test
    public  void updateVolum(){
        Audio audio=new Audio("1,Ploaia,rock,alternativ de Cargo,romana,mediu");
        Audio audio2=new Audio("2,Nemo,rock,alternativ de Nightwish,engleza,max");
        Audio audio3=new Audio("3,Relax,rock,pop de Mika,engleza,mediu");

        audioController.adauga(audio);
        audioController.adauga(audio2);
        audioController.adauga(audio3);


        audioController.updateVolum("Ploaia","maximum");

        audioController.afiseaza();
    }

    @Test
    public  void getAudios(){

        Audio audio=new Audio("1,Ploaia,rock,alternativ de Cargo,romana,mediu");
        Audio audio2=new Audio("2,Nemo,rock,alternativ de Nightwish,engleza,max");
        Audio audio3=new Audio("3,Relax,rock,pop de Mika,engleza,mediu");

        audioController.adauga(audio);
        audioController.adauga(audio2);
        audioController.adauga(audio3);

        System.out.println(audioController.getAudios());

    }

    @Test
    public  void sterge(){

        Audio audio=new Audio("1,Ploaia,rock,alternativ de Cargo,romana,mediu");
        Audio audio2=new Audio("2,Nemo,rock,alternativ de Nightwish,engleza,max");
        Audio audio3=new Audio("3,Relax,rock,pop de Mika,engleza,mediu");

        audioController.adauga(audio);
        audioController.adauga(audio2);
        audioController.adauga(audio3);


        audioController.sterge(2);
        audioController.afiseaza();

    }

    @Test
    public  void isAudio(){
        Audio audio=new Audio("1,Ploaia,rock,alternativ de Cargo,romana,mediu");
        Audio audio2=new Audio("2,Nemo,rock,alternativ de Nightwish,engleza,max");
        Audio audio3=new Audio("3,Relax,rock,pop de Mika,engleza,mediu");

        audioController.adauga(audio);
        audioController.adauga(audio2);
        audioController.adauga(audio3);
        assertEquals(true,audioController.isAudio("Nemo"));


    }



}