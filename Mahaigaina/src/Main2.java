import java.util.Scanner;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Scanner irakur_var = new Scanner(System.in);
        System.out.println("Aukeratu hurrengo aukeren artean bat dagokion zenbakia jarriz: \n1.Asteguna \n2.Pelikulen informazio orokorra \n3.Kokapena ikusi \n4.Irekiera ordutegia ikusi");
        int aukera = irakur_var.nextInt(); 
        ArrayList<String> eguna = new ArrayList<String>();
        eguna.add("Astelehena");
            eguna.add("Asteartea");
            eguna.add("Asteazkena");
            eguna.add("Osteguna");
            eguna.add("Ostirala");
            eguna.add("Larunbata");
            eguna.add("Igandea");
        ArrayList<String> pelikula = new ArrayList<String>();
        pelikula.add("Lilo y Stitch");
        pelikula.add("Una película de Minecraft");
        pelikula.add("Mufasa: El rey león");
        pelikula.add("Cómo entrenar a tu dragón");
        pelikula.add("Capitán América: Brave New World");
        pelikula.add("Conclave");
        pelikula.add("Sonic 3: La película");
        pelikula.add("Misión: Imposible. Sentencia Final");
        pelikula.add("Blancanieves");
        pelikula.add("Thunderbolt");
        pelikula.add("Padre no hay más que uno 5");
        pelikula.add("Wolfgang (Extraordinario)");
        pelikula.add("El casoplón");
        pelikula.add("Un funeral de locos");
        pelikula.add("Sirāt");
        ArrayList<String> gela = new ArrayList<String>();
        gela.add("Umeen gela");
        gela.add("Superheroien gela");
        gela.add("Thriller gela");
        gela.add("Zientzia fikzioko gela");
        gela.add("Komedia gela");
      //Asteguna aukeratzen badu
        if(aukera == 1){
            System.out.println("Sartu aste honetako egun bat zenbaki moduan (1-7)");
            int egunaAukera = irakur_var.nextInt();
            if ( egunaAukera==1){System.out.println("Astelehenean dauden pelikulak hauek dira:" + pelikula.get(0) + ", " + pelikula.get(1) + " eta " + pelikula.get(2) );}
            else if ( egunaAukera==2){System.out.println("Asteartean dauden pelikulak hauek dira:" + pelikula.get(3) + ", " + pelikula.get(4) + " eta " + pelikula.get(5) );}
            else if ( egunaAukera==3){System.out.println("Asteazkenean dauden pelikulak hauek dira:" + pelikula.get(6) + ", " + pelikula.get(7) + " eta " + pelikula.get(8) );}
            else if ( egunaAukera==4){System.out.println("Ostegunean dauden pelikulak hauek dira:" + pelikula.get(9) + ", " + pelikula.get(10) + " eta " + pelikula.get(11) );}
            else if ( egunaAukera==5){System.out.println("Ostiralean dauden pelikulak hauek dira:" + pelikula.get(12) + ", " + pelikula.get(13) + " eta " + pelikula.get(14) );}
            else if ( egunaAukera==6){System.out.println("Larunbatean dauden pelikulak hauek dira:" + pelikula.get(0) + ", " + pelikula.get(3) + " eta " + pelikula.get(6) );}
            else if ( egunaAukera==7){System.out.println("Igandean dauden pelikulak hauek dira:" + pelikula.get(1) + ", " + pelikula.get(5) + " eta " + pelikula.get(10) );}
            else {System.out.println("Zenbaki okerra sartu duzu, saiatu berriro.");}
            }
    //Zineko informazio orokorra aukeratzen badu
        if (aukera==2) {System.out.println("Aukeratu bat bi hauetatik: \nPelikula kopurua eta hauen izenak \nGela kopurua eta hauen izenak");
        int informazioaukera = irakur_var.nextInt();
            if (informazioaukera==1) {System.out.println("Gaur egun zinean dauden pelikulak " + pelikula.size() + " dira eta hauek dira: " + pelikula);}
            else if (informazioaukera==2) {System.out.println("Zineak " + gela.size() + " gela ditu eta hauek dira: " + gela);}
            else {System.out.println("Zenbaki okerra sartu duzu, saiatu berriro.");}
        }}
}   

