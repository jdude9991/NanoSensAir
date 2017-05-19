package ozaware.nanosensair;

/** tab1_data_from_air
 * Created by Jacob Miller on 5/18/2017.
 * The item that holds the tab info for the air data.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class tab1_data_from_air extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1_data_from_air, container, false);
        return rootView;
    }
}