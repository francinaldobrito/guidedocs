package com.unitins.guideDocs.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Professor extends Pessoa {

    private boolean professorDisciplina;

    private TipoProcessoOrientacao disciplina;

    private boolean professorOrientador;

    @OneToMany(mappedBy = "professorOrientador")
    private List<ProcessoOrientacao> orientacoes;

    @OneToMany
    @JoinTable(name = "AreaConhecimentoProfessor",
            joinColumns = @JoinColumn(name = "idProfessor"),
            inverseJoinColumns = @JoinColumn(name = "idAreaConhecimento"))
    private List<AreaConhecimento> areasConhecimento;

    @OneToMany
    @JoinTable(name = "DisponibilidadeProfessor",
            joinColumns = @JoinColumn(name = "idProfessor"),
            inverseJoinColumns = @JoinColumn(name = "idDisponibilidade"))
    private List<Disponibilidade> disponibilidades;

    public boolean isProfessorDisciplina() {
        return professorDisciplina;
    }

    public void setProfessorDisciplina(boolean professorDisciplina) {
        this.professorDisciplina = professorDisciplina;
    }

    public TipoProcessoOrientacao getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(TipoProcessoOrientacao disciplina) {
        this.disciplina = disciplina;
    }

    public boolean isProfessorOrientador() {
        return professorOrientador;
    }

    public void setProfessorOrientador(boolean professorOrientador) {
        this.professorOrientador = professorOrientador;
    }

    public List<ProcessoOrientacao> getOrientacoes() {
        return orientacoes;
    }

    public void setOrientacoes(List<ProcessoOrientacao> orientacoes) {
        this.orientacoes = orientacoes;
    }

    public List<AreaConhecimento> getAreasConhecimento() {
        return areasConhecimento;
    }

    public void setAreasConhecimento(List<AreaConhecimento> areasConhecimento) {
        this.areasConhecimento = areasConhecimento;
    }

    public List<Disponibilidade> getDisponibilidades() {
        return disponibilidades;
    }

    public void setDisponibilidades(List<Disponibilidade> disponibilidades) {
        this.disponibilidades = disponibilidades;
    }
}
