package com.example.mylenovo.myapplication;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;

public class LoginHelper implements Response.Listener<JSONArray>, Response.ErrorListener {

    private Context context;
    private LoginHelper.Callback activity;
    RequestQueue queue;

    public interface Callback {
        void gotLogins(JSONArray question);
        void gotLoginsError(String message);
    }

    // Constructor
    public LoginHelper (Context inputContext) {
        this.context = inputContext;
    }

    // Get Logins from url. Using interface Callback
    void getLogins(LoginHelper.Callback inputActivity) {
        this.activity = inputActivity;
        queue = Volley.newRequestQueue(context);
        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
                null, this, this);
        queue.add(jsonObjectRequest);
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        // No scores found
        activity.gotLoginsError(error.getMessage());
    }

    @Override
    public void onResponse(JSONArray response) {
        activity.gotLogins(response);
    }


//    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }
    //    void getLogins(LoginHelper.Callback inputActivity) {
//        this.activity = inputActivity;
//        queue = Volley.newRequestQueue(context);
//        String url = "https://ide50-lisabeek.legacy.cs50.io:8080/login";
//        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url,
//                null, this, this);
//        queue.add(jsonObjectRequest);
//    }

}
