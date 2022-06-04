package com.example.android.playerstats.data;

public class Player {
    private Integer id;
    private String name;
    private Integer shoot;
    private Integer dribble;
    private Integer passing;

    public Player(Integer id, String name, Integer shoot, Integer dribble, Integer passing) {
        this.id = id;
        this.name = name;
        this.shoot = shoot;
        this.dribble = dribble;
        this.passing = passing;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getShoot() {
        return shoot;
    }

    public void setShoot(Integer shoot) {
        this.shoot = shoot;
    }

    public Integer getDribble() {
        return dribble;
    }

    public void setDribble(Integer dribble) {
        this.dribble = dribble;
    }

    public Integer getPassing() {
        return passing;
    }

    public void setPassing(Integer passing) {
        this.passing = passing;
    }
}
