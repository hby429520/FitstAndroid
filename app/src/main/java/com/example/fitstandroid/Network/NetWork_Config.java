package com.example.fitstandroid.Network;


import com.example.fitstandroid.Bean.Test;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface NetWork_Config {
   String SERVICE_URL="";
   @POST("")
   Call<ResponseBody> getuser();

}
