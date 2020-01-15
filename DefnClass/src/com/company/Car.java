package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.lang.invoke.VarHandle;

public class Car {
    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String colour;


    public void setModel(String model){

        String validModel = model;
        if(validModel.equals("Carrera")){
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }


}
