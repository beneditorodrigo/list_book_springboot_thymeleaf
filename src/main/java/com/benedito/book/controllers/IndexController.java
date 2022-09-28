package com.benedito.book.controllers;

import com.benedito.book.entity.Book;
import com.benedito.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private BookService bookService;

    @GetMapping("/lista")
    public ModelAndView getList(){
        List<Book> bookList = this.bookService.findAll();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("bookList", bookList);
        return mv;
    }
}
