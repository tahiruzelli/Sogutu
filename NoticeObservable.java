import java.util.ArrayList;
import java.util.List;

public class NoticeObservable implements Observable {
    private List<Observer> observerList = new ArrayList<>();
    private String message = "Notice... !";

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer); // Kullanıcıları duyuruya eklemek için.
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer); // Kullanıcıları duyurudan silmek için.
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.notify(message); // Duyuru ya kayıtlı kullanıcılara mesaj göndermek için.
        }
    }
}
