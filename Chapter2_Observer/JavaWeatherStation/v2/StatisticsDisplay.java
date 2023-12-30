import java.util.Observable;
import java.util.Observer;
public class StatisticsDisplay implements DisplayElement, Observer {

  Observable observable;
  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float tempSum = 0.0f;
  private int numReadings;

  public StatisticsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  public void update(Observable observable, Object arg) {

    if (observable instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) observable;
      float temp = weatherData.getTemperature();
      float humidity = weatherData.getHumidity();
      float pressure = weatherData.getPressure();

      tempSum += temp;
      numReadings++;

      if (temp > maxTemp) {
        maxTemp = temp;
      }

      if (temp < minTemp) {
        minTemp = temp;
      }

      display();
  }
}

  public void display() {
    System.out.println(
      "Avg/Max/Min temperature = " +
      (tempSum / numReadings) +
      "/" +
      maxTemp +
      "/" +
      minTemp
    );
  }
}
