public class TransactionVO {
    private int id;
    private tyniint transaction_type;
    private datetime transaction_created_date;
    private datetime transaction_modified_date;
    private int product_id;
    private int quality;
    

    public TransactionVO(int c, tyniint tt, datetime tcd, datetime tmd, int pc, int q ){
        this.id = c;
        this.transaction_type = tt;
        this.transaction_created_date = tcd;
        this.transaction_modified_date = tmd;
        this.product_id = pc;
        this.quality = q;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public tyniint getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(tyniint transaction_type) {
        this.transaction_type = transaction_type;
    }
    
    public datetime getTransaction_created_date() {
        return transaction_create_date;
    }

    public void setTransaction_created_date(datetime transaction_created_date) {
        this.transaction_created_date = transaction_created_date;
    }
    
    public datetime getTransaction_modified_date() {
        return transaction_modified_date;
    }

    public void setTransaction_modified_date(datetime transaction_modified_date) {
        this.transaction_modified_date = transaction_modified_date;
    }
    
     public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    
     public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }


}
