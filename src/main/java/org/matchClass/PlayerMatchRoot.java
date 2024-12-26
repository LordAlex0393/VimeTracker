package org.matchClass;

import org.vimeClass.Match;
import org.vimeClass.Request;
import org.vimeClass.User;

import java.util.ArrayList;

public class PlayerMatchRoot {
    private User user;
    private Request request;
    private ArrayList<Match> matches;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }

    @Override
    public String toString() {
        return "PlayerMatchRoot{" +
                "\nuser=" + user +
                "\n\n" + request +
                "\n\nmatches=" + matches +
                '}';
    }
}
