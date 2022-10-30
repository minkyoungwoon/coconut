package com.project.coconut.board.freeboard.service;

import com.project.coconut.board.freeboard.repository.Criteria;
import com.project.coconut.board.freeboard.repository.FreeBoardVO;

import java.util.List;

public interface FreeBoardService {

    public List<FreeBoardVO> getList(Criteria cri);
}
