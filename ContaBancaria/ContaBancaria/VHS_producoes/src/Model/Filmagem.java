package Model;

public class Filmagem {
    int Id;
    String Descr_filmagem, data_entrega;

    public Filmagem(int Id, String Descr_filmagem, String data_entrega) {
        this.Id = Id;
        this.Descr_filmagem = Descr_filmagem;
        this.data_entrega = data_entrega;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescr_filmagem() {
        return Descr_filmagem;
    }

    public void setDescr_filmagem(String Descr_filmagem) {
        this.Descr_filmagem = Descr_filmagem;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public Filmagem(String Descr_filmagem, String data_entrega) {
        this.Descr_filmagem = Descr_filmagem;
        this.data_entrega = data_entrega;
    }
    
}
