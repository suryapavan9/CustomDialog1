package com.example.android.customdialog1;


import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CustomFrag extends DialogFragment {

    Dialog d;
    TextView tv1;
    //EditText et1;
    Button b2;
    public CustomFrag() {
        // Required empty public constructor
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder ab = new AlertDialog.Builder(getActivity());
        View v = getActivity().getLayoutInflater().inflate(R.layout.fragment_custom,null);

        tv1 = (TextView) v.findViewById(R.id.text1);
        //et1 = (EditText) v.findViewById(R.id.edittext1);
        b2 = (Button) v.findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String description = et1.getText().toString();
                //Toast.makeText(getActivity(), "description"+description, Toast.LENGTH_SHORT).show();
                d.dismiss();
            }
        });
        ab.setView(v);
        d = ab.create();
        return d;
    }
}
