package cn.htjovi.service;

import cn.htjovi.dao.ProcessPathDao;
import cn.htjovi.dto.ProcessPathDTO;
import cn.htjovi.entity.ProcesspathEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 13041 on 2018/2/1.
 */
@Service
public class ProcessPathService {
    @Autowired
    private ProcessPathDao processPathDao;
    
    public List<ProcesspathEntity> getProcessPathListForSelect(Long ProduceApplicationId){
        //增加所有经典工序组
        List<ProcesspathEntity> entities =  processPathDao.findByStatusAndType(3,1);
        return entities;
    }
}
