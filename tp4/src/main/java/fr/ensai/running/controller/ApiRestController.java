package fr.ensai.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ensai.running.model.Athlete;
import fr.ensai.running.model.Competition;
import fr.ensai.running.service.AthleteService;
import fr.ensai.running.service.CompetitionService;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @Autowired
    private AthleteService athleteService;

    /**
     * Get all athletes
     */
    @GetMapping("/athlete")
    public List<Athlete> allAthletes() {

        return athleteService.findAll();
    }

    @GetMapping("/athlete/{id}")
    public ResponseEntity<Athlete> getAthleteById(@PathVariable Long id) {
        Athlete athlete = athleteService.findById(id);
        if (athlete == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(athlete);
    }

    @PostMapping("/athlete")
    public ResponseEntity<Athlete> createUser(@RequestBody Athlete athlete) {
        Athlete createdAthlete = athleteService.save(athlete);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAthlete);
    }

    @DeleteMapping("/athlete/{id}")
    public ResponseEntity<Void> deleteAthlete(@PathVariable Long id) {
        Athlete existingAthlete = athleteService.findById(id);
        if (existingAthlete == null) {
            return ResponseEntity.notFound().build();
        }
        athleteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @Autowired
    private CompetitionService competitionService;

    /**
     * Get all athletes
     */
    @GetMapping("/competition")
    public List<Competition> allCompetition() {

        return competitionService.findAll();
    }

    @GetMapping("/competition/{id}")
    public ResponseEntity<Competition> getCompetitionById(@PathVariable Long id) {
        Competition competition = competitionService.findById(id);
        if (competition == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(competition);
    }

    @DeleteMapping("/competition/{id}")
    public ResponseEntity<Void> deleteCompetition(@PathVariable Long id) {
        Competition existingCompetition = competitionService.findById(id);
        if (existingCompetition == null) {
            return ResponseEntity.notFound().build();
        }
        athleteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
