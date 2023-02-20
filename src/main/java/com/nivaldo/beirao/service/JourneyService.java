package com.nivaldo.beirao.service;

import com.nivaldo.beirao.model.JourneyWork;
import com.nivaldo.beirao.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService{


    JourneyRepository journeyRepository;

    @Autowired
    public JourneyService(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    public JourneyWork saveJourney(JourneyWork JourneyWork){
       return journeyRepository.save(JourneyWork);

    }

    public List<JourneyWork> findAll() {
       return   journeyRepository.findAll();
    }

    public Optional<JourneyWork> getById(Long idJourney) {
        return journeyRepository.findById(idJourney);
    }

    public JourneyWork updateJourney(JourneyWork JourneyWork){
        return journeyRepository.save(JourneyWork);

    }

    public void deleteJourney(Long idJourney) {
        journeyRepository.deleteById(idJourney);
    }
}
