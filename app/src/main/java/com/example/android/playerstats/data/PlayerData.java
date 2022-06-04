package com.example.android.playerstats.data;
import java.util.ArrayList;
import java.util.List;

public class PlayerData {

    private static final List<Player> playerAData = new ArrayList<Player>() {{
        add(new Player(0, "Lionel Messi", 98, 99, 99));
        add(new Player(1, "Xavi", 92, 96, 99));
        add(new Player(2, "Ineasta", 93, 98, 95));
    }};

    private static final List<Player> playerBData = new ArrayList<Player>() {{
        add(new Player(0, "Ronaldo", 99, 95, 91));
        add(new Player(1, "Rooney", 99, 85, 87));
        add(new Player(2, "Beckham", 98, 91, 92));
    }};

    public static List<Player> getPlayerAData() {
        return playerAData;
    }

    public static List<Player> getPlayerBData() {
        return playerBData;
    }
}
