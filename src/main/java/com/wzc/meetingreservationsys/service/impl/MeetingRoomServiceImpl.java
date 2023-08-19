package com.wzc.meetingreservationsys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzc.meetingreservationsys.mapper.MeetingRoomMapper;
import com.wzc.meetingreservationsys.model.entity.MeetingRoom;
import com.wzc.meetingreservationsys.service.MeetingRoomService;
import org.springframework.stereotype.Service;

@Service
public class MeetingRoomServiceImpl extends ServiceImpl<MeetingRoomMapper, MeetingRoom> implements MeetingRoomService {
}
