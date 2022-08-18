package org.example.service;

import org.example.dao.UserDao;

/**
 * @author Cl
 * @date 2022/8/18 - 19:22
 */
public class UserService {
    public static void testService(){
        System.out.println("UserService Test ...");
        UserDao.testdao();
    }
}
