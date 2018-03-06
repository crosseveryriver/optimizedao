package cn.htjovi.dao;

import cn.htjovi.entity.ProcesspathEntity;
import cn.htjovi.entity.ProcesspathdetailEntityPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sun.java2d.loops.ProcessPath;

import java.util.List;

/**
 * Created by 13041 on 2018/2/1.
 */
public interface ProcessPathDao extends CrudRepository<ProcesspathEntity,Long> {
    @Query("select pp from ProcesspathEntity as pp where process_path_status = ?1 and process_path_type = ?2")
    List<ProcesspathEntity> findByStatusAndType(int status, int type);
}
