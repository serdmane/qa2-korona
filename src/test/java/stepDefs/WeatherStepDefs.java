package stepDefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.Map;

public class WeatherStepDefs {
    private int cityId;
    private WeatherResponse response;

    @Given("city id: {int}")
    public void set_city_id(int cityId) {
        this.cityId = cityId;
    }

    @When("we are requesting weather data")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.getWeather(cityId);
        //call Weather Requester
    }

    @Then("lon is: {double}")
    public void check_lon(double lon) {
        Assertions.assertEquals(lon, response.getCoord().getLon(), "Wrong Lon");
    }

    @Then("lat is: {double}")
    public void check_lat(double lat) {
    }

    @Then("weather id is: {int}")
    public void check_weather_id(int id) {
    }

    @Then("weather main is: {string}")
    public void check_weather_main(String main) {
    }

    @Then("weather description is: {string}")
    public void check_weather_description(String description) {
    }

    @Then("weather icon is: {string}")
    public void check_weather_icon(String icon) {
    }

    @Then("base is: {string}")
    public void check_base(String base) {
    }

    @Then("main data is:")
    public void check_main_data(Map<String, String> params) {
    }

    @Then("visibility is: {int}")
    public void check_visibility(int visibility) {
    }

    @Then("wind data is:")
    public void check_wind_data(Map<String, String> params) {
    }

    @Then("clouds data is:")
    public void check_clouds_data(Map<String, String> params) {
    }

    @Then("dt is: {int}")
    public void check_dt(int dt) {
    }

    @Then("sys data is:")
    public void check_sys_data(Map<String, String> params) {
    }

    @Then("id is: {int}")
    public void check_id_(int id) {
    }

    @Then("name is: {string}")
    public void check_name(String name) {
    }

    @Then("cod is: {int}")
    public void check_cod(int cod) {
    }

}

