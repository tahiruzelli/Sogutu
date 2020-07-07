public class IslemBirimi implements IIslemBirimi {
    public boolean SogutucuyuKapa(Eyleyici eyleyici){
        return eyleyici.SogutucuyuKapa();
    }
    public boolean SogutucuyuAc(Eyleyici eyleyici){
        return eyleyici.SogutucuyuAc();
    }
    public int SicaklikOkuVeGonder(Algilayici algilayici){
        return algilayici.SicaklikOku();
    }


}
