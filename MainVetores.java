import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author bela
 */
public class MainVetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int meuValor;
        int[] meuVetor = new int[20];
        int[] asPosicoes = new int[20];
        boolean operacaoOk = false;
        do{
            try{
                meuValor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um numero qualquer entre 0 e 9: ","Atividade Vetores", JOptionPane.INFORMATION_MESSAGE));
                Vetores oVetor = new Vetores(meuValor);
                oVetor.gerar();
                meuVetor = oVetor.getVetor();
                oVetor.menorMaior(meuVetor);
                oVetor.primOcorrencia(meuValor, meuVetor);
                oVetor.posicoesOcorrencia(meuValor, meuVetor);
                oVetor.vezesAparece(meuValor, meuVetor);
                asPosicoes = oVetor.getPosicoesOcorrencia();
                oVetor.imprimir(meuVetor, asPosicoes);
                operacaoOk = true;
                JOptionPane.showMessageDialog(null,oVetor.getDadosImpressao() ,"Outros Dados",JOptionPane.INFORMATION_MESSAGE);
                
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Exceção ocorrida: "+e+"\nO numero Inserido não é inteiro, por favor, tente novamente", "ERRO", 0);
            }catch(IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, "Exceção ocorrida: "+e.getMessage()+"\nO numero Inserido não se encontra na faixa solicitada(0-9)", "ERRO", 0);
            }finally{
                JOptionPane.showMessageDialog(null, "Bloco finally (demais exceçoes) executado :) ", "ERRO", 1);
            }
        }while(operacaoOk == false);
        
        
       
       
        // JOptionPane.showMessageDialog(null, vetorEmString, "Impressao do Vetor", JOptionPane.INFORMATION_MESSAGE);
    }
}
    
