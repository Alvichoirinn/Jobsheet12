import java.util.Scanner;
public class UcapanTerimakasih_03 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimakasih(String ucapanTambahan) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world. \n" +
        "You inspired in me a love for Learning and mode me feel like I could ask you anything.");
        UcapanTambahan(ucapanTambahan);
    }
     public static void UcapanTambahan(String ucapanTambahan){
        System.out.println("Terimakasih, " + "!" + ucapanTambahan);
    }
    public static void main(String[] args) {
        String ucapanTambahan;
        Scanner sc = new Scanner(System.in);
        UcapanTerimakasih("");
        System.out.println("Tuliskan ucapan tambahan Anda: ");
        ucapanTambahan = sc.nextLine();

        UcapanTambahan(ucapanTambahan);
        sc.close();

    }
}
