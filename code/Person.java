import java.util.Scanner;

public class Person {
    // Constructor
    void Person() {
    }

    boolean talking() {
        System.out.println("Hola, que tal!");
        //Declaració de variables
        boolean finish = false;
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introdueix un nombre per accedir al menú");
            //menu de opcions per a mostrar al usuari
            System.out.println(" 1. Quin tipus de persona ets?");
            System.out.println(" 2. Quin d'esport t'agrada");
            System.out.println(" 3. Quin és el teu número preferit entre 0 i ...?");
            System.out.println(" 4. Sabries llistar tots els nombres parells resultants de la multiplicació entre el valor enter a i b, on el valor de a creixerà fins b, b decreixerà fins a ?");
            System.out.println(" 5. Juguem a pedra paper i tisora?");
            System.out.println(" 6. Posa-li un nom!");
            System.out.println(" 7. Pots recordar-me la nostra conversa?");
            System.out.println(" 8. Sortir de l'aplicació");
            System.out.print("Opció: ");
            switch (entrada.nextInt()) {
                //menu de options dels programes
                case 1:
                    exercici1();
                    break; // break es obligatori
                case 2:
                    exercici2();
                    break;
                case 3:
                    exercici3();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    exercici6();
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
        } while (!finish);
        return true;
    }

    boolean exercici1() {
        Scanner entrada1 = new Scanner(System.in);
        //variables
        boolean finish = false;
        int numero1, numero2 = 2, numero3 = 3;
        //codi exercici 1
        System.out.println("Introdueix un nombre múltiple del 0 al 100");
        numero1 = entrada1.nextInt();
        while (true) {
            if (numero1 % numero2 == 0 && numero1 % numero3 == 0) {
                System.out.println("No binari");
                break;
            } else if (numero1 % numero2 == 0) {
                System.out.println("És home");
                break;
            } else if (numero1 % numero3 == 0) {
                System.out.println("És dona");
                break;
            } else {
                if (numero1 <= 100) numero1 += 2;
                else numero1 -= 4;
            }
        }
        return true;
    }

    boolean exercici2() {
        Scanner entrada2 = new Scanner(System.in);
        //variables
        boolean finish = false;
        int opcio;
        //2.Quin esport t'agrada?
        System.out.println("Introdueix una opció del menú");
        System.out.println("1.Patinatge");
        System.out.println("2.Futbol");
        System.out.println("3.Gimnastica");
        System.out.println("4.Basket");
        System.out.println("5.Padel");
        System.out.println("6.Tenis");
        System.out.println("7.Voley");
        System.out.println("8.Cricket");
        System.out.println("9.Golf");
        System.out.println("10.Badminton");
        //en aquests souts es llisten els diferents esports que trobarà l'usuari a escollir
        //una opció
        // declaració del switch
        opcio = entrada2.nextInt();
        switch (opcio) {
            // declaració case
            // els valors han de ser del mateix tipus que la expresió
            case 1:
                // Declaracions
                System.out.println("Has escollit patinatge!!! bona elecciḉ");
                break; // break es opcional
            case 2:
                System.out.println("Has escollit futbol!! El meu equip preferit és el Barça");
                break;
            case 3:
                System.out.println("Has escollit gimastica ritmica, molt elegant");
                break;
            case 4:
                System.out.println("Has escollit basket!! El meu equip preferit són els Lakers");
                break;
            case 5:
                System.out.println("Has escollit padel!!!!");
                break;
            case 6:
                System.out.println("Has escollit tenis, ja tens raqueta?");
                break;
            case 7:
                System.out.println("Has escollit voley!! Molt popular a Portugal");
                break;
            case 8:
                System.out.println("Has escollit cricket!! Un gran esport");
                break;
            case 9:
                System.out.println("Has escollit golf, i el teu pal?");
                break;
            case 10:
                System.out.println("Has escollit badminton, vaig a buscar la raqueta i vinc!");
                break;
            // Podem tenir qualsevol numero de declaracions de case, en aquest cas
            //cada case conte un missatge de sortida un system.out.println per mostrar un esport
            //segons el nombre introduït per l'usuari amb el qual indicarà el cas al que entrarà.
            //La declaració predeterminada, s'utilitza quan cap dels casos és verdader.
            default:
                System.out.println("Torna a provar-ho, que t'has equivocat");

        }
        return true;
    }

    boolean exercici3() {
        Scanner entrada3 = new Scanner(System.in);
        //variables
        boolean finish = false;
        return true;
    }

    boolean exercici6() { //6.Posa-li un nom:
        Scanner entrada6 = new Scanner(System.in);
        //variables
        String nom;
        boolean finish = false;
        //Problema
        System.out.println("Introdueix un nom per a la persona: ");
        nom = entrada6.next(); //assigna a la variable nom el String introduït per l'usuari
        System.out.println("Gràcies, m’agrada aquest nom " + nom);
        return true;
    }
}

            /*Scanner entrada = new Scanner(System.in);
            String nom;
            int opcio;
            int numero1, numero2 = 2, numero3 = 3;
//6.Posa-li un nom:
            System.out.println("Introdueix un nom per a la persona: ");
            nom = entrada.next(); //assigna a la variable s el String introducido por teclado
            System.out.println("Gràcies, m’agrada aquest nom") ;

            //1.Quin tipus de persona ets?
            System.out.println("Introdueix un nombre enter entre 0 i 100 en una sola línia");
            //Guardem el nombre introduit per l'usuari
            numero1 = entrada.nextInt();

            //Operacions
            //Si és múltiple de 2 serà home, si és múltiple 3 serà dona, si és múltiple
            //de tots dos No binari,

            if (numero1 % numero2 == 0) {//mirem si numero1 és multiple de numero2
                System.out.println("és home");
            } else {
                (numero1 % numero3 == 0) { //mirem si numero 1 és múltiple de número 3

                }
                System.out.println("és dona");
            }




 /*
  if (numero1 % numero2 == 0 && numero1 % numero3 == 0) {//mirem si numero1 és multiple de numero2
                    System.out.println("és no binari");

                } else {
                    if (numero1 % numero2 == 0) { //mirem si numero 1 és múltiple de número 2
                        System.out.println("ets mascle");
                    } if (numero1 % numero3 == 0) {
                        System.out.println("ets dona");

                    }do {

                    }

                }
            }while (!finish);
  */

/*   //estructura bàsica d'un nou metode
  boolean exercici3() {
        Scanner entrada3 = new Scanner(System.in);
        //variables
        boolean finish = false;
        return true;
    }
 */

/* 3. Quin és el teu numero preferit 0 i .....?
introduccio d'un nombre
Scanner entrada3 = new Scanner(System.in);
int numero03;
numero03 = entrada3.nextInt();

//recorrer nombres

 */