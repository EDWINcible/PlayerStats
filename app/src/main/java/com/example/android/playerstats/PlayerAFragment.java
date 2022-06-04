package com.example.android.playerstats;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.android.playerstats.data.PlayerData;

import java.util.ArrayList;
import java.util.List;

public class PlayerAFragment extends Fragment {
    public static final String IMAGE_ID_LIST = "image_ids";
    public static final String LIST_INDEX = "list_index";

    private List<Integer> mImageIds;
    private int mListIndex;
    private String name;

    public PlayerAFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if(savedInstanceState != null) {
            mImageIds = savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex = savedInstanceState.getInt(LIST_INDEX);
        }

        View rootView = inflater.inflate(R.layout.fragment_player_a, container, false);
        final ImageView imageView = (ImageView) rootView.findViewById(R.id.player_a_image_view);
        TextView textName = (TextView) rootView.findViewById(R.id.player_a_name);
        textName.setText(PlayerData.getPlayerAData().get(mListIndex).getName());

        TextView textShoot = (TextView) rootView.findViewById(R.id.player_a_shoot);
        textShoot.setText("Shoot :"+PlayerData.getPlayerAData().get(mListIndex).getShoot());

        TextView textDribble = (TextView) rootView.findViewById(R.id.player_a_dribble);
        textDribble.setText("Dribble :"+ PlayerData.getPlayerAData().get(mListIndex).getDribble());

        TextView textPass = (TextView) rootView.findViewById(R.id.player_a_pass);
        textPass.setText("Passing :" + PlayerData.getPlayerAData().get(mListIndex).getPassing());


        if(mImageIds != null){
            imageView.setImageResource(mImageIds.get(mListIndex));
        } else {
            Log.v("PlayerAFragment", "This fragment has a null list of image id's");
        }

        return rootView;
    }

    public void setImageIds(List<Integer> imageIds) {
        mImageIds = imageIds;
    }

    public void setListIndex(int index) {
        mListIndex = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void onSaveInstanceState(Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
        currentState.putInt(LIST_INDEX, mListIndex);
    }
}
