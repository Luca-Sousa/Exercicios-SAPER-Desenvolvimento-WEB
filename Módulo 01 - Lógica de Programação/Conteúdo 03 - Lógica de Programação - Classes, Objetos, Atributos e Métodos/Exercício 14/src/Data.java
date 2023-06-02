public class Data {
    private int ano;
    private int mes;
    private int dia;

    public Data(int diaInicial, int mesInicial, int anoInicial ) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;         
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int novoDia) {
        dia = novoDia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int novoMes) {
        mes = novoMes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int novoAno) {
        ano = novoAno;
    } 

    public void mostraData() {
        System.out.printf("Data: %02d/%02d/%04d", dia, mes, ano);
    }
}