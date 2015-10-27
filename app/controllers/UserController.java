package controllers;

import com.avaje.ebean.PagedList;
import models.User;
import models.constants.Sex;
import play.mvc.Controller;
import services.UserService;

import javax.inject.Inject;

import play.mvc.*;

import views.html.userView;

/**
 * ユーザコントローラ.
 * Created by nakamurajun on 2015/10/25.
 */
public class UserController extends Controller {

    @Inject
    UserService service;

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


}
