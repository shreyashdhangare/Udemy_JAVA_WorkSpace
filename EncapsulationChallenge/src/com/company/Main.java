package com.company;


public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(110,1234,true);
        System.out.println("The Toner level: " +printer.tonerLevel);
        printer.fillToner(12);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getPagesPrinted());
        System.out.println("THE PRINTER IS A DUPLEX PRINTER:" + printer.isDuplex);
        System.out.println(printer.printPage());
        System.out.println(printer.printPage());
        System.out.println(printer.printPage());
        System.out.println(printer.printPage());
        System.out.println(printer.printPage());
        System.out.println(printer.pagesPrinted);
    }
}
