public class HvitRute extends Rute{
  public HvitRute(int rader, int kolonner){
    super(rader,kolonner);
  }
  @Override
  public void gaa(Rute komFra, String utvei){
  utvei+= this.toString() + "  --> ";
  // System.out.println(utvei);
  // System.out.print(this + "  --> ");
  if (oppe() != null && oppe() != komFra){
    oppe().gaa(this, utvei);
  }
  if(ned() != null && ned() != komFra){
    ned().gaa(this,utvei);
  }
  if(venstre() != null && venstre()!= komFra){
    venstre().gaa(this,utvei);
  }
  if(hoyre() != null && hoyre()!= komFra){
    hoyre().gaa(this,utvei);
  }
}
  public char tilTegn(){
    return '.';
  }
}
