package infr.pi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import infr.pi.eventos.models.Evento;
import infr.pi.eventos.repositories.EventoRepository;

@Controller
public class EventosController {
	
	@Autowired
	private EventoRepository er;
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "eventos/formEvento";
	}
	@PostMapping("/eventos")
	public String adcionar(Evento evento) {
		
		System.out.println(evento);
		er.save(evento);
		
		return"eventos/evento-adcionado";
	}
	
}
