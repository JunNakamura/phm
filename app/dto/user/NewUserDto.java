package dto.user;

import models.constants.Sex;

import java.time.LocalDate;

/**
 * ユーザ新規作成画面のフォームDTO
 * Created by nakamurajun on 2015/10/28.
 */
public class NewUserDto {

    /**
     * 従業員番号.
     */
    public String employeeNumber;

    /**
     * 姓.
     */
    public String firstName;

    /**
     * 名.
     */
    public String lastName;

    /**
     * 性別.
     */
    public Sex sex;

    /**
     * 生年月日.
     */
    public LocalDate birthday;

    /**
     * 入社日.
     */
    public LocalDate hireDate;
}


