public class SogutucuyuKapa implements Observer {
    private Observable observable;
    @Override
    public void notify(String message) {
        System.out.println(message);
    }
    Eyleyici eyleyici = new Eyleyici();
    public void SogutucuyuKapa(IslemBirimi islemBirimi){
        if(islemBirimi.SogutucuyuKapa(eyleyici)==true)
            notify("Sogutucu Kapanmistir.");

    }
}
