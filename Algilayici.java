import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Algilayici implements IAlgilayici {
    private static Algilayici instance;
    private PrintWriter out;
    private Algilayici(String logDosyasi){
        try {
            out = new PrintWriter(new FileWriter(logDosyasi,true), true);
        } catch (IOException e) {e.printStackTrace();}
    }
    public static synchronized Algilayici getInstance(String logDosyasi){
        if(instance==null)
            instance = new Algilayici(logDosyasi);
        return instance;
    }
    public int SicaklikOku(){
        Random r=new Random(); //random sınıfı
        int sayi = r.nextInt(40);
        return sayi;
    }
}
