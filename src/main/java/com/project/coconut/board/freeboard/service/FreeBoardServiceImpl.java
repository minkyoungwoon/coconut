package com.project.coconut.board.freeboard.service;

import com.project.coconut.board.freeboard.mapper.FreeBoardMapper;
import com.project.coconut.board.freeboard.repository.Criteria;
import com.project.coconut.board.freeboard.repository.FreeBoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FreeBoardServiceImpl implements FreeBoardService {

    private final FreeBoardMapper freeBoardMapper;

    @Override
    public List<FreeBoardVO> getList(Criteria cri) {
        return freeBoardMapper.getList(cri);
    }
}
