package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.urlClassParser.UserParser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        //System.out.println(UserParser.parseNames("_Lord_Alex_"));
        System.out.println(UserParser.parseMatch("_Lord_Alex_").getMatches().getFirst().getId());
    }
}