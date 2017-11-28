package com.fukaimei.okhttptest;

import java.io.IOException;

import okhttp3.Request;
import okhttp3.Response;

public abstract class ResultCallback {
    public abstract void onError(Request request, Exception e);

    public abstract void onResponse(String str) throws IOException;
}