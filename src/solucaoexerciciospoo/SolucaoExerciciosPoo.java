package solucaoexerciciospoo;
import javax.swing.*;

//Imports Lista 01 ------------------------------
import lista1poo.Alg4L1;
import lista1poo.Alg2L1;
import lista1poo.Alg1L1;
import lista1poo.Alg3L1;
//------------------------------------------------

//Imports Lista 02 ------------------------------
import lista2poo.Alg2L2;
import lista2poo.Alg3L2;
import lista2poo.Alg4L2;
import lista2poo.Alg5L2;
import lista2poo.Alg6L2;
import lista2poo.Alg7L2;
import lista2poo.Alg8L2;
import lista2poo.Alg9L2;
import lista2poo.Alg10L2;
import lista2poo.Alg11L2;
import lista2poo.Alg12L2;
import lista2poo.Alg13L2;
import lista2poo.Alg14L2;
import lista2poo.Alg15L2;
import lista2poo.Alg17L2;
import lista2poo.Alg18L2;
//------------------------------------------------

//Imports Lista 03 - -----------------------------
import lista3poo.Alg1L3;
import lista3poo.Alg2L3;
import lista3poo.Alg3L3;
import lista3poo.Alg4L3;


//@author Jonathan Alves
public class SolucaoExerciciosPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Lista de Exercicios POO");
        String opcao = JOptionPane.showInputDialog("Digite o Numero da lista: ");
//----------------------------------------LISTA 1---------------------------------------------------------------
         switch (opcao) {
            case "1":
                String op1 = JOptionPane.showInputDialog("Digite o exercicio da lista 1 ");

                switch (op1) {
                    case "1":
                        JOptionPane.showMessageDialog(null, "Imprimindo direto");
                        Alg1L1 a1l1 = new Alg1L1();
                        JOptionPane.showMessageDialog(null, a1l1.mostrarMensagem());
                        break;

                    case "2":
                        JOptionPane.showMessageDialog(null, "Imprimindo numero inteiro na variavel");
                        Alg2L1 a2l1 = new Alg2L1();
                        JOptionPane.showMessageDialog(null, a2l1.getZ());
                        break;

                    case "3":
                        JOptionPane.showMessageDialog(null, "Imprimindo numero real na variavel");
                        Alg3L1 a3l1 = new Alg3L1();
                        JOptionPane.showMessageDialog(null, a3l1.getY());
                        break;

                    case "4":
                        JOptionPane.showMessageDialog(null, "Imprimindo nome na variavel");
                        Alg4L1 a4l1 = new Alg4L1();
                        JOptionPane.showMessageDialog(null, a4l1.getNome());
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inavalida");
                }
                break;
//-------------------------------------------------------------------------------------------------------------------- 
//---------------------------------------LISTA 02---------------------------------------------------------------------
            case "2":
                String op2 = JOptionPane.showInputDialog("Digite o exercicio da Lista 2");

                switch (op2) {
                    case "1":
                        JOptionPane.showMessageDialog(null, "Exercicio Vazio");

                    break;
                    case "2":
                        JOptionPane.showMessageDialog(null, "Imprimindo numero inteiro");
                        String num = JOptionPane.showInputDialog("Digite um numero: ");
                        Alg2L2 a2l2 = new Alg2L2();
                        a2l2.setNum(Integer.parseInt(num));
                        JOptionPane.showMessageDialog(null, a2l2.getNum());
                    break;

                    case "3":
                        JOptionPane.showMessageDialog(null, "Imprimindo numeros inteiros");
                        String num1 = JOptionPane.showInputDialog("Digite o primeiro numero");
                        Alg3L2 a3l2num1 = new Alg3L2();
                        a3l2num1.setNum1(Integer.parseInt(num1));

                        String num2 = JOptionPane.showInputDialog("Digite o segundo numero");
                        Alg3L2 a3l2num2 = new Alg3L2();
                        a3l2num2.setNum2(Integer.parseInt(num2));
                        JOptionPane.showMessageDialog(null, "O primeiro numero digitado foi: "+a3l2num1.getNum1()
                                                             +"\nO segundo numero digitado foi: "+a3l2num2.getNum2());
                    break;

                    case "4":
                        JOptionPane.showMessageDialog(null, "Mostrando o antecessor e sucessor");
                        String numas = JOptionPane.showInputDialog("Digite um numero");
                        Alg4L2 a4l2 = new Alg4L2();
                        a4l2.setNum(Integer.parseInt(numas));
                        JOptionPane.showMessageDialog(null, "O antecessor desse numero é: "+a4l2.ant()
                                                             +"\nO sucessor desse numero é: "+a4l2.suc());
                    break;

                    case "5":
                        JOptionPane.showMessageDialog(null, "Pequeno cadastro");
                        Alg5L2 a5l2 = new Alg5L2();
                        String nome = JOptionPane.showInputDialog("Digite seu nome");
                        String telefone = JOptionPane.showInputDialog("Digite seu telefone");
                        String endereco = JOptionPane.showInputDialog("Digite seu endereco");
                        a5l2.setNome(nome);
                        a5l2.setTelefone(telefone);
                        a5l2.setEndereco(endereco);
                        JOptionPane.showMessageDialog(null, "Nome: " + a5l2.getNome()
                                + "\nTelefone: " + a5l2.getTelefone()
                                + "\nEndereço: " + a5l2.getEndereco());
                    break;

                    case "6":
                        JOptionPane.showMessageDialog(null, "Somando numeros");
                        String n1soma = JOptionPane.showInputDialog("Digite o primeiro numero");
                        String n2soma = JOptionPane.showInputDialog("Digite o segundo numero");
                        Alg6L2 a6l2 = new Alg6L2();
                        a6l2.setNum1(Integer.parseInt(n1soma));
                        a6l2.setNum2(Integer.parseInt(n2soma));                   
                        JOptionPane.showMessageDialog(null, "A Soma dos numeros é : "+a6l2.getSoma());
                    break;
                        
                    case "7":
                        JOptionPane.showMessageDialog(null, "Multiplicando numeros");
                        String n1mult = JOptionPane.showInputDialog("Digite o primeiro numero");
                        String n2mult = JOptionPane.showInputDialog("Digite o segundo numero");
                        Alg7L2 a7l2 = new Alg7L2();
                        a7l2.setNum1(Integer.parseInt(n1mult));
                        a7l2.setNum2(Integer.parseInt(n2mult));
                        JOptionPane.showMessageDialog(null, "A multiplicação dos numeros é: "+a7l2.getMult());
                    break;
                        
                    case "8":
                        JOptionPane.showMessageDialog(null, "Terça parte de um numero");
                        String ndivi = JOptionPane.showInputDialog("Digite um numero");
                        Alg8L2 a8l2 = new Alg8L2();
                        a8l2.setNum(Integer.parseInt(ndivi));
                        JOptionPane.showMessageDialog(null, "A terça parte desse numero é: "+a8l2.getDivi());
                    break;
                        
                    case "9":
                        JOptionPane.showMessageDialog(null, "Media de 2 numeros");
                        String n1media = JOptionPane.showInputDialog("Digte o primeiro numero");
                        String n2media = JOptionPane.showInputDialog("Digite o segundo numero");
                        Alg9L2 a9l2 = new Alg9L2();
                        a9l2.setNum1(Integer.parseInt(n1media));
                        a9l2.setNum2(Integer.parseInt(n2media));
                        JOptionPane.showMessageDialog(null, "A media dos numeros é: "+a9l2.getMedia());
                    break;
                    
                    case "10":
                        JOptionPane.showMessageDialog(null, "Reajuste de 1%");
                        String valor = JOptionPane.showInputDialog("Digite um valor");
                        Alg10L2 a10l2 = new Alg10L2(); 
                        a10l2.setValor(Integer.parseInt(valor));
                        JOptionPane.showMessageDialog(null, "O reajuste de 1% desse valor é: "+a10l2.getValor());
                        break;
                        
                    case "11":
                        JOptionPane.showMessageDialog(null, "Area, Perimetro e Diagonal de um Triangulo");
                        String nbase = JOptionPane.showInputDialog("Digite a base do triangulo");
                        String naltura = JOptionPane.showInputDialog("Digite a altura do triangulo");
                        Alg11L2 a11l2 = new Alg11L2();
                        a11l2.setBase(Integer.parseInt(nbase));
                        a11l2.setAltura(Integer.parseInt(naltura));
                        JOptionPane.showMessageDialog(null, "A area desse tringulo é: "+a11l2.getArea()
                                                            +"\nO perimetro desse triangulo é: "+a11l2.getPer()
                                                            +"\nA diagonal desse triangulo é: "+a11l2.getDia());
                    break;
                        
                    case "12":
                        JOptionPane.showMessageDialog(null, "Perimetro e Area de um Circulo");
                        String raio = JOptionPane.showInputDialog("Digite o Raio do Circulo");
                        Alg12L2 a12l2 = new Alg12L2();
                        a12l2.setRaio(Integer.parseInt(raio));
                        JOptionPane.showMessageDialog(null, "A area do circulo é: "+a12l2.getArea()
                                                            +"\nO perimetro do circulo é: "+a12l2.getPer());
                    break;
                        
                    case "13":
                        JOptionPane.showMessageDialog(null, "Area de um triangulo");
                        String base = JOptionPane.showInputDialog("Digite a base do triangulo");
                        String altura = JOptionPane.showInputDialog("Digite a altura do tringulo");
                        Alg13L2 a13l2 = new Alg13L2();
                        a13l2.setBase(Integer.parseInt(base));
                        a13l2.setAltura(Integer.parseInt(altura));
                        JOptionPane.showMessageDialog(null, "A area do tringulo é: "+a13l2.getArea());
                    break;
                        
                    case "14":
                        JOptionPane.showMessageDialog(null, "Par ou Impar");
                        String numpi = JOptionPane.showInputDialog("Digite um numero");
                        Alg14L2 a14l2 = new Alg14L2();
                        a14l2.setVer(Integer.parseInt(numpi));
                        JOptionPane.showMessageDialog(null, "O numero é: "+a14l2.getVer());
                    break;
                        
                    case "15":
                        JOptionPane.showMessageDialog(null, "Numero positivo, negativo e nulo");
                        String numpn = JOptionPane.showInputDialog("Digite um numero");
                        Alg15L2 a15l2 = new Alg15L2();
                        a15l2.setNumpn(Integer.parseInt(numpn));
                        JOptionPane.showMessageDialog(null, "O numero é: "+a15l2.getNumpn());
                    break;
                        
                    case "16":
                        JOptionPane.showMessageDialog(null, "Resposta Exercicio 16");
                    break;
                    
                    case "17":
                        JOptionPane.showMessageDialog(null, "Numero maior que 20");
                        String numv = JOptionPane.showInputDialog("Digite um numero");
                        Alg17L2 a17l2 = new Alg17L2();
                        a17l2.setNumv(Integer.parseInt(numv));
                        JOptionPane.showMessageDialog(null, "O numero digitado é: "+a17l2.getNumv());
                    break;
                    
                    case "18":
                        JOptionPane.showMessageDialog(null, "Resposta Exercio 18");
                        String num1s =  JOptionPane.showInputDialog("Digite o primeiro numero");
                        String num2s = JOptionPane.showInputDialog("Digite o segundo numero");
                        Alg18L2 a18l2 = new Alg18L2();
                        a18l2.setNum1(Integer.parseInt(num1s));
                        a18l2.setNum2(Integer.parseInt(num2s));
                        JOptionPane.showMessageDialog(null, "A soma dos numeros é: "+a18l2.getSoma()
                                                            +"\nO resultado é: "+a18l2.getVer());
                    break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Invalida");
                }break;
//-----------------------------------------------------------------------------------------------------------------------
//---------------------------------------LISTA 03-------------------------------------------------------------------------
            case "3":
                String op3 = JOptionPane.showInputDialog("Digite o exercicio da lista 3");
                switch (op3) {
                    case "1":
                        JOptionPane.showMessageDialog(null, "Mensagem de Maior, Menor ou Igual a 20");
                        String mens = JOptionPane.showInputDialog("Digite um numero");
                        Alg1L3 a1l3 = new Alg1L3();
                        a1l3.setNum(Integer.parseInt(mens));
                        JOptionPane.showMessageDialog(null, "O numero digitado é "+a1l3.getMens());
                    break;
                    
                    case "2":
                        JOptionPane.showMessageDialog(null, "Verificando Siglas de Estados");
                        String sigla = JOptionPane.showInputDialog("Digite uma sigla de Estado");
                        Alg2L3 a2l3 = new Alg2L3();
                        a2l3.setSigla(sigla);
                        JOptionPane.showMessageDialog(null, "A sigla digitada é: "+a2l3.getVersigla());
                    break;
                    
                    case "3":
                        JOptionPane.showMessageDialog(null, "Numeros Iguais ou Diferentes");
                        String vernum1 = JOptionPane.showInputDialog("Digite o primeiro numero");
                        String vernum2 = JOptionPane.showInputDialog("Digite o sehgundo numero");
                        Alg3L3 a3l3 = new Alg3L3();
                        a3l3.setNum1(Integer.parseInt(vernum1));
                        a3l3.setNum2(Integer.parseInt(vernum2));
                        JOptionPane.showMessageDialog(null, "Os numeros digitados são: "+a3l3.getVernum()); 
                    break;
                    
                    case "4":
                        JOptionPane.showMessageDialog(null, "Dias da semana");
                        String numsemana = JOptionPane.showInputDialog("Digite um numero correspondente ao dia da semana");
                        Alg4L3 a4l3 = new Alg4L3();
                        a4l3.setNum(numsemana);
                        JOptionPane.showMessageDialog(null, "O dia da semana é: "+a4l3.getSemana());
                    break;
                        
                    case "5":
                        JOptionPane.showMessageDialog(null, "Calma Jovem Jovem");
                    break;
                    
                    case "6":
                        JOptionPane.showMessageDialog(null, "Mostrando de 1 a 10");
                    break;
                    
                    case "7":
                        JOptionPane.showMessageDialog(null, "Resposta Exercicio 7");
                    break;
                        
                    case "8":
                        JOptionPane.showMessageDialog(null, "Resposta Exercicio 8");
                    break;
                    
                    case "9":
                        JOptionPane.showMessageDialog(null, "Resposta Exercicio 9");
                    break;
                    
                    case "10":
                        JOptionPane.showMessageDialog(null, "Resposta Exercicio 10");
                    break;
                    
                    case "11":
                        JOptionPane.showMessageDialog(null, "Resposta Exercicio 11");
                    break;
                    
                    case "12":
                        JOptionPane.showMessageDialog(null, "Resposta Exercicio 12");
                    break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Invalida");
                } break;
//--------------------------------------------------------------------------------------------------------------------                 
        }
    }
}