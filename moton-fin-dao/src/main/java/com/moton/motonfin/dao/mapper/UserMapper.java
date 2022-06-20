package com.moton.motonfin.dao.mapper;

import com.moton.motonfin.dao.dataobject.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author
 */
@Mapper
public interface UserMapper {

    UserDO getByName(String name);

    UserDO getById(Long id);

    Long insert(UserDO userDO);
}
