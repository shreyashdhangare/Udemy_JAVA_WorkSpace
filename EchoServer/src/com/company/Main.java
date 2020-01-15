package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try(ServerSocket serverSocket = new ServerSocket(5000)){



            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("THE CLIENT IS CONNECTED");

                InputStream in;
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                Writer out;
                PrintWriter output = new PrintWriter(socket.getOutputStream(),true);

                String EchoString = input.readLine();
                try{
                    Thread.sleep(15000);
                }
                 catch (InterruptedException e) {
                     System.out.println("THREAD INTERRUPY!!!");
                }


                if(EchoString.equals("exit")){
                    break;
                }
                output.println("Echo from the server" + EchoString);
            }


        }catch (IOException e){
            System.out.println("THERE IS A SERVER EXCEPTION" + e.getMessage() );
        }

    }
}
