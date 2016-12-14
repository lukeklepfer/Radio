package lukeklepfer.com.radio.services;

import java.util.ArrayList;

import lukeklepfer.com.radio.model.Station;

/**
 * Created by lukeklepfer on 12/14/16.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {return ourInstance;}

    private DataService() {

    }
    public ArrayList<Station> getFeaturedStations(){
        //pretending we downloaded it

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)","flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations(){
        //pretending we downloaded it

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)","flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getPartyStations(){
        //pretending we downloaded it

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)","flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        return list;
    }
}

