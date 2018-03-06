package cn.htjovi.dto;

import cn.htjovi.entity.ProcesspathEntity;
import cn.htjovi.entity.ProcesspathdetailEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 13041 on 2018/2/1.
 */
public class ProcessPathDTO {
    private String process_path_name;
    private String remark;
    private long process_path_id;
    private int process_path_status;
    private int process_path_type;
    List<ProcessPathDetailDTO> process_path_detail;


    public ProcessPathDTO(ProcesspathEntity entity){
        process_path_name = entity.getProcess_path_name();
        remark = entity.getRemark();
        process_path_id = entity.getProcess_path_id();
        process_path_status = entity.getProcess_path_status();
        process_path_type = entity.getProcess_path_type();
        process_path_detail = new ArrayList<>();
        for (ProcesspathdetailEntity e : entity.getProcess_path_detail()){
            process_path_detail.add(new ProcessPathDetailDTO(e));
        }
    }

    public String getProcess_path_name() {
        return process_path_name;
    }

    public void setProcess_path_name(String process_path_name) {
        this.process_path_name = process_path_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getProcess_path_id() {
        return process_path_id;
    }

    public void setProcess_path_id(long process_path_id) {
        this.process_path_id = process_path_id;
    }

    public int getProcess_path_status() {
        return process_path_status;
    }

    public void setProcess_path_status(int process_path_status) {
        this.process_path_status = process_path_status;
    }

    public int getProcess_path_type() {
        return process_path_type;
    }

    public void setProcess_path_type(int process_path_type) {
        this.process_path_type = process_path_type;
    }

    public List<ProcessPathDetailDTO> getProcess_path_detail() {
        return process_path_detail;
    }

    public void setProcess_path_detail(List<ProcessPathDetailDTO> process_path_detail) {
        this.process_path_detail = process_path_detail;
    }
}
