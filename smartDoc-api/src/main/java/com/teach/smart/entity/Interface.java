package com.teach.smart.entity;

import com.bugull.mongo.SimpleEntity;
import com.bugull.mongo.annotations.EnsureIndex;
import com.bugull.mongo.annotations.Entity;
import com.bugull.mongo.annotations.Id;
import com.bugull.mongo.annotations.IdType;

import java.util.List;
import java.util.Map;

/**
 * author zoush
 * CreateTime 2018-03-21 17:26
 */

@Entity(name="interface")
@EnsureIndex("{}")
public class Interface extends SimpleEntity {

    @Id(type= IdType.AUTO_INCREASE, start=1000)
    private String id;

    /**
     * 组织ID
     */
    private String orgId;

    /**
     * 接口状态
     */
    private int status;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 请求地址
     */
    private String url;

    /**
     * 请求头
     */
    private List<Map> headers;

    /**
     * 请求体
     */
    private String body;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Map> getHeaders() {
        return headers;
    }

    public void setHeaders(List<Map> headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
