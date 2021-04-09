package POO.Datas;

import java.util.Date;

public class Exemplo003 {
    public static void main(String[] args) {

        Date dataNoPassado = new Date(1523124807691L);

        Date dataNoFuturo = new Date(1613124807691L);

        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        System.out.println(isAfter);

        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);

    }
}
