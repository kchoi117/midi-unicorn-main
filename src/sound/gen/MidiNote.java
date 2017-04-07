package sound.gen;

/**
 * Created by Asimm on 4/7/2017.
 */
public class MidiNote {
    private int key;
    private int velocity;
    private int duration;

    public MidiNote(int key, int velocity, int duration) {
        this.key = key;
        this.velocity = velocity;
        this.duration = duration;
    }

    public int getKey() {
        return key;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getDuration() {
        return duration;
    }
}
