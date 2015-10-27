package services;

import com.avaje.ebean.PagedList;
import com.google.inject.ImplementedBy;
import models.User;
import services.implement.UserServiceEbean;

import java.util.List;
import java.util.Optional;

/**
 * ユーザサービスのインターフェース.
 * Created by nakamurajun on 2015/10/25.
 */
@ImplementedBy(UserServiceEbean.class)
public interface UserService {

    List<User> findAll();

    Optional<User> findOne(long id);

    PagedList<User> find(int pageIndex, int pageSize);


}
