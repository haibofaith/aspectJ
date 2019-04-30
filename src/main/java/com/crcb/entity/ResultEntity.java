package com.crcb.entity;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @author:haibo.xiong
 * @date:2019/4/29
 * @description:
 */
public class ResultEntity<T> {
    /**
     * 默认0:为正常, 业务异常>0
     * 系统错误<0
     */
    private int retcode = 0;
    /**
     * 异常描述
     */
    private String retdesc = "";
    /**
     * 返回数据信息
     */
    private T data;


    /**
     * 得到retcode的值
     *
     * @return retcode的值
     */
    public int getRetcode() {
        return retcode;
    }

    /**
     * 设置retcode的值
     *
     * @param retcode 被设置的值
     */
    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    /**
     * 得到retdesc的值
     *
     * @return retdesc的值
     */
    public String getRetdesc() {
        return retdesc;
    }

    /**
     * 设置retdesc的值
     *
     * @param retdesc 被设置的值
     */
    public void setRetdesc(String retdesc) {
        this.retdesc = retdesc;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.DisableCircularReferenceDetect);
    }
}
