package models;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Entityクラスの基底クラス.
 * Created by nakamurajun on 2015/11/15.
 */
@MappedSuperclass
public class BasicModel extends Model {

    /**
     * DB上のID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    /**
     * 作成日.
     */
    @CreatedTimestamp
    public LocalDateTime createdAt;

    /**
     * 更新日.
     */
    @UpdatedTimestamp
    public LocalDateTime updatedAt;
}
