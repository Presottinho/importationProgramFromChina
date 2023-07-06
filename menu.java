public class menu{

    public static void menu(){
        System.out.println("-------------------------------------");
        System.out.println("1 - Adicionar Item \n2 - Editar Item \n3 - Apresentar Lista \n0 - Fechar Programa");
        System.out.println("-------------------------------------");
    }

    public static void numCorrespondente(){
        System.out.println("-------------------------------------");
        System.out.println("Digite o numero o correspondente ao item que deseja editar: ");
        System.out.println("-------------------------------------");
    }

    public static void chooseEdit(){
        System.out.println("-------------------------------------");
        System.out.println("O que deseja editar? 1 - Nome | 2 - Preco | 3 - Ambos");
        System.out.println("-------------------------------------");
    }

    public static void writeNewName(){
        System.out.println("-------------------------------------");
        System.out.println("Digite o novo nome do item: ");
        System.out.println("-------------------------------------");
    }

    public static void writeNewPrice(){
        System.out.println("-------------------------------------");
        System.out.println("Digite o novo valor do item: ");
        System.out.println("-------------------------------------");
    }

    public static void writeFreight(){
        System.out.println("-------------------------------------");
        System.out.println("Digite o valor do frete: ");
        System.out.println("-------------------------------------");
    }

}
