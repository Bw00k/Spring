package com.yedam.spring.board.service;

import java.util.List;
import java.util.Map;

import com.yedam.spring.board.service.BoardVO;

public interface BoardService {
	//전체조회
		public List<BoardVO> getBoardList();
		
		//단건조회
		public BoardVO getBoardInfo(BoardVO boardVO);
		
		//등록하고자 하는 글번호
		public BoardVO getBoardNO();
		
		//등록
		public int insertBoardInfo(BoardVO boardVO);  //수정은 리턴되는 값 INT
		//수정
		
		public int updateBoardInfo(BoardVO boardVO);
		
		//삭제
		public int deleteBoardInfo(int boardNo);
	}

