import java.util.Scanner;
public class Kubus03 {
    public static int hitungVolume(int s){
        int volume = s*s*s;
        return volume;
    }
    public static int hitungLuasPermukaan(int s){
        int luasPermukaan = 6*s*s;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi: ");
        int sisi = input.nextInt();

        System.out.println("volume kubus adalah " +hitungVolume(sisi));
        System.out.println("luaspermukaan " +hitungLuasPermukaan(sisi));
    }
}
