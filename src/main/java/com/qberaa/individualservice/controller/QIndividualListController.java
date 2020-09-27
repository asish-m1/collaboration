package com.qberaa.individualservice.controller;

import com.qberaa.individualservice.QIndividualService;
import com.qberaa.individualservice.model.QIndividualList;
import com.qberaa.individualservice.service.QIndividualListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QIndividualListController {

    @Autowired
    QIndividualListService qIndividualService;

    @RequestMapping("/hello")
    public String getMessage(){
        return "Hello World";
    }

    @RequestMapping("/individualList")
    public List<QIndividualList> getIndividuals(){
        return qIndividualService.getAllIndividuals();
    }
}
