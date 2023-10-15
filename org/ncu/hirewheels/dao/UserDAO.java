package org.ncu.hirewheels.dao;

import org.ncu.hirewheels.entities.User;

import java.util.List;

public interface UserDAO {
    User findById(Long userId);
    List<User> findAll();
    void addUser(User user);
    void updateUser(Long userId, User updatedUser);
    void deleteUserById(Long userId);
//    List<User> findByFirstNameIgnoreCase(String firstName);
//    List<User> findByFirstNameIgnoreCaseOrLastNameIgnoreCase(String firstName, String lastName);
//    List<User> findByEmailIgnoreCase(String email);
//    List<User> findByMobileNoIgnoreCase(String mobileNo);
}
