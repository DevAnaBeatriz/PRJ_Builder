public class Sanduiche {
    // Produto final
    public static class sanduiche {
        //A classe representa o produto final a ser construído. Os atributos pao, queijo e carne são os componentes personalizáveis do sanduíche.
        private String pao;
        private String queijo;
        private String carne;
        // Construtor privado - só o Builder pode criar
        //O construtor é privado para garantir que objetos Sanduiche só possam ser criados pelo Builder, evitando instâncias parcialmente construídas.
        private sanduiche() {}
        // Getters
        //Métodos para acessar os dados e exibir a composição do sanduíche. O método mostrarIngredientes melhora a legibilidade e utilidade da classe.
        public String getPao() { return pao; }
        public String getQueijo() { return queijo; }
        public String getCarne() { return carne; }
        // Exibe os ingredientes
        public void mostrarIngredientes() {
            System.out.println("Sanduíche com: " + pao + ", " + queijo + ", " + carne);
        }
        // Classe Builder interna
        //Essa classe implementa o padrão Builder propriamente dito. É static para não depender de uma instância externa da classe Sanduiche.
        public static class Builder {
            private Sanduiche.sanduiche sanduiche;
            public Builder() {
                sanduiche = new sanduiche();
            }
            //Cada método permite definir um ingrediente e retorna a instância do Builder, possibilitando o encadeamento de chamadas. Isso melhora a legibilidade e facilita o uso.
            public Builder comPao(String tipoPao) {
                sanduiche.pao = tipoPao;
                return this;
            }
            public Builder comQueijo(String tipoQueijo) {
                sanduiche.queijo = tipoQueijo;
                return this;
            }
            public Builder comCarne(String tipoCarne) {
                sanduiche.carne = tipoCarne;
                return this;
            }
            //Finaliza a construção e retorna o objeto Sanduiche pronto. Após esse ponto, o objeto deve estar completamente configurado
            public Sanduiche.sanduiche build() {
                return sanduiche;
            }
        }
    }

    public static class Main {
        public static void main(String[] args) {
            //Classe de entrada da aplicação Java. O método main é o ponto de partida da execução.
            sanduiche meuSanduiche = new sanduiche.Builder()
                    .comPao("Integral")
                    .comQueijo("Prato")
                    .comCarne("Frango")
                    .build();
            meuSanduiche.mostrarIngredientes();
            //O encadeamento (chaining) torna o código legível, direto e fácil de entender, mostrando um exemplo típico de uso do padrão Builder.
            // Saída: Sanduíche com: Integral, Prato, Frango
        }
    }

    }


