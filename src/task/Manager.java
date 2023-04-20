package task;

import java.util.List;

public class Manager  extends  Pegawai{

    private List<Pegawai> anakBuah;
    private Pegawai sekretaris;
    private String ruangan;

    public Manager(String nama, String departemen, char jenisKelamin) {
        super(nama, departemen, jenisKelamin);
    }

    public List<Pegawai> getAnakBuah() {
        return anakBuah;
    }

    public void setAnakBuah(List<Pegawai> anakBuah) {
        this.anakBuah = anakBuah;
    }

    public Pegawai getSekretaris() {
        return sekretaris;
    }

    public void setSekretaris(Pegawai sekretaris) {
        this.sekretaris = sekretaris;
    }


    public  void  setSekretaris(String nip, String nama, char kelamin){
        Pegawai p = new Pegawai(nip,nama,kelamin);
        p.setNip(nip);
        p.setNama(nama);
        this.sekretaris = p;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }



    //OVERLOADING AND OVERRIDINg METHOD SETNIP dengan param string
    @Override
    public void setNip(String nip) {
        if (nip.startsWith("M")){
            this.nip = nip;
        }
    }

    //OVERLOADING AND OVERRIDINg METHOD SETNIP dengan param int
    @Override
    public void setNip(int urutanMasuk) {
        this.nip = "M000" + urutanMasuk;
    }
}
