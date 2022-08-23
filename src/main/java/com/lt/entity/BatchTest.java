package com.lt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;

/**
 * @author lucine
 * @version 1.0 2022/8/21 15:33
 */
@Data
@ToString
public class BatchTest {

    @TableId
    private int empNo;

    private String title;

}
