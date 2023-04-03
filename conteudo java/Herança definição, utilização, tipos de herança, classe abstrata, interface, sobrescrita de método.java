
Definição de Herança:
A herança é um recurso da programação orientada a objetos que permite criar uma nova classe a partir de uma classe já existente, herdeira dos atributos e métodos da classe pai.

Exemplo de implementação:

class Animal {
   String nome;
   int idade;
   public void som() {
      System.out.println("Esse animal faz um som");
   }
}

class Cachorro extends Animal {
   public void som() {
      System.out.println("O cachorro late");
   }
}

class Gato extends Animal {
   public void som() {
      System.out.println("O gato mia");
   }
}

public class Main {
   public static void main(String[] args) {
      Animal a = new Animal();
      Cachorro c = new Cachorro();
      Gato g = new Gato();
      
      a.som(); // Esse animal faz um som
      c.som(); // O cachorro late
      g.som(); // O gato mia
   }
}

Utilização da Herança:
A herança é utilizada para reutilizar código de uma classe já existente e estender suas funcionalidades em uma nova classe.

Exemplo de implementação:

class Pessoa {
   String nome;
   int idade;
   public void imprimirNome() {
      System.out.println("Nome: " + nome);
   }
   public void imprimirIdade() {
      System.out.println("Idade: " + idade);
   }
}

class Cliente extends Pessoa {
   String cpf;
   public void imprimirCpf() {
      System.out.println("CPF: " + cpf);
   }
}

public class Main {
   public static void main(String[] args) {
      Cliente c = new Cliente();
      c.nome = "João";
      c.idade = 25;
      c.cpf = "123.456.789-00";
      c.imprimirNome(); // Nome: João
      c.imprimirIdade(); // Idade: 25
      c.imprimirCpf(); // CPF: 123.456.789-00
   }
}

Tipos de Herança:
Existem dois tipos de herança em Java: a herança de implementação e a herança de interface. Na herança de implementação, a subclasse herda os métodos e atributos da superclasse, enquanto na herança de interface, a subclasse herda apenas a assinatura dos métodos da superclasse (ou interface).

interface Animal {
   public void som();
}

class Cachorro implements Animal {
   public void som() {
      System.out.println("O cachorro late");
   }
}

public class Main {
   public static void main(String[] args) {
      Animal a = new Cachorro();
      a.som(); // O cachorro late
   }
}

Classe Abstrata:
Uma classe abstrata é uma classe que não pode ser instanciada diretamente, mas pode ser usada como superclasse para outras classes. Ela pode ter métodos abstratos, que não têm implementação na classe abstrata, mas devem ser implementados em todas as subclasses.

Exemplo de implementação:

public abstract class FormaGeometrica {
    public abstract double calcularArea();
}

public class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}

Interface:
Em Java, uma interface é um conjunto de métodos abstratos que uma classe pode implementar. Uma interface define apenas a assinatura dos métodos (nome, parâmetros e tipo de retorno), sem fornecer sua implementação. As classes que implementam uma interface devem implementar todos os métodos definidos na interface.

Exemplo de interface em Java:

public interface Animal {
    public void comer();
    public void fazerSom();
}

public class Cachorro implements Animal {
    public void comer() {
        System.out.println("O cachorro está comendo.");
    }

    public void fazerSom() {
        System.out.println("O cachorro está latindo.");
    }
}

Cachorro cachorro = new Cachorro();
cachorro.comer();     // saída: "O cachorro está comendo."
cachorro.fazerSom();  // saída: "O cachorro está latindo."


Sobrescrita de método:
A sobrescrita de método é um recurso em Java que permite que uma classe filha implemente um método uma classe pai, fornecendo uma implementação diferente para o mesmo método. Para sobrescrever um método, a classe filha deve fornecer uma implementação com a mesma assinatura (nome, parâmetros e tipo de retorno) que a classe pai.

Exemplo de sobrescrita de método em Java:

public class Animal {
    public void fazerSom() {
        System.out.println("O animal está fazendo som.");
    }
}

public class Cachorro extends Animal {
    public void fazerSom() {
        System.out.println("O cachorro está latindo.");
    }
}

Animal animal = new Animal();
animal.fazerSom();   // saída: "O animal está fazendo som."

Cachorro cachorro = new Cachorro();
cachorro.fazerSom(); // saída: "O cachorro está latindo."