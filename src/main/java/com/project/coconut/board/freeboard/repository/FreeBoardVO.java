package com.project.coconut.board.freeboard.repository;

import lombok.Data;

import java.util.Date;

@Data
public class FreeBoardVO {

    private int boardid;
    private Long bno;
    private String title;
    private String writer;
    private String content;
    private Long writerid;
    private Date writedate;
    private Date updatedate;




}
