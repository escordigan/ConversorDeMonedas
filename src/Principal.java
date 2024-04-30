import Adiciones.TryCatchColonesDolares;
import Adiciones.TryCatchUsdCad;
import Adiciones.TryCatchYenesDolares;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Principal {


        public static void main(String[] args) throws IOException{

            //Creacion de objeto Scanner llamado ingresoUsuario espera type del usuario
            Scanner ingresoUsuario = new Scanner(System.in);

            //Variable inicializada en 0, para poder ejecutar
            int dato = 0;

            //Creacion de while que engloba las decisiones de switch, siempre al terminar la operacion elegida del menu, aparece nuevamente el menu principal, hasta elegir la opcion de salida.

            while (dato !=7){
            System.out.println("\n");
            System.out.println("¡Gracias por utilizar los servicios de nuestro conversor de monedas internacionales!");
            System.out.println("********************************************************************************");
            System.out.println(" 1-	Dólar US a Colones");
            System.out.println(" 2- Colones a Dólar US");
            System.out.println(" 3- Dólar US a Dólar canadiense");
            System.out.println(" 4- Dólar canadiense a Dólar US");
            System.out.println(" 5 -Dólar US a Yen Japonés");
            System.out.println(" 6 -Yen Japonés a Dólar US");
            System.out.println(" 7- Salir");
            System.out.println("*************************************************************************************");
            System.out.println(" Ingrese una opcion válida: ");


            dato = ingresoUsuario.nextInt(); // Declaracion de la variable dato, se obtiene del ingresoUsuario y se lee con nextInt.

                    //Inicio de las opciones de switch, declaracion de opciones.

                    switch(dato){

                        case 1:

                            TryCatchColonesDolares.TryCaseOne();

                        break;

                        case 2:

                            TryCatchColonesDolares.TryCaseTwo();

                        break;

                        case 3:

                            TryCatchUsdCad.TryCaseThree();

                        break;

                        case 4:

                            TryCatchUsdCad.TryCaseFour();

                        break;

                        case 5:

                            TryCatchYenesDolares.TryCaseFive();

                            break;

                        case 6:

                            TryCatchYenesDolares.TryCaseSix();

                            break;
                    }
            }

            //Mensaje de salida, una vez terminado el while para cuando sea elegida la opcion 7 - Salir

            System.out.println("Saliendo del sistema... Gracias por preferirnos");
        }
}
