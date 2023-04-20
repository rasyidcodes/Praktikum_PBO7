public class InternationalStudent extends Student{

    @Override
    public String keteranganIpk() {
        if (getIpk() == 4.0){
            return "Mantap";
        }else {
            return "hehe";
        }
    }
}
