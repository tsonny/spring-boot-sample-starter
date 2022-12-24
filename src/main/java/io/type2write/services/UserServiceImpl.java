package io.type2write.services;

import io.type2write.model.UserModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
@Qualifier("primary")
public class UserServiceImpl implements UserService {
    private final Map<String, UserModel> userMap = new HashMap<>();
    private final TimeService timeService;

    public UserServiceImpl(TimeService timeService) {
        this.timeService = timeService;
        userMap.put("John", new UserModel("John", "Dow", 1234));
        userMap.put("Jane", new UserModel("Jane", "Dow", 1334));
    }
    public UserModel getUser(String userName) {
        return userMap.get(userName);
    }
    public void addUser(UserModel user) {
        user.setCreationTime(timeService.getCurrentTime("Amsterdam"));
        userMap.put(user.getFirstName(), user);
    }
    public void deleteUser(String userName) {
        userMap.remove(userName);
    }
}
