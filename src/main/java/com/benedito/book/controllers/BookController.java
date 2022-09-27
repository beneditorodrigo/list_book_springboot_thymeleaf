package com.benedito.book.controllers;

import com.benedito.book.entity.Autor;
import com.benedito.book.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private AutorService autorService;

    @GetMapping("/book/form/add")
    public ModelAndView getFormAdd(){
        ModelAndView mv = new ModelAndView("bookform");
        List<Autor> autorList = this.autorService.getAutoresList();
        mv.addObject("autorlist", autorList);
        return mv;
    }
}
