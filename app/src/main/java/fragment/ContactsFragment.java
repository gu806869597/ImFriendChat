package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cc.jimblog.imfriendchat.R;

/**
 * Created by Ran on 2016/8/10.
 */
public class ContactsFragment extends Fragment {
    private View mView ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_contacts,container,false);
        return mView;
    }
}
