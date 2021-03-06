package download_maps_project.downloadmaps.Models;

import java.io.Serializable;

public class City implements Serializable {
    private String name;
    private String map;

    public City(String name, String map) {
        this.name = name;
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }
}
