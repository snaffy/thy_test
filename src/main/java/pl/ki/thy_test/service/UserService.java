package pl.ki.thy_test.service;

import org.springframework.stereotype.Service;
import pl.ki.thy_test.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> allUsers = new ArrayList<>();
    public List<User> getAllUserArticles(){
        return allUsers;
    }
    public void addUser(User user) {
        allUsers.add(user);
    }
}