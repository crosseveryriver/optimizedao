package cn.htjovi.dao;

import cn.htjovi.entity.CardEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 13041 on 2018/2/1.
 */
public interface CardDao extends CrudRepository<CardEntity,Long> {
}
