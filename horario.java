public class horario {
    private byte hora,minuto,segundo;

    // atributos hora, minuto e segundo
    // construtor com parâmetros H, M e S
    // getter e setters para todos atributos
    // toString e equals

    public boolean isHorarioValido(byte h, byte m, byte s){
        if (h<0 || h>12) return false;

        if (m<0 || m>59) return false;

        if (s<0 || s>59) return false;

        return true;

    }
    public horario (byte h, byte m, byte s) throws Exception{
        if (!isHorarioValido(h,m,s)){
            throw new Exception("Error: Invalid time!");
        }

        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    public void setHora(byte h) throws Exception{
        if (!isHorarioValido(h, this.minuto, this.segundo)){
            throw new Exception("Error: Invalid hour!");
        }
            this.hora = h;
    }

    public byte getHora() {
        return hora;
    }

    public void setMinuto(byte m) throws Exception{
        if (!isHorarioValido(this.hora,m,this.segundo)){
            throw new Exception("Error: Invalid minute");
        }
        this.minuto = m;
    }

    public byte getMinuto() {
        return minuto;
    }

    public void setSegundo(byte s) throws Exception{
        if (!isHorarioValido(this.hora, this.minuto, s)){
            throw new Exception("Error: Invalid second");
        }
        this.segundo = s;
    }

    public byte getSegundo() {
        return segundo;
    }

    public void adiante (int qtdSegundos) throws Exception
        {
            //dar exceção se qtdSegundos<=0
        //...
        }
        public horario getHorarioFuturo (int qtdSegundos) throws Exception
        {
            //dar exceção se qtdSegundos<=0
            horario ret=new horario(this.hora,this.minuto,this.segundo);
            // modificar o ret para avancar qtdSegundos
            return ret;
        }
        public void atrase (int qtdSegundos) throws Exception
        {
           // dar exceção se qtdSegundos<=0
        //...
        }
        public horario getHorarioPassado (int qtdSegundos) throws Exception
        {
            //dar exceção se qtdSegundos<=0
            horario ret=new horario(this.hora,this.minuto,this.segundo);
            // modificar o ret para avancar qtdSegundos
            return ret;
        }
       /* public int diferenca (horario h) throws Exception
        {
            // dar exceção se h for null
            // retornar quantos segundos há entre this e h
        }*/
}

// faça uma classe Main para testar

