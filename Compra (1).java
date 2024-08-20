import java.util.Scanner;
public class Compra {


    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        String r;
        int q=0;
        System.out.println("Faça seu cadastro");
        System.out.print("Digite seu nome ");
        String nome=leia.nextLine();
        System.out.print("Digite sua senha ");
        String senha=leia.nextLine();
        System.out.println("Seu Cadastro foi um sucesso");
    for(int i=3;i>0;i--){
        System.out.println("Faça seu login");
        System.out.print("Usuário: ");
        String n=leia.nextLine();
        System.out.print("Senha: ");
        String s=leia.nextLine();
        
        if(senha.equals(s) && nome.equals(n)){
            System.out.println("Você logou na sua conta");
            break;
        }else{
            System.out.println("Seu nome de usuário ou senha está incorreto");
             
        }
    } 
    System.out.println("Cadastre seu cartão");
    System.out.print("Digite o número do seu cartão: ");
        String nc=leia.nextLine();
    System.out.print("Digite a senha do seu cartão: ");
        String sc=leia.nextLine();
    System.out.print("Digite seu saldo: ");
        float saldo=leia.nextFloat();
        String h[]= {"Sabonete","Shampoo","Condicionador","Carne de lata","Carne moida","Picadinho","Picanha"};
        double v[]={5,10,15,7,30,15,59};
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
            System.out.print("Quantidade: ");
            q=leia.nextInt();
            v[i]*=q;
            total= total + v[i];
                
        System.out.println("Quer continuar? [S/N]");
                r=leia.next();
        }while (r.equalsIgnoreCase("S"));

        System.out.println("O total deu "+total);
        for(int i=3;i>0;i--){
            System.out.println("Coloque sua senha do cartão para finalizar a compra");
            System.out.println("Senha do cartão: ");
            String sc2=leia.nextLine();
            sobra=saldo-total;
            if(sc!=sc2) {
                System.out.println("Senha incorreta!!");
                }else if(sobra>0){
                    System.out.println("Senha correta.aguarde...");
                    System.out.println("Sua compra foi um sucesso");
                    System.out.println("Você ainda tem de saldo " +"R$ "+sobra);
                    break;
                    }else if(sobra<0){
                         System.out.println("Senha correta, aguarde...");
                         System.out.println("Saldo insuficiente");
                        
                }else{
                    
               }
            }
        }
        
        
    }
