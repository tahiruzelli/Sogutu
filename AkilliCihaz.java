import java.sql.*;
import java.util.Objects;
import java.util.Scanner;
public class AkilliCihaz {
    public boolean girisBasarili = false;
    public void GirisEkrani(){
        try
        {   /***** Bağlantı kurulumu *****/
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/kullaniciBilgileri",
                    "postgres", "zorsifre123");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");


            String sql= "SELECT \"kullaniciAdi\", \"sifre\"  FROM \"Kullanici\"";

            /***** Sorgu çalıştırma *****/
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            /***** Bağlantı sonlandırma *****/
            conn.close();

            Scanner reader = new Scanner(System.in);
            String kullaniciAdi= null;
            String sifre=null;


            System.out.print("Kullanici adi giriniz: ");
            kullaniciAdi = reader.next();
            System.out.print("Sifre giriniz: ");
            sifre = reader.next();

            while(rs.next())
            {
                /***** Kayda ait alan değerlerini değişkene ata *****/
                if(Objects.equals(kullaniciAdi, rs.getString("kullaniciAdi")))
                {
                    if(Objects.equals(sifre, rs.getString("sifre")))
                    {
                        System.out.println("Giris basarili!");
                        girisBasarili = true;
                        break;
                    }
                }
            }


            if(girisBasarili==false){
                System.out.println("Bilgiler hatali, yeniden baslatiliyor!");

            }

            /***** Kaynakları serbest bırak *****/
            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
