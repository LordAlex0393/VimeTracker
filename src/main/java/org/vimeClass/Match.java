package org.vimeClass;

public class Match {
    private String id;
    private String game;
    private Map Map;
    private int date;
    private int duration;
    private int players;
    private boolean win;
    private int state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public org.vimeClass.Map getMap() {
        return Map;
    }

    public void setMap(org.vimeClass.Map map) {
        Map = map;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                "\ngame='" + game + '\'' +
                "\nMap=" + Map +
                "\ndate=" + date +
                "\nduration=" + duration +
                "\nplayers=" + players +
                "\nwin=" + win +
                "\nstate=" + state + "\n";
    }
}
