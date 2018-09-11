package com.common.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lzz on 2018/9/11.
 */
@Repository
public interface IClusterDao {
    List<Cluster> getClusterList(@Param("database") String database);
}
