package models;

import com.avaje.ebean.Model;
import models.constants.Sex;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * ユーザのモデルクラス.
 * Created by nakamurajun on 2015/10/25.
 */
@Entity
public class User extends BasicModel {

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

    /**
     * 職歴.
     */
    @OneToMany(cascade = CascadeType.ALL)
    public List<WorkExperience> workExperiences;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
