package lukeklepfer.com.radio.model;

/**
 * Created by lukeklepfer on 12/14/16.
 */

public class Station {
    final String DRAWABLE = "Drawable";

    private String stationTitle;
    private String imageUri;

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImageUri() {
        return imageUri;
    }


    public Station(String stationTitle, String imageUri) {
        this.stationTitle = stationTitle;
        this.imageUri = imageUri;
    }


}
