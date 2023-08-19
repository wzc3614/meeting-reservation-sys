package com.wzc.meetingreservationsys.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@TableName("t_meeting_room")
public class MeetingRoom implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private String location;

    private Integer capacity;

    private Integer facility;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
}
