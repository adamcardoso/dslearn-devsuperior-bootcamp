package com.devsuperior.dslearndemo.services;

import com.devsuperior.dslearndemo.dto.DeliverRevisionDTO;
import com.devsuperior.dslearndemo.entities.Deliver;
import com.devsuperior.dslearndemo.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository deliverRepository;

    @Transactional
    public void saveRevision(Long id, DeliverRevisionDTO dto) {
        Deliver deliver = deliverRepository.getOne(id); // getOne() does not access the database, it just creates a proxy
        deliver.setStatus(dto.getStatus()); // set the status
        deliver.setFeedback(dto.getFeedback()); // set the feedback
        deliver.setCorrectCount(dto.getCorrectCount()); // set the correct count
        deliverRepository.save(deliver); // save the deliver
    }
}
