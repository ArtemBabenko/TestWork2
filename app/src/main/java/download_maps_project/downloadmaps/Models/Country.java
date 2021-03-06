package download_maps_project.downloadmaps.Models;

import java.io.Serializable;
import java.util.ArrayList;

import download_maps_project.downloadmaps.Models.City;

public class Country implements Serializable {
    private String name;
    private ArrayList<City> arrayCity;

    public Country(String name, ArrayList<City> arrayCity) {
        this.name = name;
        this.arrayCity = arrayCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<City> getArrayCity() {
        return arrayCity;
    }

    public void setArrayCity(ArrayList<City> arrayCity) {
        this.arrayCity = arrayCity;
    }
}
