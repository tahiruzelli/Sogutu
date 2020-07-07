public class SicakligiGoruntule{
    public int SicakligiGonder(IslemBirimi islemBirimi){
        System.out.println("Mevcut Sicaklik:");
        return Algilayici.getInstance("Log.txt").SicaklikOku();

    }
}
