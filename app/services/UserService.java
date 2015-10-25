package services;

import models.User;

import java.util.List;
import java.util.Optional;

/**
 * ユーザサービスのインターフェース.
 * Created by nakamurajun on 2015/10/25.
 */
public interface UserService {

    List<User> findAll();

    Optional<User> findOne(long id);

    List<User> findAllByPaging(int pageIndex, int pageSize);


}
