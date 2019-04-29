package com.example.service.UserService;

import com.example.model.ItripUser;

public interface ItripUserService {
    boolean register(ItripUser itripUser);

    boolean registerAllUser(String email, String userName, Integer activated, String pwd);

    boolean findByUserCode(String usercode);

    ItripUser login(String usercode, String userPassword);
}
