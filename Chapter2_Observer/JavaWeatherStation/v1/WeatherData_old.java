@Deprecated
public class WeatherData_old {

  private Object currentConditionsDisplay;
  private Object statisticsDisplay;
  private Object forecastDisplay;

  // instance variable declarations
  public void measurementsChanged() {
    float temp = getTempterature();
    float humidity = getHumdity();
    float pressure = getPressure();
    // currentConditionsDisplay.update(temp, humidity, pressure);
    // statisticsDisplay.update(temp, humidity, pressure);
    // forecastDisplay.update(temp, humidity, pressure);
  }

  // other WeatherData methods

  private float getTempterature() {
    return 0;
  }

  private float getPressure() {
    return 0;
  }

  private float getHumdity() {
    return 0;
  }
}
