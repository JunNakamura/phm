package controllers;

import dto.workExperience.NewWorkExperienceDto;
import modules.CustomDataBinder;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.workExperience.*;

import javax.inject.Inject;

/**
 * 職歴のコントローラクラス.
 * Created by nakamurajun on 2015/11/07.
 */
public class WorkExperienceController extends Controller {

    /**
     * 職歴の追加画面.
     * @param userId
     * @return
     */
    public Result displayNew(Long userId) {
        Form<NewWorkExperienceDto> dtoForm = Form.form(NewWorkExperienceDto.class);
        return ok(newWorkExperienceView.render(dtoForm, userId));
    }

    /**
     * 職歴追加の確認画面.
     * @param userId
     * @return
     */
    public Result create(Long userId) {
        Form<NewWorkExperienceDto> dtoForm = Form.form(NewWorkExperienceDto.class).bindFromRequest();
        Logger.info("form:{}", dtoForm);
        if (dtoForm.hasErrors()) {
            Logger.debug("form errors:{}", dtoForm.errors());
            return ok(newWorkExperienceView.render(dtoForm, userId));
        }
        //TODO
        return ok("TODO");
    }
}
