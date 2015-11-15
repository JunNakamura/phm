package controllers;

import com.avaje.ebean.PagedList;
import dto.user.NewUserDto;
import models.User;
import modules.CustomDataBinder;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import services.UserService;

import javax.inject.Inject;

import play.mvc.*;

import views.html.user.*;

import java.util.Optional;

/**
 * ユーザコントローラ.
 * Created by nakamurajun on 2015/10/25.
 */
public class UserController extends Controller {

    @Inject
    UserService service;

    @Inject
    CustomDataBinder dataBinder;

    /**
     * ページングのサイズ.
     */
    private int pageSize = 10;

    /**
     * ユーザ一覧画面.
     * @param pageNumber ページ数
     * @return
     */
    public Result index(int pageNumber) {
        int pageIndex = pageNumber -1;
        PagedList<User> users = service.find(pageIndex, pageSize);
        return ok(userView.render(users));
    }

    /**
     * ユーザ詳細画面.
     * @param id ユーザID.
     * @return
     */
    public Result view(long id) {
        Optional<User> userOptional = service.findOne(id);
        Optional<Result> result = userOptional.map(user -> {
            return ok(userDetailView.render(user));
        });
        return result.orElse(notFound());
    }

    /**
     * ユーザ新規作成画面.
     * @return
     */
    public Result displayInput() {
        //入力画面の表示なので空のフォームオブジェクトを渡す
        Form<NewUserDto> userDtoForm = Form.form(NewUserDto.class);
        return ok(newUserView.render(userDtoForm));
    }

    /**
     * ユーザ新規作成の確認画面.
     * @return
     */
    public Result confirmInputting() {
        Form<NewUserDto> userDtoForm = Form.form(NewUserDto.class).bindFromRequest();
        if (userDtoForm.hasErrors()) {
            Logger.debug("userform has erros:" + userDtoForm.errors());
            return ok(newUserView.render(userDtoForm));
        }
        return ok(newUserConfirmView.render(userDtoForm));
    }

    /**
     * ユーザの新規作成.
     * @return
     */
    public Result create() {
        Form<NewUserDto> userDtoForm = Form.form(NewUserDto.class).bindFromRequest();
        NewUserDto dto = userDtoForm.get();
        service.create(dto);
        Optional<User> user = service.findOne(dto.employeeNumber);
        Form<User> userForm = Form.form(User.class).fill(user.get());
        return ok(newUserResultView.render(userForm));
    }


}
