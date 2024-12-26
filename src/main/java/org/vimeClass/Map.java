package org.vimeClass;

public class Map {
    private String id;
    private String name;
    private int teams;
    private int playersInTeam;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeams() {
        return teams;
    }

    public void setTeams(int teams) {
        this.teams = teams;
    }

    public int getPlayersInTeam() {
        return playersInTeam;
    }

    public void setPlayersInTeam(int playersInTeam) {
        this.playersInTeam = playersInTeam;
    }
}
