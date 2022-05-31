package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    User readUser(long id);

    List<User> readAllUser();
}

