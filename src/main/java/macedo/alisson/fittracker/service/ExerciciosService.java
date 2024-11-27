package macedo.alisson.fittracker.service;

import macedo.alisson.fittracker.entity.Aluno;
import macedo.alisson.fittracker.entity.Exercicios;
import macedo.alisson.fittracker.repository.AlunoRepository;
import macedo.alisson.fittracker.repository.ExerciciosRepository;

import java.util.List;
import java.util.Optional;

public class ExerciciosService {

    private final ExerciciosRepository exerciciosRepository;
    private final AlunoRepository alunoRepository;

    public ExerciciosService(ExerciciosRepository exerciciosRepository, AlunoRepository alunoRepository) {
        this.exerciciosRepository = exerciciosRepository;
        this.alunoRepository = alunoRepository;
    }

    public List<Exercicios> buscarTodosExercicios() {
        return exerciciosRepository.findAll();
    }

    public Optional<Exercicios> buscarExerciciosPorId(Long id) {
        return exerciciosRepository.findById(id);
    }

    public Exercicios criarExercicios(Exercicios exercicios) {
        return exerciciosRepository.save(exercicios);
    }

    public Exercicios atualizarExercicios(Long id, String nomeExercicios, Long numeroSeries, Long numeroRepeticoes,
                                          Long tempoDescanso, String status) {
        Exercicios exercicios = exerciciosRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Não encontrado."));
        exercicios.setNomeExercicio(exercicios.getNomeExercicio());
        exercicios.setNumeroSeries(exercicios.getNumeroSeries());
        exercicios.setNumeroRepeticoes(exercicios.getNumeroRepeticoes());
        exercicios.setTempoDescanso(exercicios.getTempoDescanso());
        exercicios.setStatus(status);
        return exerciciosRepository.save(exercicios);
    }

    public void deletarExercicios(Long id) {
        Exercicios exercicios = exerciciosRepository.findById(id).orElseThrow(() -> new RuntimeException("Não encontrado."));
        exerciciosRepository.delete(exercicios);
    }
}
