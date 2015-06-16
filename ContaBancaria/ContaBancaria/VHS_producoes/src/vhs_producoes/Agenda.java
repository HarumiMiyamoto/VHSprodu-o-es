package vhs_producoes;

public class Agenda {
    String local_gravacao, hora, data, tipo_gravacao;
    int Id;

    public Agenda(String local_gravacao, String hora, String data, String tipo_gravacao, int Id) {
        this.local_gravacao = local_gravacao;
        this.hora = hora;
        this.data = data;
        this.tipo_gravacao = tipo_gravacao;
        this.Id = Id;
    }

    public String getLocal_gravacao() {
        return local_gravacao;
    }

    public void setLocal_gravacao(String local_gravacao) {
        this.local_gravacao = local_gravacao;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo_gravacao() {
        return tipo_gravacao;
    }

    public void setTipo_gravacao(String tipo_gravacao) {
        this.tipo_gravacao = tipo_gravacao;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Agenda(String local_gravacao, String hora, String data, String tipo_gravacao) {
        this.local_gravacao = local_gravacao;
        this.hora = hora;
        this.data = data;
        this.tipo_gravacao = tipo_gravacao;
    }
    
}
