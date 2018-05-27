package com.song.attendance.util;

import com.song.attendance.constant.ResponseCodeMes;

import java.util.List;

public class Response<T> {
    /**
     *
     */
    private String code;
    private String mes;
    private Boolean isSuccess;
    private T data;
    private List<T> dataList;

    public static <T> Response<T> ok(T data) {
        Response<T> response = new Response();
        response.setCodeAndMes(ResponseCodeMes.SUCCESS);
        response.setSuccess(Boolean.TRUE);
        response.setData(data);
        return response;
    }

    public static <T> Response<T> ok(List<T> dataList) {
        Response<T> response = new Response();
        response.setCodeAndMes(ResponseCodeMes.SUCCESS);
        response.setSuccess(Boolean.TRUE);
        response.setDataList(dataList);
        return response;
    }

    public static <T> Response<T> fail(ResponseCodeMes fail) {
        Response<T> response = new Response<>();
        response.setCodeAndMes(fail);
        response.setSuccess(Boolean.FALSE);
        return response;
    }

    public void setCodeAndMes(ResponseCodeMes responseCodeMes) {
        this.code = responseCodeMes.getCode();
        this.mes = responseCodeMes.getMes();
    }

    public String getCode() {
        return code;
    }


    public String getMes() {
        return mes;
    }


    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
