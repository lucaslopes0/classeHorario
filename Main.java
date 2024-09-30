public class Main {
    public static void main(String[] args) throws Exception {
        horario hr = null;
        try {
            hr = new horario((byte) 12, (byte) 0, (byte) 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        hr.setHora((byte) 2);
        hr.setMinuto((byte) 50);
        hr.setSegundo((byte) 0);


        System.out.print("O horário setado pelo usuário é: "+hr.getHora()+":" +hr.getMinuto()+":"+hr.getSegundo());
    }
}
