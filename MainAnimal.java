
/**
 * @apiNote Classe responsável pela gestão dos animais
 * @author Vito Rodrigues Franzosi
 * @Data Criação 31.08.2024
 */
public class MainAnimal {
    public static void main(String[] args) {
        
        Gato g = new Gato();
        g.criar(new Gato(1L, "Siamês", "Miau", "10/10/2023", 3.5));
        g.criar(new Gato(2L, "Van Turco", "Mimi", "20/01/2020", 2.3));
        g.criar(new Gato(3L, "Ragdoll", "Lili", "05/12/2021", 4.1));
        
        g.visualizar(g.listar());
        System.out.println("------------------------------------------------------------");
        System.out.println("Excluir o gato de id igual a 2");
        g.excluir(2L);
        g.visualizar(g.listar());
       
        if (g.buscar(3L) == null) {
            System.out.println("Gato não encontrado!");
        }  
        else {
            System.out.println("Gato encontrado!");
        }   
       
        if (g.buscar(5L) == null) {
            System.out.println("Gato não encontrado!");
        }
        else {
            System.out.println("Gato encontrado!");
        }

        Cachorro c = new Cachorro();
        c.criar(new Cachorro(1L, "Bulldog", "AuAu", "Azul", 5.5));
        c.criar(new Cachorro(2L, "Dobberman", "AuAuAu", "Preto", 7.5));
        c.criar(new Cachorro(3L, "Pastor Alemão", "AuAuAuAu", "Alemão", 10.5));

        c.visualizar(c.listar());
        System.out.println("------------------------------------------------------------");
        System.out.println("Excluir o Cachorro de id igual a 2");
        c.excluir(2L);
        c.visualizar(c.listar());
       
        if (c.buscar(3L) == null) {
            System.out.println("Cachorro não encontrado!");
        }  
        else {
            System.out.println("Cachorro encontrado!");
        }   
       
        if (c.buscar(5L) == null) {
            System.out.println("Cachorro não encontrado!");
        }
        else {
            System.out.println("Cachorro encontrado!");
        }
    }
}
