import java.util.Scanner;
public class Compra {


    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        System.out.println("Faça seu cadastro");
        System.out.print("Digite seu nome ");
        String nome=leia.nextLine();
        System.out.print("Digite sua senha ");
        String senha=leia.nextLine();
    for(int i=0;i<10;i++){
        System.out.println("Faça seu login:");
        System.out.print("Digite seu nome ");
        String n=leia.nextLine();
        System.out.print("Digite sua senha ");
        String s=leia.nextLine();

        
        if(senha.equals(s) && nome.equals(n)){
            System.out.println("Seu cadastro foi um sucesso");
            break;
        }else{
            System.out.println("Seu nome de usuário ou senha está incorreto");
            
        }
    } 

        System.out.print("Digite quanto de saldo você tem no seu cartao: ");
        float saldo= leia.nextFloat();
        String h[]= {"Sabonete","Shampoo","Condicionador"};
        double v[]={5.7,10,15};
        String c[]={"Carne de lata","Carne moida","Picadinho","Picanha"};
        double p[]={7.0,30,15,58.99};
        String r;
        double total=0;
        double sobra;
        System.out.println("Agora veja nossos produtos");
        for(int i=0;i<h.length;i++){
            System.out.println("codigo: "+i+" "+h[i]+"--"+v[i]+"R$");
        }
        
        System.out.println("Qual produto você quer: ");
        do {
            System.out.println("Selecione os produtos com seus códigos");
            int i = leia.nextInt();
            
            total= total + v[i];
                
        System.out.println("Quer continuar? [S/N]");
                r=leia.next();
        }while (r.equalsIgnoreCase("S"));

        System.out.println("Também temos outros produtos, na área do frigorifico: ");
        for (int i=0;i<c.length;i++){
            System.out.println("O codigo "+ i+" "+c[i]+"--"+"R$"+p[i]);
        }

        do{
            System.out.println("Selecione os produtos pelo seu código");
            int i=leia.nextInt();
            
            total= total+ p[i];

            System.out.println("Quer continuar? [S/N]");
                r=leia.next();
        }while(r.equalsIgnoreCase("S"));

        System.out.println("O total deu "+total);
        sobra= saldo - total;

        if (sobra<0) {
            System.out.println("Seu saldo foi insuficinte");
        }else{
            System.out.println("Sua compra foi um sucesso");
        }

        

    }
}