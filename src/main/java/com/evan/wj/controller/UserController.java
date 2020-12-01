package com.evan.wj.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.evan.wj.pojo.User;

import io.swagger.annotations.ApiOperation;

@RestController
public class UserController {
	@GetMapping(path = "user/{id}")
	@ApiOperation(value = "${UserController.getUser.value}", notes = "${UserController.getUser.notes}")
	public User getUser(@PathVariable String id) {
		int intId = Integer.valueOf(id);
	    return new User(intId, "ichiro");
	}


    @GetMapping(path = "users")
    public List<User> getUsers() {
        return new ArrayList<User>() {
            {
                add(new User(100, "ichiro"));
                add(new User(102, "jiro"));
                add(new User(103, "saburo"));
            }
        };
    }

    @PostMapping(path = "user")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(final @Valid @RequestBody User user, final BindingResult bindingResult) {
    }

    @PutMapping(path = "user/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void updateUser(@PathVariable String id, @Valid @RequestBody User user,
            final BindingResult bindingResult) {
    }

    @DeleteMapping(path = "user/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable String id) {

    }
}