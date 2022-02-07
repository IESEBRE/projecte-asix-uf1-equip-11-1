import java.util.Scanner;
import  java.util.Random;
public class Animal {
    //Constructor
    void Animal() {
    }
    boolean talking() {
        boolean finish = false;
        Scanner scanner = new Scanner(System.in);
        boolean finishh = false;

        // Creem les variables
        int onomatopeies = 0;
        int caracter = 0;
        int animal = 0;
        // El menú amb un switch
        System.out.println(" 1. Quin tipus de animal ets?");
        System.out.println(" 2. A que t'agrada jugar?");
        System.out.println(" 3. Quin és el teu caràcter preferit?");
        System.out.println(" 4. Sabries llista tots els caràcters amb valor Unicode parell i menors o iguals a Z resultants\n" +
                "de la suma, entre el valor Unicode del primer i segon caràcter, on el valor Unicode del\n" +
                "primer creixerà fins al segon, el segon decreixerà fins primer ? ");
        System.out.println(" 5. Juguem a fer onomatopeies?");
        System.out.println(" 6. Posa-li un nom!");
        System.out.println(" 7. Pots recordar-me la nostra conversa?");
        System.out.println(" 8. Vols sortir de la conversa?");


        do {
            System.out.println("Que vols fer?:");
            //Menú d'opcions de la classe Animals
            Scanner sc = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1":
                    //Exercici definir el tipus d'animal Exercici 9
                    System.out.println("Quin tipus d'animal ets:");
                    Scanner ani = new Scanner(System.in);
                    animal = ani.next().charAt(0);
                    int difG = 'g' - animal;
                    int difS = 's' - animal;

                    if (difG >= -3 || animal <= 'g')
                        System.out.println("Gos");
                    else if (difS <= -3 || animal >= 's')
                        System.out.println("Serp");
                    else System.out.println("Mono");
                    break;
                case "2":
                    //Exercici triar joc preferit Exercici 10
                    Scanner jo = new Scanner(System.in);
                    System.out.println("Tria el teu esport preferit");
                    System.out.println("a. Padel");
                    System.out.println("b. Escalada");
                    System.out.println("c. Atletisme");
                    char joc = jo.next().charAt(0);
                    if (joc == 'a')
                        System.out.println(" Es un bon esport");
                    else if (joc == 'b')
                        System.out.println("Un esport perillos pero molt interessant");
                    else if (joc == 'c')
                        System.out.println("Ben triat");
                    else
                        System.out.println("Introdueix la lletra correcta");
                    break;
                case "3":
                    Scanner car = new Scanner(System.in);
                    System.out.println("Tria quin es el teu caracter preferit ");
                    caracter = car.next().charAt(0);
                    char iterador = 'a';
                    char counter = (char) (((caracter - 'a') / 2));
                    char finalchar = (char) (counter + 'a');

                    while (iterador != (char) (counter + 'a')) {
                        System.out.print(iterador + ",");
                        ++iterador;
                    }
                    System.out.printf(String.valueOf(finalchar + ","));
                    break;

                case "4":

                case "5":
                    Scanner ono = new Scanner(System.in);
                    Random w = new Random();
                    System.out.println("Tria un caracter per formar una onomatopeia: ");
                    int numloop = 0;


                    while (numloop != 5) {
                        char variable1 = ono.next().charAt(0);
                        System.out.println("TU:" + variable1);
                        char variable2 = (char) (w.nextInt(26) + 'a');
                        System.out.println("ELL: " + variable2);
                        char variable3 = ono.next().charAt(0);
                        System.out.println("TU: " + variable3);
                        String str = new StringBuilder().append(variable1).append(variable2).append(variable3).toString();
                        char vocal = str.charAt(1);
                        if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                            System.out.println("La combinació " + str + " es una onomatopeia");
                            ++onomatopeies;
                        }
                        else
                            System.out.println("La combinació " + str + " no es una onomatopeia");
                        char variable4 = (char) (w.nextInt(26) + 'a');
                        System.out.println("ELL: " + variable4);
                        char variable5 = ono.next().charAt(0);
                        System.out.println("TU: " + variable5);
                        char variable6 = (char) (w.nextInt(26) + 'a');
                        System.out.println("ELL: " + variable6);
                        String str2 = new StringBuilder().append(variable4).append(variable5).append(variable6).toString();
                        char vocal2 = str2.charAt(1);
                        if (vocal2 == 'a' || vocal2 == 'e' || vocal2 == 'i' || vocal2 == 'o' || vocal2 == 'u') {
                            System.out.println("La combinació " + str + " es una onomatopeia");
                            ++onomatopeies;
                        }
                        else
                            System.out.println("La combinació " + str2 + " no es una onomatopeia");
                        ++numloop;
                    }
                    System.out.println("Has format onomatopeies "+onomatopeies);
                    break;
                case "6":
                    Scanner nm = new Scanner(System.in);
                    String nom;
                    nom = nm.nextLine();
                    System.out.println(nom + " Bon nom");
                    break;
                case "7":
                    System.out.println(animal);
                    System.out.println(caracter);
                    System.out.println(onomatopeies);
                    break;
                case "8":
                    System.out.println("Vols finalitzar?(SI o NO)");
                    Scanner conv = new Scanner(System.in);
                    String conversa = conv.nextLine();
                    if (conversa.equals("SI")) {
                        return true;
                    }
                    if (conversa.equals("NO")) {
                        break;
                    }
            }
        }
        while (!finishh);
        return true;
    }
}
