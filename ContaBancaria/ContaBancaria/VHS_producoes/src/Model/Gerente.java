package Model;

public class Gerente {
    int nota_fiscal, pagamento, despesas, compra_help; 

    public Gerente(int nota_fiscal, int pagamento, int despesas, int compra_help) {
        this.nota_fiscal = nota_fiscal;
        this.pagamento = pagamento;
        this.despesas = despesas;
        this.compra_help = compra_help;
    }

    public int getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(int nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public int getPagamento() {
        return pagamento;
    }

    public void setPagamento(int pagamento) {
        this.pagamento = pagamento;
    }

    public int getDespesas() {
        return despesas;
    }

    public void setDespesas(int despesas) {
        this.despesas = despesas;
    }

    public int getCompra_help() {
        return compra_help;
    }

    public void setCompra_help(int compra_help) {
        this.compra_help = compra_help;
    }
    
}
