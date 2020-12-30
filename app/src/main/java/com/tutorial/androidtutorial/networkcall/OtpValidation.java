package com.tutorial.androidtutorial.networkcall;


import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.prefs.Preferences;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;

public class OtpValidation {

    OtopValidtionPresenterView otopValidtionPresenterView;
    private Context context;

    public OtpValidation(OtopValidtionPresenterView otopValidtionPresenterView){
        this.otopValidtionPresenterView = otopValidtionPresenterView;

    }

    public void otpVarification(String otp)
    {
        Log.i("OTPVALIDATIONMETIOD","CALLED");

        Map<String, String> map = new HashMap<>();
        map.put("Content-Type","application/json");
        map.put("wallet_id", "abc");

        // Log.i("if12","execute");
        MediaType mediaType = MediaType.parse("application/json");

        // String codeinfo = "grant_type=authorization_code&code="+code;
        JSONObject obj = new JSONObject();
        try {

            obj.put("confirmationCode",otp);


        } catch (JSONException e) {
            e.printStackTrace();
        }



        Log.i("OTPVALIDATIONbODY",""+obj.toString());
        RequestBody body = RequestBody.create(mediaType,obj.toString());

        ApiInterface apiService =
                Apiclient.getClient().create(ApiInterface.class);

        Call<OtpVarificationStatus> call = (Call<OtpVarificationStatus>) apiService.OtpValidationResult(map,body);
        call.enqueue(new Callback<OtpVarificationStatus>() {
            @Override
            public void onResponse(Call<OtpVarificationStatus> call, retrofit2.Response<OtpVarificationStatus> response) {

                Log.i("response5", String.valueOf(response.code()));

                if (response.code() == 200){

                    Log.i("888881",response.body().getStatus().trim());

                    otopValidtionPresenterView.getOtpValidationResponce(response.body().getStatus().trim());



                }
                else
                    {
                        //otopValidtionPresenterView.getOtpValidationResponce(String.valueOf(response.code()).trim());//***********changes made here

                      //Log.i("ERROR12388888888",""+mError.getMessage());


                    Gson gson = new GsonBuilder().create();
                    ErrorData mError = new ErrorData();
                    try {
                        mError = gson.fromJson(response.errorBody().string(), ErrorData.class);


                        Log.i("otpvalidationerror",mError.getMessage());

                        otopValidtionPresenterView.getOtpValidationResponce(mError.getMessage().trim());


                        if(mError.getStatus().equals("error"))
                        {




                                Log.i("Otpvaldation-ERROR",""+mError.getMessage());

                                otopValidtionPresenterView.getOtpValidationResponce(mError.getMessage().trim());


                        }
                    }

                    catch (IOException e) {

                        Log.i("OtpIOE",e.toString());

                    }

                }


            }

            @Override
            public void onFailure(Call<OtpVarificationStatus> call, Throwable t) {

                Log.i("OtpvaldationFailureNET",""+call.toString().trim());


                otopValidtionPresenterView.getOtpValidationResponce(t.getLocalizedMessage());
            }
        });
    }

    public interface OtopValidtionPresenterView{

        void getOtpValidationResponce(String flag);
        void getErrorOtpValidation(String error);
    }

}
