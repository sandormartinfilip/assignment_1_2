package com.filip.airport.business;

import com.filip.airport.persistence.dao.UserRepository;
import com.filip.airport.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sandof on 10/20/2017.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Long saveUser(User user){
        return userRepository.addUser(user);
    }
}
