package com.evan.wj.service;
import org.springframework.stereotype.Service;

import com.evan.wj.pojo.User;
@Service
public class UserService {
//    @Autowired
//    UserDao userDao;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username) {
    	User user =new User(1,username);
    	return user;
//        return userDao.findByUsername(username);
    }

    public User get(String username, String password){
    	User user =new User(1,username);
    	return user;
//      return userDao.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
//    	userDao.save(user);
    }
}