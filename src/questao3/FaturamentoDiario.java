package questao3;

public class FaturamentoDiario {
    private Integer dia;
    private Double valor;

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "FaturamentoDiario{" +
                "dia=" + dia +
                ", valor=" + valor +
                '}';
    }
}
