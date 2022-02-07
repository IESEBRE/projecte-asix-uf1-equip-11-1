
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.desktop.ScreenSleepEvent;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class alien2 {

    private static Object Scanner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Questionari:");
        System.out.println("1. Quin tipus d’extraterrestre ets?");
        System.out.println("2. Com et desplaces?");
        System.out.println("3. Quin és el teu número favorit entre 0,0 i ...?");
        System.out.println("4. Sabries llista tots els números que amb decimal després de la coma igual a #,5 després\n" +
                "de la operació (a+b)/2, entre el valor float de a i b, on el valor de a creixerà fins b, b\n" +
                "decreixerà fins a ?");
        System.out.println("5. Juguem als barquets?");
        System.out.println("6. Posa-li un nom:");
        System.out.println("7.Recordes la conversació?");
        System.out.println("8.Sortir");
        int opcion = sc.nextInt();
        switch (opcion) {


            //EXERCICI 1

            case 1:

                System.out.println("Introdueix un unm del 0 - 10");
                float numero;
                String tipo = "";
                numero = sc.nextFloat();
                numero = numero % 1;        //sobrant de divisio
                numero = numero * 10;       // mou la coma un lloc
                numero = Math.round(numero);        //arrodonim el nombre obtingut anteriorment

                // System.out.println(numero);
                if (numero > 5) tipo = "Pau";
                if (numero < 5) tipo = "Assasi";
                if (numero == 5.0) tipo = "Sucubo";

                System.out.println("El alien es tipo: " + tipo); //en "+", concatenam textos en variables
                break;


            //EXERCICI 2

            case 2:
                System.out.print("Escriu un float entre (0 y 10):");
                float num;
                //Scanner sc = new Scanner(System.in);

                num = sc.nextFloat();
                num = num % 1;
                num = num * 10;

                if (num == 0) {
                    System.out.print("Hem transporto amb: ");
                    System.out.println("Les meves cames");
                }
                    if (num == 1) {
                    System.out.print("Hem transporto amb: ");
                    System.out.println("Una moto de Carretera");
                }
                    if (num == 2) {
                    System.out.print("Hem transporto amb: ");
                    System.out.println("Pets");
                }
                    if (num == 3) {
                    System.out.print("Hem transporto amb: ");
                    System.out.println("Patins de linia");
                }
                    if (num == 4) {
                    System.out.print("Hem transporto amb: ");
                    System.out.println("Caza");
                }
                    if (num == 5) {
                    System.out.print("Hem transporto amb: ");
                    System.out.println("Alfombra voladora");
                }
                    if (num == 6) {
                    System.out.print("Hem transporto amb: ");
                    System.out.println("Una aquila peluda");
                }
                    if (num == 7) {
                    System.out.print("Hem transporto amb: ");
                    System.out.println("Un pato coix");
                }
                    if (num == 8) {
                    System.out.print("Hem transporto amb: ");
                    System.out.println("Un coet aeroespacial");
                }
                    if (num == 9) {
                    System.out.print("Hem transporto amb: ");
                    System.out.println("La ment");
                }
                    if (num == 10) {
                    System.out.print("Hem transporto amb: ");
                    System.out.println("Autobus");
                }

                break;

            //EXERCICI 3

            case 3:
                System.out.println("Escriu un nombre positiu: ");

                float prefNum;

                prefNum = sc.nextFloat();
                prefNum = prefNum / 2;

                float i = 0;
                while (i <= prefNum) {
                    System.out.printf("%.1f ", i);
                    i += 0.1;
                    System.out.println("");
                }
                float resultat = i;
                System.out.print("El meu numero preferit es: ");
                System.out.printf("%.0f", resultat);
                break;


            //EXERCICI 4

            case 4:

                break;


            //EXERCICI 5

            case 5:

                float numInicial;


                System.out.println("Anem a jugar, escull un numero: ");
                float numeroAleatorio = (float) (Math.random() * 5);
                numInicial = sc.nextFloat();

                while (numeroAleatorio != numInicial) {



                }

                break;

            //EXERCICI 6

            case 6:

                System.out.println("Escull un nom: ");

                Scanner = new Scanner(System.in);

                String nomAlien;

                nomAlien = sc.nextLine();


                System.out.println(nomAlien + "Hmmm..., M'agrada!!");

                break;
        }
    }
}
