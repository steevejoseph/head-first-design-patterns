public class ForecastDisplay implements DisplayElement, Observer {

  private float lastPressure;
  private float currentPressure;
  // Technically this could be `WeatherData weatherData`,
  // but having the type be subject
  //   a. helps to solidify observer pattern and
  //   b. if this display wanted to observe a different dataSource, that would be easy to swap (loosely coupled)
  private Subject weatherData;

  public ForecastDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update(float temp, float humidity, float pressure) {
    lastPressure = currentPressure;
    currentPressure = pressure;

    display();
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
