package com.example.service.UserService.Impl;

import com.example.dao.ItripUserMapper;
import com.example.model.ItripUser;
import com.example.service.UserService.ItripUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ItripUserServiceImpl implements ItripUserService {
    @Resource
    private ItripUserMapper itripUserMapper;

    /***
     * 注册主方法
     * @param email
     * @param userName
     * @param activated
     * @param pwd
     * @param
     * @return
     */
    @Transactional
    @Override
    public boolean registerAllUser(String email, String userName, Integer activated, String pwd) {
        ItripUser itripUser = new ItripUser(email, pwd, userName, activated);
        Long userId = itripUser.getId();
        boolean bool = this.register(itripUser);
        if (bool) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public ItripUser login(String usercode, String userPassword) {
        ItripUser itripUser = new ItripUser();
        itripUser.setUsercode(usercode);
        itripUser.setUserpassword(userPassword);
        ItripUser login = itripUserMapper.login(itripUser);
        if (login != null) {
            return login;
        } else {
            return null;
        }
    }

    @Override
    public boolean findByUserCode(String usercode) {
        return itripUserMapper.selectCzEmail(usercode) > 0 ? true : false;
    }

    @Override
    public boolean register(ItripUser itripUser) {
        return itripUserMapper.register(itripUser) > 0 ? true : false;
    }
}
