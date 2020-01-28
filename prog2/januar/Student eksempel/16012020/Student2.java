
public class Student2 {
//-------------------------------
  private String fornavn;
  private String etternavn;
  private int alder;
  private String studentId;
  private String fodselsnummer;

//----------------------------
  public Student() {

  }

  public Student(String fornavn, String etternavn, String studentId, String fodselsnummer, int alder){

    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.studentId = studentId;
    this.fodselsnummer = fodselsnummer;
    this.alder = alder;
  }
  //-----------------------------

public String getStudentId(){
  return studentId;
}

public String getFornavn(){
  return fornavn;
}

public String getEtternavn(){
  return etternavn;
}

public int getAlder(){
  return alder;
}

public String getFodselsnummer(){
  return fodselsnummer;
}
//--------------------------------------

public void setStudentId(String studentId){
  this.studentId  = studentId;
}

public void setFornavn(String fornavn){
  this.fornavn  = fornavn;
}
public void setEtternavn(String etternavn){
  this.etternavn = etternavn;
}
public void setAlder(int alder){
  this.alder  = alder;
}
//------------------------



//-------------------------------
  public void printStudentInfo(){
    System.out.println("Navn på student : " + fornavn + " " + etternavn + " " + alder + " " + studentId);
  }






}
