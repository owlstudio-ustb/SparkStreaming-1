package com.gh.bean.logfile;

import java.io.Serializable;

/**
 * Created by GH-GAN on 2016/11/24.
 */
public class LogFileContainer  implements Serializable {
    String type;
    DataContainer data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DataContainer getData() {
        return data;
    }

    public void setData(DataContainer data) {
        this.data = data;
    }


}
