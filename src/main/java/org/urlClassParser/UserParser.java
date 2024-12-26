package org.urlClassParser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.matchClass.PlayerMatchRoot;
import org.vimeClass.User;

import java.net.URL;
import java.util.ArrayList;

public class UserParser {
    public static PlayerMatchRoot parseMatch(String name){
        PlayerMatchRoot playerMatchRoot;
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            URL url = new URL("https://api.vimeworld.com/user/" + parseName(name).getFirst().getId() + "/matches");
            playerMatchRoot = objectMapper.readValue(url, new TypeReference<PlayerMatchRoot>(){});
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return playerMatchRoot;
    }

    public static ArrayList<User> parseName(String names){
        ArrayList<User> userList;
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            URL url = new URL("https://api.vimeworld.ru/user/name/" + names);
            userList = objectMapper.readValue(url, new TypeReference<ArrayList<User>>(){});
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return userList;
    }
    public static ArrayList<User> parseNames(String names){
        ArrayList<User> userList;
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            URL url = new URL("https://api.vimeworld.ru/user/name/" + names);
            userList = objectMapper.readValue(url, new TypeReference<ArrayList<User>>(){});
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return userList;
    }
}
