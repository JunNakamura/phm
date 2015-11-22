package controllers;

import modules.CustomDataBinder;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

/**
 * アプリ開始時にDIさせたいもののみを扱うコントローラ.
 * Created by nakamurajun on 2015/11/23.
 */
public class StarterController extends Controller {

    @Inject
    CustomDataBinder dataBinder;

    public Result apply() {
        return ok();
    }
}
