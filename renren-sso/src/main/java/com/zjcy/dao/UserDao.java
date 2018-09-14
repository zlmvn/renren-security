package com.zjcy.dao;

import com.zjcy.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @author flyap
 * @email 927840351@qq.com
 * @date 2018/9/11
 * @used
 */

public interface UserDao extends PagingAndSortingRepository <UserEntity,String>,JpaSpecificationExecutor<UserEntity> {

    public List<UserEntity> findByUsername(String name);
    public UserEntity findByUserId(Long id);

}
