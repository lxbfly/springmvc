package cn.gavin.springmvc.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import cn.gavin.springmvc.model.UserModel;

public class UserService {
    private Map<String, UserModel> userDB = new HashMap<String, UserModel>();

    public void create(UserModel user) {
        if (userDB.containsKey(user.getUsername())) {
            throw new RuntimeException(String.format("%s用户已经存在", user.getUsername()));
        }
        userDB.put(user.getUsername(), user);
    }

    public void update(UserModel user) {
        if (!userDB.containsKey(user.getUsername())) {
            throw new RuntimeException(String.format("%s用户不存在", user.getUsername()));
        }
        userDB.put(user.getUsername(), user);
    }

    public void delete(UserModel user) {
        if (!userDB.containsKey(user.getUsername())) {
            throw new RuntimeException(String.format("%s用户不存在", user.getUsername()));
        }
        userDB.remove(user.getUsername());
    }

    public UserModel get(String username) {
        return userDB.get(username);
    }

    public List<UserModel> list() {
        return new ArrayList<UserModel>(userDB.values());
    }
}
