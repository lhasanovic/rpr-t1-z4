package ba.unsa.etf.rpr.tutorijal1;

class Student {
    private String ime,prezime;
    private int br_indeksa;
    public Student(String ime,String prezime, int br_indeksa){
        this.ime=ime;
        this.prezime=prezime;
        this.br_indeksa=br_indeksa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBr_indeksa() {
        return br_indeksa;
    }

    public void setBr_indeksa(int br_indeksa) {
        this.br_indeksa = br_indeksa;
    }

    @Override
    public String toString() {
        return prezime + " " + ime + "(" + br_indeksa + ")";
    }
}
