package Desktop;

import java.util.ArrayList;
import java.util.Scanner;

class Main3 {

  static void pelikula() {
    System.out.println("Sarrerak erosi nahi dituzu?(1. BAI/2. EZ)");
  }
  static void menua() {
    System.out.println("Aukeratu hauetako opzio bat:");
    System.out.println("1. Aste eguna");
    System.out.println("2. Pelikulen informazioa orokorra");
    System.out.println("3. Kokapena");
    System.out.println("4. Irekiera ordutegia");
    System.out.println("5. Programa bukatu");
  }
static String agurra(){
  return "Eskerrik asko!! Agurr!!";
}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // hasiera
    System.out.println("Kaixo!!. Ongi etorri Zinema Usurbil aplikaziora.");
   int zinema = 0;
    // egunak
    ArrayList<String> egunak = new ArrayList<String>();
    egunak.add("1. Astelehena");
    egunak.add("2. Asteartea");
    egunak.add("3. Asteazkena");
    egunak.add("4. Osteguna");
    egunak.add("5. Ostirala");
    egunak.add("6. Larunbata");
    egunak.add("7. Igandea");
    egunak.add("8. Atzera");

    // pelikuak
    ArrayList<String> pelikulak = new ArrayList<String>();
    pelikulak.add("1. Blancanieves");
    pelikulak.add("2. Conclave");
    pelikulak.add("3. Mufasa: EL Rey Leon");
    pelikulak.add("4. Sonic 3");
    pelikulak.add("5. Sirat");
    pelikulak.add("6. Atzera");
   
    // aretoak
    ArrayList<String> aretoa = new ArrayList<String>();
    aretoa.add("1. Umeen aretoa");
    aretoa.add("2. Superheroien aretoa");
    aretoa.add("3. Thriller aretoa");
    aretoa.add("4. Zientzia fikziozko aretoa");
    aretoa.add("5. Komedia aretoa");
    aretoa.add("6. Atzera");

   
    while (zinema !=5){/*5 zenbakia kilkatzen denean programa ixten da */
      menua();
      zinema = sc.nextInt();
      if(zinema == 5){
          agurra();
      }

    switch (zinema) {
      case 1:
      //egunk
        System.out.println("Aukeratu egun bat: "+egunak);
        int aukeguna=sc.nextInt();
        if (aukeguna == 8) { /*8 zenbakia klikatzean menura bueltatzea */
    break;
        }
         //aretoak
        System.out.println("Aukeratu areto bat: ");
         switch (aukeguna) {
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
    }

    System.out.println("Areto kopurua: " + (aretoa.size() - 1));
    //pelikulak
    int aukareto = sc.nextInt();
    if(aukareto == 6){/*6 zenbakia klikatzean menura bueltatzea */
      break;
     }
     System.out.println("Aukeratu pelikula bat: ");
    switch (aukareto) {
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
    }

    //sarrerak
    int aukpelikula = sc.nextInt();
    if(aukpelikula == 6){/*6 zenbakia klikatzean menura bueltatzea */
      break;
   
    }
    switch (aukpelikula) {
      case 1:
        pelikula();
        break;
      case 2:
        pelikula();
        break;
      case 3:
        pelikula();
        break;
      case 4:
        pelikula();
        break;
      case 5:
        pelikula();
        break;
    }

    //sarrerak erosi
    int sarrerak = sc.nextInt();
    switch (sarrerak) {
      case 1:
        System.out.println("Zenbat sarrera nahi dituzu?(1-4)");
        int sarrerakop = sc.nextInt();
    if (sarrerakop > 4) {
      System.out.println("Ezin dituzu 4 sarrera baino gehiago erosi");
    }
    switch (sarrerakop) {
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
  }
  
  break;
   
     
      case 2:
        System.out.println("Pelikula hauek daude: " + pelikulak);
        System.out.println("Pelikula kopurua: " + (pelikulak.size() -1));
        break;
      case 3:
        System.out.println("De Etarte Bidea, 20160 Zubieta, Gipuzkoa");
        break;
      case 4:
        System.out.println("Astelehenetik-Ostiralera: 10:00-21:00. " +
            "Larunbatak eta Igandeak: 8:00-14:00, 16:00-23:00.");
        break;
      case 5:
        break;
   
    }
    }
   
     
    sc.close();
  }
}
