package com.likun.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

// 通过 @ConfigurationProperties 加载properties文件内的配置，通过prefix属性指定properties的配置
@ConfigurationProperties(prefix="com.likun")
public class ConfigBean {
    private String author;
    private String name;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
