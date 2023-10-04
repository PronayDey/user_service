package com.user.user_service.service;

import com.user.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UserService {
    List<User> list=List.of( new User(777L,"pronay","56575774"),
                             new User(555L,"ram","43554366"),
                              new User(111L,"shubham","43346666")



    );
    @Override
    public User getUser(Long id) {
        return list.stream().filter(e->e.getUserId().equals(id)).findAny().orElse(null);
    }
}
