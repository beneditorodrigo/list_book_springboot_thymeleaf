package com.benedito.book.controllers;

import com.benedito.book.entity.Autor;
import com.benedito.book.entity.Book;
import com.benedito.book.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private AutorService autorService;

    @GetMapping("/book/form/add")
    public ModelAndView getFormAdd(){
        ModelAndView mv = new ModelAndView("bookform");
        List<Autor> autorList = autorService.getAutoresList();
        mv.addObject("autorlist", autorList);
        return mv;
    }

    @PostMapping("/book/form/save")
    public String sabeBook(@Valid Book book, BindingResult result, RedirectAttributes redirect){

        if(result.hasErrors()){
            redirect.addFlashAttribute("mensagem", "Verifique os campos obrigatórios!");
            return "redirect:/book/form/save";
        }

        return "redirect:/lista";
    }
}
