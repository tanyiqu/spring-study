package love.tanyiqu.service;

public class UserServiceImpl implements UserService {
    @Override
    public void select() {
        System.out.println("查询用户");
    }

    @Override
    public void insert() {
        System.out.println("添加用户");
    }
}
