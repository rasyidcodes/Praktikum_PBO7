public class Student {

    private  String nis;
    private  String nama;
    private  String kelas;
    private  double ipk;

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public  String keteranganIpk(){
        if (ipk == 4.0){
            return "isitimewa";
        }else if (ipk > 3.0 && ipk <4.0){
            return "baik";
        }else if (ipk >2.0 && ipk < 3.0){
            return "cukup";
        }else {
            return "kuramh baik";
        }
    }
}
