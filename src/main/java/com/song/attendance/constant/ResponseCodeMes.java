package com.song.attendance.constant;

public enum  ResponseCodeMes {
    ERROR("0000001","错误"),
    SUCCESS("000000","成功");

    private String code;
    private String mes;
    private ResponseCodeMes(String code,String mes){
        this.code=code;
        this.mes = mes;
    }

    public String getCode() {
        return code;
    }

    public String getMes() {
        return mes;
    }
}
