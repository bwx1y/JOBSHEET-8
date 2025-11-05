import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder result = new StringBuilder();

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();

        result
                .append("=".repeat(100)).append("\n")
                .append(String.format("Jumlah pendaftar: %d", jumlahPoliteknik)).append("\n");

        if (jumlahPoliteknik <= 0) {
            System.out.println("tidak boleh memasukan 0 atau di bawahnya");
        }

        for (int i = 0; i != jumlahPoliteknik; i++) {
            System.out.println("=".repeat(100));
            System.out.print("Masukan nama politeknik: ");
            String nama = sc.nextLine();

            result
                    .append("=".repeat(100)).append("\n")
                    .append(String.format("Nama Politeknik : %s %n", nama))
                    .append("=".repeat(100)).append("\n");


            // batminton
            System.out.println("=".repeat(100));
            System.out.println("Nama bidang lomba: Batminton");
            System.out.println("=".repeat(100));
            result
                    .append("=".repeat(100)).append("\n")
                    .append("Nama bidang lomba: Batminton").append("\n")
                    .append("=".repeat(100)).append("\n");

            for (int x = 1; x != 6; x++) {
                System.out.printf("Nama atlet ke-%d: ", x);
                String namaAtlet = sc.nextLine();
                result.append(String.format("Nama atlet ke-%d: %s", x, namaAtlet)).append("\n");
            }

            //  tenis meja
            System.out.println("=".repeat(100));
            System.out.println("Nama bidang lomba: Tenis meja");
            System.out.println("=".repeat(100));
            result
                    .append("=".repeat(100)).append("\n")
                    .append("Nama bidang lomba: Tenis meja").append("\n")
                    .append("=".repeat(100)).append("\n");

            for (int x = 1; x != 6; x++) {
                System.out.printf("Nama atlet ke-%d: ", x);
                String namaAtlet = sc.nextLine();
                result.append(String.format("Nama atlet ke-%d: %s", x, namaAtlet)).append("\n");
            }

            //  basket
            System.out.println("=".repeat(100));
            System.out.println("Nama bidang lomba: Basket");
            System.out.println("=".repeat(100));
            result
                    .append("=".repeat(100)).append("\n")
                    .append("Nama bidang lomba: Basket").append("\n")
                    .append("=".repeat(100)).append("\n");

            for (int x = 1; x != 6; x++) {
                System.out.printf("Nama atlet ke-%d: ", x);
                String atlet = sc.nextLine();
                result.append(String.format("Nama atlet ke-%d: %s", x, atlet)).append("\n");
            }

            //  bola voli
            System.out.println("=".repeat(100));
            System.out.println("Nama bidang lomba: Bola voli");
            System.out.println("=".repeat(100));
            result
                    .append("=".repeat(100)).append("\n")
                    .append("Nama bidang lomba: Bola voli").append("\n")
                    .append("=".repeat(100)).append("\n");

            for (int x = 1; x != 6; x++) {
                System.out.printf("Nama atlet ke-%d: ", x);
                String namaAtlet = sc.nextLine();
                result.append(String.format("Nama atlet ke-%d: %s", x, namaAtlet)).append("\n");
            }
            
            result.append("\n");
        }

        System.out.println();
        System.out.println(result);
    }
}
