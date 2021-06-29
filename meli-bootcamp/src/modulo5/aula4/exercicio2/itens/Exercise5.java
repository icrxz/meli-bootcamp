package modulo5.aula4.exercicio2.itens;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.lang.System.out;

class Data {
    private GregorianCalendar data = new GregorianCalendar();
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public GregorianCalendar getData() {
        return data;
    }

    public void setData(GregorianCalendar data) {
        this.data = data;
    }

    public Data() {}

    public Data(int dia, int mes, int ano) {
        this.data = new GregorianCalendar(ano, mes, dia);
    }

    public void addDia() {
        data.add(GregorianCalendar.DAY_OF_YEAR, 1);
    }

    public static void verificaData(String data) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);

            dateFormat.parse(data);

            out.println("Data passada é valida");
        } catch (Exception err) {
            out.println("Data passada é invalida");
        }
    }

    @Override
    public String toString() {
        return df.format(data.getTime());
    }
}

public class Exercise5 {
    public static void exec() {
        Data currentData = new Data();

        out.println(currentData);

        for (int i = 0; i < 5; i++) {
            currentData.addDia();
        }

        out.println(currentData);

        Data.verificaData("10/11/1998");
        Data.verificaData("11/14/2012");
    }
}
