package com.moton.motonfin.api;


import com.moton.motonfin.api.model.UserModel;

/**
 * @author
 */
public interface UserService {

    String getUserName(Long id);

    UserModel addUser(UserModel user);
}
