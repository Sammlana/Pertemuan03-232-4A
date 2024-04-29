public class Operator {
    


    public static void main(String[] args){
    
    String nama = "Hisyam Alifian Maulana";
    int jumlahSks = 144;
    double ipk = 3.09;
    String username = "admin";
    String password = "admin";    
    
    System.out.println(1 + 2);
    System.out.println(1 - 2);
    System.out.println(1 * 2);
    System.out.println(1 / 2);
    System.out.println(1 % 2);

    System.out.println(jumlahSks++);
    System.out.println(++jumlahSks);

    System.out.println(jumlahSks--);

    System.out.println(ipk > 3.5 ? "Dengan Pujian" : "B aja");

    String usernameInputan = "admin";
    String passwordInputan = "admin"; 
    
    if(usernameInputan.equals(username)){
        if(passwordInputan.equals(password)){
            System.out.println("Berhasil");
        } else {
            System.out.println("Username / Password Salah");
        }
    } else {
        System.out.println("Username / Password Salah");
    }

    if(usernameInputan.equals(username)
        &&
        passwordInputan.equals(password)){
            System.out.println("Berhasil");
        } else {
            System.out.println("Username / Password Salah");
        }
    
        double totalBelanja = 25000;
        double uangDiDompet = 26000;
        double angsul = 0;
        if (uangDiDompet > totalBelanja){
            angsul = uangDiDompet - totalBelanja;
            System.out.println("Cukup, Angsul : " + angsul);
        } else {
            System.out.println("Pas");
        }

    }


}