package com.wzc.meetingreservationsys.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@TableName("t_meeting_info")
public class MeetingInfo implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String theme;

    private LocalDateTime beginTime;

    private LocalDateTime endTime;

    private Long userId;

    private Long roomId;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 逻辑删除
     */
    @TableLogic
    private Integer isDelete;
}
