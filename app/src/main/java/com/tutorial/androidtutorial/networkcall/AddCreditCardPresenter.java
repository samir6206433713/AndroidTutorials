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
import retrofit2.Response;

public class AddCreditCardPresenter {

   /* AddcreditCardView addcreditCardView;
    private Context context;

    public AddCreditCardPresenter(AddCreditCard addCreditCard){
        this.addcreditCardView = addCreditCard;

    }

    public void getCreditCardDetails(String phone_number, String email_id, String seller_payme_id, boolean buyer_is_permanent, String first_name, String last_name, String card_number, String cvv, String expiredate, String social_id, String user_id) {

        Map<String,String> map = new HashMap<>();
        map.put("Content-Type","application/json");
        map.put("accesstoken", Preferences.getInstance(context).getdata(Preferences.ACCESS_TOKEN));

        MediaType mediaType = MediaType.parse("application/json");

       // Log.i("phone_number111",phone_number);





        JSONObject obj = new JSONObject();
        try {
            obj.put("phone_number", phone_number);
            obj.put("email_id", email_id);
            obj.put("seller_payme_id", seller_payme_id);
            obj.put("buyer_is_permanent", buyer_is_permanent);
            obj.put("first_name", first_name);
            obj.put("last_name", last_name);
            obj.put("card_number", card_number);
            obj.put("cvv", cvv);
            obj.put("expiry_date", expiredate);
            obj.put("social_id", social_id);
            obj.put("user_id", user_id);



            Log.i("Object22",obj.toString());

        } catch (JSONException e) {
            e.printStackTrace();
        }



        Log.i("SignUpPresenterBody",""+obj.toString());
        RequestBody body = RequestBody.create(mediaType,obj.toString());

        ApiInterface apiService =
                Apiclient.getClient().create(ApiInterface.class);

        Call<AddCredItCard> call = (Call<AddCredItCard>) apiService.addCreditCard(map,body);
       call.enqueue(new Callback<AddCredItCard>() {
           @Override
           public void onResponse(Call<AddCredItCard> call, Response<AddCredItCard> response) {
               Log.i("printResponse2222",""+response.toString());

               if (response.code() == 200){
                 //  Log.i("getTokenData",""+response.body().getMessage());
                   addcreditCardView.getAddCreditCardMessage(String.valueOf(response.code()).trim());


                   if (response.body().getMessage().equals("Success")){

                   }
               } else {
                   Gson gson = new GsonBuilder().create();
                   ErrorData mError = new ErrorData();

                   try {
                       mError = gson.fromJson(response.errorBody().string(), ErrorData.class);
                       Log.i("ErrorCredit22", "" + response.errorBody().toString());

                       if (mError.getStatus().equals("Error")) {


                           Log.i("SignUpPresenterErrorMsg",""+mError.getMessage());
                           addcreditCardView.getErrorMessage(mError.getMessage());


                       }
                   } catch (IOException e) {
                       e.printStackTrace();
                   }


               }
           }

           @Override
           public void onFailure(Call<AddCredItCard> call, Throwable t) {

           }
       });


    }

    public interface AddcreditCardView{
          void getAddCreditCardMessage(String message);
          void  getErrorMessage(String meassage);
    }*/

}