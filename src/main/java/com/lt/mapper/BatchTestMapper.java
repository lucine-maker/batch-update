package com.lt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lt.entity.BatchTest;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lucine
 * @version 1.0 2022/8/21 15:34
 */
public interface BatchTestMapper extends BaseMapper<BatchTest> {

    void updateForList(@Param("batchTests") List<BatchTest> batchTests);

    void addForList(@Param("batchTests") List<BatchTest> batchTests);

}
