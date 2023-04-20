package task;

public class Pegawai {

    private String nama;
     String nip;
    private String departemen;

    private char jenisKelamin;
    private int gaji;
    private  int thr;

    private  int cuti = 12;

    public Pegawai(String nama, String departemen, char jenisKelamin) {
        this.nama = nama;
        this.departemen = departemen;
        this.jenisKelamin = jenisKelamin;
    }

    public void setGaji(int gaji, int tunjangan){
        this.gaji =  gaji + tunjangan;
    }

    public void setGaji( int gaji, int tunjangan, int potongan){
        this.gaji =  gaji + tunjangan - potongan;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }


    //OVERLOADING METHOD SETNIP dengan param string
    public void setNip(String nip) {
        if (nip.startsWith("P")){
            this.nip = nip;
        }
    }

    //OVERLOADING METHOD SETNIP dengan param int
    public void setNip(int urutanMasuk) {
        this.nip = "P000" + urutanMasuk;
    }



    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }


    public int getThr() {
        return gaji;
    }

    public void setThr(int thr) {
        this.thr = thr;
    }


    public int getCuti() {
        return cuti;
    }

    public void setCuti(int cuti) {
        this.cuti = this.cuti + cuti;
    }

    public void setCuti(String tipeCuti){
        if (tipeCuti == "pernikahan"){
             this.cuti = this.cuti + 2;
        }else if (tipeCuti == "persalinan"){
            if (jenisKelamin == 'L' || jenisKelamin == 'l'){
                this.cuti = this.cuti + 3;
            }else if(jenisKelamin == 'P' || jenisKelamin == 'p'){
                this.cuti = this.cuti + 90;
            }
        } else if (tipeCuti == "liburan") {
            this.cuti = this.cuti + 8;
        } else if (tipeCuti == "berduka") {
            this.cuti = this.cuti + 7;
        }
    }


}
