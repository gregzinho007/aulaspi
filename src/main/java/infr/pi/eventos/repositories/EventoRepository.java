package infr.pi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import infr.pi.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
