public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0)
            System.out.println("Invalid Value");

        else {
            int kB = kiloBytes % 1024;
            int MegaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + MegaBytes + " MB and " + kB + " KB");

        }

    }

}
