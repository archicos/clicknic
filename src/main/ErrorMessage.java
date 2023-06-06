package main;

public class ErrorMessage {
    
    public static String errorMessage(int errorCode){
        switch(errorCode){
            case 0: return "Terjadi Kesalahan!";
            case 1: return "Akun tidak ditemukan!";
            case 2: return "Password salah!";
            case 3: return "Username dan Password tidak boleh kosong!";
            case 4: return "Nama sudah terdaftar!";
            case 5: return "Username sudah terdaftar!";
            case 6: return "Password tidak sesuai!";
            case 7: return "Posisi tidak boleh kosong!";
            
        }
        return "";
    }
}
