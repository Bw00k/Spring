package com.yedam.java.board.mapper;

import java.util.List;

import com.yedam.java.board.service.BoardVO;

public interface BoardMapper {
	//전체조회
	public List<BoardVO> selectAllBoardList();
	
	//부여될 게시글 번호 조회
	public int getBoardNo();
	
	//게시글 등록
	public int insertBoard(BoardVO boardVO);
	
	//게시글 조회를 기반으로 한 인기순
}
