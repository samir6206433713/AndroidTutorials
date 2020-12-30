package com.tutorial.androidtutorial.networkcall;




import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
//https://api.serverlessbanking.com


    @POST("pm/v1/paymentMethods/addCreditCards")
    Call<AddCredItCard> addCreditCard(@HeaderMap Map<String, String> map,
                                      @Body RequestBody body);

    @POST("wum/v1/wallets/signupConfirm")
    Call<OtpVarificationStatus> OtpValidationResult(@HeaderMap Map<String, String> map,
                                                    @Body RequestBody body);


 /*   @GET("pm/v1/paymentMethods/getUserBanks/{userId}")
    Call<DepositData> getSaveBank(@HeaderMap Map<String, String> map, @Path("userId") String user_id);*/







}