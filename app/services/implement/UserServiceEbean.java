package services.implement;

import com.avaje.ebean.Model;
import com.avaje.ebean.PagedList;
import models.ModelFinder;
import models.User;
import services.UserService;

import java.util.List;
import java.util.Optional;

/**
 * ユーザーサービスのEbeanによる実装.
 * Created by nakamurajun on 2015/10/25.
 */
public class UserServiceEbean implements UserService {

    private Model.Finder<Long, User> find = ModelFinder.create(User.class);

    @Override
    public List<User> findAll() {
        return find.all();
    }

    @Override
    public Optional<User> findOne(long id) {
        return Optional.ofNullable(find.byId(id));
    }

    @Override
    public PagedList<User> find(int pageIndex, int pageSize) {
        return find.findPagedList(pageIndex, pageSize);
    }
}

