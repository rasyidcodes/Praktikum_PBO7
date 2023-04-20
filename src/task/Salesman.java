package task;

public class Salesman extends Pegawai{

    private int target;
    private int penjualan;
    private int bonus;


    public Salesman(String nama, String departemen, char jenisKelamin) {
        super(nama, departemen, jenisKelamin);
    }


    //Override method getGaji dari pegawai
    @Override
    public int getGaji(){
        return super.getGaji();
    }

    //Override method getThr dari pegawai
    @Override
    public int getThr() {
        if (penjualan >= target){
            return super.getGaji() * 2;
        }else {
            return super.getGaji();
        }
    }


    //Override method setThr dari pegawai
    @Override
    public void setThr(int thr) {
        super.setThr(thr);
    }


    //OVERLOADING AND OVERRIDING METHOD setNip dengan param string
    @Override
    public void setNip(String nip) {
        if (nip.startsWith("S")){
            this.nip = nip;
        }
    }

    //OVERLOADING AND OVERRIDING METHOD setNip dengan param int
    @Override
    public void setNip(int urutanMasuk) {
        this.nip = "S000" + urutanMasuk;
    }


    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


}
