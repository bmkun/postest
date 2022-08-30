package com.idho.training.service.serviceimpl;

import com.idho.training.dao.UserDao;
import com.idho.training.dto.UserDto;
import com.idho.training.entity.User;
import com.idho.training.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Idho
 */

@Service
//@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    public void simpan(UserDto userDto) {
//    log.info("== Datanya : {}", userDto);
     User user = new User();
        user.setID(userDto.getId());
        user.setUSERNAME(userDto.getUsername());
        user.setPASSWORD(userDto.getPassword());
        user.setIS_ACTIVE(1);

        userDao.save(user);
//        userDao.deleteAllById();
    }
}
