package macedo.alisson.fittracker.entity.dto;

import macedo.alisson.fittracker.entity.Exercicios;

public class ExerciciosDTO {

    public Exercicios exercicios(){
        Exercicios exercicios = new Exercicios();
        exercicios.setNomeExercicio(this.exercicios().getNomeExercicio());
        exercicios.setNumeroSeries(this.exercicios().getNumeroSeries());
        exercicios.setNumeroRepeticoes(this.exercicios().getNumeroRepeticoes());
        exercicios.setTempoDescanso(this.exercicios().getTempoDescanso());
        exercicios.setStatus(this.exercicios().getStatus());
        return exercicios;

    }
}
