package com.yedam.java.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {
	private int boardNo;
	private String boardTitle;
	private String boardWriter;
	private String boardContent;
	private String boardImage;
	// java.util.Date -> setter 사용 시 'yyyy/MM/dd'
	// Html의 input 태그) type : date 사용시 yyyy--MM--dd'  
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date boardDate;
}                 