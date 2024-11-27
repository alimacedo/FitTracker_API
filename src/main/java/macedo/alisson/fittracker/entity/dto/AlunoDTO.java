package macedo.alisson.fittracker.entity.dto;

import macedo.alisson.fittracker.entity.Aluno;

import java.time.LocalDateTime;

public class AlunoDTO {

    public Aluno autor(){
        Aluno aluno = new Aluno();
        aluno.setNome(this.autor().getNome());
        aluno.setCPF(this.autor().getCPF());
        aluno.setDataCadastro(this.autor().getDataCadastro());
        return aluno;
    }
}
