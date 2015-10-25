package models;

import com.avaje.ebean.Model;
import models.constants.Sex;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * ユーザのモデルクラス.
 * Created by nakamurajun on 2015/10/25.
 */
@Entity
public class User extends Model {

    /**
     * DB上のID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

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
     * ファインダー.
     */
    public static final Finder<Long, User> find = new Finder<Long, User>(User.class);

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
