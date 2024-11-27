package macedo.alisson.fittracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Exercicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeExercicio;
    private Long numeroSeries;
    private Long numeroRepeticoes;
    private Long tempoDescanso;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }

    public Long getNumeroSeries() {
        return numeroSeries;
    }

    public void setNumeroSeries(Long numeroSeries) {
        this.numeroSeries = numeroSeries;
    }

    public Long getNumeroRepeticoes() {
        return numeroRepeticoes;
    }

    public void setNumeroRepeticoes(Long numeroRepeticoes) {
        this.numeroRepeticoes = numeroRepeticoes;
    }

    public Long getTempoDescanso() {
        return tempoDescanso;
    }

    public void setTempoDescanso(Long tempoDescanso) {
        this.tempoDescanso = tempoDescanso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Exercicios{" +
                "id=" + id +
                ", nomeExercicio='" + nomeExercicio + '\'' +
                ", numeroSeries=" + numeroSeries +
                ", numeroRepeticoes=" + numeroRepeticoes +
                ", tempoDescanso=" + tempoDescanso +
                ", status='" + status + '\'' +
                '}';
    }
}