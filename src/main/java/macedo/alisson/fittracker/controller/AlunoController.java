package macedo.alisson.fittracker.controller;

import macedo.alisson.fittracker.entity.Aluno;
import macedo.alisson.fittracker.entity.dto.AlunoDTO;
import macedo.alisson.fittracker.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public ResponseEntity<Aluno> buscarTodoAluno() {
        return new ResponseEntity<Aluno>(alunoService.buscarTodoAluno(), HttpStatus.OK);

    }

    @GetMapping("/buscar")
    public ResponseEntity<Aluno> buscarAlunoPorId(@PathVariable Long id) {
        Optional<Aluno> buscarAlunoPorId = alunoService.buscarAlunoPorId(id);
        if (buscarAlunoPorId.isPresent())
            return new ResponseEntity<>(buscarAlunoPorId.get(), HttpStatus.OK);
        return new ResponseEntity<Aluno>("Não encontrado!", HttpStatus.NOT_FOUND);
    }

    @PostMapping("/criar")
    public ResponseEntity<Aluno> criarAluno(@RequestBody Aluno aluno) {
        return new ResponseEntity<Aluno>(alunoService.criarAluno(aluno), HttpStatus.CREATED);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<?> atualizarAluno(@RequestBody Aluno aluno) {
        return new ResponseEntity<Aluno>(alunoService.atualizarAluno(long),HttpStatus.OK);
    }


    @DeleteMapping("/deletar")
    public ResponseEntity<Aluno> deletarAluno(@PathVariable Long id) {
        alunoService.deletarAluno(id);
        return new ResponseEntity<Aluno>("Excluído.", HttpStatus.OK);
    }
}