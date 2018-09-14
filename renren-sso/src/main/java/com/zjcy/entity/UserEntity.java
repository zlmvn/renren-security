package com.zjcy.entity;



import com.alibaba.fastjson.annotation.JSONField;

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
@Table(name = "tb_user")
public class UserEntity {

    /**
     * 用户ID
     */
    @Id
    private Long userId;
    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;
    /**
     * 手机号
     */
    @Column(name="mobile")
    private String mobile;
    /**
     * 密码
     */
    @Column(name="password")
    private String password;
    /**
     * 创建时间
     */
    @Column(name="create_time")
    private Date createTime;
    public UserEntity(){};
    public UserEntity(Long userId, String username, String mobile, String password, Date createTime) {
        this.userId = userId;
        this.username = username;
        this.mobile = mobile;
        this.password = password;
        this.createTime = createTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
