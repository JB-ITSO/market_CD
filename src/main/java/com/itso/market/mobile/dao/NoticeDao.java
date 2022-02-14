package com.itso.market.mobile.dao;

import com.itso.market.mobile.model.CATEGORY;
import com.itso.market.mobile.model.MEMBER;
import com.itso.market.mobile.model.NOTICE;
import com.itso.market.mobile.model.STORE;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NoticeDao {
    NOTICE getNotice(NOTICE notice);
    int insertNotice(NOTICE notice);
    int updateNotice(NOTICE notice);
    int deleteNotice(NOTICE notice);
    List<NOTICE> getNoticeList();

    NOTICE getPreNotice(NOTICE notice);
    NOTICE getNextNotice(NOTICE notice);
}
