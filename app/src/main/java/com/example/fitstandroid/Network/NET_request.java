package com.example.fitstandroid.Network;


import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class NET_request {
    private static NET_request net_request;
    private static String json;
    Retrofit retrofit;
    NetWork_Config service;


    private NET_request() {}
    public NetWork_Config setServiceConfig(){
        retrofit = new Retrofit.Builder().baseUrl(NetWork_Config.SERVICE_URL).build();
        service = retrofit.create(NetWork_Config.class);
        return service;
    }
    public static NET_request getNET_request(){
        if (net_request==null){
            net_request = new NET_request();
        }
        return net_request;
    }


    public static void request(Call<ResponseBody> data, final Back callBack) {
        data.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    json = response.body().string();
                    if(callBack !=null){
                        callBack.onResponse(json);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
//        data.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                try {
//                    json = response.body().string();
//
//                    if (response != null)
//                    {
//                        response.onResponse(json);
//                    }
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//
//            }
//        });
    }


    public static interface Back
    {
        void onResponse(String json);
    }

}
