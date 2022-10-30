package com.project.coconut.board.freeboard.mapper;

import com.project.coconut.board.freeboard.repository.Criteria;
import com.project.coconut.board.freeboard.repository.FreeBoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FreeBoardMapper {

    public List<FreeBoardVO> getList(Criteria cri);

}
