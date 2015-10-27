package models;

import com.avaje.ebean.Model;

/**
 * モデルファインダーの生成インターフェース.
 * Created by nakamurajun on 2015/10/25.
 */
public interface ModelFinder  {

    static <T extends Model> Model.Finder<Long, T> create(Class<T> clazz) {
        return new Model.Finder<Long, T>(clazz);
    }
}
