public  class foeward {
  Gamepad gamepad;
  double motorpower;
  double motor;
  int sleep;
  double fr;
  double br;
  double bl;
  double fl;
  double setpower;
  
  motor = motor.setpower();

   public void init (){
    this.motor = motorpower;
  if (gamepad.leftStick >= 0) {
  fr.setpower = motorpower;
  br.setpower = motorpower;
  fl.setpower = motorpower;
  bl.setpower = motorpower;
    }
   else if (gamepad.leftStick <= 0) {
      fr.setpower = -motorpower;
      br.setpower = -motorpower;
      fl.setpower = -motorpower;
      bl.setpower = -motorpower;
    }
    else {
      fr.setpower = 0;
      br.setpower = 0;
      fl.setpower = 0;
      bl.setpower = 0;
  
    }
}
}