package ankita.myapplication.TabsUsingCustomPager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ankita.myapplication.R;

/**
 * A simple {@link Fragment} subclass. Activities that contain this fragment must implement the
 * {@link TabFragment2.OnFragmentInteractionListener} interface to handle interaction events.
 */
public class TabFragment2 extends Fragment {

    private OnFragmentInteractionListener mListener;

    public TabFragment2 () {
        // Required empty public constructor
    }


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate (R.layout.fragment_tab_fragment1, container, false);
        TextView tv = (TextView)view.findViewById (R.id.tvTabFragment1);
//        int position = getArguments ().getInt ("position");
//        tv.setText ("This is content of Tab "+position);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed (Uri uri) {

        if (mListener != null) {
            mListener.onFragmentInteraction (uri);
        }
    }

    @Override
    public void onAttach (Context context) {

        super.onAttach (context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        }
        else {
            throw new RuntimeException (context.toString ()
                                                + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach () {

        super.onDetach ();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this fragment to allow an
     * interaction in this fragment to be communicated to the activity and potentially other
     * fragments contained in that activity.
     * <p/>
     * See the Android Training lesson <a href= "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragmenbind the widget to the ViewPager. (Its</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction (Uri uri);
    }
}
