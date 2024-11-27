package macedo.alisson.fittracker.repository;

import macedo.alisson.fittracker.entity.Exercicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciciosRepository extends JpaRepository<Exercicios, Long> {
}
