package com.dean.todolist.controller;

import com.dean.todolist.dao.ProgramDao;
import com.dean.todolist.entity.ProgramEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ProgramController {

    @Autowired
    private ProgramDao programDao;

    @GetMapping("/program/{id}")
    public ProgramEntity findAll(@PathVariable("id") Long id){

        return programDao.findProgramById(id);
    }

}
