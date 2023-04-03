Classes e objetos: definição de classes, instância de objetos, membros de classe (variáveis e métodos), construtores e destructores.

Definição de Classes:
Conceitos básicos: Uma classe é uma estrutura que define um conjunto de atributos e métodos que podem ser usados para criar objetos em Java.

Exemplo de implementação:

public class Car {
   private String model;
   private int year;

   public Car(String model, int year) {
      this.model = model;
      this.year = year;
   }

   public void start() {
      System.out.println("The " + model + " has started.");
   }
}

Instância de Objetos:
Conceitos básicos: Um objeto é uma instância de uma classe. Para criar um objeto em Java, você precisa instanciar uma classe usando o operador "new".

Exemplo de implementação:

Car car = new Car("Honda Civic", 2020);

Membros de Classe:
Conceitos básicos: Os membros de uma classe em Java incluem variáveis e métodos. As variáveis definem o estado do objeto e os métodos definem o comportamento do objeto.

Exemplo de implementação:

public class Car {
   private String model;
   private int year;

   public Car(String model, int year) {
      this.model = model;
      this.year = year;
   }

   public void start() {
      System.out.println("The " + model + " has started.");
   }

   public String getModel() {
      return model;
   }

   public int getYear() {
      return year;
   }
}

Construtores e Destructores:
Conceitos básicos: Um construtor é um método especial em Java que é usado para criar e inicializar um objeto quando ele é instanciado. Um destrutor é um método especial em Java que é chamado quando um objeto é destruído.

Exemplo de implementação:

public class Car {
   private String model;
   private int year;

   public Car(String model, int year) {
      this.model = model;
      this.year = year;
   }

   public void start() {
      System.out.println("The " + model + " has started.");
   }

   @Override
   public void finalize() {
      System.out.println("The " + model + " has been destroyed.");
   }
}

Exercícios práticos: Crie uma classe em Java que represente uma pessoa com membros como nome, idade e sexo. Em seguida, crie um objeto dessa classe e exiba seus atributos no console. Por fim, crie um construtor para a classe que permita inicializar esses atributos e um destrutor que imprima uma mensagem quando o objeto for destruído.