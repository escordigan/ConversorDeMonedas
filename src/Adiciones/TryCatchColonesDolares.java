package Adiciones;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class TryCatchColonesDolares {

  public static void TryCaseOne(){

    try {
      System.out.println("Por favor ingrese el valor de dólares americanos que desea convertir a colones. \n" +
              "No se requiere utilizar comas, usar el punto únicamente para decimales en caso sea necesario: ");

      Scanner valorUsuario = new Scanner(System.in); //Creacion de objeto Scanner llamado valorUsuario, espera type del usuario

      var conversionUno = valorUsuario.nextLine(); //Var conversionUno almacena y lee el valor del usario en este primer caso del switch. Su usa para formar el link del API

      // URL del API endpoint
      String apiUrl = "https://v6.exchangerate-api.com/v6/0eb6ae9584d9c4bd5fb92079/pair/USD/CRC/" + conversionUno;

      // Creacion de un objeto tipo URL - Pasando del API a URL
      URL url = new URL(apiUrl);

      // Abriendo una conexion HTTP al URL
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("GET");

      // Obteniendo el codigo de respuesta
      int responseCode = connection.getResponseCode();

      // Si el codigo de respuesta es exitoso (status code 200)
      if (responseCode == HttpURLConnection.HTTP_OK) {

        // Crecion de un BufferedReader para leer el response body
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        // Leyendo el response body linea por linea
        while ((inputLine = in.readLine()) != null) {
          response.append(inputLine);
        }
        in.close();

        // Convirtiendo la respuesta a un Java String
        String responseBody = response.toString();

        // Parseando la respuesta JSON usando Gson
        Gson gson = new Gson();
        JsonObject objetoJson = gson.fromJson(responseBody, JsonObject.class);

        // Extrayendo Strings especificos del objeto JSON
        String conversion_result = objetoJson.get("conversion_result").getAsString();
        String conversion_rate = objetoJson.get("conversion_rate").getAsString();

        // Imprimiendo los Strings extraidos de JSON
        System.out.println("Conversion del valor en dólares americanos a colones: " + conversion_result);
        System.out.println("                                                              ");
        System.out.println("Valor de la tasa de cambio utilizada, en colones: " + conversion_rate);

      } else {
        // Si el codigo de respuesta no fue exitoso, imprime un error de mensaje
        System.out.println(" Error al recibir respuesta del API, codigo de respuesta: " + responseCode);
      }
      // Cerrando la conexion

      connection.disconnect();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  public static void TryCaseTwo(){

    try {
      System.out.println("Por favor ingrese el valor de colones que desea convertir a dólares americanos. \n" +
              "No se requiere utilizar comas, usar el punto únicamente para decimales en caso sea necesario: ");

      //Aqui se espera el ingreso del usuario, el monto o valor, ademas la variable se guarda para su posterior uso en el link del API
      Scanner valorUsuario = new Scanner(System.in);
      var conversionDos = valorUsuario.nextLine();


      // URL del API endpoint
      String apiUrl = "https://v6.exchangerate-api.com/v6/0eb6ae9584d9c4bd5fb92079/pair/CRC/USD/" + conversionDos;

      // Creacion de un objeto tipo URL - Pasando del API a URL
      URL url = new URL(apiUrl);

      // Abriendo una conexion HTTP al URL
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("GET");

      // Obteniendo el codigo de respuesta
      int responseCode = connection.getResponseCode();

      // Si el codigo de respuesta es exitoso (status code 200)
      if (responseCode == HttpURLConnection.HTTP_OK) {

        // Crecion de un BufferedReader para leer el response body
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        // Leyendo el response body linea por linea
        while ((inputLine = in.readLine()) != null) {
          response.append(inputLine);
        }
        in.close();

        // Convirtiendo la respuesta a un Java String
        String responseBody = response.toString();

        // Parseando la respuesta JSON usando Gson
        Gson gson = new Gson();
        JsonObject objetoJson = gson.fromJson(responseBody, JsonObject.class);

        // Extrayendo Strings especificos del objeto JSON
        String conversion_result = objetoJson.get("conversion_result").getAsString();
        String conversion_rate = objetoJson.get("conversion_rate").getAsString();

        // Imprimiendo los Strings extraidos de JSON
        System.out.println("Conversion del valor de colones a dólares americanos: " + conversion_result);
        System.out.println("                                                              ");
        System.out.println("Valor de la tasa de cambio utilizada, en dólares americanos: " + conversion_rate);

      } else {
        // Si el codigo de respuesta no fue exitoso, imprime un error de mensaje
        System.out.println(" Error al recibir respuesta del API, codigo de respuesta: " + responseCode);
      }
      // Cerrando la conexion

      connection.disconnect();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  }




