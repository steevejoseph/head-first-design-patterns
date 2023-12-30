import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

  Observable observable;
  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  public void update(Observable observable, Object arg) {
    if (observable instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) observable;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      // When update() called, save temp and hudmity, then immediately display it
      display();
    }
  }
  public void display() {
    System.out.println(
      "Current conditions: " +
      temperature +
      "F degrees and " +
      humidity +
      "% humidity"
    );
  }
}
