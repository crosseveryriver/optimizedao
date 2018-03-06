package cn.htjovi.dto;

import cn.htjovi.entity.ProcessEntity;

/**
 * Created by 13041 on 2018/2/1.
 */
public class ProcessDTO {
    private String process_name;
    private long process_id;
    private int process_status;

    ProcessDTO(ProcessEntity processEntity){
        this.process_name = processEntity.getProcess_name();
        this.process_id = processEntity.getProcess_id();
        this.process_status = processEntity.getProcess_status();
    }

    public String getProcess_name() {
        return process_name;
    }

    public void setProcess_name(String process_name) {
        this.process_name = process_name;
    }

    public long getProcess_id() {
        return process_id;
    }

    public void setProcess_id(long process_id) {
        this.process_id = process_id;
    }

    public int getProcess_status() {
        return process_status;
    }

    public void setProcess_status(int process_status) {
        this.process_status = process_status;
    }



}
