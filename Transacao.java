import java.util.ArrayList;
import java.util.List;

public class TransacaoBO {
    List<TransacaoVO> transacao;

    public TransacaoBO(){
        Transacao = new ArrayList<TrasacaoVO>();

        TransacaoVO transacao1 = new TransacaoVO();
        transacaoVO transacao2 = new TransacaoVO();

        transacao.add(transacao1);
        transacao.add(transacao2);
    }

    public List<TransacaoVO> getTodos(){
        return transacao;
    }

    public TransacaoVO getTransacao(int cod){
        return transacao.get(cod);
    }

    public void updateTransacao(TransacaoVO transacao){
        transacao.get(transacao.getCodigo()).setNome(transacao.getNome());
        System.out.println("Transacao - Codigo " + transacao.getCodigo() + " atualizado no banco de dados");
    }

    public void deleteTransacao(TransacaoVO transacao){
        transacao.remove(transacao.getCodigo());
        System.out.println("Transacao - Codigo " + transacao.getCodigo() + " removido do banco de dados");
    }

    public void addTransacao(TransacaoVO transacao){
        transacao.add(transacao);
        System.out.println("Transacao - Codigo " + transacao.getCodigo() + " inserido no banco de dados");
    }

}
