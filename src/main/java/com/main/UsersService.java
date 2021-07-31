package com.main;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UserDao userDao;
    private final HttpClient httpClient;

    public List<User> getUsers(){


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://google.com"))
                .GET()
                .build();

        HttpResponse<String> resp = null;
        try {
            resp = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(resp.body());

        return  userDao.all();
    }

    @PostConstruct
    public void t(){
        System.out.println("!!!!!!!!!!!!!!!!");
    }
}
