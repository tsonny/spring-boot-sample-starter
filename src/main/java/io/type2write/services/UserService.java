package io.type2write.services;

import io.type2write.model.UserModel;

public interface UserService {
    UserModel getUser(String userName);
    void addUser(UserModel userName);
    void deleteUser(String userName);
}
