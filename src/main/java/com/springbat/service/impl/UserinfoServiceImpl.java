package com.springbat.service.impl;

import com.springbat.dao.UserinfoMapper;
import com.springbat.entity.Userinfo;
import com.springbat.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Autowired
    private UserinfoMapper mapper;
    public int insert(Userinfo record) {
        return mapper.insert(record);
    }

    public ArrayList<Userinfo> selectSelective(Userinfo record) {
        return mapper.selectSelective(record);
    }
}