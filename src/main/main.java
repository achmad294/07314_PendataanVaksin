//package Main07289;
//
//import Controller07289.AdminController07289;
//import Controller07289.PendudukController07289;
//import Entity07289.PendudukEntity0728907289;
//
//import java.util.Scanner;
//
//public class Main07289 {
//    public static AdminController07289 adminController07289 = new AdminController07289();
//    public static PendudukController07289 pendudukController07289 = new PendudukController07289();
//    public static Scanner input = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int pil;
//        do {
//            System.out.println("1. Login Admin");
//            System.out.println("2. Registrasi Admin");
//            System.out.println("Masukkan Pilihan: ");
//            pil = input.nextInt();
//            input.nextLine();
//
//            switch (pil) {
//                case 1 -> loginAdmin();
//                case 2 -> regisData();
//            }
//        } while (pil != 0);
//    }
//
//    static void loginAdmin() {
//        int pil;
//        String nip, password;
//
//        System.out.println("Masukkan NIP: ");
//        nip = input.nextLine();
//        System.out.println("Masukkan Password: ");
//        password = input.next();
//        int cek = adminController07289.cekLogin(nip, password);
//        if (cek != 0) {
//            System.out.println("Berhasil Login");
//            menu();
//        } else {
//            System.out.println("Gagal Login");
//        }
//    }
//
//    static void menu() {
//        int pil;
//        do {
//            System.out.println("1. ADMIN");
//            System.out.println("2. PENDUDUK");
//            System.out.println("Masukkan Inputan: ");
//            pil = input.nextInt();
//
//            switch (pil) {
//                case 1 -> menuAdmin();
//                case 2 -> menuPenduduk();
//            }
//        } while (pil != 0);
//    }
//
//    static void menuAdmin() {
//        int pil;
//        do {
//            System.out.println("1. Update Passwordd");
//            System.out.println("2. Update NoTelp");
//            System.out.println("3. Hapus Data");
//            System.out.println("0. Log Out");
//            System.out.print("Pilih: ");
//            pil = input.nextInt();
//            input.nextLine();
//            switch (pil) {
//                case 1:
//                    updatepassword();
//                    break;
//                case 2:
//                    updatenotelp();
//                    break;
//                case 3:
//                    deleteData();
//                    break;
//            }
//        } while (pil != 0);
//    }
//
//    static void regisData() {
//        int id;
//        String nip, nama, alamat, password, noTelp;
//
//        System.out.println("Masukkan id: ");
//        id = input.nextInt();
//        input.nextLine();
//        System.out.println("Masukkan NIP: ");
//        nip = input.nextLine();
//        System.out.println("Masukkan Nama: ");
//        nama = input.nextLine();
//        System.out.println("Masukkan Alamat: ");
//        alamat = input.nextLine();
//        System.out.println("Masukkan Password: ");
//        password = input.nextLine();
//        System.out.println("Masukkan No Telp: ");
//        noTelp = input.nextLine();
//
//        adminController07289.insertData(id, nip, nama, alamat, password, noTelp);
//    }
//
//    static void updatepassword() {
//        String password;
//        int id;
//        System.out.println("Masukkan id: ");
//        id = input.nextInt();
//        input.nextLine();
//        System.out.println("Masukkan password baru: ");
//        password = input.nextLine();
//        adminController07289.updatePassword(password, id);
//    }
//
//    static void updatenotelp() {
//        String noTelp;
//        int id;
//        System.out.println("Masukkan id: ");
//        id = input.nextInt();
//        input.nextLine();
//        System.out.println("Masukkan No Telp baru: ");
//        noTelp = input.nextLine();
//        adminController07289.updateNoTelp(noTelp, id);
//    }
//
//    static void deleteData() {
//        System.out.print("Masukkan id yang ingin dihapus: ");
//        int id = input.nextInt();
//        adminController07289.deleteData(id);
//    }
//
//    static void menuPenduduk() {
//        int pil;
//        do {
//            System.out.println("1. Insert Data penduduk");
//            System.out.println("2. Update Dosis");
//            System.out.println("3. Update NoTelp");
//            System.out.println("4. Lihat Data");
//            System.out.println("5. Lihat Data Berdasarkan id");
//            System.out.println("6. Cek Data");
//            System.out.println("0. Log Out");
//            System.out.print("Pilih: ");
//            pil = input.nextInt();
//            input.nextLine();
//            switch (pil) {
//                case 1:
//                    insertPenduduk();
//                    break;
//                case 2:
//                    updateDosis();
//                    break;
//                case 3:
//                    updatenotelpPenduduk();
//                    break;
//                case 4:
//                    showData();
//                    break;
//                case 5:
//                    System.out.println("Masukkan ID: ");
//                    int id = input.nextInt();
//                    showData(id);
//                    break;
//                case 6:
//                    CekData();
//                    break;
//            }
//        } while (pil != 0);
//    }
//
//    static void insertPenduduk() {
//        System.out.println("Masukkan NIK: ");
//        String nik = input.nextLine();
//        System.out.println("Masukkan Nama: ");
//        String nama = input.nextLine();
//        System.out.println("Masukkan Alamat: ");
//        String alamat = input.nextLine();
//        System.out.println("Masukkan No Telp: ");
//        String noTelp = input.nextLine();
//        System.out.print("Masukkan dosis: ");
//        String dosis = input.nextLine();
//        System.out.print("Masukkan Jenis Vaksin: ");
//        String vaksin = input.next();
//
//        pendudukController07289.insertData(nik, nama, alamat, noTelp, dosis, vaksin);
//    }
//
//    static void updateDosis() {
//        System.out.print("Masukkan id: ");
//        int id = input.nextInt();
//        System.out.print("Masukkan Dosis baru: ");
//        String dosis = input.next();
//        pendudukController07289.updateDosis(dosis, id);
//    }
//
//    static void updatenotelpPenduduk() {
//        String noTelp;
//        int id;
//        System.out.println("Masukkan id: ");
//        id = input.nextInt();
//        input.nextLine();
//        System.out.println("Masukkan No Telp baru: ");
//        noTelp = input.nextLine();
//        pendudukController07289.updateNoTelp(noTelp, id);
//    }
//
//    static void showData() {
//        for (PendudukEntity0728907289 pendudukEntity0728907289 : pendudukController07289.getDataPenduduk()) {
//            System.out.println("--------------------------------------------------");
//            System.out.println("Id : " + pendudukEntity0728907289.getId());
//            System.out.println("Nama : " + pendudukEntity0728907289.getNama());
//            System.out.println("Alamat : " + pendudukEntity0728907289.getAlamat());
//            System.out.println("No Telp : " + pendudukEntity0728907289.getNoTelp());
//            System.out.println("NIK : " + pendudukEntity0728907289.getNik());
//            System.out.println("Dosis: " + pendudukEntity0728907289.getDosis());
//            System.out.println("Jenis Vaksin :  " + pendudukEntity0728907289.getJns_vaksin());
//            System.out.println("--------------------------------------------------");
//        }
//
//    }
//
//    static void showData(int id){
//        for (PendudukEntity0728907289 pendudukEntity : pendudukController07289.getDataPenduduk(id)) {
//            System.out.println("--------------------------------------------------");
//            System.out.println("Id : " + pendudukEntity.getId());
//            System.out.println("Nama : " + pendudukEntity.getNama());
//            System.out.println("Alamat : " + pendudukEntity.getAlamat());
//            System.out.println("No Telp : " + pendudukEntity.getNoTelp());
//            System.out.println("NIK : " + pendudukEntity.getNik());
//            System.out.println("Dosis: " + pendudukEntity.getDosis());
//            System.out.println("Jenis Vaksin :  " + pendudukEntity.getJns_vaksin());
//            System.out.println("--------------------------------------------------");
//        }
//    }
//
//
//    static void CekData(){
//        System.out.print("Masukkan nik yang ingin di cek: ");
//        String nik = input.nextLine();
//        int cek = pendudukController07289.CekData(nik);
//
//        if(cek > 0){
//            System.out.println("Data Tersedia");
//            showData(cek);
//        }else{
//            System.out.println("Data Tidak Tersedia");
//        }
//
//    }
//}
