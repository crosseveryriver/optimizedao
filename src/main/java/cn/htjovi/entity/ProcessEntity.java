package cn.htjovi.entity;

import javax.persistence.*;

/**
 * Created by 13041 on 2018/2/1.
 */
@Entity
@Table(name = "process", schema = "public", catalog = "LCIndustry3")
public class ProcessEntity {
    private String process_name;
    private long process_id;
    private Integer process_status;

    @Basic
    @Column(name = "processname", nullable = true, length = -1)
    public String getProcess_name() {
        return process_name;
    }

    public void setProcess_name(String processname) {
        this.process_name = processname;
    }

    @Id
    @Column(name = "processid", nullable = false)
    public long getProcess_id() {
        return process_id;
    }

    public void setProcess_id(long processid) {
        this.process_id = processid;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getProcess_status() {
        return process_status;
    }

    public void setProcess_status(Integer status) {
        this.process_status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProcessEntity that = (ProcessEntity) o;

        if (process_id != that.process_id) return false;
        if (process_name != null ? !process_name.equals(that.process_name) : that.process_name != null) return false;
        if (process_status != null ? !process_status.equals(that.process_status) : that.process_status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = process_name != null ? process_name.hashCode() : 0;
        result = 31 * result + (int) (process_id ^ (process_id >>> 32));
        result = 31 * result + (process_status != null ? process_status.hashCode() : 0);
        return result;
    }
}
