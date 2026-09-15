# ☕ Guia de Estudos: Orientação a Objetos em Java

**Nesta unidade, o foco de estudo será:**
> Métodos → Classes → Objetos → Construtores → Getters/Setters → Encapsulamento → `this`

---

## 📌 1. Conceitos Fundamentais

* **Método:** Representa uma ação ou comportamento. É o que o objeto "sabe fazer".
* **Classe:** É um modelo (ou molde) de algo da realidade. Pode possuir dados (atributos) e ações (métodos).
* **Objeto:** É uma instância física (na memória) desse modelo.

---

## 🏗️ 2. Instanciando um Objeto

A sintaxe padrão para criar (instanciar) um objeto a partir de uma classe em Java é:

```java
TipoDaClasse nomeDaVariavel = new TipoDaClasse();
```

**Exemplo prático:**
```java
Carro meuCarro = new Carro();
```
> 💡 **O que acontece aqui?** Foi criado na memória um objeto baseado na classe `Carro`, e o nome (referência) desse objeto passou a ser `meuCarro`.

---

## 🛠️ 3. O Papel dos Construtores

**Qual a função de um Construtor?**
Em uma classe, pode haver ou não a declaração explícita de um Construtor.

* **Sem construtor definido (Uso do construtor padrão):** Na hora de instanciar, o objeto é criado na memória com seus valores iniciais vazios, e você precisa definir suas características (atributos) passo a passo depois. *(Como mencionado no seu Exemplo_2)*
* **Com construtor definido:** Ele recebe os argumentos logo no momento da criação e já entrega o objeto instanciado na memória com as características que lhe foram impostas. *(Como mencionado no seu Exemplo_3)*

**Exemplo:**
```java
// Criando primeiro para configurar depois (Sem construtor explícito)
Carro carro1 = new Carro();
carro1.setCor("Vermelho"); 

// Já criando com as características impostas (Com construtor)
Carro carro2 = new Carro("Vermelho");
```

---

## 🔒 4. Encapsulamento, Getters/Setters e `this`

**Para que serve o Encapsulamento?**
* **Segurança:** Serve para que os atributos das classes não sejam modificados de forma arbitrária diretamente a partir da `main`. Para isso, os atributos são marcados como `private`.
* **Organização e Manutenção (Economia de tempo):** Serve para que outras classes não precisem ser modificadas uma por uma caso a estrutura interna de uma determinada classe mude.

**Completando a estrutura da sua unidade:**
Para interagir com esses atributos encapsulados de forma segura e didática, entram em cena os outros conceitos:
* **Getters / Setters:** Já que não podemos acessar o atributo direto da `main`, usamos métodos **Get** (para ler o valor) e **Set** (para alterar o valor passando pelas regras da classe).
* **A palavra `this`:** Usada dentro da própria classe para deixar claro quando estamos falando do atributo do objeto e não de uma variável passageira.

**Exemplo integrado:**
```java
public class Carro {
    private String cor; // Encapsulado (Segurança)

    // Construtor usando o 'this'
    public Carro(String cor) {
        this.cor = cor; // 'this.cor' é o atributo, 'cor' é o parâmetro recebido
    }

    // Getter
    public String getCor() {
        return this.cor;
    }

    // Setter
    public void setCor(String cor) {
        this.cor = cor;
    }
}
```
