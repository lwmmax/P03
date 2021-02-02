package com.example.llx_02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DFragment extends Fragment {
    private Button button,button2;
    private TextView textView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DFragment newInstance(String param1, String param2) {
        DFragment fragment = new DFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_d, container, false);
       button=view.findViewById(R.id.button_d);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Toast.makeText(getActivity(),"我现在想妈妈了！我最爱她了。她是最好的妈妈！",Toast.LENGTH_SHORT).show();
           }
       });
       button2 = view.findViewById(R.id.button_d2);
       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               NavController controller = Navigation.findNavController(v);
               controller.navigate(R.id.action_DFragment_to_EFragment);
           }
       });
       return view;
    }
}