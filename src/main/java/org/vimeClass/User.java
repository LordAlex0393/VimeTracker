package org.vimeClass;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private int id;
    private String username;
    private int level;
    private float levelPercentage;
    private String rank;
    private ArrayList<String> ranks;
    private int playedSeconds;
    private int lastSeen;
    private boolean prime;
    private int primeStart;
    private String primeIcon;
    private String prefix;
    private ArrayList<String> customColors;
    private Guild guild;
    private Online online;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getLevelPercentage() {
        return levelPercentage;
    }

    public void setLevelPercentage(float levelPercentage) {
        this.levelPercentage = levelPercentage;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public ArrayList<String> getRanks() {
        return ranks;
    }

    public void setRanks(ArrayList<String> ranks) {
        this.ranks = ranks;
    }

    public int getPlayedSeconds() {
        return playedSeconds;
    }

    public void setPlayedSeconds(int playedSeconds) {
        this.playedSeconds = playedSeconds;
    }

    public int getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(int lastSeen) {
        this.lastSeen = lastSeen;
    }

    public boolean isPrime() {
        return prime;
    }

    public void setPrime(boolean prime) {
        this.prime = prime;
    }

    public int getPrimeStart() {
        return primeStart;
    }

    public void setPrimeStart(int primeStart) {
        this.primeStart = primeStart;
    }

    public String getPrimeIcon() {
        return primeIcon;
    }

    public void setPrimeIcon(String primeIcon) {
        this.primeIcon = primeIcon;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public ArrayList<String> getCustomColors() {
        return customColors;
    }

    public void setCustomColors(ArrayList<String> customColors) {
        this.customColors = customColors;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public Online getOnline() {
        return online;
    }

    public void setOnline(Online online) {
        this.online = online;
    }

    @Override
    public String toString() {
        return "User{" +
                "\nId = " + id +
                "\nUsername = '" + username + '\'' +
                "\nLevel = " + level +
                "\nRank = '" + rank + '\'' +
                "\nPlayedHours = " + playedSeconds/60/60 +
                "\nLastSeen Date = " + new Date(lastSeen * 1000L) +
                "\nGuild = " + guild.getName() + '}';
    }

    public String toExtendedString() {
        return "User{" +
                "\nId = " + id +
                "\nUsername = '" + username + '\'' +
                "\nLevel = " + level +
                "\nLevelPercentage = " + levelPercentage +
                "\nRank = '" + rank + '\'' +
                "\nRanks = " + ranks +

                "\n\nPlayedSeconds = " + playedSeconds +
                "\nPlayedMinutes = " + playedSeconds/60 +
                "\nPlayedHours = " + playedSeconds/60/60 +
                "\nPlayedDays = " + playedSeconds/60/60/24 +
                "\nPlayedYears = " + playedSeconds/60/60/24/365 +

                "\n\nLastSeen = " + lastSeen +
                "\nLastSeen Date = " + new Date(lastSeen * 1000L) +

                "\n\nPrime = " + prime +
                "\nPrimeStart = " + primeStart +
                "\nPrimeIcon = '" + primeIcon + '\'' +
                "\nPrefix = '" + prefix + '\'' +
                "\nCustomColors = " + customColors +
                "\nGuild = " + guild.getName() +
                "\nOnline = " + online +
                '}';
    }
}