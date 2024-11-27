package macedo.alisson.fittracker.controller;

import macedo.alisson.fittracker.entity.Aluno;
import macedo.alisson.fittracker.entity.Exercicios;
import macedo.alisson.fittracker.service.AlunoService;
import macedo.alisson.fittracker.service.ExerciciosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/exercicios")
public class ExerciciosController {

    private ExerciciosService exerciciosService;

    public ExerciciosController(ExerciciosService service) {
        this.exerciciosService = exerciciosService;
    }

    @GetMapping
    public List<Exercicios> buscarTodosExercicios() {
        return exerciciosService.buscarTodosExercicios();
    }

    @GetMapping("/{id}")
    public Optional<Exercicios> buscarExerciciosPorId(@PathVariable Long id) {
        return exerciciosService.buscarExerciciosPorId(id);
    }

    @PostMapping
    public Exercicios criarExercicios(@RequestBody Exercicios exercicios) {
        return exerciciosService.criarExercicios(exercicios);
    }

    @PutMapping("/{id}")
    public Exercicios atualizarExercicios(@PathVariable Long id, @RequestBody Exercicios exercicios) {
        return exerciciosService.atualizarExercicios(id);
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id) {
        exerciciosService.deletarExercicios(id);
    }
}
