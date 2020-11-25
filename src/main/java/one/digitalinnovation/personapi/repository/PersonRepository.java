package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

//pegar uma interface do JPA<Pessoa, e tipo de dados id>
public interface PersonRepository extends JpaRepository<Person, Long> {
}
