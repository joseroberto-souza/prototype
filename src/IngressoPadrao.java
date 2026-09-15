public class IngressoPadrao implements IngressoPrototype{
    private final String filme;
    private final String sala;
    private final String horario;
    private String assento;

    public IngressoPadrao(String filme, String sala, String horario) {
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
        this.assento = " ";
    }

    private IngressoPadrao (IngressoPadrao prototipo){
        this.filme = prototipo.filme;
        this.sala = prototipo.sala;
        this.horario = prototipo.horario;
        this.assento = prototipo.assento;

    }


    @Override
    public IngressoPrototype clonar() {
        return new IngressoPadrao(this);
    }

    @Override
    public void setAssento(String assento) {
        this.assento = assento;

    }

    @Override
    public void exibirIngresso() {
        System.out.println("Filme: "+filme);
        System.out.println("Sala: " + sala);
        System.out.println("Horério: "+ horario);
        System.out.println("Assento: "+ assento);

    }
}
