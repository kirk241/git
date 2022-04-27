public class shootball extends abstact {
  Gamepad gamepad;
  double motor;
  double hardwaremap;
  double setpower;

motor = hardwaremap.motor;
public void init (){
  if (gamepad.A) {
    motor.setpower(0.3);
  }
  else {
    motor.setpower(0);
  }
}
}