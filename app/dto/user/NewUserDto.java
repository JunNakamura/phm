package dto.user;

import models.constants.Sex;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.data.validation.ValidationError;
import services.UserService;
import services.implement.UserServiceEbean;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ユーザ新規作成画面のフォームDTO
 * Created by nakamurajun on 2015/10/28.
 */
public class NewUserDto {

    private UserService service = new UserServiceEbean();

    /**
     * 従業員番号.
     */
    @Constraints.Required
    public String employeeNumber;

    /**
     * 姓.
     */
    @Constraints.Required
    public String firstName;

    /**
     * 名.
     */
    @Constraints.Required
    public String lastName;

    /**
     * 性別.
     */
    @Constraints.Required
    public Sex sex;

    /**
     * 生年月日.
     */
    @Constraints.Required
    @Formats.DateTime(pattern = "yyyy-MM-dd")
    public Date birthday;

    /**
     * 入社日.
     */
    @Constraints.Required
    @Formats.DateTime(pattern = "yyyy-MM-dd")
    public Date hireDate;

    /**
     * 追加のバリデーション.
     * @return
     */
    public List<ValidationError> validate() {
        List<ValidationError> errors = new ArrayList<>();

        if (service.findOne(employeeNumber).isPresent()) {
            errors.add(new ValidationError("employeeNumber","This employee number is registered."));
        }

        return errors.isEmpty() ? null : errors;
    }
}


