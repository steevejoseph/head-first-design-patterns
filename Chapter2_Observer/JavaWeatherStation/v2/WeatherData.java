import java.util.ArrayList;

public class WeatherData implements Subject {

  private ArrayList observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new ArrayList();
  }

  public void registerObserver(Observer o) {
    observers.add(o);
  }

  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  public void notifyObservers() {
    for (Object o : observers) {
      Observer observer = (Observer) o;
      observer.update(temperature, humidity, pressure);
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(
    float temperature,
    float humidity,
    float pressure
  ) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
  // TODO(steeve): Implement a setMeasuremements that pulls 3 vals from the web

  // other WeatherData methods
}
