package cn.tesco.yigou.util;

import java.util.ArrayList;
import java.util.List;

public class PageList<T> {

    private Integer tatol = 0;
    private List<T> rows = new ArrayList<>();

    public Integer getTatol() {
        return tatol;
    }

    public void setTatol(Integer tatol) {
        this.tatol = tatol;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
