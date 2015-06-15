package vhs_producoes;

public class Agenda {
    String locla_gravacao, hora, data, tipo_gravacao;
    int ID_agenda, idFilmagem;
   
   

    public Agenda(String locla_gravacao, String hora, String data, String tipo_gravacao, int ID_agenda, int idFilmagem) {
        this.locla_gravacao = locla_gravacao;
        this.hora = hora;
        this.data = data;
        this.tipo_gravacao = tipo_gravacao;
        this.ID_agenda = ID_agenda;
        this.idFilmagem= idFilmagem;
    }

    public String getLocla_gravacao() {
        return locla_gravacao;
    }

    public void setLocla_gravacao(String locla_gravacao) {
        this.locla_gravacao = locla_gravacao;
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
        return ID_agenda;
    }

    public void setId(int Id) {
        this.ID_agenda = ID_agenda;
    }

    public int getIdFilmagem() {
        return idFilmagem;
    }

    public void setIdFilmagem(int idFilmagem) {
        this.idFilmagem = idFilmagem;
    }
     

    public Agenda(String locla_gravacao, String hora, String data, String tipo_gravacao) {
        this.locla_gravacao = locla_gravacao;
        this.hora = hora;
        this.data = data;
        this.tipo_gravacao = tipo_gravacao;
    }
    
}
