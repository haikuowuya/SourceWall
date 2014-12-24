package com.example.sourcewall.connection;

/**
 * Created by NashLegend on 2014/9/23 0023
 */
public class ResultObject {
    public ResultCode code = ResultCode.CODE_OK;
    public boolean ok = false;
    public String message = "";
    public Object result;

    public static enum ResultCode {
        CODE_OK,
        CODE_LOGIN_FAILED,
        CODE_TOKEN_EXPIRED,
        CODE_NETWORK_ERROR,
        CODE_JSON_ERROR,
        CODE_UNKNOWN,
        CODE_NO_TOKEN
    }
}
