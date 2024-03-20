public class Turno {
    private int turno;

    public Turno() {
        this.turno = 0;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "turno=" + turno +
                '}';
    }

    public int quienToca(){
       /* if(turno==0){
            return 0;
        }else{
            return 1;
        }*/
        return turno;
    }
    public int quienNoToca(){
        if(turno==0){
            return 1;
        }else{
            return 0;
        }
    }
    public void cambiar(){
        if(turno==0){
            this.turno=1;
        }else {
            this.turno=0;
        }
    }
}
