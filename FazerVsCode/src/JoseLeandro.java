public class 2920482221032 {

    private String nomeCompleto;
    private String ra;
    private int idade;
    private String gitHub;
    private String linkedIn;
    private String cursoETurma;

    public JoseLeandro(){

    }
    
    public JoseLeandro(String nomeCompleto, String ra, int idade, String gitHub, String linkedIn, String cursoETurma) {
        this.nomeCompleto = nomeCompleto;
        this.ra = ra;
        this.idade = idade;
        this.gitHub = gitHub;
        this.linkedIn = linkedIn;
        this.cursoETurma = cursoETurma;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getCursoETurma() {
        return cursoETurma;
    }

    public void setCursoETurma(String cursoETurma) {
        this.cursoETurma = cursoETurma;
    }
}

