package dto.workExperience;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import play.data.format.Formats;
import play.data.validation.Constraints;
import java.time.LocalDate;
import java.util.Optional;

/**
 * 職歴追加時のDTO.
 * Created by nakamurajun on 2015/11/07.
 */
public class NewWorkExperienceDto {

    /**
     * 業務の概要.
     */
    @Constraints.Required
    public String overview;

    /**
     * 開始日.
     */
    @Constraints.Required
    @Formats.DateTime(pattern = "yyyy-MM-dd")
    public LocalDate startDate;

    /**
     * 終了日.
     */
    @Constraints.Required
    @Formats.DateTime(pattern = "yyyy-MM-dd")
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
