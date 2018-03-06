package cn.htjovi.dto;

import cn.htjovi.entity.ProcesspathdetailEntity;

/**
 * Created by 13041 on 2018/2/1.
 */
public class ProcessPathDetailDTO {
    ProcessPathDetailDTO(ProcesspathdetailEntity entity){
        process_path_id = entity.getProcess_path_id();
        process_path_detail_id = entity.getProcess_path_detail_id();
        sort = entity.getSort();
        detail_status = entity.getDetail_status();
        process = new ProcessDTO(entity.getProcess());
    }

    private long process_path_id;
    private long process_path_detail_id;
    private int sort;
    private int detail_status;
    private ProcessDTO process;

    public long getProcess_path_id() {
        return process_path_id;
    }

    public void setProcess_path_id(long process_path_id) {
        this.process_path_id = process_path_id;
    }

    public long getProcess_path_detail_id() {
        return process_path_detail_id;
    }

    public void setProcess_path_detail_id(long process_path_detail_id) {
        this.process_path_detail_id = process_path_detail_id;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getDetail_status() {
        return detail_status;
    }

    public void setDetail_status(int detail_status) {
        this.detail_status = detail_status;
    }
}
