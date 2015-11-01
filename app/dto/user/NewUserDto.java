package dto.user;

import models.constants.Sex;
import play.data.format.Formats;
import play.data.validation.Constraints;

import java.time.LocalDate;
import java.util.Date;

/**
 * ユーザ新規作成画面のフォームDTO
 * Created by nakamurajun on 2015/10/28.
 */
public class NewUserDto {

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
}


