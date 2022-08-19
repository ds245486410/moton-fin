package com.moton.motonfin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Component;

import com.moton.motonfin.dao.dataobject.UserDO;
import com.moton.motonfin.dao.mapper.UserMapper;
import com.moton.motonfin.api.UserService;
import com.moton.motonfin.api.model.UserModel;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    private static final BeanCopier copier = BeanCopier.create(UserModel.class, UserDO.class, false);

    @Transactional
    public String getUserName(Long id) {
        UserDO userDO = userMapper.getById(id);
        return userDO != null ? userDO.getName() : null;
    }

    public UserModel addUser(UserModel user) {
        UserDO userDO = new UserDO();
        copier.copy(user, userDO, null);

        Long id = userMapper.insert(userDO);
        user.setId(id);
        return user;
    }
}
