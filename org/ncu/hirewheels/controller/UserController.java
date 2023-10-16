package org.ncu.hirewheels.controller;

import org.ncu.hirewheels.dao.UserDAO;
import org.ncu.hirewheels.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
	UserDAO userDAO;

	@Autowired
	public UserController(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
    @GetMapping
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = userDAO.findById(id);
        return user;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        userDAO.addUser(user);
        return user;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
            user.setUserId(id);
            userDAO.updateUser(id,user);
        return user;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userDAO.deleteUserById(id);
    }
}
