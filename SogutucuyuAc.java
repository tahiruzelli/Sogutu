public class SogutucuyuAc implements Observer {
    private Observable observable;
    @Override
    public void notify(String message) {
        System.out.println(message);
    }
    Eyleyici eyleyici = new Eyleyici();
    public void SogutucuyuAc(IslemBirimi islemBirimi){
        if(islemBirimi.SogutucuyuAc(eyleyici)==true)
            notify("Sogutucu Acilmistir.");

    }
}
