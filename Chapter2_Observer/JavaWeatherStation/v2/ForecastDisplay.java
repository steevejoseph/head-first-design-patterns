import java.util.Observer;
import java.util.Observable;
public class ForecastDisplay implements DisplayElement, Observer {

  private float lastPressure;
  private float currentPressure = 29.92f;
  private Observable observable;

  public ForecastDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  public void update(Observable observable, Object arg) {
    if (observable instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) observable;
      lastPressure = currentPressure;
      currentPressure = weatherData.getPressure();
      display();
    }
  }

  public void display() {
    System.out.print("Forecast: ");
    if (currentPressure > lastPressure) {
      System.out.println("Improving weather on the way!");
    } else if (currentPressure == lastPressure) {
      System.out.println("More of the same");
    } else if (currentPressure < lastPressure) {
      System.out.println("Watch out for cooler, rainy weather");
    }
  }
}
