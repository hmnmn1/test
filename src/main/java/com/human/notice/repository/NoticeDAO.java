package com.human.notice.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.human.notice.vo.NoticeVO;

@Repository
public class NoticeDAO {

    @Autowired
    private SqlSession sqlSession;

    private static final String NAMESPACE = "com.example.mapper.NoticeMapper";

    public List<NoticeVO> selectNoticeList() {
        return sqlSession.selectList(NAMESPACE + ".selectNoticeList");
    }
}