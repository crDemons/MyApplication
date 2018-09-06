package com.example.admin.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv);
    }

    public void getHttpsHtml(View view) {

    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private String url="";
    private String json="";
    private String testOKHttp(){
        //new OkHttpClient __ new Request __ client.newCall-RealCall-Dispatcher.execte/enqueue__Interceptor__Response
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = null;
        try {
            response = okHttpClient.newCall(request).execute();
            if (response.isSuccessful()){
                response.body().string();
            }else {
                throw new IOException("Unexpected code " + response);
            }
            okHttpClient.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {

                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {

                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private String getOKHttp(){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private String postOKHttp(){
//        public static final
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        RequestBody requestBody;
//        FormBody formBody;
//        MultipartBody multipartBody;
//
//        ResponseBody responseBody;
//        RealResponseBody realResponseBody;
////        CacheResponseBody
//        Route route;
//        RouteDatabase routeDatabase;
//        RouteSelector routeSelector;
//        WebSocket webSocket;
//        InetAddress inetAddress;
//        InetSocketAddress inetSocketAddress;
//        Dispatcher dispatcher;
//        RealInterceptorChain realInterceptorChain;
//        Address address;
//        Okio okio;
//        ByteString byteString;
//        Buffer buffer;
//        FileSystem fileSystem;
//        CacheControl cacheControl;
//        CacheStrategy cacheStrategy;
//        CacheInterceptor cacheInterceptor;
//        Cache cache;
//        InternalCache internalCache;
//        ConnectionSpec connectionSpec;
//        ConnectionSpecSelector connectionSpecSelector;
//        HttpCodec httpCodec;
//        Http1Codec http1Codec;
//        Http2Codec http2Codec;
//        Platform platform;
//        Connection connection;
//        RealConnection realConnection;
//        ConnectInterceptor connectInterceptor;
//        CallServerInterceptor callServerInterceptor;
        return "";
    }
}
