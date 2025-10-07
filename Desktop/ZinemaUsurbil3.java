package Desktop;
import java.util.ArrayList;
import java.util.Scanner;

class Main3{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

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
        if (zinema == 1) {
            System.out.println("Aukeratu aste eguna:");
            for (String eguna : egunak) {
            System.out.println(eguna);
            }
        }
        if(zinema == 2){
            System.out.println("Aukeratu pelikula bat(info)");
            for(String pelikula : pelikulak){
                System.out.println(pelikula);
            }
        }
        else if(zinema == 3){
            System.out.println("Kokapena");
        }
        else if(zinema == 4){
            System.out.println("Ordutegia");
        }
        else if(zinema == 5){
            //programa bukatu
        }
        int aukeguna = sc.nextInt ();
            
        //Eguneko menua
        if(aukeguna == 1){
            System.out.println("Aukeratu areto bat: ");
            for(String areto: aretoa){
                System.out.println(areto);
            }
        }
        else if(aukeguna == 2){
            System.out.println("Aukeratu areto bat: ");
            for(String areto: aretoa){
                System.out.println(areto);
            }
        }
        else if(aukeguna == 3){
            System.out.println("Aukeratu areto bat: ");
            for(String areto: aretoa){
                System.out.println(areto);
            }
        }
        else if(aukeguna == 4){
            System.out.println("Aukeratu areto bat: ");
            for(String areto: aretoa){
                System.out.println(areto);
            }
        }
        else if(aukeguna == 5){
            System.out.println("Aukeratu areto bat: ");
            for(String areto3: aretoa){
                System.out.println(areto3);
            }
        }
        else if(aukeguna == 6){
            System.out.println("Aukeratu areto bat: ");
            for(String areto: aretoa){
                System.out.println(areto);
            }
        }
        else if(aukeguna == 7){
            System.out.println("Aukeratu areto bat: ");
            for(String areto: aretoa){
                System.out.println(areto);
            }
        }
        else if(aukeguna == 8){
                //atzera
            }
        else if(aukeguna == 8){
            //atzera
        }
        int aukareto=sc.nextInt();

        //aretoko menua
        if(aukareto == 1){
            System.out.println("Aukeratu pelikula bat: ");
            for(String pelikula: pelikulak){
                System.out.println(pelikula);
            }

        }
         else if(aukareto == 2){
            System.out.println("Aukeratu pelikula bat: ");
            for(String pelikula: pelikulak){
                System.out.println(pelikula);
            }

        }
        else if(aukareto == 3){
            System.out.println("Aukeratu pelikula bat: ");
            for(String pelikula: pelikulak){
                System.out.println(pelikula);
            }

        }
        else if(aukareto == 4){
            System.out.println("Aukeratu pelikula bat: ");
            for(String pelikula: pelikulak){
                System.out.println(pelikula);
            }

        }
        else if(aukareto == 5){
            System.out.println("Aukeratu pelikula bat: ");
            for(String pelikula: pelikulak){
                System.out.println(pelikula);
            }

        }
        else if(aukareto == 6){
            //atzera
            }
            int aukpelikula=sc.nextInt();

            //pelikula menua
            if(aukpelikula == 1){
                System.out.println("Sarrerak erosi nahi dituzu?(1. BAI/2. EZ)");

            }
            else if(aukpelikula == 2){
                System.out.println("Sarrerak erosi nahi dituzu?(1. BAI/2. EZ)");
                
            }
            else if(aukpelikula ==3){
                System.out.println("Sarrerak erosi nahi dituzu?(1. BAI/2. EZ)");
                
            }
            else if(aukpelikula == 4){
                System.out.println("Sarrerak erosi nahi dituzu?(1. BAI/2. EZ)");
                
            }
            else if(aukpelikula == 5){
                System.out.println("Sarrerak erosi nahi dituzu?(1. BAI/2. EZ)");
                
            }
            int sarrerak =sc.nextInt();

            //Sarrerak menua
            if(sarrerak == 1){
                System.out.println("Zenbat sarrera nahi dituzu?(1-4)");
            }
            else if(sarrerak == 2){
                //atzera
            }
            int sarrerakop=sc.nextInt();
            if(sarrerakop == 1){
                System.out.println("Eskerrik asko sarrera "+sarrerakop+" erosi duzu");
                System.out.println(4-sarrerakop+" sarrera gehiago erosi ditzazkezu");
            }
            else if(sarrerakop>=2 || sarrerakop<=4){
                System.out.println("Eskerrik asko "+sarrerakop+" sarrera erosi dituzu");
                System.out.println(4-sarrerakop+" sarrera gehiago erosi ditzazkezu");
            }
            else if(sarrerakop>4){
                System.out.println("Ezin dituzu 4 sarrera baino gehiago erosi");
            }
            }
        }
    