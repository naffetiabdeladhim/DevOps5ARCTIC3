package tn.esprit.pidevarctic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidevarctic.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}