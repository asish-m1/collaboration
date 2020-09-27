package com.qberaa.individualservice.service;

import com.qberaa.individualservice.model.QIndividualList;
import com.qberaa.individualservice.repository.QIndividualListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class QIndividualListService {

    @Autowired
    QIndividualListRepository qIndividualListRepository;

    public List<QIndividualList> getAllIndividuals(){
        return qIndividualListRepository.findAll();
    }
}
