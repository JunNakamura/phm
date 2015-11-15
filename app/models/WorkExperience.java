package models;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * 職歴のモデルクラス.
 * Created by nakamurajun on 2015/11/02.
 */
@Entity
public class WorkExperience extends BasicModel {

    /**
     * 紐づくユーザ.
     */
    @ManyToOne(optional = false)
    public User user;

    /**
     * 業務の概要.
     */
    public String overview;

    /**
     * 開始日.
     */
    public LocalDate startDate;

    /**
     * 終了日.
     */
    public LocalDate endDate;

    /**
     * プログラミング言語.
     */
    public String programingLanguage;

    /**
     * RDMS.
     */
    public String rdbms;

    /**
     * フレームワーク.
     */
    public String framework;

    /**
     * IDE.
     */
    public String ide;

    /**
     * OS.
     */
    public String os;

    /**
     * VCS.
     */
    public String vcs;

    /**
     * BTS.
     */
    public String bts;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
