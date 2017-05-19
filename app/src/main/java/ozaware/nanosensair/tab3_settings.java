package ozaware.nanosensair;

/** tab3_settings
 * Created by Jacob MIller on 5/18/2017.
 * Holds the information for customised user settings
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class tab3_settings extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1_data_from_air, container, false);
        return rootView;
    }
}
