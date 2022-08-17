package Weather;

public abstract class WeatherData {
    private float temperature;
    private float humidity;
    private float presure;

    public WeatherData(float temperature, float humidity, float presure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.presure = presure;
    }

    public WeatherData(float temperature2, float humidity2) {
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPresure() {
        return presure;
    }

    public void measuementsChanges() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float presure = getPresure();
        CurrentConditionDisplay.update(temp, humidity, presure);
    }

}
