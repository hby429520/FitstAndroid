package com.example.fitstandroid.Network;

public class NetWork_Config {
    private String SERVICE_URL;
    private int REQUEST_TIMEOUT;
    private int SO_TIMEOUT;
    private int type;

    public String getSERVICE_URL() {
        return SERVICE_URL;
    }

    public void setSERVICE_URL(String SERVICE_URL) {
        this.SERVICE_URL = SERVICE_URL;
    }

    public int getREQUEST_TIMEOUT() {
        return REQUEST_TIMEOUT;
    }

    public void setREQUEST_TIMEOUT(int REQUEST_TIMEOUT) {
        this.REQUEST_TIMEOUT = REQUEST_TIMEOUT;
    }

    public int getSO_TIMEOUT() {
        return SO_TIMEOUT;
    }

    public void setSO_TIMEOUT(int SO_TIMEOUT) {
        this.SO_TIMEOUT = SO_TIMEOUT;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
