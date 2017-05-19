package ozaware.nanosensair;

/** tab2_map
 * Created by Jacob Miller on 5/18/2017.
 * Holds the Map Data from the database
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class tab2_map extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1_data_from_air, container, false);
        return rootView;
    }
}
