package com.springbat.service;

import com.springbat.entity.Userinfo;

import java.util.ArrayList;

public interface UserinfoService {
    int insert(Userinfo record);

    ArrayList<Userinfo> selectSelective(Userinfo record);
}
