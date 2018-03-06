package cn.htjovi.entity;

import javax.persistence.*;

/**
 * Created by 13041 on 2018/2/1.
 */
@Entity
@Table(name = "processpathdetail", schema = "public", catalog = "LCIndustry3")
@IdClass(ProcesspathdetailEntityPK.class)
public class ProcesspathdetailEntity {
    private int sort;
    private long process_path_id;
    private long process_path_detail_id;
    private long processid;
    private Integer detail_status;
    private ProcessEntity process;


    @Id
    @Column(name = "sort", nullable = false)
    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Id
    @Column(name = "processpathid", nullable = false)
    public long getProcess_path_id() {
        return process_path_id;
    }

    public void setProcess_path_id(long processpathid) {
        this.process_path_id = processpathid;
    }

    @Basic
    @Column(name = "processpathdetailid", nullable = false)
    public long getProcess_path_detail_id() {
        return process_path_detail_id;
    }

    public void setProcess_path_detail_id(long processpathdetailid) {
        this.process_path_detail_id = processpathdetailid;
    }

    @Id
    @Column(name = "processid", nullable = false)
    public long getProcessid() {
        return processid;
    }

    public void setProcessid(long processid) {
        this.processid = processid;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getDetail_status() {
        return detail_status;
    }

    public void setDetail_status(Integer status) {
        this.detail_status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProcesspathdetailEntity that = (ProcesspathdetailEntity) o;

        if (sort != that.sort) return false;
        if (process_path_id != that.process_path_id) return false;
        if (process_path_detail_id != that.process_path_detail_id) return false;
        if (processid != that.processid) return false;
        if (detail_status != null ? !detail_status.equals(that.detail_status) : that.detail_status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sort;
        result = 31 * result + (int) (process_path_id ^ (process_path_id >>> 32));
        result = 31 * result + (int) (process_path_detail_id ^ (process_path_detail_id >>> 32));
        result = 31 * result + (int) (processid ^ (processid >>> 32));
        result = 31 * result + (detail_status != null ? detail_status.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "processid",insertable = false,updatable = false)
    public ProcessEntity getProcess() {
        return process;
    }

    public void setProcess(ProcessEntity process) {
        this.process = process;
    }
}
