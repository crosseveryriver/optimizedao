package cn.htjovi.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 13041 on 2018/2/1.
 */
@Entity
@Table(name = "processpath", schema = "public", catalog = "LCIndustry3")
public class ProcesspathEntity {
    private String process_path_name;
    private String remark;
    private long process_path_id;
    private Integer process_path_status;
    private Integer process_path_type;
    private List<ProcesspathdetailEntity> process_path_detail;

    @Basic
    @Column(name = "processpathname", nullable = true, length = -1)
    public String getProcess_path_name() {
        return process_path_name;
    }

    public void setProcess_path_name(String processpathname) {
        this.process_path_name = processpathname;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = -1)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
    @Column(name = "status", nullable = true)
    public Integer getProcess_path_status() {
        return process_path_status;
    }

    public void setProcess_path_status(Integer status) {
        this.process_path_status = status;
    }

    @Basic
    @Column(name = "processpathtype", nullable = true)
    public Integer getProcess_path_type() {
        return process_path_type;
    }

    public void setProcess_path_type(Integer processpathtype) {
        this.process_path_type = processpathtype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProcesspathEntity that = (ProcesspathEntity) o;

        if (process_path_id != that.process_path_id) return false;
        if (process_path_name != null ? !process_path_name.equals(that.process_path_name) : that.process_path_name != null)
            return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (process_path_status != null ? !process_path_status.equals(that.process_path_status) : that.process_path_status != null) return false;
        if (process_path_type != null ? !process_path_type.equals(that.process_path_type) : that.process_path_type != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = process_path_name != null ? process_path_name.hashCode() : 0;
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (int) (process_path_id ^ (process_path_id >>> 32));
        result = 31 * result + (process_path_status != null ? process_path_status.hashCode() : 0);
        result = 31 * result + (process_path_type != null ? process_path_type.hashCode() : 0);
        return result;
    }

    @OneToMany
    @JoinColumn(name = "processpathid")
    public List<ProcesspathdetailEntity> getProcess_path_detail() {
        return process_path_detail;
    }

    public void setProcess_path_detail(List<ProcesspathdetailEntity> processpathdetails) {
        this.process_path_detail = processpathdetails;
    }
}
