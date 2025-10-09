import java.util.Scanner;
import java.util.ArrayList;

public class Main2 {
    static String agurra(){
        return "Ongi etorri zine aretora!";
    }
    /**
     * Mahaiaineko aplikazio honetan scanner bat erabiliko dugu erabiltzailearen sarrerak jasotzeko. Sarrera hauek
     * erabiliko ditugu zinearen menu nagusian zehar nabigatzeko eta aukeratutako pelikulak ikusteko sarrerak erosteko.
     * Pelikula bakoitzeko gehienez 4 sarrera erosi ahal izango dira
     * @param args
     */
    public static void main(String[] args) {
        Scanner irakur_var = new Scanner(System.in);

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

        boolean running = true;
        while (running) {
            // Menu nagusia
            System.out.println(
                    "\nAukeratu hurrengo aukeren artean bat dagokion zenbakia jarriz: \n 1.Asteguna \n 2.Pelikulen informazio orokorra \n 3.Kokapena ikusi \n 4.Irekiera ordutegia ikusi \n 5.Irten");

            int aukera = irakur_var.nextInt();

            // Asteguna aukeratzen badu
            if (aukera == 1) {
                System.out.println(
                        "Sartu asteko egun bat zenbaki moduan \n 1. Astelehena \n 2. Asteartea \n 3. Asteazkena \n 4. Osteguna \n 5. Ostirala \n 6. Larunbata \n 7. Igandea");
                int egunaAukera = irakur_var.nextInt();
                if (egunaAukera == 1) {
                    System.out.println("Astelehenean dauden pelikulak hauek dira: bat aukeratu" +
                            "\n1." + pelikula.get(0) +
                            "\n2." + pelikula.get(1) +
                            "\n3." + pelikula.get(2));
                } else if (egunaAukera == 2) {
                    System.out.println("Asteartean dauden pelikulak hauek dira: bat aukeratu" +
                            "\n1." + pelikula.get(3) +
                            "\n2." + pelikula.get(4) +
                            "\n3." + pelikula.get(5));
                } else if (egunaAukera == 3) {
                    System.out.println("Asteazkenean dauden pelikulak hauek dira: bat aukeratu" +
                            "\n1." + pelikula.get(6) +
                            "\n2." + pelikula.get(7) +
                            "\n3." + pelikula.get(8));
                } else if (egunaAukera == 4) {
                    System.out.println("Ostegunean dauden pelikulak hauek dira, bat aukeratu:" +
                            "\n1." + pelikula.get(9) +
                            "\n2." + pelikula.get(10) +
                            "\n3." + pelikula.get(11));
                } else if (egunaAukera == 5) {
                    System.out.println("Ostiralean dauden pelikulak hauek dira: bat aukeratu" +
                            "\n1." + pelikula.get(12) +
                            "\n2." + pelikula.get(13) +
                            "\n3." + pelikula.get(14));
                } else if (egunaAukera == 6) {
                    System.out.println("Larunbatean dauden pelikulak hauek dira: bat aukeratu" +
                            "\n1." + pelikula.get(0) +
                            "\n2." + pelikula.get(3) +
                            "\n3." + pelikula.get(6));
                } else if (egunaAukera == 7) {
                    System.out.println("Igandean dauden pelikulak hauek dira:" +
                            "\n1." + pelikula.get(1) +
                            "\n2." + pelikula.get(5) +
                            "\n3." + pelikula.get(10));
                } else {
                    System.out.println("Zenbaki okerra sartu duzu, saiatu berriro.");
                }

                int aukera2 = irakur_var.nextInt();
                System.out.println("Zenbat sarrera nahi dituzu erosi (4 pelikula bakoitzeko gehienez)?");
                int sarrera = irakur_var.nextInt();
                if (sarrera > 4) {
                    System.out.println("Barkatu, baina pelikula bakoitzeko gehienez 4 sarrera erosi ditzakezu.");
                } else {
                    System.out.println("Eskerrik asko zure erosketagatik, ondo pasa zinea ikusten!");
                }
                continue; // berriro menu nagusira
            }

            // Zineko informazio orokorra aukeratzen badu
            if (aukera == 2) {
                System.out.println(
                        "Aukeratu bat bi hauetatik: \n1.Pelikula kopurua eta hauen izenak \n2.Gela kopurua eta hauen izenak");
                int informazioaukera = irakur_var.nextInt();
                if (informazioaukera == 1) {
                    System.out.println("Gaur egun zinean dauden pelikulak " + pelikula.size() + " dira eta hauek dira: "
                            + pelikula);
                } else if (informazioaukera == 2) {
                    System.out.println("Zineak " + gela.size() + " gela ditu eta hauek dira: " + gela);
                } else {
                    System.out.println("Zenbaki okerra sartu duzu, saiatu berriro.");
                }
                continue;
            }
            // kokapena
            if (aukera == 3) {
                System.out.println(" Zinearen direkzioa hau da: Bo. Txiki-Erdi, 7, 20170 Usurbil, Gipuzkoa");
                continue;
            }
            // Irekiera ordutegia
            if (aukera == 4) {
                System.out.println(
                        "Zinea astelehenetik ostiralera 16:00etatik 22:00etara dago irekita eta larunbat eta igandeetan 15:00etatik 23:00etara.");
                continue;
            }
            if (aukera == 5) {
                System.out.println("Agur!");
                running = false;
            }
        }
    }
}
