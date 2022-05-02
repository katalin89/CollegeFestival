package View;

public class Login {
}
/*
public class ViewLogin {
   private ControllerPersoana controllerPersoana;


    public ViewLogin(){


        controllerPersoana= new ControllerPersoana("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\src\\com\\company\\resources\\persoane.txt");
     login();

    }

    public void meniu(){
System.out.println("Apasa tasta 1 petru login");
System.out.println("Apasa tata 2 pentru log out");

    }
    public  void play(){
        Scanner scanner=new Scanner(System.in);
        boolean run=true;
        int alegere=0;
        controllerPersoana.load();
        while(run=true){
            meniu();
            switch (alegere){
                case 1:login();
                break;
                default:
            }
        }
    }

    public void login(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Itroduceti numele ");
        String nume=scanner.nextLine();
        System.out.println("Introduceti parola");
        String parola=scanner.nextLine();
        System.out.println("Logare: ");
        Persoana logat= controllerPersoana.login(nume,parola);
        if(logat!=null){
            Persoana pers=controllerPersoana.getPersoana(nume);


            if(pers instanceof Angajat){

                 ViewAngajat viewAngajat= new ViewAngajat();
            }else{
                ViewStudent viewStudent = new ViewStudent(pers);
            }
        }


    }
}*/