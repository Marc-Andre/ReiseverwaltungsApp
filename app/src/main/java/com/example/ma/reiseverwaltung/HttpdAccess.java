package com.example.ma.reiseverwaltung;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by Marc-André on 18.05.2015.
 */
/**public class HttpdAccess {
/**
/**    OkHttpClient client = new OkHttpClient();
/**    Request request = new Request.Builder()
/**            .url("10.1.41.108:8080")
/**            .build();
/**    Response responses = null;
/**    try {
/**        responses = client.newCall(request).execute();
/**    } catch (IOException e) {
/**        e.printStackTrace();
/**    }
/**    try {
/**        String jsonData = responses.body().toString();
/**        JSONObject Jobject = new JSONObject(jsonData);
/**        JSONArray Jarray = Jobject.getJSONArray("");
/**        for (int i = 0; i < Jarray.length(); i++) {
/**            JSONObject object = Jarray.getJSONObject(i);
/**        } catch (JSONException ja) {
/**            ja.
/**        }
/**    } catch (JSONException je) {
/**        je.printStackTrace();
/**    }
/**}
/**