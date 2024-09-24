import java.util.Scanner;

public class data{
    public static void main(String[] args) {
        int jumlah_siswa;
        int TotalBerat_siswa;
        int absensi_siswa;
        double Totalsemua_berat=0;
        double rata_rata_BeratBadansiswa;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jumlah Siswa");
        jumlah_siswa=scanner.nextInt();
        System.out.println("----------------------------------------------");
        for(absensi_siswa=1; absensi_siswa<=jumlah_siswa;absensi_siswa++){
            System.out.println("Masukkan BeratBadan Siswa ke-"+ absensi_siswa+":");
            TotalBerat_siswa = scanner.nextInt();
            Totalsemua_berat += TotalBerat_siswa;
        }
        System.out.println("----------------------------------------------");
        rata_rata_BeratBadansiswa = Totalsemua_berat/jumlah_siswa;
        System.out.println("Rata rata BeratBadan dari"+jumlah_siswa+"siswa adalah:"+rata_rata_BeratBadansiswa);
    }
}
