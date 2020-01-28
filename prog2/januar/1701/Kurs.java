

public class Kurs{

  private String navn, kode;
  private double studiePoeng;
// ----------------Get set navn------------------------------
  public String getNavn(){
    return navn;
  }

  public void setKurs( String navn){
    this.navn = navn;
  }
// -----------------------------------------------
  public String getKode(){
    return kode;
  }

  public void setKode( String kode){
    this.kode = kode;
  }
// ----------------------------------------------
  public double getStudiePoeng(){
    return studiePoeng;
  }

  public void setStudiePoeng( double studiePoeng){
    this.studiePoeng = studiePoeng;
  }
// ------------------Konstruktør---------------
public Kurs(String navn, String kode, double studiePoeng){

  this.navn = navn;
  this.kode = kode;
  this.studiePoeng = studiePoeng;
}








}
