package com.example.cdsm.tp012;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragAnimx extends Fragment {

    private ImageButton imgBtnCat;
    private ImageButton imgBtnDog;
    private FragDescx fragDesc;

    public FragAnimx() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedState) {
        super.onActivityCreated(savedState);

        imgBtnCat = (ImageButton) getActivity().findViewById(R.id.imgBtnCat);
        imgBtnDog = (ImageButton) getActivity().findViewById(R.id.imgBtnDog);

        imgBtnCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleImageClick(R.drawable.cat_smile, "cat");
            }
        });

        imgBtnDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleImageClick(R.drawable.dog_vector, "dog");
            }
        });

    }

    private void handleImageClick(int imgRes, String imgDesc) {
        if (getActivity().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragDesc = (FragDescx) getActivity().getFragmentManager().findFragmentById(R.id.fDesc1);
            fragDesc.changeImageView(getActivity().getResources().getDrawable(imgRes), imgDesc);

        } else {
            Intent intent = new Intent(getActivity(), DescActivity.class);
            intent.putExtra("image", imgRes);
            intent.putExtra("description", imgDesc);
            startActivity(intent);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_animx, container, false);
    }

}
