package com.main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Ann
public class UserDaoImpl implements UserDao{
    @Override
    public List<User> all() {
        return List.of(
                new User().setName("vasia").setSurname("pupkin"),
                new User().setName("vasia").setSurname("pupkin"),
                new User().setName("vasia").setSurname("pupkin"),
                new User().setName("vasia").setSurname("pupkin")

        );
    }
}
