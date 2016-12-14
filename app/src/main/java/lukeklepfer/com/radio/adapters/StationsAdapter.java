package lukeklepfer.com.radio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

import lukeklepfer.com.radio.holders.StationViewHolder;
import lukeklepfer.com.radio.model.Station;

/**
 * Created by lukeklepfer on 12/14/16.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {


        return 0;
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        return null;
    }

}
