package com.bit2015.emaillist3.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bit2015.emaillist3.vo.EmailListVo;

@Repository
public class EmailListDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public void insert( EmailListVo vo ) {
		sqlSession.insert( "emaillist.insert", vo );
	}
	
	public List<EmailListVo> getList() {
		List<EmailListVo> list = sqlSession.selectList( "emaillist.list2" );
		return list;
	}
}