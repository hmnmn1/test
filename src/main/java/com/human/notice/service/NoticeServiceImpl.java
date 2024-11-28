package com.human.notice.service;

import com.human.notice.repository.NoticeDAO;
import com.human.notice.vo.NoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

    private final NoticeDAO noticeDAO;

    @Autowired
    public NoticeServiceImpl(NoticeDAO noticeDAO) {
        this.noticeDAO = noticeDAO;
    }

    @Override
    public List<NoticeVO> getNoticeList() {
        return noticeDAO.selectNoticeList();
    }
}