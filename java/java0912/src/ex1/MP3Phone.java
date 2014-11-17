
package ex1;

/**
 * @author kosta
 * Document    : MP3Phone created on : 2014. 9. 12, ¿ÀÀü 10:00:16
 */
public class MP3Phone extends Ex1_Super{
 int size;
 public MP3Phone(String model, String number, int chord, int size)
 {
     this.size=size;
     super.chord=chord;
     super.model=model;
     setNumber(number);
 }

    public int getSize() {
        return size;
    }
}
