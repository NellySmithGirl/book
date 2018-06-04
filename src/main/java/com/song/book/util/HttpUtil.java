package com.song.book.util;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpUtil {
    static CloseableHttpClient httpclient = HttpClients.createDefault();//这个里面有连接池 维持一个连接复用
    private static String CHAR_SET = "utf-8";

    public static void get(String url, Map<String, Object> params) throws IOException {
        if(params !=null && !params.isEmpty()){
            List<NameValuePair> pairs = new ArrayList<>(params.size());
            for (String key :params.keySet()){
                pairs.add(new BasicNameValuePair(key, params.get(key).toString()));
            }
            url +="?"+EntityUtils.toString(new UrlEncodedFormEntity(pairs), CHAR_SET);
        }
        HttpGet httpGet = new HttpGet(url);
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(2000).setConnectionRequestTimeout(2000)
                .setSocketTimeout(2000).build();
        httpGet.setConfig(requestConfig);
        CloseableHttpResponse response = httpclient.execute(httpGet);
        System.out.println("得到的结果:" + response.getStatusLine().getStatusCode());//得到请求结果
        HttpEntity entity = response.getEntity();//得到请求回来的数据</code>
        String result = null;
        if (entity != null) {
            result = EntityUtils.toString(entity, "utf-8");
            EntityUtils.consume(entity);
            response.close();
            System.out.println(result);
        }
    }
    /**
     * HTTP Post 获取内容
     * @param url 请求的url地址 ?之前的地址
     * @param params 请求的参数
     * @return 页面内容
     * @throws IOException
     * @throws ClientProtocolException
     */

    public static String sendPost(String url, Map<String, Object> params) throws ClientProtocolException, IOException {

        List<NameValuePair> pairs = null;
        if (params != null && !params.isEmpty()) {
            pairs = new ArrayList<NameValuePair>(params.size());
            for (String key : params.keySet()) {
                pairs.add(new BasicNameValuePair(key, params.get(key).toString()));
            }
        }
        HttpPost httpPost = new HttpPost(url);
        if (pairs != null && pairs.size() > 0) {
            httpPost.setEntity(new UrlEncodedFormEntity(pairs, CHAR_SET));
        }
        CloseableHttpResponse response = httpclient.execute(httpPost);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode != 200) {
            httpPost.abort();
            throw new RuntimeException("HttpClient,error status code :" + statusCode);
        }
        HttpEntity entity = response.getEntity();
        String result = null;
        if (entity != null) {
            result = EntityUtils.toString(entity, CHAR_SET);
            EntityUtils.consume(entity);
            response.close();
            return result;
        }else{
            return null;
        }
    }
    public static void main(String[] args) throws IOException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("time",0);
        long l = System.currentTimeMillis();
        get("http://127.0.0.1:8080/book/test",map);
        get("http://127.0.0.1:8080/book/test",map);
        get("http://127.0.0.1:8080/book/test",map);
        get("http://127.0.0.1:8080/book/test",map);
        System.out.println(System.currentTimeMillis() - l);
//        get("http://www.google.com",map);
    }

}
