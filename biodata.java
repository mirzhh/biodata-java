import java.util.Scanner;

public class biodata {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nis, nama, usia, jk, agama;
        System.out.println("=========== Dimohon memasukkan data diri anda ===========");
        System.out.print("Masukan nama anda : ");
        nama = scan.nextLine();
        System.out.print("Masukan NIS anda : ");
        nis = scan.nextLine();
        System.out.print("Masukan usia anda : ");
        usia = scan.nextLine();
        System.out.print("Masukan jenis kelamin anda : ");
        jk = scan.nextLine();
        System.out.print("Masukan agama anda : ");
        agama = scan.nextLine();
        System.out.println("=========== Data diri anda ===========");
        System.out.println("Nama : " + nama);
        System.out.println("NIS : " + nis);
        System.out.println("Usia : " + usia);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Agama : " + agama);
        System.out.println("Terima kasih telah mengisi data diri anda");
        scan.close();
    }
}