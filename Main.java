import java.lang.annotation.*; 

// Definição da anotação
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.TYPE)  
@interface Tabela {  
    String nomeTabela();  
}  

// Aplicação da anotação em uma classe
@Tabela(nomeTabela = "Tabela")  
class Usuario {  
    private String nome;  
    private int idade;  

    public Usuario(String nome, int idade) {  
        this.nome = nome;  
        this.idade = idade;  
    }  

    public String getNome() {  
        return nome;  
    }  

    public int getIdade() {  
        return idade;  
    }  
}  

// Classe principal para testar a anotação
public class Main {  
    public static void main(String[] args) {  
        try {  
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
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}


