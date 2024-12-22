package org.urlClassParser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.vimeClass.User;

import java.net.URL;
import java.util.ArrayList;

public class UserParser {
    public static User parseName(String name){
        User user;
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            URL url = new URL("https://api.vimeworld.ru/user/name/" + name);
            user = objectMapper.readValue(url, new TypeReference<User>(){});
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return user;
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
