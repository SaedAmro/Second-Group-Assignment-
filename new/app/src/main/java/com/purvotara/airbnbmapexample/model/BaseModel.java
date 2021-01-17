package com.purvotara.airbnbmapexample.model;

import android.content.Context;

import com.purvotara.airbnbmapexample.controller.BaseInterface;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public abstract class BaseModel {
    transient Context mContext;
    transient BaseInterface mBaseInterface;

    public BaseModel(Context context, BaseInterface baseInterface) {
        mBaseInterface = baseInterface;
        mContext = context;
    }


    public abstract void parseAndNotifyResponse(JSONObject response, int requestType) throws JSONException;

    public abstract HashMap<String, Object> getRequestBodyObject(int requestType);


    public abstract HashMap<String, String> getRequestBodyString(int requestType);

}
