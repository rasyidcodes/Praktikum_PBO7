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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    //OVERLOADING METHOD setNip dengan param string
    //Dioverride oleh childclass
    public void setNip(String nip) {
        if (nip.startsWith("P")){
            this.nip = nip;
        }
    }

    //OVERLOADING METHOD setNip dengan param int
    //Dioverride oleh childclass
    public void setNip(int urutanMasuk) {
        this.nip = "P000" + urutanMasuk;
    }



    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    //method yg dioverride oleh childclass
    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }


    //method yg dioverride oleh childclass
    public int getThr() {
        return gaji;
    }

    //method yg dioverride oleh childclass
    public void setThr(int thr) {
        this.thr = thr;
    }


    public int getCuti() {
        return cuti;
    }

    //OVERLOADING METHOD setCuti dengan param int
    public void setCuti(int cuti) {
        this.cuti = this.cuti + cuti;
    }

    //OVERLOADING METHOD setCuti dengan param String
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
