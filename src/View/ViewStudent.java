package View;

import com.company.controller.CollegeController;
import com.company.controller.EventController;
import com.company.controller.StudentController;
import com.company.model.Event;
import com.company.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewStudent {
    private StudentController studentController;
    private EventController eventController;
    private CollegeController collegeController;


    Student student;

    public ViewStudent(Student student) {
        studentController = new StudentController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\CollegeFestivalOrganizer\\src\\com\\company\\resurces\\students.txt");
        eventController = new EventController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\CollegeFestivalOrganizer\\src\\com\\company\\resurces\\events.txt");
        collegeController = new CollegeController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\CollegeFestivalOrganizer\\src\\com\\company\\resurces\\college.txt");
        this.student = student;
        play();
    }

    public  void meniu(){
        System.out.println("*******************STUDENT**************************");
        System.out.println("Apasa tasta 1 pentru a afisa toti studenti ");
        System.out.println("Apasa tasta 2 sa se afiseza la care event participa studentul ");
        System.out.println("Apasa tasta  3 pentru a se inscrie la un event");
        System.out.println("Apasa tasta  4 pentru unscribe event");
    }

    public void play(){
        Scanner citeste=new Scanner(System.in);
        boolean run=true;
        int alegere=0;
        meniu();
        while (run==true){
            alegere=Integer.parseInt(citeste.nextLine());
            switch (alegere){
                case 1:
                    studentController.afiseaza();
                    break;
                case 2:eventurileStudentului();
                    break;
                default:
            }
        }

    }

    public void eventurileStudentului(){
        System.out.println("Suntiinscrisi la events");
        ArrayList<Event> studentEvents = eventController.returnLista(this.student.getId());
        for(Event event:studentEvents){
            System.out.println(eventController.returnEvent(event.getId()).descriere());
        }
    }

}
/*
    public void cursurileStudentului() {
        System.out.println("Sunti inscris la cursurile");
        ArrayList<Enrolment> studentEnrolments = controllerEnrolment.returnLista(this.persoana.getId());
        for (Enrolment enrolment : studentEnrolments) {
            System.out.println(controllerCurs.returnCurs(enrolment.getCourseId()).descriere());
        }
    }

    public void inscrieLaCurs() {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cursul la care doriti sa va inscrieti");
        String name =scanner.nextLine();

        Curs curs= controllerCurs.returnCursDupaNume(name);


        if(curs!=null){

            Enrolment x = new Enrolment(
                    controllerEnrolment.nextId(),//pentru obiectul nou x dam un id urmator
                    this.persoana.getId(),
                    curs.getId(),
                     "12.12.23"
                    );

            controllerEnrolment.adauga(x);
            controllerEnrolment.saveFiser();
            System.out.println("V-ati inscris la "+curs.getName());
        }

    }

    public void unscribeCurs() {

        Scanner scanner=new Scanner(System.in);
        ArrayList<Enrolment>enrolments=controllerEnrolment.returnLista(persoana.getId());
        System.out.println("Introduceti numele cursului");
        String  nume=scanner.nextLine();
         Curs curs =controllerCurs.returnCursDupaNume(nume);
         int persId= persoana.getId();
         int cursId= curs.getId();
         System.out.println("Studentul a renuntat la cursul introdus");
         controllerEnrolment.stergeDupaStCurs(persId,cursId);
         controllerEnrolment.saveFiser();

    }
}
*/