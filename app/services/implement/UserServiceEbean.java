package services.implement;

import com.avaje.ebean.Model;
import com.avaje.ebean.PagedList;
import dto.user.NewUserDto;
import models.ModelFinder;
import models.User;
import services.UserService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
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
    public Optional<User> findOne(String employeeNumber) {
        User user = find.where()
                .eq("employeeNumber", employeeNumber)
                .findUnique();
        return Optional.ofNullable(user);
    }

    @Override
    public PagedList<User> find(int pageIndex, int pageSize) {
        return find.findPagedList(pageIndex, pageSize);
    }

    @Override
    public void create(NewUserDto newUserDto) {
        User user = new User();
        user.employeeNumber = newUserDto.employeeNumber;
        user.firstName = newUserDto.firstName;
        user.lastName = newUserDto.lastName;
        user.sex = newUserDto.sex;
        user.birthday = newUserDto.birthday.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        user.hireDate = newUserDto.hireDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        user.save();
    }
}

