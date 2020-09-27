package com.qberaa.individualservice.repository;

import com.qberaa.individualservice.model.QIndividualList;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface QIndividualListRepository extends JpaRepository<QIndividualList, BigDecimal> {

}
