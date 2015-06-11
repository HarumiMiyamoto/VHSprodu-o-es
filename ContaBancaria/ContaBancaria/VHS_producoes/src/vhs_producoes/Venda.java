package vhs_producoes;

public class Venda {
    int Id;
    String data;

    public Venda(int Id, String data) {
        this.Id = Id;
        this.data = data;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Venda(String data) {
        this.data = data;
    }
    
    
}
