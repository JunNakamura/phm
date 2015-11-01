package models.constants;

import com.avaje.ebean.annotation.EnumValue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
    FEMALE;

    /**
     * すべての要素.
     * @return
     */
    public static List<String> valuesAsList() {
        return Arrays.asList(values()).stream()
                .map(x -> x.name())
                .collect(Collectors.toList());
    }
}
