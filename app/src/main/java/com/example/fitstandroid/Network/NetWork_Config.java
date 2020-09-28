package com.example.fitstandroid.Network;

public class NetWork_Config {
    /**
     * @SERVICE_URL  服务器地址
     * @CONNECT_TIMEOUT 连接超时时间
     * @READ_TIMEOUT 读取超时时间
     */
    private String SERVICE_URL;
    private int CONNECT_TIMEOUT;
    private int READ_TIMEOUT;

    public String getSERVICE_URL() {
        return SERVICE_URL;
    }

    public void setSERVICE_URL(String SERVICE_URL) {
        this.SERVICE_URL = SERVICE_URL;
    }

    public int getCONNECT_TIMEOUT() {
        return CONNECT_TIMEOUT;
    }

    public void setCONNECT_TIMEOUT(int CONNECT_TIMEOUT) {
        this.CONNECT_TIMEOUT = CONNECT_TIMEOUT;
    }

    public int getREAD_TIMEOUT() {
        return READ_TIMEOUT;
    }

    public void setREAD_TIMEOUT(int READ_TIMEOUT) {
        this.READ_TIMEOUT = READ_TIMEOUT;
    }
}
