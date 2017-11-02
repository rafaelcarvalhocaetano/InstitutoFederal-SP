///******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Rafael Carvalho Caetano
//******************************************************
package br.com.ifsp.domain;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class Curso {
    
    //variavel inteira responsavel pela identificação
    private int id;
    //variavel inteira responsavel pela carga horária do curso
    private int cargaHoraria;
    //variavel inteira responsavel pelo quantidade de vagas do curso
    private int numeroVagas;
    //variavel inteira responsavel pelo nome da disciplina
    private String nomeDisciplina;
    //variavel inteira responsavel pela curso que pertence
    private String CursoPertence;
    //variavel inteira responsavel pelo período
    private String periodo;
    
    
    //Abaixo estão as varáveis acima encapsuladas com setters e getters

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the CursoPertence
     */
    public String getCursoPertence() {
        return CursoPertence;
    }

    /**
     * @param CursoPertence the CursoPertence to set
     */
    public void setCursoPertence(String CursoPertence) {
        this.CursoPertence = CursoPertence;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }
    
    
    
}
