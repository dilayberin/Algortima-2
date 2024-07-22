package vize1.pkg2çalışmalar;



import java.io.*;

public class chat {

    public static void main(String[] args) {
        try {
            File sinifA = new File("sınıfA.txt");
            File sinifB = new File("sınıfB.txt");
            File uzun = new File("uzun.txt");

            FileWriter uzunYaz = new FileWriter(uzun);

            FileReader sinifAOku = new FileReader(sinifA);
            BufferedReader sinifABuffer = new BufferedReader(sinifAOku);

            FileReader sinifBOku = new FileReader(sinifB);
            BufferedReader sinifBBuffer = new BufferedReader(sinifBOku);

            String satirA = sinifABuffer.readLine();
            String satirB = sinifBBuffer.readLine();

            while (satirA != null || satirB != null) {

                if (satirA != null) {
                    int uzunlukA = satirA.length();
                    uzunYaz.write(satirA + " " + uzunlukA + "\n");
                    satirA = sinifABuffer.readLine();
                }

                if (satirB != null) {
                    int uzunlukB = satirB.length();
                    uzunYaz.write(satirB + " " + uzunlukB + "\n");
                    satirB = sinifBBuffer.readLine();
                }
            }

            uzunYaz.close();
            sinifAOku.close();
            sinifBOku.close();

            FileReader uzunOku = new FileReader(uzun);
            BufferedReader uzunBuffer = new BufferedReader(uzunOku);

            String satirUzun = uzunBuffer.readLine();

            while (satirUzun != null) {

                String[] parcalar = satirUzun.split(" ");
                String kelime = parcalar[0];
                int uzunluk = Integer.parseInt(parcalar[1]);

                if (uzunluk >= 3) {
                    System.out.println(kelime + " " + uzunluk);
                }

                satirUzun = uzunBuffer.readLine();
            }

            uzunOku.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
