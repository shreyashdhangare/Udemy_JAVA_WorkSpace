package com.company;

public class Printer {
    int tonerLevel;
    int pagesPrinted;
    boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int toner){
        if(toner > 0 && toner < 100){
            this.tonerLevel = toner;
        }
        else{
            this.tonerLevel = 100;
        }

        System.out.println("The printer is now on toner level::" + this.tonerLevel);

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int printPage(){
        System.out.println("Printer.printPage called");
        this.pagesPrinted = this.pagesPrinted + 1;
        return this.pagesPrinted;
    }


}
