package co.simplon.avent.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.avent.model.Link;
import co.simplon.avent.repository.LinkRepository;

@RestController
@RequestMapping("/api/link")
public class LinkController {

 @Autowired
 private LinkRepository linkRepo;
 @GetMapping
 public List<Link> getDailyLink(){
	 // Today date
	 LocalDate today = LocalDate.now();
	 
	 return linkRepo.findByDate(today);
	 
 }
}
