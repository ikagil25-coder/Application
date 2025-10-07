import java.util.*;

public class Main1 {
    static Scanner sc = new Scanner(System.in);

    static String agurra() {
        return "Kaixo eta ongietorri Zine Usurbilera!";
    }
    
    static String[] gelak = {
            "Umeen gela", "Superheroien gela", "Thriller gela",
            "Zientzia fikzioko gela", "Komedia gela"
    };

    static String[] pelikulak = {
            "Lilo y Stitch", "Una película de Minecraft", "Mufasa: El rey león",
            "Cómo entrenar a tu dragón", "Capitán América: Brave New World",
            "Conclave", "Sonic 3: La película", "Misión: Imposible. Sentencia Final",
            "Blancanieves", "Thunderbolt", "Padre no hay más que uno 5",
            "Wolfgang (Extraordinario)", "El casoplón", "Un funeral de locos", "Sirāt"
    };

    // Egunak
    static String[] egunak = {
            "Astelehena", "Asteartea", "Asteazkena",
            "Osteguna", "Ostirala", "Larunbata", "Igandea"
    };

    // Programazioa: Egunen lista → pelikulen lista
    static ArrayList<ArrayList<String>> programazioa = new ArrayList<>();

    // Sarrerak: Egunen lista → gelako sarrerak
    static ArrayList<ArrayList<Integer>> sarrerak = new ArrayList<>();

    // Programazioa kargatu
    static void kargatuProgramazioa() {
        // Astelehena
        programazioa.add(new ArrayList<>(List.of(
                "Lilo y Stitch",
                "Capitán América: Brave New World",
                "Conclave",
                "Sonic 3: La película",
                "Padre no hay más que uno 5")));
        // Asteartea
        programazioa.add(new ArrayList<>(List.of(
                "Mufasa: El rey león",
                "Thunderbolt",
                "Misión: Imposible. Sentencia Final",
                "Cómo entrenar a tu dragón",
                "Un funeral de locos")));
        // Asteazkena
        programazioa.add(new ArrayList<>(List.of(
                "Una película de Minecraft",
                "Wolfgang (Extraordinario)",
                "Sirāt",
                "Blancanieves",
                "El casoplón")));
        // Osteguna
        programazioa.add(new ArrayList<>(List.of(
                "Cómo entrenar a tu dragón",
                "Capitán América: Brave New World",
                "Misión: Imposible. Sentencia Final",
                "Thunderbolt",
                "Padre no hay más que uno 5")));
        // Ostirala
        programazioa.add(new ArrayList<>(List.of(
                "Mufasa: El rey león",
                "Sonic 3: La película",
                "Conclave",
                "Wolfgang (Extraordinario)",
                "Un funeral de locos")));
        // Larunbata
        programazioa.add(new ArrayList<>(List.of(
                "Lilo y Stitch",
                "Capitán América: Brave New World",
                "Conclave",
                "Sonic 3: La película",
                "Padre no hay más que uno 5")));
        // Igandea
        programazioa.add(new ArrayList<>(List.of(
                "Mufasa: El rey león",
                "Thunderbolt",
                "Misión: Imposible. Sentencia Final",
                "Cómo entrenar a tu dragón",
                "Un funeral de locos")));
    }

    // Sarrerak kargatu
    static void kargatuSarrerak() {
        for (int i = 0; i < programazioa.size(); i++) {
            ArrayList<Integer> eguneko = new ArrayList<>();
            for (int j = 0; j < gelak.length; j++) {
                eguneko.add(0); // Hasieran sarrera kopurua 0 da
            }
            sarrerak.add(eguneko);
        }
    }

    static void erakutsiPelikulak() {
        System.out.println("\nPelikula guztiak:");
        for (int i = 0; i < pelikulak.length; i++) {
            System.out.println((i + 1) + ". " + pelikulak[i]);
        }
    }

    static void menuEguna() {
        for (int i = 0; i < egunak.length; i++) {
            System.out.println((i + 1) + " - " + egunak[i]);
        }
        System.out.print("Aukeratu eguna: ");
        int e = sc.nextInt();
        sc.nextLine();

        if (e < 1 || e > 7) {
            System.out.println("Zenbaki okerra.");
            return;
        }
        int egunaIdx = e - 1;
        System.out.println("\n" + egunak[egunaIdx] + "ko programazioa:");

        ArrayList<String> egunekoPelikulak = programazioa.get(egunaIdx);

        for (int i = 0; i < egunekoPelikulak.size(); i++) {
            System.out.println((i + 1) + ". " + egunekoPelikulak.get(i) + " (" + gelak[i] + ")");
        }

        System.out.print("\nSarrera erosi nahi duzu? (bai/ez): ");
        String bai = sc.nextLine();
        if (bai.equalsIgnoreCase("bai")) {
            System.out.print("Aukeratu pelikularen zenbakia: ");
            int zenb = sc.nextInt();
            sc.nextLine();

            if (zenb >= 1 && zenb <= egunekoPelikulak.size()) {
                String aukPeli = egunekoPelikulak.get(zenb - 1);
                System.out.print("Zenbat sarrera nahi dituzu (1-4): ");
                int kop = sc.nextInt();
                sc.nextLine();
                erosiSarrera(egunaIdx, zenb - 1, aukPeli, kop);
            } else {
                System.out.println("Zenbaki okerra.");
            }
        }
    }

    static void erosiSarrera(int egunaIdx, int peliIdx, String pelikula, int kop) {
        if (kop < 1 || kop > 4) {
            System.out.println("Sarrera kopuru okerra (1-4).");
            return;
        }

        int lehendik = sarrerak.get(egunaIdx).get(peliIdx);
        if (lehendik + kop <= 4) {
            sarrerak.get(egunaIdx).set(peliIdx, lehendik + kop);
            System.out.println("Erosi dituzu " + kop + " sarrera: " + pelikula +
                    " (" + egunak[egunaIdx] + ": " + sarrerak.get(egunaIdx).get(peliIdx) + "/4)");
        } else {
            System.out.println("Ezin dira " + kop + " sarrera erosi " + egunak[egunaIdx] + "rako. " +
                    "Gehienez " + (4 - lehendik) + " erosi ditzakezu egun horretarako.");
        }
    }

    public static void main(String[] args) {
        System.out.println(agurra());
        kargatuProgramazioa();
        kargatuSarrerak();

        boolean running = true;
        while (running) {
            System.out.println("\n--- USURBIL ZINEA ---");
            System.out.println("1 - Aste eguna aukeratu");
            System.out.println("2 - Pelikulen informazio orokorra");
            System.out.println("3 - Kokapena ikusi");
            System.out.println("4 - Irekiera ordutegia ikusi");
            System.out.println("5 - Irten");
            System.out.print("Aukeratu: ");

            int auk = sc.nextInt();
            sc.nextLine();

            switch (auk) {
                case 1 -> menuEguna();
                case 2 -> erakutsiPelikulak();
                case 3 -> System.out.println("Kokapena: Usurbil Zinea - Kale Nagusia 12, Usurbil");
                case 4 -> System.out.println("Ordutegia: Astelehenetik Igandera 16:00 - 23:00");
                case 5 -> running = false;
                default -> System.out.println("Aukera okerra.");
            }
        }
    }
}
