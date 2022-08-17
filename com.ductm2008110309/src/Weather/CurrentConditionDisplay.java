package Weather;

public class CurrentConditionDisplay extends WeatherData {

    public CurrentConditionDisplay(float temperature, float humidity, float presure) {
        super(temperature, humidity);
        // TODO Auto-generated constructor stub
    }

    @Override
    public float getTemperature() {
        // TODO Auto-generated method stub
        return super.getTemperature();
    }

    @Override
    public float getHumidity() {
        // TODO Auto-generated method stub
        return super.getHumidity();
    }

    public static void update(float temp, float humidity, float presure) {

    }
}
