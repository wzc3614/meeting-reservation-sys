package com.wzc.meetingreservationsys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzc.meetingreservationsys.mapper.MeetingInfoMapper;
import com.wzc.meetingreservationsys.model.entity.MeetingInfo;
import com.wzc.meetingreservationsys.service.MeetingInfoService;
import org.springframework.stereotype.Service;

@Service
public class MeetingInfoServiceImpl extends ServiceImpl<MeetingInfoMapper, MeetingInfo> implements MeetingInfoService {
}
