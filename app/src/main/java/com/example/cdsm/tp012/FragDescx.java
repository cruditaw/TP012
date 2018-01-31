package com.example.cdsm.tp012;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragDescx extends Fragment {

    private ImageView imgView;
    private TextView tvDesc;

    public FragDescx() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedState) {
        super.onActivityCreated(savedState);

        imgView = (ImageView) getActivity().findViewById(R.id.imgViewDesc);
        tvDesc = (TextView) getActivity().findViewById(R.id.tvDesc);

        Intent intent = getActivity().getIntent();
        int imgRes = intent.getIntExtra("image", -1);
        String imgDesc = intent.getStringExtra("description");

        if (imgRes != -1) {
            imgView.setImageDrawable(getActivity().getResources().getDrawable(imgRes));
            tvDesc.setText(imgDesc);
        }
    }

    public void changeImageView(Drawable image, String desc) {
        imgView.setImageDrawable(image);
        tvDesc.setText(desc);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_descx, container, false);
    }

}
