import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed{

    private int temperature;
    private int pressure;

    public void setMeasurements(int t, int p) { //змінює параметри і відсилає їх спостерігачам
       temperature = t;
       pressure = p;
       notifyObservers();
    }

    List<Observer> observers = new ArrayList<>();

    public MeteoStation() {
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers){
            o.handleEvent(temperature, pressure);
        }
    }
}

