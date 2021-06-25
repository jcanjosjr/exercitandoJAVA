package POO.cursoEmVideo.Aula10;

public class Testando {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        //Peixe
        p.setPeso(0.89f);
        p.setIdade(1);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        //Ave
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(4);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        //Canguru
        Canguru c = new Canguru();
        c.setPeso(50.5f);
        c.setIdade(15);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        //Cachorro
        Cachorro k = new Cachorro();
        k.setPeso(20f);
        k.setIdade(12);
        k.setMembros(4);
        k.setCorPelo("Preto");
        k.alimentar();
        k.emitirSom();
        k.enterrarOsso();
    }
}
