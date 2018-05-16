package com.szyh.iflytek.bean;

import com.szyh.iflytek.define.MessageDefine;

/**
 * Created by Administrator on 2018/5/16.
 */

public class HairpinMachineStatusResponse extends Message {

    /**
     * 0x30卡在前端不持卡位置
     * 0x31卡在前端持卡位
     * 0x32 卡在射频位置
     * 0x33 卡在IC位置
     * 0x34 卡在后端持卡位
     * 0x35 机内无卡
     * 0x36 卡不再标准位置
     * 0x37 卡在重读卡位
     */
    private int status;

    private String describe;

    public HairpinMachineStatusResponse() {

    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
