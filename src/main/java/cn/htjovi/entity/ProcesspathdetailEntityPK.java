package cn.htjovi.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by 13041 on 2018/2/1.
 */
public class ProcesspathdetailEntityPK implements Serializable {
    private int sort;
    private long process_path_id;
    private long processid;

    @Column(name = "sort", nullable = false)
    @Id
    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Column(name = "processpathid", nullable = false)
    @Id
    public long getProcess_path_id() {
        return process_path_id;
    }

    public void setProcess_path_id(long processpathid) {
        this.process_path_id = processpathid;
    }

    @Column(name = "processid", nullable = false)
    @Id
    public long getProcessid() {
        return processid;
    }

    public void setProcessid(long processid) {
        this.processid = processid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProcesspathdetailEntityPK that = (ProcesspathdetailEntityPK) o;

        if (sort != that.sort) return false;
        if (process_path_id != that.process_path_id) return false;
        if (processid != that.processid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sort;
        result = 31 * result + (int) (process_path_id ^ (process_path_id >>> 32));
        result = 31 * result + (int) (processid ^ (processid >>> 32));
        return result;
    }
}
