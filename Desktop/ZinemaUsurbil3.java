package Desktop;
import java.util.ArrayList;
import java.util.Scanner;

class Main3{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        //hasiera
        System.out.println("Kaixo!!. Ongi etorri Zinema Usurbil aplikaziora.");
        System.out.println("Aukeratu hauetako opzio bat:");
        System.out.println("1. Aste eguna");
        System.out.println("2. Pelikulen informazioa orokorra");
        System.out.println("3. Kokapena");
        System.out.println("4. Irekiera ordutegia");
        System.out.println("5. Programa bukatu");

        int zinema=sc.nextInt();

        //egunak
        ArrayList<String> egunak = new ArrayList<String>();
        egunak.add("1. Astelehena");
        egunak.add("2. Asteartea");
        egunak.add("3. Asteazkena");
        egunak.add("4. Osteguna");
        egunak.add("5. Ostirala");
        egunak.add("6. Larunbata");
        egunak.add("7. Igandea");
        egunak.add("8. Atzera");

        //peliluak
        ArrayList<String> pelikulak = new ArrayList<String>();
        pelikulak.add("1. Blancanieves");
        pelikulak.add("2. Conclave");
        pelikulak.add("3. Mufasa: EL Rey Leon");
        pelikulak.add("4. Sonic 3");
        pelikulak.add("5. Sirat");
         pelikulak.add("6. Atzera");
        
        //aretoak
        ArrayList<String>aretoa = new ArrayList<String>();
        aretoa.add("1. Umeen aretoa");
        aretoa.add("2. Superheroien aretoa");
        aretoa.add("3. Thriller aretoa");
        aretoa.add("4. Zientzia fikziozko aretoa");
        aretoa.add("5. Komedia aretoa");
        aretoa.add("6. Atzera");

       //lehen menua
       switch(zinema){
        case 1:
        System.out.println(egunak);
        break;
        case 2:
        System.out.println("Pelikulen informazio orokorra");
        break;
        case 3:
        System.out.println("Kokapena");
        break;
        case 4:
        System.out.println("Irekiera ordutegia");
        break;
        case 5:
        break;
       }    
       
       //Eguneko menua
        int aukeguna = sc.nextInt ();
        switch(aukeguna){
            case 1:
            System.out.println(aretoa);
            break;
            case 2:
            System.out.println(aretoa);
            break;
            case 3:
            System.out.println(aretoa);
            break;
            case 4:
            System.out.println(aretoa);
            break;
            case 5:
            System.out.println(aretoa);
            break;
            case 6:
            System.out.println(aretoa);
            break;
            case 7:
            System.out.println(aretoa);
            break;
            case 8:
            break;
        }

        //aretoko menua
        int aukareto=sc.nextInt();
        switch(aukareto){
            case 1:
              System.out.println(pelikulak);
              break;
            case 2:
              System.out.println(pelikulak);
              break;
              case 3:
              System.out.println(pelikulak);
              break;
            case 4:
              System.out.println(pelikulak);
              break;
              case 5:
              System.out.println(pelikulak);
              break;
            case 6:
              break;
        }
       
        //pelikula menua
            int aukpelikula=sc.nextInt();
            switch(aukpelikula){
                case 1:
                System.out.println("Sarrerak erosi nahi dituzu?(1. BAI/2. EZ)");
                break;
                case 2:
                System.out.println("Sarrerak erosi nahi dituzu?(1. BAI/2. EZ)");
                break;
                case 3:
                System.out.println("Sarrerak erosi nahi dituzu?(1. BAI/2. EZ)");
                break;
                case 4:
                System.out.println("Sarrerak erosi nahi dituzu?(1. BAI/2. EZ)");
                break;
                case 5:
                System.out.println("Sarrerak erosi nahi dituzu?(1. BAI/2. EZ)");
                break;
            }
            
            //Sarrerak menua
            int sarrerak =sc.nextInt();
            switch(sarrerak){
                case 1:
                 System.out.println("Zenbat sarrera nahi dituzu?(1-4)");
                 break;
                 case 2:
                 break;
            }
            //sarrerak erosi
            int sarrerakop=sc.nextInt();
             if(sarrerakop > 4){
                System.out.println("Ezin dituzu 4 sarrera baino gehiago erosi");
            }
            switch(sarrerakop){
                case 1:
                 System.out.println("Eskerrik asko sarrera 1 erosi duzu");
                 System.out.println("3 sarrera gehiago erosi ditzazkezu");
                 break;
                 case 2:
                  System.out.println("Eskerrik asko 2 sarrera erosi dituzu");
                  System.out.println("2 sarrera gehiago erosi ditzazkezu");
                  break;
                  case 3:
                  System.out.println("Eskerrik asko 3 sarrera erosi dituzu");
                  System.out.println("Sarrera 1 gehiago erosi dezakezu");
                  break;
                  case 4:
                  System.out.println("Eskerrik asko 4 sarrera erosi dituzu");
                  System.out.println("Ezin dituzu sarrera gehiago erosi");
                  break;
                  case 5:
                  break;
            }
            sc.close();
            }
        }
    