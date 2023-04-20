package task;

public class Main {
    public static void main(String[] args) {


        System.out.println("Pegawai(1) ==========================");
        //Nomer 1
        Pegawai pegawaiBiasa = new Pegawai("pegawaiBiasa","HRD",'P');
        pegawaiBiasa.setGaji(10000);
        System.out.println("THR pegawai biasa : " + pegawaiBiasa.getThr());;

        //Nomer2
        Manager rasyidManager = new Manager("rasyidManager","produksi",'P');
        rasyidManager.setGaji(20000);
        System.out.println("THR manager : " + rasyidManager.getThr());

        //Nomer3
        Salesman salesman1 =  new Salesman("salesman1","sales",'L');
        salesman1.setGaji(25000);
        salesman1.setTarget(100);
        salesman1.setPenjualan(120);
        System.out.println("THR salesman : " + salesman1.getThr());


        System.out.println("Pegawai(2) ==========================");

        Pegawai myPegawai1= new Pegawai("myPegawai1","pegawai",'L');
        Pegawai myPegawai2= new Pegawai("myPegawai2","pegawai",'P');
        myPegawai1.setCuti(10);
        System.out.println(myPegawai1.getCuti());
        myPegawai2.setCuti("persalinan");
        System.out.println(myPegawai2.getCuti());


        System.out.println("Pegawai(3) ==========================");
        //Nomer1
        Pegawai pegawai1 = new Pegawai("pegawai1","pegawai",'L');
        Pegawai pegawai2 = new Pegawai("pegawai2","pegawai",'P');
        pegawai1.setNip("P0001");
        pegawai2.setNip(12);

        System.out.println("nip pegawai biasa");
        System.out.println(pegawai1.getNip());
        System.out.println(pegawai2.getNip());

        Salesman salesman10 = new Salesman("mysales","sales",'L');
        Salesman salesman11 = new Salesman("mysales2","sales",'L');
        salesman10.setNip("S0001");
        salesman11.setNip(2);
        System.out.println("nip salesman");
        System.out.println(salesman10.getNip());
        System.out.println(salesman11.getNip());


        Manager manager1 = new Manager("manager1","manager",'L');
        Manager manager2 = new Manager("manager1","manager",'P');
        manager1.setNip("M0001");
        manager2.setNip(8);
        System.out.println("nip manager");
        System.out.println(manager1.getNip());
        System.out.println(manager2.getNip());


    }
}