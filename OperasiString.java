public class OperasiString{
    public static void main(String[] args){
        String kota = "Banjarbaru";
        System.out.println(kota);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);
        System.out.println(uniskaString.toUpperCase());
        System.out.println(kota.toUpperCase());

        System.out.println(uniskaString.toLowerCase());
        System.out.println(kota.toLowerCase());

        System.out.println(uniskaString.substring(5));
        System.out.println(kota.substring(5));

        System.out.println(uniskaString.substring(0,4));
        System.out.println(kota.substring(0,4));

        String hariIni = "2024-04-22";
        String tahun = hariIni.substring(0,4);
        String bulan = hariIni.substring(5,7);
        String tanggal = hariIni.substring(8,10);

        System.out.println(tanggal+ "-" +bulan+ "-" +tahun);

        switch(bulan){
            case "01":
                System.out.println(tanggal+ " Januari "+tahun);
                break;
            case "02":
                System.out.println(tanggal+ " Februari "+tahun);
                break;
            case "03":
                System.out.println(tanggal+ " Maret "+tahun);
                break;
            case "04":
                System.out.println(tanggal+ " April "+tahun);
                break;
            case "05":
                System.out.println(tanggal+ " Mei "+tahun);
                break;
            case "06":
                System.out.println(tanggal+ " Juni "+tahun);
                break;
            case "07":
                System.out.println(tanggal+ " Juli "+tahun);
                break;
            case "08":
                System.out.println(tanggal+ " Agustus "+tahun);
                break;
            case "09":
                System.out.println(tanggal+ " September "+tahun);
                break;
            case "10":
                System.out.println(tanggal+ " Oktober "+tahun);
                break;
            case "11":
                System.out.println(tanggal+ " November "+tahun);
                break;
            case "12":
                System.out.println(tanggal+ " Desember "+tahun);
                break;
            default:
                System.out.println("Tidak Valid");
                break;                
        }
    
    }
}