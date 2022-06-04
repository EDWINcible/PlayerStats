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

public class PlayerBFragment extends Fragment {
    public static final String IMAGE_ID_LIST = "image_ids";
    public static final String LIST_INDEX = "list_index";

    private List<Integer> mImageIds;
    private int mListIndex;

    public PlayerBFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(savedInstanceState != null) {
            mImageIds = savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex = savedInstanceState.getInt(LIST_INDEX);
        }

        View rootView = inflater.inflate(R.layout.fragment_player_b, container, false);
        final ImageView imageView = (ImageView) rootView.findViewById(R.id.player_b_image_view);

        TextView textName = (TextView) rootView.findViewById(R.id.player_b_name);
        textName.setText(PlayerData.getPlayerBData().get(mListIndex).getName());

        TextView textShoot = (TextView) rootView.findViewById(R.id.player_b_shoot);
        textShoot.setText("Shoot :"+PlayerData.getPlayerBData().get(mListIndex).getShoot());

        TextView textDribble = (TextView) rootView.findViewById(R.id.player_b_dribble);
        textDribble.setText("Dribble :"+ PlayerData.getPlayerBData().get(mListIndex).getDribble());

        TextView textPass = (TextView) rootView.findViewById(R.id.player_b_pass);
        textPass.setText("Passing :" + PlayerData.getPlayerBData().get(mListIndex).getPassing());

        if(mImageIds != null){
            imageView.setImageResource(mImageIds.get(mListIndex));
        } else {
            Log.v("PlayerBFragment", "This fragment has a null list of image id's");
        }

        return rootView;
    }

    public void setImageIds(List<Integer> imageIds) {
        mImageIds = imageIds;
    }

    public void setListIndex(int index) {
        mListIndex = index;
    }

    @Override
    public void onSaveInstanceState(Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
        currentState.putInt(LIST_INDEX, mListIndex);
    }
}
