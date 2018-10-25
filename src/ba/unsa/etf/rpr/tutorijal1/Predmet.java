package ba.unsa.etf.rpr.tutorijal1;

class Predmet {

    private String naziv_predmeta;
    private int sifra_predmeta;
    private final int max_br;

    private Student niz_studenata[];
    private int br_studenata;

    public Predmet(String naziv_predmeta, int sifra_predmeta, int max_br) {
        this.naziv_predmeta = naziv_predmeta;
        this.sifra_predmeta = sifra_predmeta;
        this.max_br = max_br;
        this.niz_studenata = new Student[max_br];
        this.br_studenata = 0;
    }

    public void upisi(Student s){
        //provjera duzine niza
        if(br_studenata == max_br) return;

        niz_studenata[br_studenata] = s;
        br_studenata++;
    }

    public void ispisi(Student s){
        if(br_studenata == 0) return;

        for(int i = 0; i < br_studenata; i++){
            if(niz_studenata[i].getBr_indeksa() == s.getBr_indeksa()){
                
            }
        }
    }

    public String getNaziv_predmeta() {
        return naziv_predmeta;
    }

    public void setNaziv_predmeta(String naziv_predmeta) {
        this.naziv_predmeta = naziv_predmeta;
    }

    public int getSifra_predmeta() {
        return sifra_predmeta;
    }

    public void setSifra_predmeta(int sifra_predmeta) {
        this.sifra_predmeta = sifra_predmeta;
    }

    public int getMax_br() {
        return max_br;
    }
}
