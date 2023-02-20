package com.nivaldo.beirao.controller;

import com.nivaldo.beirao.model.JourneyWork;
import com.nivaldo.beirao.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus; uncomment
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/journey")
public class JourneyWorkController {
    @Autowired
    JourneyService journeyService;

    @PostMapping
    public JourneyWork createJourney(@RequestBody JourneyWork journeyWork){
        return journeyService.saveJourney(journeyWork);
    }

    @GetMapping
    public List<JourneyWork> getJourneyList(){
        return journeyService.findAll();

    }

    @GetMapping("/{idJourney}")
    public ResponseEntity<JourneyWork>  getJourneyByID(@PathVariable("idJourney") Long idJourney) throws Exception {
        return  ResponseEntity.ok(journeyService.getById(idJourney).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public JourneyWork updateJourney(@RequestBody JourneyWork journeyWork){
        return journeyService.updateJourney(journeyWork);
    }
//uncomment
    /*@DeleteMapping("/{idJourney}")
    public ResponseEntity deleteByID(@PathVariable("idJourney") Long idJourney) throws Exception {
       try {
           journeyService.deleteJourney(idJourney);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return (ResponseEntity<JourneyWork>) ResponseEntity.ok();

    }


*/ //uncomment
}
