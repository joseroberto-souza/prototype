public class Main {
    public  static void main(String[] args){
        IngressoPrototype modeloPadrao = new IngressoPadrao("Homem Aranha",
                "Sala 1", "19:00");
        IngressoPrototype ingressoCliente1 = modeloPadrao.clonar();
        ingressoCliente1.setAssento("F12");

        IngressoPrototype iC2 = modeloPadrao.clonar();
        iC2.setAssento("H32");

        ingressoCliente1.exibirIngresso();
        iC2.exibirIngresso();
    }
}
