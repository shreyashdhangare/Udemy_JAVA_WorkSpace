package com.company;

import java.io.*;
import java.net.Socket;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",5000)){

            InputStream in;
            BufferedReader Echoes = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Writer out;
            PrintWriter StringToEcho = new PrintWriter(socket.getOutputStream(),true);

            Scanner scanner = new Scanner(System.in);
            String EchoString;
            String Response;

            do{
                System.out.println("Enter the string to be echoed");
                EchoString = scanner.nextLine();

                StringToEcho.println(EchoString);
                if(!EchoString.equals("exit")){
                    Response = Echoes.readLine();
                    System.out.println(Response);
                }
            }while(!EchoString.equals("exit"));


        }
        catch (IOException e){
            System.out.println("THERE HAS BEEN AN EXCEPTION");
        }
    }
}
