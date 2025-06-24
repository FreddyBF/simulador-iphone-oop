public class Iphone implements Telefone, NavegadorInternet, ReprodutorMusical {
    private String modelo;
    private String cor;
    private String versao;

    // Construtor com parâmetros
    public Iphone(String modelo, String cor, String versao) {
        this.modelo = modelo;
        this.cor = cor;
        this.versao = versao;
    }

    // Construtor padrão
    public Iphone() {
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getVersao() {
        return versao;
    }

    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atender telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de Voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void actualizarPagina() {
        System.out.println("Atualizar página....");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar a Música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecioada: " + musica);
    }
}
