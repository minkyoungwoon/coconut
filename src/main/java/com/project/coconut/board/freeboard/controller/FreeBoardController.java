package com.project.coconut.board.freeboard.controller;


import com.project.coconut.board.freeboard.repository.Criteria;
import com.project.coconut.board.freeboard.service.FreeBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/freeboard/*")
public class FreeBoardController {

    private final FreeBoardService service;

    @GetMapping("/test")
    public String hello(Model model) throws Exception{
        return "helloWorld";
    }


    @GetMapping("/list")
    public void freeBoardList(Model model, Criteria cri) throws Exception{
        model.addAttribute("list",service.getList(cri));

    }
}
