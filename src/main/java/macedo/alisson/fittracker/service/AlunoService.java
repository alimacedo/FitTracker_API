package macedo.alisson.fittracker.service;

import macedo.alisson.fittracker.entity.Aluno;
import macedo.alisson.fittracker.repository.AlunoRepository;
import macedo.alisson.fittracker.repository.ExerciciosRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;
    private final ExerciciosRepository exerciciosRepository;

    public AlunoService(AlunoRepository alunoRepository, ExerciciosRepository exerciciosRepository) {
        this.alunoRepository = alunoRepository;
        this.exerciciosRepository = exerciciosRepository;
    }

    public List<Aluno> buscarTodoAluno() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> buscarAlunoPorId(Long id) {
        return alunoRepository.findById(id);
    }

    public Aluno criarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno atualizarAluno(Long id, String Aluno, String CPF, LocalDateTime dataCadastro) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Não encontrado."));
        aluno.setNome(aluno.getNome());
        aluno.setCPF(aluno.getCPF());
        aluno.setDataCadastro(aluno.getDataCadastro());
        return alunoRepository.save(aluno);
    }

    public void deletarAluno(Long id) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Não encontrado."));
        alunoRepository.delete(aluno);
    }
}
