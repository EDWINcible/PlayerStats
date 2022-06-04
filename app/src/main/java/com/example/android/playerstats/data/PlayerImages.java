package com.example.android.playerstats.data;

import com.example.android.playerstats.R;

import java.util.ArrayList;
import java.util.List;

public class PlayerImages {
    private static final List<Integer> playerA = new ArrayList<Integer>() {{
        add(R.drawable.player_a_0);
        add(R.drawable.player_a_1);
        add(R.drawable.player_a_2);
    }};

    private static final List<Integer> playerB = new ArrayList<Integer>() {{
        add(R.drawable.player_b_0);
        add(R.drawable.player_b_1);
        add(R.drawable.player_b_2);
    }};

    private static final List<Integer> allPlayers = new ArrayList<Integer>() {{
        addAll(playerA);
        addAll(playerB);
    }};

    public static List<Integer> getPlayerA() {
        return playerA;
    }

    public static List<Integer> getPlayerB() {
        return playerB;
    }

    public static List<Integer> getAll() {
        return allPlayers;
    }
}
