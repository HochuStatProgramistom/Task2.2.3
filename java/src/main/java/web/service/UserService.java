package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    User readUser(long id);

    List<User> readAllUser();
}
