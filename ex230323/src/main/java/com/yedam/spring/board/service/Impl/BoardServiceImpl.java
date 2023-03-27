package com.yedam.spring.board.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.spring.board.mapper.BoardMapper;
import com.yedam.spring.board.service.BoardService;
import com.yedam.spring.board.service.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getBoardList() {
		
		return boardMapper.selectBoardList();
	}

	@Override
	public BoardVO getBoardInfo(BoardVO boardVO) {
		return boardMapper.selectBoardInfo(boardVO);
	}

	@Override
	public BoardVO getBoardNO() {
	return null;
		
	}

	@Override
	public int insertBoardInfo(BoardVO boardVO) {
		return 0;
	}

	@Override
	public int updateBoardInfo(BoardVO boardVO) {
		return 0;
	}

	@Override
	public int deleteBoardInfo(int boardNo) {
		return 0;
	}
	
}
