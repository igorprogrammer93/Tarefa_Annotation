public class Main {
    public static void main(String[] args) {
        // Obtém a classe Usuario
        Class<?> obj = Usuario.class;

        // Verifica se a anotação está presente
        if (obj.isAnnotationPresent(Tabela.class)) {
            // Obtém a anotação
            Tabela tabela = obj.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.nomeTabela());
        } else {
            System.out.println("A anotação Tabela não está presente na classe.");
        }
    }
}
