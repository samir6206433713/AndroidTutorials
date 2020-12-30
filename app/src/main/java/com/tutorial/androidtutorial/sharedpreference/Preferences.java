package com.tutorial.androidtutorial.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;

public class Preferences {

//********************************Here is the code to be changed in future if required**************************************
public static Bitmap bitmap2;
    public static String walletidforapi="b6169af0-9f22-11e9-903b-7df1dad52e0a";  //      //ecfd8790-86bd-11e9-869c-bfdfe01caf28

    public static String KissWalletidapi="435496f0-a302-11e9-bc13-69819d8cd694";

    public static String Country_Code="+9725";//+9725

    public static int minDigitPhone=8; //8

    public static String seller_payme_id ="MPL15226-887149PS-HJMBPXDY-GRBCMPAM";//  //MPL15226-888365JT-W2RVAILL-YAXJD7QO   //



    //******************************************************************************************************************************
    public static String dePositAmount="000";
    public static String playStoreLink="https://play.google.com/store/apps/details?id=com.pey.app";
    public static String Wallet_NamePersonalInfo="pey";//pey

    public static String XApiKey="j1xcE1VOJr6Ldav3bUWzY2b3m3T7kul76ZuB8kJN";// for parent

    public static String ChildXApiKey="juWO8WqqYPadIPxpUAvbV6HI9RbEzU1zaFVGWHvc";// for child



    public static String Old_password="123456";
    public static String password="123456";


    public static String business_type="private";
    public static String fragment_type="main";
    public static String device_type="Android";
    public static String contactName="";
    public static String fromPoneEmeil="no";



    public static final String CHANNEL_ID = "my_channel_01";
    public static final String CHANNEL_NAME = "Simplified Coding Notification";
    public static final String CHANNEL_DESCRIPTION = "www.simplifiedcoding.net";

    public static String uploadImage="";

    ///*****************Notificatin foreground******************************************



    public static String transaction_id = "";
    public static String destination_phone = "";
    public static String amount = "";
    public static String description = "";
    public static String destination_user_name = "";
    public static String payment_type = "";
    public static String destination_email = "";
    public static String pending_notification = "";




    public static String Child_phone_number = "";
    public static String Child_first_name = "";
    public static String Child_last_name = "";
    public static String Child_user_id = "";
    public static String Child_wallet_id = "";


//**********************.........................Ends here *****************************************************************

    public static final String SHARED_PREF_NAME = "mypref";
    public static final String USER_ID = "user_id";
    public static final String Phone_NO = "phone_no";
    public static final String DEVICE_ID = "device_id";
    public static final String DEVICE_TOKEN = "device_token";
    public static final String WALLET_ID = "wallet_id";
    public static final String WALLET_NAME = "wallet_name";
    public static final String REFRESHED_TOKEN = "refreshed_token";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String ACCESSTOKEN_EXPEIRESAT = "accesstoken_expiresat";
    public static final String ID_TOKEN = "id_token";
    public static final String IDTOKEN_EXPIRESAT= "idtoken_expiresat";
    public static final String USER_PIN = "user_pin";
    public static final String First_Name = "first_name";
    public static final String Last_Name = "last_name";
    public static final String ID_NUMBER = "id_number";
    public static final String RESEND_PIN_CODE = "resend_pin_code";
    public static final String TRANSACTION_ID = "transaction_id";
    public static final String BRANCH_NUMBER="branch_number";
    public static final String ACCOUNT_NUMBER="account_number";
    public static String UserBalance="0.00";
    public static String CurrentActivity="";
    public static final String BANK_ID="bank_id";
    public static final String FULL_NAME="full_name";
    public static final String OtpRestetPin="otp_reset_pin";

    public static final String IFLOGINPREVIOUS="NO";
    public static final String SAVED_IMAGE_PATH="saved_image_path";

    //******************This is the static variables Constants******************



    public static String Content_Type="application/json";



    public static String language="en";
    public static String flag="";

    public static boolean resetpincalled=false;


    public static String Discont = "5aef1dee9f3f21084ae736ba"; //Discont
    public static String Poalim = "5aef1dfa9f3f21084ae736bb";//Poalim
    public static String Mizrahi = "5aef1e389f3f21084ae736bf";//Mizrahi
    public static String Habenleumi = "5aef1e659f3f21084ae736c3";//Habenleumi
    public static String Leumi= "5aef1ec19f3f21084ae736c9";//leumi










    public static final String Password = "nameKey";
    public static final String Email = "emailKey";


    private static Preferences mInstance;
    private static Context mCtx;

    public Preferences(Context context) {
        mCtx = context;
    }

    public static synchronized Preferences getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new Preferences(context);
        }
        return mInstance;
    }



    //this method will store the user data in shared preferences
    public void update(String KEY, String VALUE) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(KEY, VALUE);


        editor.apply();
    }

    //this method will checker whether user is already logged in or not
    public boolean isLoggedIn(String key) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, null) != null;
    }

    //this method will give the logged in user
    public String getdata(String key) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);

        return  sharedPreferences.getString(key, null);
    }

    //this method will logout the user
    public void logout() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();






    }

}