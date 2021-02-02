package com.example.llx_02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavAction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FFragment extends Fragment {
    private Button button1,button2,button3;
    private TextView textView1,textView2;
    int n=0;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FFragment newInstance(String param1, String param2) {
        FFragment fragment = new FFragment();
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
        View view= inflater.inflate(R.layout.fragment_f, container, false);
        button1=view.findViewById(R.id.button_f01);
        button2=view.findViewById(R.id.button_f02);
        button3=view.findViewById(R.id.button_f03);
        textView1=view.findViewById(R.id.textView_f01);
        textView2=view.findViewById(R.id.textView_f02);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n++;
                textView1.setText(String.valueOf(n));
                textView2.setText("这是我在幼儿园的照片，国庆节老师给我拍的照片。");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n--;
                textView1.setText(String.valueOf(n));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller= Navigation.findNavController(v);
                controller.navigate(R.id.action_FFragment_to_CFragment);
            }
        });
        return view;
    }
}