package com.company.controller;

import com.company.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventControllerTest {

    private EventController controllerEvent;

    @BeforeEach
    public void preconditie() {
        controllerEvent = new EventController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\CollegeFestivalOrganizer\\src\\com\\company\\resurces\\events.txt");
    }

    @Test
    public void returnpoz() {
        System.out.println(controllerEvent.poz(2));
    }


    @Test
    public void testLoad1() {
        //Preconditie
        Event event1 = new Event("1,Balul Bobocilor,festivitate,Organizat in fiecare an,1,1,Sala Mare");
        Event event2 = new Event("2,Concert Symphonic,concert,Filarmonica de stat,1,2,Amfiteatru");
        Event event3 = new Event("3,Meeting fosti studenti,meeting,Organizat in fiecare an,2,3,Sala Mare");
        Event event4 = new Event("4,Concurs de literatura,concurs,Organizat de catre invatatori,2,3,Amfiteatru");
        Event event5 = new Event("5,Concert de canteci populare,concert,Asociatie de traditie,2,3,Amfiteatru");

        //Actiune
        controllerEvent.adauga(event1);
        controllerEvent.adauga(event2);
        controllerEvent.adauga(event3);
        controllerEvent.adauga(event4);
        controllerEvent.adauga(event5);

        controllerEvent.toSaveFisier();
        controllerEvent.load();

        //Rezultat
        assertEquals(true, controllerEvent.poz(1) != -1);
        assertEquals(true, controllerEvent.poz(2) != -1);
        assertEquals(true, controllerEvent.poz(3) != -1);
        assertEquals(true, controllerEvent.poz(4) != -1);
        assertEquals(true, controllerEvent.poz(5) != -1);

        //Postconditie
        controllerEvent.stergeEvent("Balul Bobocilor");
        controllerEvent.stergeEvent("Concert Symphonic");
        controllerEvent.stergeEvent("Meeting fosti studenti");
        controllerEvent.stergeEvent("Concurs de literatura");
        controllerEvent.stergeEvent("Concert de canteci populare");

        controllerEvent.toSaveFisier();
        controllerEvent.load();
        assertEquals(false, controllerEvent.poz(1) != -1);
        assertEquals(false, controllerEvent.poz(2) != -1);
        assertEquals(false, controllerEvent.poz(3) != -1);
        assertEquals(false, controllerEvent.poz(4) != -1);
        assertEquals(false, controllerEvent.poz(5) != -1);
    }

    @Test
    public void adauga() {
        //preconditie
        Event event1 = new Event("1,Balul Bobocilor,festivitate,Organizat in fiecare an,1,1,Sala Mare");
        Event event2 = new Event("2,Concert Symphonic,concert,Filarmonica de stat,1,2,Amfiteatru");
        Event event3 = new Event("3,Meeting fosti studenti,meeting,Organizat in fiecare an,2,3,Sala Mare");
        Event event4 = new Event("4,Concurs de literatura,concurs,Organizat de catre invatatori,2,3,Amfiteatru");
        Event event5 = new Event("5,Concert de canteci populare,concert,Asociatie de traditie,2,3,Amfiteatru");

        //Actiune
        controllerEvent.adauga(event1);
        controllerEvent.adauga(event2);
        controllerEvent.adauga(event3);
        controllerEvent.adauga(event4);
        controllerEvent.adauga(event5);

        controllerEvent.toSaveFisier();

        //rezultat
        assertEquals(true, controllerEvent.isEvent("Balul Bobocilor"));
        assertEquals(true, controllerEvent.isEvent("Concert Symphonic"));
        assertEquals(true, controllerEvent.isEvent("Meeting fosti studenti"));
        assertEquals(true, controllerEvent.isEvent("Concurs de literatura"));
        assertEquals(true, controllerEvent.isEvent("Concert de canteci populare"));
    //postconditie

        controllerEvent.stergeEvent("Balul Bobocilor");
        controllerEvent.stergeEvent("Concert Symphonic");
        controllerEvent.stergeEvent("Meeting fosti studenti");
        controllerEvent.stergeEvent("Concurs de literatura");
        controllerEvent.stergeEvent("Concert de canteci populare");

        controllerEvent.toSaveFisier();

        controllerEvent.load();

        assertEquals(false, controllerEvent.poz(1) != -1);
        assertEquals(false, controllerEvent.poz(2) != -1);
        assertEquals(false, controllerEvent.poz(3) != -1);
        assertEquals(false, controllerEvent.poz(4) != -1);
        assertEquals(false, controllerEvent.poz(5) != -1);
    }

    @Test
    public void toSave() {
        //preconditie

        Event event1 = new Event("1,Balul Bobocilor,festivitate,Organizat in fiecare an,1,1,Sala Mare");
        Event event2 = new Event("2,Concert Symphonic,concert,Filarmonica de stat,1,2,Amfiteatru");
        Event event3 = new Event("3,Meeting fosti studenti,meeting,Organizat in fiecare an,2,3,Sala Mare");
        Event event4 = new Event("4,Concurs de literatura,concurs,Organizat de catre invatatori,2,3,Amfiteatru");
        Event event5 = new Event("5,Concert de canteci populare,concert,Asociatie de traditie,2,3,Amfiteatru");
        //Actiune
        controllerEvent.adauga(event1);
        controllerEvent.adauga(event2);
        controllerEvent.adauga(event3);
        controllerEvent.adauga(event4);
        controllerEvent.adauga(event5);

        controllerEvent.toSaveFisier();
        //Rezultat

        assertEquals(
                "1,Balul Bobocilor,festivitate,Organizat in fiecare an,1,1,Sala Mare\n" +
                        "2,Concert Symphonic,concert,Filarmonica de stat,1,2,Amfiteatru\n" +
                        "3,Meeting fosti studenti,meeting,Organizat in fiecare an,2,3,Sala Mare\n" +
                        "4,Concurs de literatura,concurs,Organizat de catre invatatori,2,3,Amfiteatru\n" +
                        "5,Concert de canteci populare,concert,Asociatie de traditie,2,3,Amfiteatru\n", controllerEvent.toSave());

        ///postconditie
        controllerEvent.stergeEvent("Balul Bobocilor");
        controllerEvent.stergeEvent("Concert Symphonic");
        controllerEvent.stergeEvent("Meeting fosti studenti");
        controllerEvent.stergeEvent("Concurs de literatura");
        controllerEvent.stergeEvent("Concert de canteci populare");

        controllerEvent.toSaveFisier();

        controllerEvent.load();

        assertEquals(false, controllerEvent.poz(4) != -1);
        assertEquals(false, controllerEvent.poz(5) != -1);
        assertEquals(false, controllerEvent.poz(6) != -1);
        assertEquals(false, controllerEvent.poz(7) != -1);
        assertEquals(false, controllerEvent.poz(8) != -1);

    }

    @Test
    public void afisare() {
        //Preconditie

        Event event1 = new Event("1,Balul Bobocilor,festivitate,Organizat in fiecare an,1,1,Sala Mare");
        Event event2 = new Event("2,Concert Symphonic,concert,Filarmonica de stat,1,2,Amfiteatru");
        Event event3 = new Event("3,Meeting fosti studenti,meeting,Organizat in fiecare an,2,3,Sala Mare");
        Event event4 = new Event("4,Concurs de literatura,concurs,Organizat de catre invatatori,2,3,Amfiteatru");
        Event event5 = new Event("5,Concert de canteci populare,concert,Asociatie de traditie,2,3,Amfiteatru");

        //Actiune
        controllerEvent.adauga(event1);
        controllerEvent.adauga(event2);
        controllerEvent.adauga(event3);
        controllerEvent.adauga(event4);
        controllerEvent.adauga(event5);

        controllerEvent.toSaveFisier();
        controllerEvent.afisare();

        //postconditie

        controllerEvent.stergeEvent("Balul Bobocilor");
        controllerEvent.stergeEvent("Concert Symphonic");
        controllerEvent.stergeEvent("Meeting fosti studenti");
        controllerEvent.stergeEvent("Concurs de literatura");
        controllerEvent.stergeEvent("Concert de canteci populare");

        controllerEvent.toSaveFisier();

        controllerEvent.load();

        assertEquals(false, controllerEvent.poz(4) != -1);
        assertEquals(false, controllerEvent.poz(5) != -1);
        assertEquals(false, controllerEvent.poz(6) != -1);
        assertEquals(false, controllerEvent.poz(7) != -1);
        assertEquals(false, controllerEvent.poz(8) != -1);

    }

    @Test
    public void poz() {
        //Preconditie
        Event event1 = new Event("1,Balul Bobocilor,festivitate,Organizat in fiecare an,1,1,Sala Mare");
        Event event2 = new Event("2,Concert Symphonic,concert,Filarmonica de stat,1,2,Amfiteatru");
        Event event3 = new Event("3,Meeting fosti studenti,meeting,Organizat in fiecare an,2,3,Sala Mare");
        Event event4 = new Event("4,Concurs de literatura,concurs,Organizat de catre invatatori,2,3,Amfiteatru");
        Event event5 = new Event("5,Concert de canteci populare,concert,Asociatie de traditie,2,3,Amfiteatru");


        //Actiune
        controllerEvent.adauga(event1);
        controllerEvent.adauga(event2);
        controllerEvent.adauga(event3);
        controllerEvent.adauga(event4);
        controllerEvent.adauga(event5);
        controllerEvent.toSaveFisier();
        controllerEvent.load();


        assertEquals(0, controllerEvent.poz(4));
        assertEquals(1, controllerEvent.poz(5));
        assertEquals(2, controllerEvent.poz(6));
        assertEquals(3, controllerEvent.poz(7));
        assertEquals(4, controllerEvent.poz(8));


        //Postconditie

        controllerEvent.stergeEvent("Balul Bobocilor");
        controllerEvent.stergeEvent("Concert Symphonic");
        controllerEvent.stergeEvent("Meeting fosti studenti");
        controllerEvent.stergeEvent("Concurs de literatura");
        controllerEvent.stergeEvent("Concert de canteci populare");

        controllerEvent.toSaveFisier();
        controllerEvent.load();
        assertEquals(false, controllerEvent.poz(4) != -1);
        assertEquals(false, controllerEvent.poz(5) != -1);
        assertEquals(false, controllerEvent.poz(6) != -1);
        assertEquals(false, controllerEvent.poz(7) != -1);
        assertEquals(false, controllerEvent.poz(8) != -1);


    }

    @Test
    public void isEvent() {
        //Preconditie
        Event event1 = new Event("1,Balul Bobocilor,festivitate,Organizat in fiecare an,1,1,Sala Mare");
        Event event2 = new Event("2,Concert Symphonic,concert,Filarmonica de stat,1,2,Amfiteatru");
        Event event3 = new Event("3,Meeting fosti studenti,meeting,Organizat in fiecare an,2,3,Sala Mare");
        Event event4 = new Event("4,Concurs de literatura,concurs,Organizat de catre invatatori,2,3,Amfiteatru");
        Event event5 = new Event("5,Concert de canteci populare,concert,Asociatie de traditie,2,3,Amfiteatru");

        //actiune
        controllerEvent.adauga(event1);
        controllerEvent.adauga(event2);
        controllerEvent.adauga(event3);
        controllerEvent.adauga(event4);
        controllerEvent.adauga(event5);

        controllerEvent.toSaveFisier();

        //rezultat

        assertEquals(true, controllerEvent.isEvent("Balul Bobocilor"));
        assertEquals(true, controllerEvent.isEvent("Concert Symphonic"));
        assertEquals(true, controllerEvent.isEvent("Meeting fosti studenti"));
        assertEquals(true, controllerEvent.isEvent("Concurs de literatura"));
        assertEquals(true, controllerEvent.isEvent("Concert de canteci populare"));
        //Postconditie

        controllerEvent.stergeEvent("Balul Bobocilor");
        controllerEvent.stergeEvent("Concert Symphonic");
        controllerEvent.stergeEvent("Meeting fosti studenti");
        controllerEvent.stergeEvent("Concurs de literatura");
        controllerEvent.stergeEvent("Concert de canteci populare");

        controllerEvent.toSaveFisier();

        controllerEvent.load();


        assertEquals(false, controllerEvent.poz(1) != -1);
        assertEquals(false, controllerEvent.poz(2) != -1);
        assertEquals(false, controllerEvent.poz(3) != -1);
        assertEquals(false, controllerEvent.poz(4) != -1);
        assertEquals(false, controllerEvent.poz(5) != -1);
    }

}