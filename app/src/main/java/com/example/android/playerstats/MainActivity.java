package com.example.android.playerstats;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TextView;

import com.example.android.playerstats.data.PlayerImages;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {
            PlayerAFragment fragmentA = new PlayerAFragment();
            fragmentA.setImageIds(PlayerImages.getPlayerA());
            int playerAIndex = getIntent().getIntExtra("playerAIndex", 0);
            fragmentA.setListIndex(playerAIndex);

            PlayerBFragment fragmentB = new PlayerBFragment();
            fragmentB.setImageIds(PlayerImages.getPlayerB());
            int playerBIndex = getIntent().getIntExtra("playerBIndex", 0);
            fragmentB.setListIndex(playerBIndex);

            FragmentManager fragmentManager = getSupportFragmentManager();

            fragmentManager.beginTransaction()
                    .add(R.id.player_a_container, fragmentA)
                    .commit();
            fragmentManager.beginTransaction()
                    .add(R.id.player_b_container, fragmentB)
                    .commit();
        }
    }
}