package cn.htjovi.controller;

import cn.htjovi.dao.ProcessPathDao;
import cn.htjovi.dto.ProcessPathDTO;
import cn.htjovi.entity.ProcesspathEntity;
import cn.htjovi.service.ProcessPathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 13041 on 2018/2/1.
 */
@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private ProcessPathService processPathService;

    @GetMapping("/getcarddetailforselect")
    public List<ProcesspathEntity> getCardDetailForSelect(@RequestHeader(name = "produceapplicationid",required = false,defaultValue = "910") Long produceApplicationId){
        return processPathService.getProcessPathListForSelect(produceApplicationId);
    }
}
