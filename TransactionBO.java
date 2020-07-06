import java.util.ArrayList;
import java.util.List;

public class TransactionBO {
    List<TransactionVO> transaction;

    public TransactionBO(){
        Transaction = new ArrayList<TrasactionVO>();

        TransactionVO transaction1 = new TransactionVO();
        transactionVO transaction2 = new TransactionVO();

        transaction.add(transaction1);
        transaction.add(transaction2);
    }

    public List<TransactionVO> getTodos(){
        return transaction;
    }

    public TransactionVO getTransaction(int id){
        return transaction.get(id);
    }

    public void updateTransaction(TransactionVO transaction){
        transaction.get(transaction.getId()).setTransaction_type(transaction.getTransaction_type());
        System.out.println("Transaction - Id " + transaction.getId() + " atualizado no banco de dados");
    }

    public void deleteTransaction(TransactionVO transaction){
        transaction.remove(transaction.getId());
        System.out.println("Transaction - Id " + transaction.getId() + " removido do banco de dados");
    }

    public void addTransaction(TransactionVO transaction){
        transaction.add(transaction);
        System.out.println("Transaction - Id " + transaction.getId() + " inserido no banco de dados");
    }

}
