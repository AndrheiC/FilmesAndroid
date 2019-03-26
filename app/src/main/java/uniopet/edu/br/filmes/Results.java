package uniopet.edu.br.filmes;

class Results {
    private String tituloFilme;
    private Integer IDFilme;
    private String diretorFilme;

    public Results(String tituloFilme, Integer IDFilme, String diretorFilme) {
        this.tituloFilme = tituloFilme;
        this.IDFilme = IDFilme;
        this.diretorFilme = diretorFilme;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public Integer getIDFilme() {
        return IDFilme;
    }

    public void setIDFilme(Integer IDFilme) {
        this.IDFilme = IDFilme;
    }

    public String getDiretorFilme() {
        return diretorFilme;
    }

    public void setDiretorFilme(String diretorFilme) {
        this.diretorFilme = diretorFilme;
    }
}
