package fi.lut.olio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Kysytään käyttäjältä tehtaan nimi
        System.out.print("Anna tehtaalle nimi: ");
        String factoryName = sc.nextLine();

        // Luodaan uusi tehdas käyttäjän syöttämällä nimellä
        Factory factory = new Factory(factoryName);



        boolean running = true;
        while (running) {
            System.out.println("1) Lisää kone");
            System.out.println("2) Listaa kaikki koneet");
            System.out.println("0) Lopeta ohjelma");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Anna koneen tyyppi: ");
                    String type = sc.nextLine();

                    System.out.println("Anna koneen malli: ");
                    String model = sc.nextLine();

                    System.out.println("Anna työntekijän nimi: ");
                    String workerName = sc.nextLine();

                    System.out.println("Anna työntekijän rooli: ");
                    String workerRole = sc.nextLine();

                    Worker worker = new Worker(workerName, workerRole);
                    Machine machine = new Machine(type, model, worker);

                    factory.addMachine(machine);
                    System.out.println("Kone lisätty!");
                    break;
                
                case 2:
                    System.out.println("Tehtaasta " + factory.getName() + " löytyy seuraavat koneet:");
                    
                    for (Machine m : factory.getMachines()) {
                        System.out.println(m.getMachineDetails());
                        System.out.println(); // tyhjä rivi koneiden väliin
                    }  
                    break;

                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    running = false;
                    
                    }
        }
        sc.close();
    }
}  
    