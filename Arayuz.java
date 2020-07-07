import java.sql.*; //Veritabanı sürücüsü
import java.util.Scanner;
public class Arayuz implements IArayuz {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        SicakligiGoruntule sicakligiGoruntule = new SicakligiGoruntule();
        SogutucuyuKapa sogutucuyuKapa = new SogutucuyuKapa();
        SogutucuyuAc sogutucuyuAc = new SogutucuyuAc();
        IslemBirimi islemBirimi = new IslemBirimi();
        AkilliCihaz akilliCihaz = new AkilliCihaz();
        do{
            akilliCihaz.GirisEkrani();
        }while(akilliCihaz.girisBasarili == false);

        while(true){
            System.out.println("1-)Sogutucuyu Ac");
            System.out.println("2-)Sogutucuyu Kapa");
            System.out.println("3-)Sicakligi Goruntule");
            System.out.println("4-)Cikis");
            int secenek = reader.nextInt();
            if(secenek == 1){
                sogutucuyuAc.SogutucuyuAc(islemBirimi);

            }
            if(secenek == 2){
                sogutucuyuKapa.SogutucuyuKapa(islemBirimi);

            }
            if(secenek == 3){
                System.out.println(sicakligiGoruntule.SicakligiGonder(islemBirimi));
            }
            if(secenek==4){
                System.out.println("Cikis yapiliyor");
                System.exit(0);
            }
        }

    }
}
