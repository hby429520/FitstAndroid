package com.example.fitstandroid.Network;

import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Network_Request {
    private NetWork_Config netWork_config;
    public Network_Request(){
        netWork_config=new NetWork_Config();
    }

    public String GET(String API) throws IOException {
        HttpURLConnection connection = null;
        URL url = new URL(netWork_config.getSERVICE_URL() + API);
        connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.setReadTimeout(netWork_config.getREAD_TIMEOUT());
        connection.setConnectTimeout(netWork_config.getCONNECT_TIMEOUT());
        int code = connection.getResponseCode();
        if (code==200){
            InputStream inputStream = connection.getInputStream();
            String Str = getStringFromInputStream(inputStream);
            return Str;
        }else {
            return "201";
        }
//        if (connection!=null){
//              connection.disconnect();
//        }
//        return null;
    }
    public void POST(String API,String JSONString){

    }
    private String getStringFromInputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len =-1;
        while ((len=inputStream.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        inputStream.close();
        String str = os.toString();
        os.close();
        return str;
    }
}
