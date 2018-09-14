package com.zjcy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author flyap
 * @email 927840351@qq.com
 * @date 2018/9/10
 * @used
 */
@Entity
@Table(name="tb_token")
public class TokenEntity {
    @Id
    private Long userId;
    @Column(name="token")
    private String token;
    /**
     * 过期时间
     */
    @Column(name="expire_time")
    private Date expireTime;
    /**
     * 更新时间
     */
    @Column(name="update_time")
    private Date updateTime;

    public TokenEntity(Long userId, String token, Date expireTime, Date updateTime) {
        this.userId = userId;
        this.token = token;
        this.expireTime = expireTime;
        this.updateTime = updateTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
