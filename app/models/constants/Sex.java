package models.constants;

import com.avaje.ebean.annotation.EnumValue;

/**
 * 性別の定数クラス.
 * Created by nakamurajun on 2015/10/25.
 */
public enum Sex {

    /**
     * 男性.
     */
    @EnumValue("male")
    MALE,

    /**
     * 女性.
     */
    @EnumValue("female")
    FEMALE
}
