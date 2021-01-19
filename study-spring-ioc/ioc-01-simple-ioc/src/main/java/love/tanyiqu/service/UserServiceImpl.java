package love.tanyiqu.service;

import love.tanyiqu.dao.UserDao;

public class UserServiceImpl implements UserService {


    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
