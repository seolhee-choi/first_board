package com.board.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.model.BoardVO;
import com.board.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTest {
    
    private static final Logger log = LoggerFactory.getLogger(BoardServiceTest.class);

    
    @Autowired
    private BoardService service;
    
    //게시판 등록
    /*
    @Test
    public void testEnroll() {
        
        BoardVO vo = new BoardVO();
        
        vo.setTitle("service test");
        vo.setContent("service test");
        vo.setWriter("service test");
        
        service.enroll(vo);
    }
    
    
    
    // 게시판 목록 테스트
    @Test
    public void testGetList() {
        service.getList().forEach(board -> log.info("" + board));        
    }

    //게시판 조회
    @Test
    public void testGETPage() {

    	int bno = 11;
        log.info("" + service.getPage(bno));
    }
    
    // 게시판 수정
    @Test
    public void testModify() {
        
        BoardVO board = new BoardVO();
        board.setBno(11);
        board.setTitle("수정 제목2");
        board.setContent("수정 내용2");
        
        int result = service.modify(board);
        log.info("result : " +result);
    }     

    //게시판 삭제
    @Test
    public void testDelete() {
        
        int result = service.delete(11);
        log.info("result : " + result);
    }
     */

    // 게시판 조회(페이징 적용)
    @Test
    public void testGetListPaging() {
        
        Criteria cri = new Criteria();
        
        List list = service.getListPaging(cri);
        
        list.forEach(board -> log.info("" + board));
        
    } 
 
}